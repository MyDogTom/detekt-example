package com.github.mydogtom.detekt.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import groovy.lang.Closure

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("active", "patterns", "exclude-rule-sets", "exclude-rules")
class TestPattern {

    @JsonProperty("active")
    var active: Boolean? = null
    @JsonProperty("patterns")
    var patterns: MutableList<String>? = null
    @JsonProperty("exclude-rule-sets")
    var excludeRuleSets: MutableList<String>? = null
    @JsonProperty("exclude-rules")
    var excludeRules: MutableList<String>? = null

    fun patterns(closure: Closure<MutableList<String>>) {
//        patterns = mutableListOf<String>().configure(closure)
    }

    fun excludeRuleSets(closure: Closure<MutableList<String>>) {
//        excludeRuleSets = mutableListOf<String>().configure(closure)
    }

    fun excludeRules(closure: Closure<MutableList<String>>) {
//        excludeRules = mutableListOf<String>().configure(closure)
    }
}
