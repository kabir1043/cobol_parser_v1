package cobol.psi

import cobol.CobolFileTypeSingleton
import cobol.CobolLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

public class CobolFile(viewProvider: FileViewProvider): PsiFileBase(viewProvider, CobolLanguage.INSTANCE) {
    override fun getFileType(): FileType = CobolFileTypeSingleton.INSTANCE
    override fun toString(): String = "Cobol File"
}