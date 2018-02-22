package com.github.mydogtom.detekt.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("active", "excludeAnnotatedProperties", "ignoreOnClassesPattern")
class LateinitUsage : BaseActivatedSetting() {

    @JsonProperty("excludeAnnotatedProperties")
    var excludeAnnotatedProperties: String? = null
    @JsonProperty("ignoreOnClassesPattern")
    var ignoreOnClassesPattern: String? = null

}
