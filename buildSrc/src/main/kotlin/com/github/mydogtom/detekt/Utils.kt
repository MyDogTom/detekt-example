package com.github.mydogtom.detekt

import groovy.lang.Closure
import org.gradle.util.ConfigureUtil

internal fun <T> T.configure(closure: Closure<T>): T {
    return ConfigureUtil.configure(closure, this)
}