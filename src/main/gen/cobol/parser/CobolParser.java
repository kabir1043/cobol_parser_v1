// This is a generated file. Not intended for manual editing.
package cobol.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static cobol.psi.CobolTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CobolParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return cobol_file(b, l + 1);
  }

  /* ********************************************************** */
  // cobol_source_program
  static boolean cobol_file(PsiBuilder b, int l) {
    return cobol_source_program(b, l + 1);
  }

  /* ********************************************************** */
  // id_div_line
  //     prog_id_line
  //     data_div_section?
  //     proc_div_lines
  public static boolean cobol_source_program(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cobol_source_program")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = id_div_line(b, l + 1);
    r = r && prog_id_line(b, l + 1);
    r = r && cobol_source_program_2(b, l + 1);
    r = r && proc_div_lines(b, l + 1);
    exit_section_(b, m, COBOL_SOURCE_PROGRAM, r);
    return r;
  }

  // data_div_section?
  private static boolean cobol_source_program_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cobol_source_program_2")) return false;
    data_div_section(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER EQ NUMBER
  public static boolean cond(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cond")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, EQ, NUMBER);
    exit_section_(b, m, COND, r);
    return r;
  }

  /* ********************************************************** */
  // NUMBER DATA DIVISION DOT
  public static boolean data_div_line(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_div_line")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NUMBER, DATA, DIVISION, DOT);
    exit_section_(b, m, DATA_DIV_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // data_div_line
  //     working_storage_line
  //     data_item_line*
  public static boolean data_div_section(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_div_section")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = data_div_line(b, l + 1);
    r = r && working_storage_line(b, l + 1);
    r = r && data_div_section_2(b, l + 1);
    exit_section_(b, m, DATA_DIV_SECTION, r);
    return r;
  }

  // data_item_line*
  private static boolean data_div_section_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_div_section_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!data_item_line(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "data_div_section_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // NUMBER IDENTIFIER PIC PIC_STRING VALUE literal
  public static boolean data_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_item")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NUMBER, IDENTIFIER, PIC, PIC_STRING, VALUE);
    r = r && literal(b, l + 1);
    exit_section_(b, m, DATA_ITEM, r);
    return r;
  }

  /* ********************************************************** */
  // NUMBER data_item DOT
  public static boolean data_item_line(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_item_line")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    r = r && data_item(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, DATA_ITEM_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER | STRING
  public static boolean display_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "display_arg")) return false;
    if (!nextTokenIs(b, "<display arg>", IDENTIFIER, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DISPLAY_ARG, "<display arg>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DISPLAY display_arg+ DOT
  public static boolean display_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "display_stmt")) return false;
    if (!nextTokenIs(b, DISPLAY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DISPLAY);
    r = r && display_stmt_1(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, DISPLAY_STMT, r);
    return r;
  }

  // display_arg+
  private static boolean display_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "display_stmt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = display_arg(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!display_arg(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "display_stmt_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NUMBER IDENTIFICATION DIVISION DOT
  public static boolean id_div_line(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_div_line")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NUMBER, IDENTIFICATION, DIVISION, DOT);
    exit_section_(b, m, ID_DIV_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // NUMBER | STRING
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    if (!nextTokenIs(b, "<literal>", NUMBER, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NUMBER para_name DOT
  public static boolean para_line(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "para_line")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    r = r && para_name(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, PARA_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean para_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "para_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, PARA_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // PERFORM para_name perform_vary
  public static boolean perform_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perform_stmt")) return false;
    if (!nextTokenIs(b, PERFORM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERFORM);
    r = r && para_name(b, l + 1);
    r = r && perform_vary(b, l + 1);
    exit_section_(b, m, PERFORM_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // VARYING IDENTIFIER FROM value_ BY value_ UNTIL cond
  public static boolean perform_vary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perform_vary")) return false;
    if (!nextTokenIs(b, VARYING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, VARYING, IDENTIFIER, FROM);
    r = r && value_(b, l + 1);
    r = r && consumeToken(b, BY);
    r = r && value_(b, l + 1);
    r = r && consumeToken(b, UNTIL);
    r = r && cond(b, l + 1);
    exit_section_(b, m, PERFORM_VARY, r);
    return r;
  }

  /* ********************************************************** */
  // NUMBER PROCEDURE DIVISION DOT
  public static boolean proc_div_line(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "proc_div_line")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NUMBER, PROCEDURE, DIVISION, DOT);
    exit_section_(b, m, PROC_DIV_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // proc_div_line (para_line | stmt_line)*
  public static boolean proc_div_lines(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "proc_div_lines")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = proc_div_line(b, l + 1);
    r = r && proc_div_lines_1(b, l + 1);
    exit_section_(b, m, PROC_DIV_LINES, r);
    return r;
  }

  // (para_line | stmt_line)*
  private static boolean proc_div_lines_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "proc_div_lines_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!proc_div_lines_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "proc_div_lines_1", c)) break;
    }
    return true;
  }

  // para_line | stmt_line
  private static boolean proc_div_lines_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "proc_div_lines_1_0")) return false;
    boolean r;
    r = para_line(b, l + 1);
    if (!r) r = stmt_line(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // NUMBER PROG_ID DOT IDENTIFIER DOT
  public static boolean prog_id_line(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prog_id_line")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NUMBER, PROG_ID, DOT, IDENTIFIER, DOT);
    exit_section_(b, m, PROG_ID_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // perform_stmt
  //     | stop_stmt
  //     | display_stmt
  public static boolean stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STMT, "<stmt>");
    r = perform_stmt(b, l + 1);
    if (!r) r = stop_stmt(b, l + 1);
    if (!r) r = display_stmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NUMBER stmt
  public static boolean stmt_line(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_line")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    r = r && stmt(b, l + 1);
    exit_section_(b, m, STMT_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // STOP RUN DOT
  public static boolean stop_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stop_stmt")) return false;
    if (!nextTokenIs(b, STOP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STOP, RUN, DOT);
    exit_section_(b, m, STOP_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER | NUMBER
  public static boolean value_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_")) return false;
    if (!nextTokenIs(b, "<value>", IDENTIFIER, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_, "<value>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, NUMBER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NUMBER WORKING_STORAGE SECTION DOT
  public static boolean working_storage_line(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "working_storage_line")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NUMBER, WORKING_STORAGE, SECTION, DOT);
    exit_section_(b, m, WORKING_STORAGE_LINE, r);
    return r;
  }

}
