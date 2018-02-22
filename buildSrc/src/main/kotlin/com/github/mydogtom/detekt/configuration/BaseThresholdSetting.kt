package com.github.mydogtom.detekt.configuration

import com.fasterxml.jackson.annotation.JsonProperty

abstract class BaseThresholdSetting : BaseActivatedSetting() {
    @JsonProperty("threshold")
    var threshold: Int? = null
}