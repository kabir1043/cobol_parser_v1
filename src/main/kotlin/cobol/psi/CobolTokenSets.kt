package cobol.psi

import com.intellij.psi.tree.TokenSet

object CobolTokenSets {
    val IDENTIFIERS: TokenSet = TokenSet.create(CobolTypes.IDENTIFIER)
    val COMMENTS: TokenSet = TokenSet.EMPTY
    val STRINGS: TokenSet = TokenSet.create(CobolTypes.STRING)
}