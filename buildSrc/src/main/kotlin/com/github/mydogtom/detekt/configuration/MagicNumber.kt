package com.github.mydogtom.detekt.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "active",
    "ignoreNumbers",
    "ignoreHashCodeFunction",
    "ignorePropertyDeclaration",
    "ignoreConstantDeclaration",
    "ignoreCompanionObjectPropertyDeclaration",
    "ignoreAnnotation",
    "ignoreNamedArgument",
    "ignoreEnums"
)
class MagicNumber : BaseActivatedSetting() {

    @JsonProperty("ignoreNumbers")
    var ignoreNumbers: String? = null
    @JsonProperty("ignoreHashCodeFunction")
    var ignoreHashCodeFunction: Boolean? = null
    @JsonProperty("ignorePropertyDeclaration")
    var ignorePropertyDeclaration: Boolean? = null
    @JsonProperty("ignoreConstantDeclaration")
    var ignoreConstantDeclaration: Boolean? = null
    @JsonProperty("ignoreCompanionObjectPropertyDeclaration")
    var ignoreCompanionObjectPropertyDeclaration: Boolean? = null
    @JsonProperty("ignoreAnnotation")
    var ignoreAnnotation: Boolean? = null
    @JsonProperty("ignoreNamedArgument")
    var ignoreNamedArgument: Boolean? = null
    @JsonProperty("ignoreEnums")
    var ignoreEnums: Boolean? = null

}
