package com.github.mydogtom.detekt

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.github.mydogtom.detekt.configuration.Build
import com.github.mydogtom.detekt.configuration.Comments
import com.github.mydogtom.detekt.configuration.Complexity
import com.github.mydogtom.detekt.configuration.ConsoleReports
import com.github.mydogtom.detekt.configuration.EmptyBlocks
import com.github.mydogtom.detekt.configuration.Exceptions
import com.github.mydogtom.detekt.configuration.Naming
import com.github.mydogtom.detekt.configuration.OutputReports
import com.github.mydogtom.detekt.configuration.Performance
import com.github.mydogtom.detekt.configuration.PotentialBugs
import com.github.mydogtom.detekt.configuration.Processors
import com.github.mydogtom.detekt.configuration.Style
import com.github.mydogtom.detekt.configuration.TestPattern
import groovy.lang.Closure

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "autoCorrect",
    "failFast",
    "test-pattern",
    "build",
    "processors",
    "console-reports",
    "output-reports",
    "comments",
    "complexity",
    "empty-blocks",
    "exceptions",
    "naming",
    "performance",
    "potential-bugs",
    "style"
)
open class DetektConfig {

    @JsonProperty("autoCorrect")
    var autoCorrect: Boolean? = null
    @JsonProperty("failFast")
    var failFast: Boolean? = null
    @JsonProperty("test-pattern")
    var testPattern: TestPattern? = null
    @JsonProperty("build")
    var build: Build? = null
    @JsonProperty("processors")
    var processors: Processors? = null
    @JsonProperty("console-reports")
    var consoleReports: ConsoleReports? = null
    @JsonProperty("output-reports")
    var outputReports: OutputReports? = null
    @JsonProperty("comments")
    var comments: Comments? = null
    @JsonProperty("complexity")
    var complexity: Complexity? = null
    @JsonProperty("empty-blocks")
    var emptyBlocks: EmptyBlocks? = null
    @JsonProperty("exceptions")
    var exceptions: Exceptions? = null
    @JsonProperty("naming")
    var naming: Naming? = null
    @JsonProperty("performance")
    var performance: Performance? = null
    @JsonProperty("potential-bugs")
    var potentialBugs: PotentialBugs? = null
    @JsonProperty("style")
    var style: Style? = null

    fun testPattern(closure: Closure<TestPattern>) {
        testPattern = TestPattern().configure(closure)
    }

    fun build(closure: Closure<Build>) {
        build = Build().configure(closure)
    }

    fun processors(closure: Closure<Processors>) {
        processors = Processors().configure(closure)
    }

    fun consoleReports(closure: Closure<ConsoleReports>) {
        consoleReports = ConsoleReports().configure(closure)
    }

    fun outputReports(closure: Closure<OutputReports>) {
        outputReports = OutputReports().configure(closure)
    }

    fun comments(closure: Closure<Comments>) {
        comments = Comments().configure(closure)
    }

    fun complexity(closure: Closure<Complexity>) {
        complexity = Complexity().configure(closure)
    }

    fun emptyBlocks(closure: Closure<EmptyBlocks>) {
        emptyBlocks = EmptyBlocks().configure(closure)
    }

    fun exceptions(closure: Closure<Exceptions>) {
        exceptions = Exceptions().configure(closure)
    }

    fun naming(closure: Closure<Naming>) {
        naming = Naming().configure(closure)
    }

    fun performance(closure: Closure<Performance>) {
        performance = Performance().configure(closure)
    }

    fun potentialBugs(closure: Closure<PotentialBugs>) {
        potentialBugs = PotentialBugs().configure(closure)
    }

    fun style(closure: Closure<Style>) {
        style = Style().configure(closure)
    }
}