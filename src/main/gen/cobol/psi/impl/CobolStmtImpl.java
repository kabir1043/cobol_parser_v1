// This is a generated file. Not intended for manual editing.
package cobol.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static cobol.psi.CobolTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import cobol.psi.*;

public class CobolStmtImpl extends ASTWrapperPsiElement implements CobolStmt {

  public CobolStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolDisplayStmt getDisplayStmt() {
    return findChildByClass(CobolDisplayStmt.class);
  }

  @Override
  @Nullable
  public CobolPerformStmt getPerformStmt() {
    return findChildByClass(CobolPerformStmt.class);
  }

  @Override
  @Nullable
  public CobolStopStmt getStopStmt() {
    return findChildByClass(CobolStopStmt.class);
  }

}
