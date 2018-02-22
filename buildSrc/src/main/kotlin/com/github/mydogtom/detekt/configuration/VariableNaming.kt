package com.github.mydogtom.detekt.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("active", "variablePattern", "privateVariablePattern")
class VariableNaming : BaseActivatedSetting() {

    @JsonProperty("variablePattern")
    var variablePattern: String? = null
    @JsonProperty("privateVariablePattern")
    var privateVariablePattern: String? = null

}
