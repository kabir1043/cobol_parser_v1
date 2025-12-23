package cobol;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import cobol.psi.CobolTypes;
import com.intellij.psi.TokenType;

%%

%class CobolLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{ return;
%eof}

WHITE_SPACE = [\ \t\r\n]+
LETTER      = [A-Za-z]
DIGIT       = [0-9]
IDENTIFIER  = {LETTER}({LETTER}|{DIGIT}|"-")*
NUMBER      = {DIGIT}+
STRING      = "'"[^']*"'"

%%

/* KEYWORDS */
<YYINITIAL> "IDENTIFICATION"        { return CobolTypes.IDENTIFICATION; }
<YYINITIAL> "DIVISION"              { return CobolTypes.DIVISION; }
<YYINITIAL> "PROGRAM-ID"            { return CobolTypes.PROG_ID; }
<YYINITIAL> "DATA"                  { return CobolTypes.DATA; }
<YYINITIAL> "WORKING-STORAGE"       { return CobolTypes.WORKING_STORAGE; }
<YYINITIAL> "SECTION"               { return CobolTypes.SECTION; }
<YYINITIAL> "PROCEDURE"             { return CobolTypes.PROCEDURE; }
<YYINITIAL> "PERFORM"               { return CobolTypes.PERFORM; }
<YYINITIAL> "VARYING"               { return CobolTypes.VARYING; }
<YYINITIAL> "FROM"                  { return CobolTypes.FROM; }
<YYINITIAL> "BY"                    { return CobolTypes.BY; }
<YYINITIAL> "UNTIL"                 { return CobolTypes.UNTIL; }
<YYINITIAL> "STOP"                  { return CobolTypes.STOP; }
<YYINITIAL> "RUN"                   { return CobolTypes.RUN; }
<YYINITIAL> "DISPLAY"               { return CobolTypes.DISPLAY; }
<YYINITIAL> "PIC"                   { return CobolTypes.PIC; }
<YYINITIAL> "VALUE"                 { return CobolTypes.VALUE; }

/* SYMBOLS */
<YYINITIAL> "."                     { return CobolTypes.DOT; }
<YYINITIAL> "="                     { return CobolTypes.EQ; }
<YYINITIAL> "("                     { return CobolTypes.LPAREN; }
<YYINITIAL> ")"                     { return CobolTypes.RPAREN; }

/* LITERALS */
<YYINITIAL> {NUMBER}                { return CobolTypes.NUMBER; }
<YYINITIAL> {STRING}                { return CobolTypes.STRING; }

/* IDENTIFIERS */
<YYINITIAL> {IDENTIFIER}            { return CobolTypes.IDENTIFIER; }

/* WHITESPACE AND ERRORS */
{WHITE_SPACE}                       { return TokenType.WHITE_SPACE; }
[^]                                 { return TokenType.BAD_CHARACTER; }