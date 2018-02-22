package com.github.mydogtom.detekt.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("active", "searchInNestedClass", "searchInInnerClass", "searchInInnerObject", "searchInInnerInterface")
class UndocumentedPublicClass: BaseActivatedSetting() {

    @JsonProperty("searchInNestedClass")
    var searchInNestedClass: Boolean? = null
    @JsonProperty("searchInInnerClass")
    var searchInInnerClass: Boolean? = null
    @JsonProperty("searchInInnerObject")
    var searchInInnerObject: Boolean? = null
    @JsonProperty("searchInInnerInterface")
    var searchInInnerInterface: Boolean? = null
}
