package com.github.mydogtom.detekt.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("active", "exceptions")
class TooGenericExceptionCaught : BaseActivatedSetting() {

    @JsonProperty("exceptions")
    var exceptions: List<String>? = null
}
