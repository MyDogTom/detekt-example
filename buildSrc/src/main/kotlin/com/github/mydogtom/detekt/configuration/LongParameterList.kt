package com.github.mydogtom.detekt.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("active", "threshold", "ignoreDefaultParameters")
class LongParameterList : BaseThresholdSetting() {

    @JsonProperty("ignoreDefaultParameters")
    var ignoreDefaultParameters: Boolean? = null
}
