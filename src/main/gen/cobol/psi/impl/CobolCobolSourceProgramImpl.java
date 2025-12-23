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

public class CobolCobolSourceProgramImpl extends ASTWrapperPsiElement implements CobolCobolSourceProgram {

  public CobolCobolSourceProgramImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitCobolSourceProgram(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolDataDivSection getDataDivSection() {
    return findChildByClass(CobolDataDivSection.class);
  }

  @Override
  @NotNull
  public CobolIdDivLine getIdDivLine() {
    return findNotNullChildByClass(CobolIdDivLine.class);
  }

  @Override
  @NotNull
  public CobolProcDivLines getProcDivLines() {
    return findNotNullChildByClass(CobolProcDivLines.class);
  }

  @Override
  @NotNull
  public CobolProgIdLine getProgIdLine() {
    return findNotNullChildByClass(CobolProgIdLine.class);
  }

}
