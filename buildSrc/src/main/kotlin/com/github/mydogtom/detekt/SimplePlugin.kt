package com.github.mydogtom.detekt

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.JavaExec

open class SimplePlugin: Plugin<Project> {



    override fun apply(project: Project) {
        val extension = project.extensions.create(extensionName, DetektExtension::class.java)

        project.configurations.maybeCreate(configurationName)
            .setVisible(true)
            .setDescription("Detekt configuration")

        val generationTask = project.tasks.create(generationTaskName, ConfigGenerationTask::class.java)

        project.afterEvaluate({
            it.dependencies.add(configurationName, "io.gitlab.arturbosch.detekt:detekt-cli:1.0.0.RC6-1")

        })
        val configPath = generationTask.outputFile.absolutePath

        project.tasks.create("detektCheck", JavaExec::class.java) { task ->
            task.inputs.files(project.fileTree(mapOf("dir" to "src", "include" to "**/*.kt")))
            task.args(
                "--config", configPath,
                "--input", project.projectDir.absolutePath,
                "--filters", ".*src/\\w*[Tt]est/.*"
            )
            task.main = "io.gitlab.arturbosch.detekt.cli.Main"
            task.classpath = project.configurations.findByName(configurationName)
            task.dependsOn(generationTaskName)
        }
    }
    companion object {
        const val extensionName = "detekt"
        private const val configurationName = "detekt"
        private const val generationTaskName = "generateDetektConfig"

    }
}