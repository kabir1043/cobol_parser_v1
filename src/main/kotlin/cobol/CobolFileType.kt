package cobol

import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.NlsContexts
import com.intellij.openapi.util.NlsSafe
import org.jetbrains.annotations.NonNls
import javax.swing.Icon

class CobolFileType : LanguageFileType(CobolLanguage.INSTANCE) {
    override fun getName(): @NonNls String {
        return "Cobol File"
    }

    override fun getDescription(): @NlsContexts.Label String {
        return "Cobol language File"
    }

    override fun getDefaultExtension(): @NlsSafe String {
        return "cob"
    }
    override fun getIcon(): Icon? {
        return CobolIcons.FILE
    }
}