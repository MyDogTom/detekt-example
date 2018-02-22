package com.github.mydogtom.detekt.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("active", "minimumVariableNameLength")
class VariableMinLength : BaseActivatedSetting() {

    @JsonProperty("minimumVariableNameLength")
    var minimumVariableNameLength: Int? = null

}
