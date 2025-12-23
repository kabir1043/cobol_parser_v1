package cobol.psi

import cobol.CobolLanguage
import com.intellij.psi.tree.IElementType

class CobolElementType(debugName: String): IElementType(debugName, CobolLanguage.INSTANCE) {
}