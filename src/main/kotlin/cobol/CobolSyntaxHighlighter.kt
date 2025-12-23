package cobol

import cobol.psi.CobolTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

class CobolSyntaxHighlighter : SyntaxHighlighterBase() {
    companion object {
        val KEYWORD = TextAttributesKey.createTextAttributesKey(
            "COBOL_KEYWORD",
            DefaultLanguageHighlighterColors.KEYWORD
        )
        val NUMBER = TextAttributesKey.createTextAttributesKey(
            "COBOL_NUMBER",
            DefaultLanguageHighlighterColors.NUMBER
        )
        val STRING = TextAttributesKey.createTextAttributesKey(
            "COBOL_STRING",
            DefaultLanguageHighlighterColors.STRING
        )
        val IDENTIFIER = TextAttributesKey.createTextAttributesKey(
            "COBOL_IDENTIFIER",
            DefaultLanguageHighlighterColors.IDENTIFIER
        )
        val OPERATOR = TextAttributesKey.createTextAttributesKey(
            "COBOL_OPERATOR",
            DefaultLanguageHighlighterColors.OPERATION_SIGN
        )
        val BAD_CHARACTER = TextAttributesKey.createTextAttributesKey(
            "COBOL_BAD_CHARACTER",
            HighlighterColors.BAD_CHARACTER
        )

        val KEYWORD_KEYS = arrayOf(KEYWORD)
        val NUMBER_KEYS = arrayOf(NUMBER)
        val STRING_KEYS = arrayOf(STRING)
        val IDENTIFIER_KEYS = arrayOf(IDENTIFIER)
        val OPERATOR_KEYS = arrayOf(OPERATOR)
        val BAD_CHAR_KEYS = arrayOf(BAD_CHARACTER)
        val EMPTY_KEYS = arrayOfNulls<TextAttributesKey>(0)

    }

    override fun getHighlightingLexer(): Lexer = CobolLexerAdapter()

    override fun getTokenHighlights(p0: IElementType?): Array<out TextAttributesKey?> =
        when (p0) {

            // KEYWORDS
            CobolTypes.IDENTIFICATION,
            CobolTypes.DIVISION,
            CobolTypes.PROG_ID,
            CobolTypes.DATA,
            CobolTypes.WORKING_STORAGE,
            CobolTypes.SECTION,
            CobolTypes.PROCEDURE,
            CobolTypes.PERFORM,
            CobolTypes.VARYING,
            CobolTypes.FROM,
            CobolTypes.BY,
            CobolTypes.UNTIL,
            CobolTypes.STOP,
            CobolTypes.RUN,
            CobolTypes.DISPLAY,
            CobolTypes.PIC,
            CobolTypes.VALUE
                -> KEYWORD_KEYS

            // OPERATORS
            CobolTypes.DOT,
            CobolTypes.EQ,
            CobolTypes.LPAREN,
            CobolTypes.RPAREN
                -> OPERATOR_KEYS


            CobolTypes.IDENTIFIER ->
                IDENTIFIER_KEYS
            CobolTypes.NUMBER ->
                NUMBER_KEYS
            CobolTypes.STRING ->
                STRING_KEYS

            // ERRORS
            TokenType.BAD_CHARACTER ->
                BAD_CHAR_KEYS

            else -> EMPTY_KEYS
        }
}