package cobol.psi

import cobol.CobolLanguage
import com.intellij.psi.tree.IElementType

class CobolTokenType(debugName: String): IElementType(debugName, CobolLanguage.INSTANCE) {
    override fun toString() = "CobolTokenType." + super.toString()
}