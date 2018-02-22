package com.github.mydogtom.detekt.configuration

import com.fasterxml.jackson.annotation.JsonProperty

open class BaseActivatedSetting {
    @JsonProperty("active")
    var active: Boolean? = null
}