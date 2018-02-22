package com.github.mydogtom.detekt.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.github.mydogtom.detekt.configure

import groovy.lang.Closure

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "active",
    "CollapsibleIfStatements",
    "DataClassContainsFunctions",
    "EqualsNullCall",
    "ExpressionBodySyntax",
    "ForbiddenComment",
    "ForbiddenImport",
    "FunctionOnlyReturningConstant",
    "LoopWithTooManyJumpStatements",
    "MagicNumber",
    "MaxLineLength",
    "MayBeConst",
    "ModifierOrder",
    "NestedClassesVisibility",
    "NewLineAtEndOfFile",
    "OptionalAbstractKeyword",
    "OptionalUnit",
    "OptionalWhenBraces",
    "ProtectedMemberInFinalClass",
    "RedundantVisibilityModifierRule",
    "ReturnCount",
    "SafeCast",
    "SerialVersionUIDInSerializableClass",
    "SpacingBetweenPackageAndImports",
    "ThrowsCount",
    "UnnecessaryAbstractClass",
    "UnnecessaryInheritance",
    "UnnecessaryParentheses",
    "UntilInsteadOfRangeTo",
    "UnusedImports",
    "UnusedPrivateMember",
    "UseDataClass",
    "UtilityClassWithPublicConstructor",
    "WildcardImport"
)
class Style : BaseActivatedSetting() {

    @JsonProperty("CollapsibleIfStatements")
    var collapsibleIfStatements: BaseActivatedSetting? = null
    @JsonProperty("DataClassContainsFunctions")
    var dataClassContainsFunctions: DataClassContainsFunctions? = null
    @JsonProperty("EqualsNullCall")
    var equalsNullCall: BaseActivatedSetting? = null
    @JsonProperty("ExpressionBodySyntax")
    var expressionBodySyntax: BaseActivatedSetting? = null
    @JsonProperty("ForbiddenComment")
    var forbiddenComment: ForbiddenComment? = null
    @JsonProperty("ForbiddenImport")
    var forbiddenImport: ForbiddenImport? = null
    @JsonProperty("FunctionOnlyReturningConstant")
    var functionOnlyReturningConstant: FunctionOnlyReturningConstant? = null
    @JsonProperty("LoopWithTooManyJumpStatements")
    var loopWithTooManyJumpStatements: LoopWithTooManyJumpStatements? = null
    @JsonProperty("MagicNumber")
    var magicNumber: MagicNumber? = null
    @JsonProperty("MaxLineLength")
    var maxLineLength: MaxLineLength? = null
    @JsonProperty("MayBeConst")
    var mayBeConst: BaseActivatedSetting? = null
    @JsonProperty("ModifierOrder")
    var modifierOrder: BaseActivatedSetting? = null
    @JsonProperty("NestedClassesVisibility")
    var nestedClassesVisibility: BaseActivatedSetting? = null
    @JsonProperty("NewLineAtEndOfFile")
    var newLineAtEndOfFile: BaseActivatedSetting? = null
    @JsonProperty("OptionalAbstractKeyword")
    var optionalAbstractKeyword: BaseActivatedSetting? = null
    @JsonProperty("OptionalUnit")
    var optionalUnit: BaseActivatedSetting? = null
    @JsonProperty("OptionalWhenBraces")
    var optionalWhenBraces: BaseActivatedSetting? = null
    @JsonProperty("ProtectedMemberInFinalClass")
    var protectedMemberInFinalClass: BaseActivatedSetting? = null
    @JsonProperty("RedundantVisibilityModifierRule")
    var redundantVisibilityModifierRule: BaseActivatedSetting? = null
    @JsonProperty("ReturnCount")
    var returnCount: ReturnCount? = null
    @JsonProperty("SafeCast")
    var safeCast: BaseActivatedSetting? = null
    @JsonProperty("SerialVersionUIDInSerializableClass")
    var serialVersionUIDInSerializableClass: BaseActivatedSetting? = null
    @JsonProperty("SpacingBetweenPackageAndImports")
    var spacingBetweenPackageAndImports: BaseActivatedSetting? = null
    @JsonProperty("ThrowsCount")
    var throwsCount: ThrowsCount? = null
    @JsonProperty("UnnecessaryAbstractClass")
    var unnecessaryAbstractClass: BaseActivatedSetting? = null
    @JsonProperty("UnnecessaryInheritance")
    var unnecessaryInheritance: BaseActivatedSetting? = null
    @JsonProperty("UnnecessaryParentheses")
    var unnecessaryParentheses: BaseActivatedSetting? = null
    @JsonProperty("UntilInsteadOfRangeTo")
    var untilInsteadOfRangeTo: BaseActivatedSetting? = null
    @JsonProperty("UnusedImports")
    var unusedImports: BaseActivatedSetting? = null
    @JsonProperty("UnusedPrivateMember")
    var unusedPrivateMember: BaseActivatedSetting? = null
    @JsonProperty("UseDataClass")
    var useDataClass: UseDataClass? = null
    @JsonProperty("UtilityClassWithPublicConstructor")
    var utilityClassWithPublicConstructor: BaseActivatedSetting? = null
    @JsonProperty("WildcardImport")
    var wildcardImport: WildcardImport? = null

    fun collapsibleIfStatements(closure: Closure<BaseActivatedSetting>) {
        collapsibleIfStatements = BaseActivatedSetting().configure(closure)
    }

    fun dataClassContainsFunctions(closure: Closure<DataClassContainsFunctions>) {
        dataClassContainsFunctions = DataClassContainsFunctions().configure(closure)
    }

    fun equalsNullCall(closure: Closure<BaseActivatedSetting>) {
        equalsNullCall = BaseActivatedSetting().configure(closure)
    }

    fun expressionBodySyntax(closure: Closure<BaseActivatedSetting>) {
        expressionBodySyntax = BaseActivatedSetting().configure(closure)
    }

    fun forbiddenComment(closure: Closure<ForbiddenComment>) {
        forbiddenComment = ForbiddenComment().configure(closure)
    }

    fun forbiddenImport(closure: Closure<ForbiddenImport>) {
        forbiddenImport = ForbiddenImport().configure(closure)
    }

    fun functionOnlyReturningConstant(closure: Closure<FunctionOnlyReturningConstant>) {
        functionOnlyReturningConstant = FunctionOnlyReturningConstant().configure(closure)
    }

    fun loopWithTooManyJumpStatements(closure: Closure<LoopWithTooManyJumpStatements>) {
        loopWithTooManyJumpStatements = LoopWithTooManyJumpStatements().configure(closure)
    }

    fun magicNumber(closure: Closure<MagicNumber>) {
        magicNumber = MagicNumber().configure(closure)
    }

    fun maxLineLength(closure: Closure<MaxLineLength>) {
        maxLineLength = MaxLineLength().configure(closure)
    }

    fun mayBeConst(closure: Closure<BaseActivatedSetting>) {
        mayBeConst = BaseActivatedSetting().configure(closure)
    }

    fun modifierOrder(closure: Closure<BaseActivatedSetting>) {
        modifierOrder = BaseActivatedSetting().configure(closure)
    }

    fun nestedClassesVisibility(closure: Closure<BaseActivatedSetting>) {
        nestedClassesVisibility = BaseActivatedSetting().configure(closure)
    }

    fun newLineAtEndOfFile(closure: Closure<BaseActivatedSetting>) {
        newLineAtEndOfFile = BaseActivatedSetting().configure(closure)
    }

    fun optionalAbstractKeyword(closure: Closure<BaseActivatedSetting>) {
        optionalAbstractKeyword = BaseActivatedSetting().configure(closure)
    }

    fun optionalUnit(closure: Closure<BaseActivatedSetting>) {
        optionalUnit = BaseActivatedSetting().configure(closure)
    }

    fun optionalWhenBraces(closure: Closure<BaseActivatedSetting>) {
        optionalWhenBraces = BaseActivatedSetting().configure(closure)
    }

    fun protectedMemberInFinalClass(closure: Closure<BaseActivatedSetting>) {
        protectedMemberInFinalClass = BaseActivatedSetting().configure(closure)
    }

    fun redundantVisibilityModifierRule(closure: Closure<BaseActivatedSetting>) {
        redundantVisibilityModifierRule = BaseActivatedSetting().configure(closure)
    }

    fun returnCount(closure: Closure<ReturnCount>) {
        returnCount = ReturnCount().configure(closure)
    }

    fun safeCast(closure: Closure<BaseActivatedSetting>) {
        safeCast = BaseActivatedSetting().configure(closure)
    }

    fun serialVersionUIDInSerializableClass(closure: Closure<BaseActivatedSetting>) {
        serialVersionUIDInSerializableClass = BaseActivatedSetting().configure(closure)
    }

    fun spacingBetweenPackageAndImports(closure: Closure<BaseActivatedSetting>) {
        spacingBetweenPackageAndImports = BaseActivatedSetting().configure(closure)
    }

    fun throwsCount(closure: Closure<ThrowsCount>) {
        throwsCount = ThrowsCount().configure(closure)
    }

    fun unnecessaryAbstractClass(closure: Closure<BaseActivatedSetting>) {
        unnecessaryAbstractClass = BaseActivatedSetting().configure(closure)
    }

    fun unnecessaryInheritance(closure: Closure<BaseActivatedSetting>) {
        unnecessaryInheritance = BaseActivatedSetting().configure(closure)
    }

    fun unnecessaryParentheses(closure: Closure<BaseActivatedSetting>) {
        unnecessaryParentheses = BaseActivatedSetting().configure(closure)
    }

    fun untilInsteadOfRangeTo(closure: Closure<BaseActivatedSetting>) {
        untilInsteadOfRangeTo = BaseActivatedSetting().configure(closure)
    }

    fun unusedImports(closure: Closure<BaseActivatedSetting>) {
        unusedImports = BaseActivatedSetting().configure(closure)
    }

    fun unusedPrivateMember(closure: Closure<BaseActivatedSetting>) {
        unusedPrivateMember = BaseActivatedSetting().configure(closure)
    }

    fun useDataClass(closure: Closure<UseDataClass>) {
        useDataClass = UseDataClass().configure(closure)
    }

    fun utilityClassWithPublicConstructor(closure: Closure<BaseActivatedSetting>) {
        utilityClassWithPublicConstructor = BaseActivatedSetting().configure(closure)
    }

    fun wildcardImport(closure: Closure<WildcardImport>) {
        wildcardImport = WildcardImport().configure(closure)
    }
}
