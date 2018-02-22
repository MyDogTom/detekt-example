package com.github.mydogtom.detekt.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

import groovy.lang.Closure

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("warningThreshold", "failThreshold", "weights")
class Build {

    @JsonProperty("warningThreshold")
    var warningThreshold: Int? = null
    @JsonProperty("failThreshold")
    var failThreshold: Int? = null
    @JsonProperty("weights")
    var weights: Weights? = null

    fun weights(closure: Closure<Weights>) {
//        weights = Weights().configure(closure)
    }
}
