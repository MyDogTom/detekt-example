package com.github.mydogtom.detekt.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("active", "threshold", "ignoreAnnotation", "excludeStringsWithLessThan5Characters", "ignoreStringsRegex")
class StringLiteralDuplication : BaseThresholdSetting() {

    @JsonProperty("ignoreAnnotation")
    var ignoreAnnotation: Boolean? = null
    @JsonProperty("excludeStringsWithLessThan5Characters")
    var excludeStringsWithLessThan5Characters: Boolean? = null
    @JsonProperty("ignoreStringsRegex")
    var ignoreStringsRegex: String? = null

}
