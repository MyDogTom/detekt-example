package com.github.mydogtom.detekt.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("active", "constantPattern", "propertyPattern", "privatePropertyPattern")
class TopLevelPropertyNaming : BaseActivatedSetting() {

    @JsonProperty("constantPattern")
    var constantPattern: String? = null
    @JsonProperty("propertyPattern")
    var propertyPattern: String? = null
    @JsonProperty("privatePropertyPattern")
    var privatePropertyPattern: String? = null

}
