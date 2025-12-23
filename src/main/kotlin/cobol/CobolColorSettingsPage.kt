package cobol

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import com.intellij.openapi.util.NlsContexts
import org.jetbrains.annotations.NonNls
import javax.swing.Icon

class CobolColorSettingsPage: ColorSettingsPage {

    companion object {
        val DESCRIPTORS = arrayOf(
            AttributesDescriptor("Keywords", CobolSyntaxHighlighter.KEYWORD),
            AttributesDescriptor("Identifiers", CobolSyntaxHighlighter.IDENTIFIER),
            AttributesDescriptor("Literals//Numbers", CobolSyntaxHighlighter.NUMBER),
            AttributesDescriptor("Literals//Strings", CobolSyntaxHighlighter.STRING),
            AttributesDescriptor("Operators", CobolSyntaxHighlighter.OPERATOR),
            AttributesDescriptor("Bad characters", CobolSyntaxHighlighter.BAD_CHARACTER)
        )
    }
    override fun getIcon(): Icon? = CobolIcons.FILE
    override fun getHighlighter(): SyntaxHighlighter = CobolSyntaxHighlighter()
    override fun getDemoText(): @NonNls String =
        """
        01 IDENTIFICATION DIVISION.
        02 PROGRAM-ID. HELLO.
        03 DATA DIVISION.
        04 WORKING-STORAGE SECTION.
        05 01 WS-A PIC 9(2) VALUE 0.
        06 PROCEDURE DIVISION.
        07 A-PARA.
        08 DISPLAY 'B-PARA ' WS-A.
        09 STOP RUN.
        """.trimIndent()

    override fun getAdditionalHighlightingTagToDescriptorMap(): Map<String?, TextAttributesKey?>? = null
    override fun getAttributeDescriptors(): Array<out AttributesDescriptor?> = DESCRIPTORS
    override fun getColorDescriptors(): Array<out ColorDescriptor?> = ColorDescriptor.EMPTY_ARRAY
    override fun getDisplayName(): @NlsContexts.ConfigurableName String = "Cobol"
}