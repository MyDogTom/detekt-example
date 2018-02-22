package com.github.mydogtom.detekt.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

import groovy.lang.Closure

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "active",
    "DuplicateCaseInWhenExpression",
    "EqualsAlwaysReturnsTrueOrFalse",
    "EqualsWithHashCodeExist",
    "ExplicitGarbageCollectionCall",
    "InvalidRange",
    "IteratorHasNextCallsNextMethod",
    "IteratorNotThrowingNoSuchElementException",
    "LateinitUsage",
    "UnconditionalJumpStatementInLoop",
    "UnreachableCode",
    "UnsafeCallOnNullableType",
    "UnsafeCast",
    "UselessPostfixExpression",
    "WrongEqualsTypeParameter"
)
class PotentialBugs : BaseActivatedSetting() {

    @JsonProperty("DuplicateCaseInWhenExpression")
    var duplicateCaseInWhenExpression: BaseActivatedSetting? = null
    @JsonProperty("EqualsAlwaysReturnsTrueOrFalse")
    var equalsAlwaysReturnsTrueOrFalse: BaseActivatedSetting? = null
    @JsonProperty("EqualsWithHashCodeExist")
    var equalsWithHashCodeExist: BaseActivatedSetting? = null
    @JsonProperty("ExplicitGarbageCollectionCall")
    var explicitGarbageCollectionCall: BaseActivatedSetting? = null
    @JsonProperty("InvalidRange")
    var invalidRange: BaseActivatedSetting? = null
    @JsonProperty("IteratorHasNextCallsNextMethod")
    var iteratorHasNextCallsNextMethod: BaseActivatedSetting? = null
    @JsonProperty("IteratorNotThrowingNoSuchElementException")
    var iteratorNotThrowingNoSuchElementException: BaseActivatedSetting? = null
    @JsonProperty("LateinitUsage")
    var lateinitUsage: LateinitUsage? = null
    @JsonProperty("UnconditionalJumpStatementInLoop")
    var unconditionalJumpStatementInLoop: BaseActivatedSetting? = null
    @JsonProperty("UnreachableCode")
    var unreachableCode: BaseActivatedSetting? = null
    @JsonProperty("UnsafeCallOnNullableType")
    var unsafeCallOnNullableType: BaseActivatedSetting? = null
    @JsonProperty("UnsafeCast")
    var unsafeCast: BaseActivatedSetting? = null
    @JsonProperty("UselessPostfixExpression")
    var uselessPostfixExpression: BaseActivatedSetting? = null
    @JsonProperty("WrongEqualsTypeParameter")
    var wrongEqualsTypeParameter: BaseActivatedSetting? = null

    fun duplicateCaseInWhenExpression(closure: Closure<BaseActivatedSetting>) {
//        duplicateCaseInWhenExpression = BaseActivatedSetting().configure(closure)
    }

    fun equalsAlwaysReturnsTrueOrFalse(closure: Closure<BaseActivatedSetting>) {
//        equalsAlwaysReturnsTrueOrFalse = BaseActivatedSetting().configure(closure)
    }

    fun equalsWithHashCodeExist(closure: Closure<BaseActivatedSetting>) {
//        equalsWithHashCodeExist = BaseActivatedSetting().configure(closure)
    }

    fun explicitGarbageCollectionCall(closure: Closure<BaseActivatedSetting>) {
//        explicitGarbageCollectionCall = BaseActivatedSetting().configure(closure)
    }

    fun invalidRange(closure: Closure<BaseActivatedSetting>) {
//        invalidRange = BaseActivatedSetting().configure(closure)
    }

    fun iteratorHasNextCallsNextMethod(closure: Closure<BaseActivatedSetting>) {
//        iteratorHasNextCallsNextMethod = BaseActivatedSetting().configure(closure)
    }

    fun iteratorNotThrowingNoSuchElementException(closure: Closure<BaseActivatedSetting>) {
//        iteratorNotThrowingNoSuchElementException = BaseActivatedSetting().configure(closure)
    }

    fun lateinitUsage(closure: Closure<LateinitUsage>) {
//        lateinitUsage = LateinitUsage().configure(closure)
    }

    fun unconditionalJumpStatementInLoop(closure: Closure<BaseActivatedSetting>) {
//        unconditionalJumpStatementInLoop = BaseActivatedSetting().configure(closure)
    }

    fun unreachableCode(closure: Closure<BaseActivatedSetting>) {
//        unreachableCode = BaseActivatedSetting().configure(closure)
    }

    fun unsafeCallOnNullableType(closure: Closure<BaseActivatedSetting>) {
//        unsafeCallOnNullableType = BaseActivatedSetting().configure(closure)
    }

    fun unsafeCast(closure: Closure<BaseActivatedSetting>) {
//        unsafeCast = BaseActivatedSetting().configure(closure)
    }

    fun uselessPostfixExpression(closure: Closure<BaseActivatedSetting>) {
//        uselessPostfixExpression = BaseActivatedSetting().configure(closure)
    }

    fun wrongEqualsTypeParameter(closure: Closure<BaseActivatedSetting>) {
//        wrongEqualsTypeParameter = BaseActivatedSetting().configure(closure)
    }

}
