package com.github.mydogtom.detekt.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

import groovy.lang.Closure

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "active",
    "EmptyCatchBlock",
    "EmptyClassBlock",
    "EmptyDefaultConstructor",
    "EmptyDoWhileBlock",
    "EmptyElseBlock",
    "EmptyFinallyBlock",
    "EmptyForBlock",
    "EmptyFunctionBlock",
    "EmptyIfBlock",
    "EmptyInitBlock",
    "EmptyKtFile",
    "EmptySecondaryConstructor",
    "EmptyWhenBlock",
    "EmptyWhileBlock"
)
class EmptyBlocks : BaseActivatedSetting() {

    @JsonProperty("EmptyCatchBlock")
    var emptyCatchBlock: EmptyCatchBlock? = null
    @JsonProperty("EmptyClassBlock")
    var emptyClassBlock: BaseActivatedSetting? = null
    @JsonProperty("EmptyDefaultConstructor")
    var emptyDefaultConstructor: BaseActivatedSetting? = null
    @JsonProperty("EmptyDoWhileBlock")
    var emptyDoWhileBlock: BaseActivatedSetting? = null
    @JsonProperty("EmptyElseBlock")
    var emptyElseBlock: BaseActivatedSetting? = null
    @JsonProperty("EmptyFinallyBlock")
    var emptyFinallyBlock: BaseActivatedSetting? = null
    @JsonProperty("EmptyForBlock")
    var emptyForBlock: BaseActivatedSetting? = null
    @JsonProperty("EmptyFunctionBlock")
    var emptyFunctionBlock: BaseActivatedSetting? = null
    @JsonProperty("EmptyIfBlock")
    var emptyIfBlock: BaseActivatedSetting? = null
    @JsonProperty("EmptyInitBlock")
    var emptyInitBlock: BaseActivatedSetting? = null
    @JsonProperty("EmptyKtFile")
    var emptyKtFile: BaseActivatedSetting? = null
    @JsonProperty("EmptySecondaryConstructor")
    var emptySecondaryConstructor: BaseActivatedSetting? = null
    @JsonProperty("EmptyWhenBlock")
    var emptyWhenBlock: BaseActivatedSetting? = null
    @JsonProperty("EmptyWhileBlock")
    var emptyWhileBlock: BaseActivatedSetting? = null

    fun emptyCatchBlock(closure: Closure<EmptyCatchBlock>) {
//        emptyCatchBlock = EmptyCatchBlock().configure(closure)
    }

    fun emptyClassBlock(closure: Closure<BaseActivatedSetting>) {
//        emptyClassBlock = BaseActivatedSetting().configure(closure)
    }

    fun emptyDefaultConstructor(closure: Closure<BaseActivatedSetting>) {
//        emptyDefaultConstructor = BaseActivatedSetting().configure(closure)
    }

    fun emptyDoWhileBlock(closure: Closure<BaseActivatedSetting>) {
//        emptyDoWhileBlock = BaseActivatedSetting().configure(closure)
    }

    fun emptyElseBlock(closure: Closure<BaseActivatedSetting>) {
//        emptyElseBlock = BaseActivatedSetting().configure(closure)
    }

    fun emptyFinallyBlock(closure: Closure<BaseActivatedSetting>) {
//        emptyFinallyBlock = BaseActivatedSetting().configure(closure)
    }

    fun emptyForBlock(closure: Closure<BaseActivatedSetting>) {
//        emptyForBlock = BaseActivatedSetting().configure(closure)
    }

    fun emptyFunctionBlock(closure: Closure<BaseActivatedSetting>) {
//        emptyFunctionBlock = BaseActivatedSetting().configure(closure)
    }

    fun emptyIfBlock(closure: Closure<BaseActivatedSetting>) {
//        emptyIfBlock = BaseActivatedSetting().configure(closure)
    }

    fun emptyInitBlock(closure: Closure<BaseActivatedSetting>) {
//        emptyInitBlock = BaseActivatedSetting().configure(closure)
    }

    fun emptyKtFile(closure: Closure<BaseActivatedSetting>) {
//        emptyKtFile = BaseActivatedSetting().configure(closure)
    }

    fun emptySecondaryConstructor(closure: Closure<BaseActivatedSetting>) {
//        emptySecondaryConstructor = BaseActivatedSetting().configure(closure)
    }

    fun emptyWhenBlock(closure: Closure<BaseActivatedSetting>) {
//        emptyWhenBlock = BaseActivatedSetting().configure(closure)
    }

    fun emptyWhileBlock(closure: Closure<BaseActivatedSetting>) {
//        emptyWhileBlock = BaseActivatedSetting().configure(closure)
    }

}
