

# CreateEdgeFunctionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**language** | **String** |  |  [optional] |
|**code** | **String** |  |  [optional] |
|**jsonArgs** | [**CreateEdgeFunctionRequestJsonArgs**](CreateEdgeFunctionRequestJsonArgs.md) |  |  [optional] |
|**initiatorType** | [**InitiatorTypeEnum**](#InitiatorTypeEnum) |  |  [optional] |
|**active** | **Boolean** |  |  [optional] |
|**isProprietaryCode** | **Boolean** |  |  [optional] |



## Enum: InitiatorTypeEnum

| Name | Value |
|---- | -----|
| EDGE_APPLICATION | &quot;edge_application&quot; |
| EDGE_FIREWALL | &quot;edge_firewall&quot; |



