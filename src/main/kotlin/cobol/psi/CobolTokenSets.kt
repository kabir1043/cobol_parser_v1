package cobol.psi

import com.intellij.psi.tree.TokenSet

object CobolTokenSets {
    val IDENTIFIERS: TokenSet = TokenSet.create(CobolTypes.IDENTIFIER)
    val COMMENTS: TokenSet = TokenSet.EMPTY
    // Assuming that a pic string is to be treated as an identifier, and must be tokenized as a string
    val STRINGS: TokenSet = TokenSet.create(CobolTypes.STRING, CobolTypes.PIC_STRING)
}