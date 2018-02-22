package com.github.mydogtom.detekt.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("active", "maxLineLength", "excludePackageStatements", "excludeImportStatements")
class MaxLineLength : BaseActivatedSetting() {

    @JsonProperty("maxLineLength")
    var maxLineLength: Int? = null
    @JsonProperty("excludePackageStatements")
    var excludePackageStatements: Boolean? = null
    @JsonProperty("excludeImportStatements")
    var excludeImportStatements: Boolean? = null

}
