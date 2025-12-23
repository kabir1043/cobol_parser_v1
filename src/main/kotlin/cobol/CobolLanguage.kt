package cobol

import com.intellij.lang.Language

class CobolLanguage private constructor() : Language("Cobol"){
    companion object {
        val INSTANCE = CobolLanguage()
    }
}