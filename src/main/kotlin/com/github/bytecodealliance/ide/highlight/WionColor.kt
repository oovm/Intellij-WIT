package com.github.bytecodealliance.ide.highlight

import com.github.bytecodealliance.MessageBundle
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.options.OptionsBundle
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.util.NlsContexts
import java.util.function.Supplier

enum class WionColor(humanName: Supplier<@NlsContexts.AttributeDescriptor String>, default: TextAttributesKey? = null) {
    // 特殊关键词
    KEYWORD(OptionsBundle.messagePointer("options.language.defaults.keyword"), DefaultLanguageHighlighterColors.KEYWORD),
    // 字面量
    NONE(MessageBundle.messagePointer("color.token.null"), DefaultLanguageHighlighterColors.KEYWORD),
    BOOLEAN(MessageBundle.messagePointer("color.token.boolean"), DefaultLanguageHighlighterColors.KEYWORD),
    NUMBER(MessageBundle.messagePointer("color.token.number"), DefaultLanguageHighlighterColors.NUMBER),
    STRING(MessageBundle.messagePointer("color.token.string"), DefaultLanguageHighlighterColors.STRING),
    TEXT(MessageBundle.messagePointer("color.token.text"), STRING.textAttributesKey),
    STRING_ESCAPED(
        MessageBundle.messagePointer("color.token.text"),
        DefaultLanguageHighlighterColors.VALID_STRING_ESCAPE
    ),
    STRING_BAD(MessageBundle.messagePointer("color.token.text"), DefaultLanguageHighlighterColors.INVALID_STRING_ESCAPE),
    // 标识符
    IDENTIFIER(
        OptionsBundle.messagePointer("options.language.defaults.identifier"),
        DefaultLanguageHighlighterColors.IDENTIFIER
    ),
    SYM_WORLD(MessageBundle.messagePointer("color.token.symbol.world"), DefaultLanguageHighlighterColors.INTERFACE_NAME),
    SYM_INTERFACE(
        MessageBundle.messagePointer("color.token.symbol.interface"),
        DefaultLanguageHighlighterColors.INTERFACE_NAME
    ),
    SYM_TYPE(MessageBundle.messagePointer("color.token.symbol.type"), DefaultLanguageHighlighterColors.CLASS_NAME),
    SYM_FIELD(MessageBundle.messagePointer("color.token.symbol.field"), DefaultLanguageHighlighterColors.INSTANCE_FIELD),

    SYM_VARIANT(
        MessageBundle.messagePointer("color.token.symbol.variant"),
        DefaultLanguageHighlighterColors.STATIC_FIELD
    ),
    //    SYM_ATTRIBUTE(WitBundle.messagePointer("color.token.symbol.attribute"), Default.STATIC_METHOD),
//    SYM_VARIABLE(WitBundle.messagePointer("color.token.symbol.variable"), Default.REASSIGNED_PARAMETER),
    SYM_FUNCTION(
        MessageBundle.messagePointer("color.token.symbol.function"),
        DefaultLanguageHighlighterColors.FUNCTION_DECLARATION
    ),
    SYM_BUILTIN(
        MessageBundle.messagePointer("color.token.symbol.builtin"),
        DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL
    ),

    // 标点符号
    PARENTHESES(
        OptionsBundle.messagePointer("options.language.defaults.parentheses"),
        DefaultLanguageHighlighterColors.PARENTHESES
    ),
    BRACKETS(
        OptionsBundle.messagePointer("options.language.defaults.brackets"),
        DefaultLanguageHighlighterColors.BRACKETS
    ),
    BRACES(OptionsBundle.messagePointer("options.language.defaults.braces"), DefaultLanguageHighlighterColors.BRACES),
    DOT(OptionsBundle.messagePointer("options.language.defaults.dot"), DefaultLanguageHighlighterColors.DOT),
    COMMA(OptionsBundle.messagePointer("options.language.defaults.comma"), DefaultLanguageHighlighterColors.COMMA),
    OPERATION(MessageBundle.messagePointer("color.token.set"), DefaultLanguageHighlighterColors.OPERATION_SIGN),
    SEMICOLON(
        OptionsBundle.messagePointer("options.language.defaults.semicolon"),
        DefaultLanguageHighlighterColors.SEMICOLON
    ),

    // 注释
    LINE_COMMENT(
        OptionsBundle.messagePointer("options.language.defaults.line.comment"),
        DefaultLanguageHighlighterColors.LINE_COMMENT
    ),
    BLOCK_COMMENT(
        OptionsBundle.messagePointer("options.language.defaults.block.comment"),
        DefaultLanguageHighlighterColors.BLOCK_COMMENT
    ),
    DOC_COMMENT(
        OptionsBundle.messagePointer("options.language.defaults.doc.markup"),
        DefaultLanguageHighlighterColors.DOC_COMMENT
    ),

    // 错误
    BAD_CHARACTER(
        OptionsBundle.messagePointer("options.java.attribute.descriptor.bad.character"),
        HighlighterColors.BAD_CHARACTER
    ),

    // 废弃
    EXTENSION(
        OptionsBundle.messagePointer("options.language.defaults.metadata"),
        DefaultLanguageHighlighterColors.METADATA
    ),
    ;

    val textAttributesKey: TextAttributesKey = TextAttributesKey.createTextAttributesKey("WION.$name", default)
    val attributesDescriptor: AttributesDescriptor = AttributesDescriptor(humanName, textAttributesKey)
    val testSeverity: HighlightSeverity = HighlightSeverity(name, HighlightSeverity.INFORMATION.myVal)
}