package com.github.mydogtom.detekt.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

import groovy.lang.Closure

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("active", "ForEachOnRange", "SpreadOperator", "UnnecessaryTemporaryInstantiation")
class Performance : BaseActivatedSetting() {

    @JsonProperty("ForEachOnRange")
    var forEachOnRange: BaseActivatedSetting? = null
    @JsonProperty("SpreadOperator")
    var spreadOperator: BaseActivatedSetting? = null
    @JsonProperty("UnnecessaryTemporaryInstantiation")
    var unnecessaryTemporaryInstantiation: BaseActivatedSetting? = null

    fun forEachOnRange(closure: Closure<BaseActivatedSetting>) {
//        forEachOnRange = BaseActivatedSetting().configure(closure)
    }

    fun spreadOperator(closure: Closure<BaseActivatedSetting>) {
//        spreadOperator = BaseActivatedSetting().configure(closure)
    }

    fun unnecessaryTemporaryInstantiation(closure: Closure<BaseActivatedSetting>) {
//        unnecessaryTemporaryInstantiation = BaseActivatedSetting().configure(closure)
    }

}
