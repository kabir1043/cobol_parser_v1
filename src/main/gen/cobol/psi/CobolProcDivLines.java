// This is a generated file. Not intended for manual editing.
package cobol.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolProcDivLines extends PsiElement {

  @NotNull
  List<CobolParaLine> getParaLineList();

  @NotNull
  CobolProcDivLine getProcDivLine();

  @NotNull
  List<CobolStmtLine> getStmtLineList();

}
