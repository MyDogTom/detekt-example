package com.github.mydogtom.detekt.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

import groovy.lang.Closure

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("active", "exclude")
class Processors {

    @JsonProperty("active")
    var active: Boolean? = null
    @JsonProperty("exclude")
    var exclude: MutableList<String>? = null

    fun exclude(closure: Closure<MutableList<String>>) {
//        exclude = mutableListOf<String>().configure(closure)
    }

}
