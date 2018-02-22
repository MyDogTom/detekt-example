package com.github.mydogtom.detekt.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "active",
    "thresholdInFiles",
    "thresholdInClasses",
    "thresholdInInterfaces",
    "thresholdInObjects",
    "thresholdInEnums"
)
class TooManyFunctions : BaseActivatedSetting() {

    @JsonProperty("thresholdInFiles")
    var thresholdInFiles: Int? = null
    @JsonProperty("thresholdInClasses")
    var thresholdInClasses: Int? = null
    @JsonProperty("thresholdInInterfaces")
    var thresholdInInterfaces: Int? = null
    @JsonProperty("thresholdInObjects")
    var thresholdInObjects: Int? = null
    @JsonProperty("thresholdInEnums")
    var thresholdInEnums: Int? = null
}
