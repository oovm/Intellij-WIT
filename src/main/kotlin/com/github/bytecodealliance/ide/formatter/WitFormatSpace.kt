package com.github.bytecodealliance.ide.formatter

import com.github.bytecodealliance.WitLanguage
import com.github.bytecodealliance.language.psi.WitTypes.*
import com.intellij.formatting.SpacingBuilder
import com.intellij.psi.codeStyle.CodeStyleSettings
import com.intellij.psi.codeStyle.CommonCodeStyleSettings
import com.intellij.psi.tree.TokenSet

data class WitFormatSpace(
    val commonSettings: CommonCodeStyleSettings,
    val spacingBuilder: SpacingBuilder
) {
    companion object {
        fun create(settings: CodeStyleSettings): WitFormatSpace {
            val commonSettings = settings.getCommonSettings(WitLanguage)
            return WitFormatSpace(commonSettings, createSpacingBuilder(commonSettings))
        }
        private val space_around = TokenSet.create(
            EQ,
            TO,
        )
        private val remove_space_before = TokenSet.create(
            PARENTHESIS_R,
            BRACKET_R,
            ANGLE_R,
            COMMA,
            SEMICOLON
        )
        private val remove_space_after = TokenSet.create(
            PARENTHESIS_L,
            BRACKET_L,
            ANGLE_L,
        )
        private val remove_space_newline_after = TokenSet.create(
            BRACKET_L,
            DOT,
            DOLLAR,
            STAR,
            HYPHEN
        )
        private val remove_space_newline_before = TokenSet.create(
            BRACKET_R
        )
        private val newline_indent_after = TokenSet.create(TO)

        private val separators = TokenSet.create(COMMA, SEMICOLON)

        private fun createSpacingBuilder(commonSettings: CommonCodeStyleSettings): SpacingBuilder {
            val custom = SpacingBuilder(commonSettings)
                // ,
//                .after(separators).spacing(1, 1, 0, commonSettings.KEEP_LINE_BREAKS, 0)
                // k: v
//                .after(COLON).spacing(1, 1, 0, false, 0)
                // k = v
                .around(space_around).spacing(1, 1, 0, commonSettings.KEEP_LINE_BREAKS, 0)
            // SpacingBuilder { }
            // .before(PROPERTIES_BLOCK).spacing(1, 1, 0, commonSettings.KEEP_LINE_BREAKS, 0)

            return custom
                .before(remove_space_before).spaceIf(false)
                .after(remove_space_after).spaceIf(false)
//                .before(remove_space_newline_before).spacing(0, 0, 0, false, 0)
//                .after(remove_space_newline_after).spacing(0, 0, 0, false, 0)
                .after(newline_indent_after).spacing(0, 0, 0, true, 1)
        }
    }
}