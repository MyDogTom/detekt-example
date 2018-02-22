package com.github.mydogtom.detekt

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import java.io.File

open class ConfigGenerationTask : DefaultTask() {

    val detektConfig = project.extensions.getByName(SimplePlugin.extensionName) as DetektExtension

    val outputDir = "${project.buildDir}${File.separator}detekt"

    val outputFile = File(outputDir, "detekt_config.yml")

    @TaskAction
    fun writeConfig() {
        val outputDirFile = File(outputDir)
        if (!outputDirFile.exists()) {
            outputDirFile.mkdir()
        }
        val mapper = ObjectMapper(YAMLFactory())
        mapper.writeValue(outputFile, detektConfig.config)
    }
}