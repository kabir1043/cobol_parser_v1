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

public class CobolDataDivSectionImpl extends ASTWrapperPsiElement implements CobolDataDivSection {

  public CobolDataDivSectionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitDataDivSection(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CobolDataDivLine getDataDivLine() {
    return findNotNullChildByClass(CobolDataDivLine.class);
  }

  @Override
  @NotNull
  public List<CobolDataItemLine> getDataItemLineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolDataItemLine.class);
  }

  @Override
  @NotNull
  public CobolWorkingStorageLine getWorkingStorageLine() {
    return findNotNullChildByClass(CobolWorkingStorageLine.class);
  }

}
