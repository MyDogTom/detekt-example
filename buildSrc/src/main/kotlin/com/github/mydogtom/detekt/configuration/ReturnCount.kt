package com.github.mydogtom.detekt.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("active", "max", "excludedFunctions")
class ReturnCount : BaseActivatedSetting() {

    @JsonProperty("max")
    var max: Int? = null
    @JsonProperty("excludedFunctions")
    var excludedFunctions: String? = null

}
