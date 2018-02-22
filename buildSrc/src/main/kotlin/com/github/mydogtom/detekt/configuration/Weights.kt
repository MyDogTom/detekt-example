package com.github.mydogtom.detekt.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("complexity", "formatting", "LongParameterList", "comments")
class Weights {

    @JsonProperty("complexity")
    var complexity: Int? = null
    @JsonProperty("formatting")
    var formatting: Int? = null
    @JsonProperty("LongParameterList")
    var longParameterList: Int? = null
    @JsonProperty("comments")
    var comments: Int? = null
}
