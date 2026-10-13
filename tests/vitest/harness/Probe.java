// Reflection-only probe for one generated SDK package (okhttp-gson client).
// It has no compile-time dependency on the package, so it is compiled once and run
// with each package's classpath.
//   java Probe routes <ApiClass>...         -> verb and route of every <op>Call method
//   java Probe call <baseUrl> <ApiClass> <op> <json-args>
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Probe {
    static final String PKG = "org.openapitools.client";

    public static void main(String[] args) throws Exception {
        if (args[0].equals("routes")) {
            routes(java.util.Arrays.copyOfRange(args, 1, args.length));
        } else if (args[0].equals("call")) {
            call(args[1], args[2], args[3], args[4]);
        } else {
            throw new IllegalArgumentException("unknown mode " + args[0]);
        }
    }

    static Object newClient() throws Exception {
        return Class.forName(PKG + ".ApiClient").getConstructor().newInstance();
    }

    static Object placeholder(Class<?> type, int index) {
        if (type == String.class) return "__P" + index + "__";
        if (type == UUID.class) return UUID.fromString(String.format("00000000-0000-0000-0000-%012d", index));
        if (type == Integer.class || type == int.class) return 900000 + index;
        if (type == Long.class || type == long.class) return 900000L + index;
        if (type == Boolean.class || type == boolean.class) return Boolean.FALSE;
        if (type == java.math.BigDecimal.class) return java.math.BigDecimal.valueOf(900000L + index);
        if (List.class.isAssignableFrom(type)) return Collections.emptyList();
        return null;
    }

    static String json(String s) {
        return s == null ? "null" : "\"" + s.replace("\\", "\\\\").replace("\"", "\\\"") + "\"";
    }

    static void routes(String[] classes) throws Exception {
        Object client = newClient();
        String basePath = (String) client.getClass().getMethod("getBasePath").invoke(client);
        StringBuilder out = new StringBuilder("{\"basePath\":" + json(basePath) + ",\"routes\":[");
        boolean first = true;
        for (String simple : classes) {
            Class<?> api = Class.forName(PKG + ".api." + simple);
            Object instance = api.getConstructor(client.getClass()).newInstance(client);
            for (Method m : api.getMethods()) {
                String name = m.getName();
                if (!name.endsWith("Call") || !m.getReturnType().getName().equals("okhttp3.Call")) continue;
                Class<?>[] types = m.getParameterTypes();
                Object[] values = new Object[types.length];
                for (int i = 0; i < types.length; i++) values[i] = placeholder(types[i], i);
                Object call = m.invoke(instance, values);
                Object request = call.getClass().getMethod("request").invoke(call);
                String verb = (String) request.getClass().getMethod("method").invoke(request);
                Object url = request.getClass().getMethod("url").invoke(request);
                String path = (String) url.getClass().getMethod("encodedPath").invoke(url);
                out.append(first ? "" : ",").append("{\"className\":").append(json(simple))
                   .append(",\"name\":").append(json(name.substring(0, name.length() - 4)))
                   .append(",\"method\":").append(json(verb)).append(",\"path\":").append(json(path)).append("}");
                first = false;
            }
        }
        System.out.print(out.append("]}"));
    }

    static void call(String baseUrl, String simple, String op, String argsJson) throws Exception {
        Object client = newClient();
        Class<?> cc = client.getClass();
        cc.getMethod("setBasePath", String.class).invoke(client, baseUrl);
        cc.getMethod("setApiKey", String.class).invoke(client, "test-token");
        cc.getMethod("setApiKeyPrefix", String.class).invoke(client, "Token");
        Class<?> api = Class.forName(PKG + ".api." + simple);
        Object instance = api.getConstructor(cc).newInstance(client);
        Class<?> jsonClass = Class.forName(PKG + ".JSON");
        Object jsonInstance = cc.getMethod("getJSON").invoke(client);
        Method deserialize = jsonClass.getMethod("deserialize", String.class, Type.class);
        Method serialize = jsonClass.getMethod("serialize", Object.class);

        // args: JSON array; each element is converted to the declared parameter type.
        com.google.gson.JsonArray raw = com.google.gson.JsonParser.parseString(argsJson).getAsJsonArray();
        Method target = null;
        for (Method m : api.getMethods()) {
            if (m.getName().equals(op) && m.getParameterCount() == raw.size()) target = m;
        }
        if (target == null) throw new NoSuchMethodException(op);
        Type[] types = target.getGenericParameterTypes();
        Object[] values = new Object[types.length];
        for (int i = 0; i < types.length; i++) {
            values[i] = raw.get(i).isJsonNull() ? null : deserialize.invoke(jsonInstance, raw.get(i).toString(), types[i]);
        }
        String result;
        try {
            Object data = target.invoke(instance, values);
            String type = data == null ? "null" : data.getClass().getSimpleName();
            String body = data == null ? "null" : (String) serialize.invoke(jsonInstance, data);
            result = "{\"error\":null,\"dataType\":" + json(type) + ",\"data\":" + body + "}";
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            Class<?> apiException = Class.forName(PKG + ".ApiException");
            if (!apiException.isInstance(cause)) throw e;
            int code = (int) apiException.getMethod("getCode").invoke(cause);
            result = "{\"error\":{\"status\":" + code + "},\"dataType\":null,\"data\":null}";
        }
        System.out.print(result);
    }
}
