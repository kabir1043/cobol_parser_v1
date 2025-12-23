package cobol

import cobol.parser.CobolParser
import cobol.psi.CobolFile
import cobol.psi.CobolTokenSets
import cobol.psi.CobolTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

class CobolParserDefinition : ParserDefinition {

    companion object {
        val FILE = IFileElementType(CobolLanguage.INSTANCE)
    }
    override fun createLexer(p0: Project?): Lexer = CobolLexerAdapter()
    override fun createParser(p0: Project?): PsiParser = CobolParser()
    override fun getFileNodeType(): IFileElementType = FILE
    override fun getCommentTokens(): TokenSet = CobolTokenSets.COMMENTS
    override fun getStringLiteralElements(): TokenSet = CobolTokenSets.STRINGS
    override fun createElement(p0: ASTNode?): PsiElement = CobolTypes.Factory.createElement(p0)
    override fun createFile(p0: FileViewProvider): PsiFile = CobolFile(p0)

}