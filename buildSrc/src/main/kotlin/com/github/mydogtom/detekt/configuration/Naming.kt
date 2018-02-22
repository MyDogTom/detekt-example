package com.github.mydogtom.detekt.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

import groovy.lang.Closure

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "active",
    "ClassNaming",
    "EnumNaming",
    "ForbiddenClassName",
    "FunctionMaxLength",
    "FunctionMinLength",
    "FunctionNaming",
    "MatchingDeclarationName",
    "MemberNameEqualsClassName",
    "ObjectPropertyNaming",
    "PackageNaming",
    "TopLevelPropertyNaming",
    "VariableMaxLength",
    "VariableMinLength",
    "VariableNaming"
)
class Naming : BaseActivatedSetting() {

    @JsonProperty("ClassNaming")
    var classNaming: ClassNaming? = null
    @JsonProperty("EnumNaming")
    var enumNaming: EnumNaming? = null
    @JsonProperty("ForbiddenClassName")
    var forbiddenClassName: ForbiddenClassName? = null
    @JsonProperty("FunctionMaxLength")
    var functionMaxLength: FunctionMaxLength? = null
    @JsonProperty("FunctionMinLength")
    var functionMinLength: FunctionMinLength? = null
    @JsonProperty("FunctionNaming")
    var functionNaming: FunctionNaming? = null
    @JsonProperty("MatchingDeclarationName")
    var matchingDeclarationName: BaseActivatedSetting? = null
    @JsonProperty("MemberNameEqualsClassName")
    var memberNameEqualsClassName: MemberNameEqualsClassName? = null
    @JsonProperty("ObjectPropertyNaming")
    var objectPropertyNaming: ObjectPropertyNaming? = null
    @JsonProperty("PackageNaming")
    var packageNaming: PackageNaming? = null
    @JsonProperty("TopLevelPropertyNaming")
    var topLevelPropertyNaming: TopLevelPropertyNaming? = null
    @JsonProperty("VariableMaxLength")
    var variableMaxLength: VariableMaxLength? = null
    @JsonProperty("VariableMinLength")
    var variableMinLength: VariableMinLength? = null
    @JsonProperty("VariableNaming")
    var variableNaming: VariableNaming? = null

    fun classNaming(closure: Closure<ClassNaming>) {
//        classNaming = ClassNaming().configure(closure)
    }

    fun enumNaming(closure: Closure<EnumNaming>) {
//        enumNaming = EnumNaming().configure(closure)
    }

    fun forbiddenClassName(closure: Closure<ForbiddenClassName>) {
//        forbiddenClassName = ForbiddenClassName().configure(closure)
    }

    fun functionMaxLength(closure: Closure<FunctionMaxLength>) {
//        functionMaxLength = FunctionMaxLength().configure(closure)
    }

    fun functionMinLength(closure: Closure<FunctionMinLength>) {
//        functionMinLength = FunctionMinLength().configure(closure)
    }

    fun functionNaming(closure: Closure<FunctionNaming>) {
//        functionNaming = FunctionNaming().configure(closure)
    }

    fun matchingDeclarationName(closure: Closure<BaseActivatedSetting>) {
//        matchingDeclarationName = BaseActivatedSetting().configure(closure)
    }

    fun memberNameEqualsClassName(closure: Closure<MemberNameEqualsClassName>) {
//        memberNameEqualsClassName = MemberNameEqualsClassName().configure(closure)
    }

    fun objectPropertyNaming(closure: Closure<ObjectPropertyNaming>) {
//        objectPropertyNaming = ObjectPropertyNaming().configure(closure)
    }

    fun packageNaming(closure: Closure<PackageNaming>) {
//        packageNaming = PackageNaming().configure(closure)
    }

    fun topLevelPropertyNaming(closure: Closure<TopLevelPropertyNaming>) {
//        topLevelPropertyNaming = TopLevelPropertyNaming().configure(closure)
    }

    fun variableMaxLength(closure: Closure<VariableMaxLength>) {
//        variableMaxLength = VariableMaxLength().configure(closure)
    }

    fun variableMinLength(closure: Closure<VariableMinLength>) {
//        variableMinLength = VariableMinLength().configure(closure)
    }

    fun variableNaming(closure: Closure<VariableNaming>) {
//        variableNaming = VariableNaming().configure(closure)
    }
}
