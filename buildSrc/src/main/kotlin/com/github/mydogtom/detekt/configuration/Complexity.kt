package com.github.mydogtom.detekt.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

import groovy.lang.Closure

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "active",
    "ComplexCondition",
    "ComplexInterface",
    "ComplexMethod",
    "LabeledExpression",
    "LargeClass",
    "LongMethod",
    "LongParameterList",
    "MethodOverloading",
    "NestedBlockDepth",
    "StringLiteralDuplication",
    "TooManyFunctions"
)
class Complexity: BaseActivatedSetting() {

    @JsonProperty("ComplexCondition")
    var complexCondition: ComplexCondition? = null
    @JsonProperty("ComplexInterface")
    var complexInterface: ComplexInterface? = null
    @JsonProperty("ComplexMethod")
    var complexMethod: ComplexMethod? = null
    @JsonProperty("LabeledExpression")
    var labeledExpression: LabeledExpression? = null
    @JsonProperty("LargeClass")
    var largeClass: LargeClass? = null
    @JsonProperty("LongMethod")
    var longMethod: LongMethod? = null
    @JsonProperty("LongParameterList")
    var longParameterList: LongParameterList? = null
    @JsonProperty("MethodOverloading")
    var methodOverloading: MethodOverloading? = null
    @JsonProperty("NestedBlockDepth")
    var nestedBlockDepth: NestedBlockDepth? = null
    @JsonProperty("StringLiteralDuplication")
    var stringLiteralDuplication: StringLiteralDuplication? = null
    @JsonProperty("TooManyFunctions")
    var tooManyFunctions: TooManyFunctions? = null

    fun complexCondition(closure: Closure<ComplexCondition>) {
//        complexCondition = ComplexCondition().configure(closure)
    }
    fun complexInterface(closure: Closure<ComplexInterface>) {
//        complexInterface = ComplexInterface().configure(closure)
    }
    fun complexMethod(closure: Closure<ComplexMethod>) {
//        complexMethod = ComplexMethod().configure(closure)
    }
    fun labeledExpression(closure: Closure<LabeledExpression>) {
//        labeledExpression = LabeledExpression().configure(closure)
    }
    fun largeClass(closure: Closure<LargeClass>) {
//        largeClass = LargeClass().configure(closure)
    }
    fun longMethod(closure: Closure<LongMethod>) {
//        longMethod = LongMethod().configure(closure)
    }
    fun longParameterList(closure: Closure<LongParameterList>) {
//        longParameterList = LongParameterList().configure(closure)
    }
    fun methodOverloading(closure: Closure<MethodOverloading>) {
//        methodOverloading = MethodOverloading().configure(closure)
    }
    fun nestedBlockDepth(closure: Closure<NestedBlockDepth>) {
//        nestedBlockDepth = NestedBlockDepth().configure(closure)
    }
    fun stringLiteralDuplication(closure: Closure<StringLiteralDuplication>) {
//        stringLiteralDuplication = StringLiteralDuplication().configure(closure)
    }
    fun tooManyFunctions(closure: Closure<TooManyFunctions>) {
//        tooManyFunctions = TooManyFunctions().configure(closure)
    }
}
