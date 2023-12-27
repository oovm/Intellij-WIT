package com.github.bytecodealliance.language;


import static com.github.bytecodealliance.language.psi.WionTypes.*;
import static com.intellij.json.JsonElementTypes.LINE_COMMENT;
import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;

%%

//%{
//public WitLexer() {
//	this((java.io.Reader)null);
//}
//%}

%public
%class _WionLexer
%implements com.intellij.lexer.FlexLexer
%function advance
%type com.intellij.psi.tree.IElementType
%unicode

//%state TextContextIndent

WHITE_SPACE      = [\s\t]
COMMENT_LINE     = [/]{2}[^\r\n]*
COMMENT_BLOCK    = [/][*][^*]*[*]+([^/*][^*]*[*]+)*[/]
//SYMBOL=[\p{XID_Start}_][\p{XID_Continue}_]*
ESCAPED = %[a-zA-Z0-9\-]+
// namespace:package/module_function@2024.2.4-semver
SYMBOL = [@/.\-\p{XID_Continue}]+
WORD = [a-zA-Z][a-zA-Z0-9]*
//STRING=\"([^\"\\]|\\.)*\"
INTEGER=(0|[1-9][0-9_]*)
DECIMAL=([0-9]+\.[0-9]*([Ee][0-9]+)?)|(\.[0-9]+([Ee][0-9]+)?)

STRING_S1 = '[^']*'
STRING_S2 = \"(\\.|[^\\])*\"

KW_SOME  = "some"
KW_NONE  = "none"
KW_FINE  = "fine"
KW_FAIL  = "fail"
KW_TRUE  = "true"
KW_FALSE = "false"
%%

<YYINITIAL> {
    {WHITE_SPACE}+     { return WHITE_SPACE; }
	{COMMENT_LINE}     { return LINE_COMMENT; }
//	{COMMENT_BLOCK}    { return COMMENT_BLOCK; }
}

<YYINITIAL> {
	"(" { return PARENTHESIS_L; }
    ")" { return PARENTHESIS_R; }
    "[" { return BRACKET_L; }
    "]" { return BRACKET_R; }
	"{" { return BRACE_L; }
	"}" { return BRACE_R; }
//	"<" { return ANGLE_L; }
//	">" { return ANGLE_R; }
	"=" { return EQ; }
}
<YYINITIAL> {
	{KW_SOME} { return KW_SOME; }
	{KW_NONE} { return KW_NONE; }

	{KW_FINE} { return KW_FINE; }
	{KW_FAIL} { return KW_FAIL; }

	{KW_TRUE}  { return KW_TRUE; }
	{KW_FALSE} { return KW_FALSE; }

	{STRING_S1} { return STRING_S1; }
	{STRING_S2} { return STRING_S2; }

	{SYMBOL}  { return SYMBOL; }
}
// =====================================================================================================================
[^] { return BAD_CHARACTER; }
