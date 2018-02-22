package com.github.mydogtom.detekt.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

import groovy.lang.Closure

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "active",
    "ExceptionRaisedInUnexpectedLocation",
    "InstanceOfCheckForException",
    "NotImplementedDeclaration",
    "PrintStackTrace",
    "RethrowCaughtException",
    "ReturnFromFinally",
    "SwallowedException",
    "ThrowingExceptionFromFinally",
    "ThrowingExceptionInMain",
    "ThrowingExceptionsWithoutMessageOrCause",
    "ThrowingNewInstanceOfSameException",
    "TooGenericExceptionCaught",
    "TooGenericExceptionThrown"
)
class Exceptions: BaseActivatedSetting() {

    @JsonProperty("ExceptionRaisedInUnexpectedLocation")
    var exceptionRaisedInUnexpectedLocation: ExceptionRaisedInUnexpectedLocation? = null
    @JsonProperty("InstanceOfCheckForException")
    var instanceOfCheckForException: BaseActivatedSetting? = null
    @JsonProperty("NotImplementedDeclaration")
    var notImplementedDeclaration: BaseActivatedSetting? = null
    @JsonProperty("PrintStackTrace")
    var printStackTrace: BaseActivatedSetting? = null
    @JsonProperty("RethrowCaughtException")
    var rethrowCaughtException: BaseActivatedSetting? = null
    @JsonProperty("ReturnFromFinally")
    var returnFromFinally: BaseActivatedSetting? = null
    @JsonProperty("SwallowedException")
    var swallowedException: BaseActivatedSetting? = null
    @JsonProperty("ThrowingExceptionFromFinally")
    var throwingExceptionFromFinally: BaseActivatedSetting? = null
    @JsonProperty("ThrowingExceptionInMain")
    var throwingExceptionInMain: BaseActivatedSetting? = null
    @JsonProperty("ThrowingExceptionsWithoutMessageOrCause")
    var throwingExceptionsWithoutMessageOrCause: ThrowingExceptionsWithoutMessageOrCause? = null
    @JsonProperty("ThrowingNewInstanceOfSameException")
    var throwingNewInstanceOfSameException: BaseActivatedSetting? = null
    @JsonProperty("TooGenericExceptionCaught")
    var tooGenericExceptionCaught: TooGenericExceptionCaught? = null
    @JsonProperty("TooGenericExceptionThrown")
    var tooGenericExceptionThrown: TooGenericExceptionThrown? = null

    fun exceptionRaisedInUnexpectedLocation(closure: Closure<ExceptionRaisedInUnexpectedLocation>) {
//        exceptionRaisedInUnexpectedLocation = ExceptionRaisedInUnexpectedLocation().configure(closure)
    }

    fun instanceOfCheckForException(closure: Closure<BaseActivatedSetting>) {
//        instanceOfCheckForException = BaseActivatedSetting().configure(closure)
    }

    fun notImplementedDeclaration(closure: Closure<BaseActivatedSetting>) {
//        notImplementedDeclaration = BaseActivatedSetting().configure(closure)
    }

    fun printStackTrace(closure: Closure<BaseActivatedSetting>) {
//        printStackTrace = BaseActivatedSetting().configure(closure)
    }

    fun rethrowCaughtException(closure: Closure<BaseActivatedSetting>) {
//        rethrowCaughtException = BaseActivatedSetting().configure(closure)
    }

    fun returnFromFinally(closure: Closure<BaseActivatedSetting>) {
//        returnFromFinally = BaseActivatedSetting().configure(closure)
    }

    fun swallowedException(closure: Closure<BaseActivatedSetting>) {
//        swallowedException = BaseActivatedSetting().configure(closure)
    }

    fun throwingExceptionFromFinally(closure: Closure<BaseActivatedSetting>) {
//        throwingExceptionFromFinally = BaseActivatedSetting().configure(closure)
    }

    fun throwingExceptionInMain(closure: Closure<BaseActivatedSetting>) {
//        throwingExceptionInMain = BaseActivatedSetting().configure(closure)
    }

    fun throwingExceptionsWithoutMessageOrCause(closure: Closure<ThrowingExceptionsWithoutMessageOrCause>) {
//        throwingExceptionsWithoutMessageOrCause = ThrowingExceptionsWithoutMessageOrCause().configure(closure)
    }

    fun throwingNewInstanceOfSameException(closure: Closure<BaseActivatedSetting>) {
//        throwingNewInstanceOfSameException = BaseActivatedSetting().configure(closure)
    }

    fun tooGenericExceptionCaught(closure: Closure<TooGenericExceptionCaught>) {
//        tooGenericExceptionCaught = TooGenericExceptionCaught().configure(closure)
    }

    fun tooGenericExceptionThrown(closure: Closure<TooGenericExceptionThrown>) {
//        tooGenericExceptionThrown = TooGenericExceptionThrown().configure(closure)
    }
}
