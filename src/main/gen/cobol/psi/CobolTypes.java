// This is a generated file. Not intended for manual editing.
package cobol.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import cobol.psi.impl.*;

public interface CobolTypes {

  IElementType COBOL_SOURCE_PROGRAM = new CobolElementType("COBOL_SOURCE_PROGRAM");
  IElementType COND = new CobolElementType("COND");
  IElementType DATA_DIV_LINE = new CobolElementType("DATA_DIV_LINE");
  IElementType DATA_DIV_SECTION = new CobolElementType("DATA_DIV_SECTION");
  IElementType DATA_ITEM = new CobolElementType("DATA_ITEM");
  IElementType DATA_ITEM_LINE = new CobolElementType("DATA_ITEM_LINE");
  IElementType DISPLAY_ARG = new CobolElementType("DISPLAY_ARG");
  IElementType DISPLAY_STMT = new CobolElementType("DISPLAY_STMT");
  IElementType ID_DIV_LINE = new CobolElementType("ID_DIV_LINE");
  IElementType LITERAL = new CobolElementType("LITERAL");
  IElementType PARA_LINE = new CobolElementType("PARA_LINE");
  IElementType PARA_NAME = new CobolElementType("PARA_NAME");
  IElementType PERFORM_STMT = new CobolElementType("PERFORM_STMT");
  IElementType PERFORM_VARY = new CobolElementType("PERFORM_VARY");
  IElementType PROC_DIV_LINE = new CobolElementType("PROC_DIV_LINE");
  IElementType PROC_DIV_LINES = new CobolElementType("PROC_DIV_LINES");
  IElementType PROG_ID_LINE = new CobolElementType("PROG_ID_LINE");
  IElementType STMT = new CobolElementType("STMT");
  IElementType STMT_LINE = new CobolElementType("STMT_LINE");
  IElementType STOP_STMT = new CobolElementType("STOP_STMT");
  IElementType VALUE_ = new CobolElementType("VALUE_");
  IElementType WORKING_STORAGE_LINE = new CobolElementType("WORKING_STORAGE_LINE");

  IElementType BY = new CobolTokenType("BY");
  IElementType DATA = new CobolTokenType("DATA");
  IElementType DISPLAY = new CobolTokenType("DISPLAY");
  IElementType DIVISION = new CobolTokenType("DIVISION");
  IElementType DOT = new CobolTokenType("DOT");
  IElementType EQ = new CobolTokenType("EQ");
  IElementType FROM = new CobolTokenType("FROM");
  IElementType IDENTIFICATION = new CobolTokenType("IDENTIFICATION");
  IElementType IDENTIFIER = new CobolTokenType("IDENTIFIER");
  IElementType NUMBER = new CobolTokenType("NUMBER");
  IElementType PERFORM = new CobolTokenType("PERFORM");
  IElementType PIC = new CobolTokenType("PIC");
  IElementType PIC_STRING = new CobolTokenType("PIC_STRING");
  IElementType PROCEDURE = new CobolTokenType("PROCEDURE");
  IElementType PROG_ID = new CobolTokenType("PROG_ID");
  IElementType RUN = new CobolTokenType("RUN");
  IElementType SECTION = new CobolTokenType("SECTION");
  IElementType STOP = new CobolTokenType("STOP");
  IElementType STRING = new CobolTokenType("STRING");
  IElementType UNTIL = new CobolTokenType("UNTIL");
  IElementType VALUE = new CobolTokenType("VALUE");
  IElementType VARYING = new CobolTokenType("VARYING");
  IElementType WORKING_STORAGE = new CobolTokenType("WORKING_STORAGE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == COBOL_SOURCE_PROGRAM) {
        return new CobolCobolSourceProgramImpl(node);
      }
      else if (type == COND) {
        return new CobolCondImpl(node);
      }
      else if (type == DATA_DIV_LINE) {
        return new CobolDataDivLineImpl(node);
      }
      else if (type == DATA_DIV_SECTION) {
        return new CobolDataDivSectionImpl(node);
      }
      else if (type == DATA_ITEM) {
        return new CobolDataItemImpl(node);
      }
      else if (type == DATA_ITEM_LINE) {
        return new CobolDataItemLineImpl(node);
      }
      else if (type == DISPLAY_ARG) {
        return new CobolDisplayArgImpl(node);
      }
      else if (type == DISPLAY_STMT) {
        return new CobolDisplayStmtImpl(node);
      }
      else if (type == ID_DIV_LINE) {
        return new CobolIdDivLineImpl(node);
      }
      else if (type == LITERAL) {
        return new CobolLiteralImpl(node);
      }
      else if (type == PARA_LINE) {
        return new CobolParaLineImpl(node);
      }
      else if (type == PARA_NAME) {
        return new CobolParaNameImpl(node);
      }
      else if (type == PERFORM_STMT) {
        return new CobolPerformStmtImpl(node);
      }
      else if (type == PERFORM_VARY) {
        return new CobolPerformVaryImpl(node);
      }
      else if (type == PROC_DIV_LINE) {
        return new CobolProcDivLineImpl(node);
      }
      else if (type == PROC_DIV_LINES) {
        return new CobolProcDivLinesImpl(node);
      }
      else if (type == PROG_ID_LINE) {
        return new CobolProgIdLineImpl(node);
      }
      else if (type == STMT) {
        return new CobolStmtImpl(node);
      }
      else if (type == STMT_LINE) {
        return new CobolStmtLineImpl(node);
      }
      else if (type == STOP_STMT) {
        return new CobolStopStmtImpl(node);
      }
      else if (type == VALUE_) {
        return new CobolValue_Impl(node);
      }
      else if (type == WORKING_STORAGE_LINE) {
        return new CobolWorkingStorageLineImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
