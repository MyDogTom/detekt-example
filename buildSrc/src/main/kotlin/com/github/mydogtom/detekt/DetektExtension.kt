package com.github.mydogtom.detekt

import com.github.mydogtom.detekt.DetektConfig
import com.github.mydogtom.detekt.configure
import groovy.lang.Closure

open class DetektExtension {
    var config: DetektConfig = DetektConfig()

    fun config(closure: Closure<DetektConfig>) {
        config = config.configure(closure)
    }
}