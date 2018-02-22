package com.github.mydogtom.detekt.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

import groovy.lang.Closure

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "active",
    "CommentOverPrivateFunction",
    "CommentOverPrivateProperty",
    "EndOfSentenceFormat",
    "UndocumentedPublicClass",
    "UndocumentedPublicFunction"
)
class Comments {

    @JsonProperty("active")
    var active: Boolean? = null
    @JsonProperty("CommentOverPrivateFunction")
    var commentOverPrivateFunction: CommentOverPrivateFunction? = null
    @JsonProperty("CommentOverPrivateProperty")
    var commentOverPrivateProperty: CommentOverPrivateProperty? = null
    @JsonProperty("EndOfSentenceFormat")
    var endOfSentenceFormat: EndOfSentenceFormat? = null
    @JsonProperty("UndocumentedPublicClass")
    var undocumentedPublicClass: UndocumentedPublicClass? = null
    @JsonProperty("UndocumentedPublicFunction")
    var undocumentedPublicFunction: UndocumentedPublicFunction? = null

    fun commentOverPrivateFunction(closure: Closure<CommentOverPrivateFunction>) {
//        commentOverPrivateFunction = CommentOverPrivateFunction().configure(closure)
    }

    fun commentOverPrivateProperty(closure: Closure<CommentOverPrivateProperty>) {
//        commentOverPrivateProperty = CommentOverPrivateProperty().configure(closure)
    }

    fun endOfSentenceFormat(closure: Closure<EndOfSentenceFormat>) {
//        endOfSentenceFormat = EndOfSentenceFormat().configure(closure)
    }

    fun undocumentedPublicClass(closure: Closure<UndocumentedPublicClass>) {
//        undocumentedPublicClass = UndocumentedPublicClass().configure(closure)
    }

    fun undocumentedPublicFunction(closure: Closure<UndocumentedPublicFunction>) {
//        undocumentedPublicFunction = UndocumentedPublicFunction().configure(closure)
    }
}
