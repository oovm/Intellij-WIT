// Generated by JFlex 1.9.1 http://jflex.de/  (tweaked for IntelliJ platform)
// source: wion.flex

package com.github.bytecodealliance.language;


import static com.github.bytecodealliance.language.psi.WionTypes.*;
//import static com.intellij.json.JsonElementTypes.LINE_COMMENT;
import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;


public class _WionLexer implements com.intellij.lexer.FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\1\u0200\1\u0300\1\u0400\1\u0500\1\u0600\1\u0700"+
    "\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00\1\u0e00\1\u0f00"+
    "\1\u1000\1\u0100\1\u1100\1\u1200\1\u1300\1\u0100\1\u1400\1\u1500"+
    "\1\u1600\1\u1700\1\u1800\1\u1900\1\u1a00\1\u1b00\1\u0100\1\u1c00"+
    "\1\u1d00\1\u1e00\12\u1f00\1\u2000\1\u2100\2\u1f00\1\u2200\1\u2300"+
    "\2\u1f00\31\u0100\1\u2400\121\u0100\1\u2500\4\u0100\1\u2600\1\u0100"+
    "\1\u2700\1\u2800\1\u2900\1\u2a00\1\u2b00\1\u2c00\53\u0100\1\u2d00"+
    "\10\u2e00\31\u1f00\1\u0100\1\u2f00\1\u3000\1\u3100\1\u3200\1\u3300"+
    "\1\u3400\1\u3500\1\u3600\1\u3700\1\u3800\1\u3900\1\u3a00\1\u0100"+
    "\1\u3b00\1\u3c00\1\u3d00\1\u3e00\1\u3f00\1\u4000\1\u4100\1\u1f00"+
    "\1\u4200\1\u4300\1\u4400\1\u4500\1\u4600\1\u4700\1\u4800\1\u4900"+
    "\1\u4a00\1\u4b00\1\u4c00\1\u4d00\1\u1f00\1\u4e00\1\u4f00\1\u5000"+
    "\1\u1f00\3\u0100\1\u5100\1\u5200\1\u5300\12\u1f00\4\u0100\1\u5400"+
    "\17\u1f00\2\u0100\1\u5500\41\u1f00\2\u0100\1\u5600\1\u5700\2\u1f00"+
    "\1\u5800\1\u5900\27\u0100\1\u5a00\2\u0100\1\u5b00\45\u1f00\1\u0100"+
    "\1\u5c00\1\u5d00\11\u1f00\1\u5e00\24\u1f00\1\u5f00\1\u6000\1\u1f00"+
    "\1\u6100\1\u6200\1\u6300\1\u6400\2\u1f00\1\u6500\5\u1f00\1\u6600"+
    "\1\u6700\1\u6800\5\u1f00\1\u6900\1\u6a00\4\u1f00\1\u6b00\21\u1f00"+
    "\246\u0100\1\u6c00\20\u0100\1\u6d00\1\u6e00\25\u0100\1\u6f00\34\u0100"+
    "\1\u7000\14\u1f00\2\u0100\1\u7100\u0b06\u1f00\1\u7200\u02fe\u1f00";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\2\22\0\1\1\1\0"+
    "\1\4\1\5\3\0\1\6\1\7\1\10\1\0\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\6\20\2\21"+
    "\1\5\2\0\1\22\2\0\1\5\4\23\1\24\1\23"+
    "\24\5\1\25\1\26\1\27\1\0\1\30\1\0\1\31"+
    "\1\32\2\23\1\33\1\34\2\5\1\35\2\5\1\36"+
    "\1\37\1\40\1\41\2\5\1\42\1\43\1\44\1\45"+
    "\2\5\1\46\2\5\1\47\1\0\1\50\7\0\1\3"+
    "\32\0\1\1\11\0\1\5\12\0\1\5\1\0\1\51"+
    "\2\0\1\5\5\0\27\5\1\0\37\5\1\0\u01ca\5"+
    "\4\0\14\5\16\0\5\5\7\0\1\5\1\0\1\5"+
    "\21\0\160\51\5\5\1\0\2\5\3\0\3\5\1\0"+
    "\1\5\6\0\1\5\1\51\3\5\1\0\1\5\1\0"+
    "\24\5\1\0\123\5\1\0\213\5\1\0\5\51\2\0"+
    "\246\5\1\0\46\5\2\0\1\5\6\0\51\5\10\0"+
    "\55\51\1\0\1\51\1\0\2\51\1\0\2\51\1\0"+
    "\1\51\10\0\33\5\4\0\4\5\35\0\13\51\5\0"+
    "\53\5\37\51\4\0\2\5\1\51\143\5\1\0\1\5"+
    "\7\51\2\0\6\51\2\5\2\51\1\0\4\51\2\5"+
    "\12\51\3\5\2\0\1\5\20\0\1\5\1\51\36\5"+
    "\33\51\2\0\131\5\13\51\1\5\16\0\12\51\41\5"+
    "\11\51\2\5\4\0\1\5\2\0\1\51\2\0\26\5"+
    "\4\51\1\5\11\51\1\5\3\51\1\5\5\51\22\0"+
    "\31\5\3\51\4\0\13\5\65\0\25\5\1\0\10\5"+
    "\25\0\17\51\1\0\41\51\66\5\3\51\1\5\22\51"+
    "\1\5\7\51\12\5\2\51\2\0\12\51\1\0\20\5"+
    "\3\51\1\0\10\5\2\0\2\5\2\0\26\5\1\0"+
    "\7\5\1\0\1\5\3\0\4\5\2\0\1\51\1\5"+
    "\7\51\2\0\2\51\2\0\3\51\1\5\10\0\1\51"+
    "\4\0\2\5\1\0\3\5\2\51\2\0\12\51\2\5"+
    "\12\0\1\5\1\0\1\51\2\0\3\51\1\0\6\5"+
    "\4\0\2\5\2\0\26\5\1\0\7\5\1\0\2\5"+
    "\1\0\2\5\1\0\2\5\2\0\1\51\1\0\5\51"+
    "\4\0\2\51\2\0\3\51\3\0\1\51\7\0\4\5"+
    "\1\0\1\5\7\0\14\51\3\5\1\51\13\0\3\51"+
    "\1\0\11\5\1\0\3\5\1\0\26\5\1\0\7\5"+
    "\1\0\2\5\1\0\5\5\2\0\1\51\1\5\10\51"+
    "\1\0\3\51\1\0\3\51\2\0\1\5\17\0\2\5"+
    "\2\51\2\0\12\51\11\0\1\5\6\51\1\0\3\51"+
    "\1\0\10\5\2\0\2\5\2\0\26\5\1\0\7\5"+
    "\1\0\2\5\1\0\5\5\2\0\1\51\1\5\7\51"+
    "\2\0\2\51\2\0\3\51\10\0\2\51\4\0\2\5"+
    "\1\0\3\5\2\51\2\0\12\51\1\0\1\5\20\0"+
    "\1\51\1\5\1\0\6\5\3\0\3\5\1\0\4\5"+
    "\3\0\2\5\1\0\1\5\1\0\2\5\3\0\2\5"+
    "\3\0\3\5\3\0\14\5\4\0\5\51\3\0\3\51"+
    "\1\0\4\51\2\0\1\5\6\0\1\51\16\0\12\51"+
    "\20\0\5\51\10\5\1\0\3\5\1\0\27\5\1\0"+
    "\20\5\3\0\1\5\7\51\1\0\3\51\1\0\4\51"+
    "\7\0\2\51\1\0\3\5\5\0\2\5\2\51\2\0"+
    "\12\51\20\0\1\5\3\51\1\0\10\5\1\0\3\5"+
    "\1\0\27\5\1\0\12\5\1\0\5\5\2\0\1\51"+
    "\1\5\7\51\1\0\3\51\1\0\4\51\7\0\2\51"+
    "\7\0\1\5\1\0\2\5\2\51\2\0\12\51\1\0"+
    "\2\5\15\0\4\51\1\0\10\5\1\0\3\5\1\0"+
    "\51\5\2\51\1\5\7\51\1\0\3\51\1\0\4\51"+
    "\1\5\5\0\3\5\1\51\7\0\3\5\2\51\2\0"+
    "\12\51\12\0\6\5\2\0\2\51\1\0\22\5\3\0"+
    "\30\5\1\0\11\5\1\0\1\5\2\0\7\5\3\0"+
    "\1\51\4\0\6\51\1\0\1\51\1\0\10\51\6\0"+
    "\12\51\2\0\2\51\15\0\60\5\1\51\1\5\10\51"+
    "\5\0\7\5\10\51\1\0\12\51\47\0\2\5\1\0"+
    "\1\5\1\0\5\5\1\0\30\5\1\0\1\5\1\0"+
    "\12\5\1\51\1\5\12\51\1\5\2\0\5\5\1\0"+
    "\1\5\1\0\6\51\2\0\12\51\2\0\4\5\40\0"+
    "\1\5\27\0\2\51\6\0\12\51\13\0\1\51\1\0"+
    "\1\51\1\0\1\51\4\0\2\51\10\5\1\0\44\5"+
    "\4\0\24\51\1\0\2\51\5\5\13\51\1\0\44\51"+
    "\11\0\1\51\71\0\53\5\24\51\1\5\12\51\6\0"+
    "\6\5\4\51\4\5\3\51\1\5\3\51\2\5\7\51"+
    "\3\5\4\51\15\5\14\51\1\5\17\51\2\0\46\5"+
    "\1\0\1\5\5\0\1\5\2\0\53\5\1\0\115\5"+
    "\1\0\4\5\2\0\7\5\1\0\1\5\1\0\4\5"+
    "\2\0\51\5\1\0\4\5\2\0\41\5\1\0\4\5"+
    "\2\0\7\5\1\0\1\5\1\0\4\5\2\0\17\5"+
    "\1\0\71\5\1\0\4\5\2\0\103\5\2\0\3\51"+
    "\11\0\11\51\16\0\20\5\20\0\126\5\2\0\6\5"+
    "\3\0\u016c\5\2\0\21\5\1\1\32\5\5\0\113\5"+
    "\3\0\13\5\7\0\15\5\1\0\4\5\3\51\13\0"+
    "\22\5\3\51\13\0\22\5\2\51\14\0\15\5\1\0"+
    "\3\5\1\0\2\51\14\0\64\5\40\51\3\0\1\5"+
    "\4\0\1\5\1\51\2\0\12\51\41\0\3\51\2\0"+
    "\12\51\6\0\131\5\7\0\51\5\1\51\1\5\5\0"+
    "\106\5\12\0\37\5\1\0\14\51\4\0\14\51\12\0"+
    "\12\51\36\5\2\0\5\5\13\0\54\5\4\0\32\5"+
    "\6\0\13\51\45\0\27\5\5\51\4\0\65\5\12\51"+
    "\1\0\35\51\2\0\13\51\6\0\12\51\15\0\1\5"+
    "\10\0\16\51\102\0\5\51\57\5\21\51\7\5\4\0"+
    "\12\51\21\0\11\51\14\0\3\51\36\5\15\51\2\5"+
    "\12\51\54\5\16\51\14\0\44\5\24\51\10\0\12\51"+
    "\3\0\3\5\12\51\44\5\2\0\11\5\7\0\53\5"+
    "\2\0\3\5\20\0\3\51\1\0\25\51\4\5\1\51"+
    "\6\5\1\51\2\5\3\51\1\5\5\0\300\5\72\51"+
    "\1\0\5\51\26\5\2\0\6\5\2\0\46\5\2\0"+
    "\6\5\2\0\10\5\1\0\1\5\1\0\1\5\1\0"+
    "\1\5\1\0\37\5\2\0\65\5\1\0\7\5\1\0"+
    "\1\5\3\0\3\5\1\0\7\5\3\0\4\5\2\0"+
    "\6\5\4\0\15\5\5\0\3\5\1\0\7\5\3\0"+
    "\13\1\35\0\2\3\5\0\1\1\17\0\2\51\23\0"+
    "\1\51\12\0\1\1\21\0\1\5\15\0\1\5\20\0"+
    "\15\5\63\0\15\51\4\0\1\51\3\0\14\51\21\0"+
    "\1\5\4\0\1\5\2\0\12\5\1\0\1\5\2\0"+
    "\6\5\6\0\1\5\1\0\1\5\1\0\1\5\1\0"+
    "\20\5\2\0\4\5\5\0\5\5\4\0\1\5\21\0"+
    "\51\5\u0177\0\57\5\1\0\57\5\1\0\205\5\6\0"+
    "\4\5\3\51\2\5\14\0\46\5\1\0\1\5\5\0"+
    "\1\5\2\0\70\5\7\0\1\5\17\0\1\51\27\5"+
    "\11\0\7\5\1\0\7\5\1\0\7\5\1\0\7\5"+
    "\1\0\7\5\1\0\7\5\1\0\7\5\1\0\7\5"+
    "\1\0\40\51\1\1\4\0\3\5\31\0\11\5\6\51"+
    "\1\0\5\5\2\0\5\5\4\0\126\5\2\0\2\51"+
    "\2\0\3\5\1\0\132\5\1\0\4\5\5\0\53\5"+
    "\1\0\136\5\21\0\33\5\65\0\306\5\112\0\360\5"+
    "\20\0\215\5\103\0\56\5\2\0\15\5\3\0\20\5"+
    "\12\51\2\5\24\0\57\5\1\51\4\0\12\51\1\0"+
    "\37\5\2\51\120\5\2\51\45\0\11\5\2\0\147\5"+
    "\2\0\65\5\2\0\5\5\60\0\13\5\1\51\3\5"+
    "\1\51\4\5\1\51\27\5\5\51\30\0\64\5\14\0"+
    "\2\51\62\5\22\51\12\0\12\51\6\0\22\51\6\5"+
    "\3\0\1\5\1\0\2\5\13\51\34\5\10\51\2\0"+
    "\27\5\15\51\14\0\35\5\3\0\4\51\57\5\16\51"+
    "\16\0\1\5\12\51\6\0\5\5\1\51\12\5\12\51"+
    "\5\5\1\0\51\5\16\51\11\0\3\5\1\51\10\5"+
    "\2\51\2\0\12\51\6\0\27\5\3\0\1\5\3\51"+
    "\62\5\1\51\1\5\3\51\2\5\2\51\5\5\2\51"+
    "\1\5\1\51\1\5\30\0\3\5\2\0\13\5\5\51"+
    "\2\0\3\5\2\51\12\0\6\5\2\0\6\5\2\0"+
    "\6\5\11\0\7\5\1\0\7\5\1\0\53\5\1\0"+
    "\14\5\10\0\163\5\10\51\1\0\2\51\2\0\12\51"+
    "\6\0\244\5\14\0\27\5\4\0\61\5\4\0\u0100\52"+
    "\156\5\2\0\152\5\46\0\7\5\14\0\5\5\5\0"+
    "\1\5\1\51\12\5\1\0\15\5\1\0\5\5\1\0"+
    "\1\5\1\0\2\5\1\0\2\5\1\0\154\5\41\0"+
    "\213\5\6\0\332\5\22\0\100\5\2\0\66\5\50\0"+
    "\12\5\6\0\20\51\20\0\20\51\3\0\2\51\30\0"+
    "\3\51\41\0\1\5\1\0\1\5\3\0\1\5\1\0"+
    "\1\5\1\0\1\5\1\0\1\5\1\0\176\5\23\0"+
    "\12\51\7\0\32\5\4\0\1\51\1\0\32\5\13\0"+
    "\70\5\2\51\37\5\3\0\6\5\2\0\6\5\2\0"+
    "\6\5\2\0\3\5\43\0\14\5\1\0\32\5\1\0"+
    "\23\5\1\0\2\5\1\0\17\5\2\0\16\5\42\0"+
    "\173\5\105\0\65\5\210\0\1\51\202\0\35\5\3\0"+
    "\61\5\17\0\1\51\37\0\40\5\15\0\36\5\5\0"+
    "\46\5\5\51\5\0\36\5\2\0\44\5\4\0\10\5"+
    "\1\0\5\5\52\0\236\5\2\0\12\51\6\0\44\5"+
    "\4\0\44\5\4\0\50\5\10\0\64\5\234\0\67\5"+
    "\11\0\26\5\12\0\10\5\230\0\6\5\2\0\1\5"+
    "\1\0\54\5\1\0\2\5\3\0\1\5\2\0\27\5"+
    "\12\0\27\5\11\0\37\5\101\0\23\5\1\0\2\5"+
    "\12\0\26\5\12\0\32\5\106\0\70\5\6\0\2\5"+
    "\100\0\1\5\3\51\1\0\2\51\5\0\4\51\4\5"+
    "\1\0\3\5\1\0\35\5\2\0\3\51\4\0\1\51"+
    "\40\0\35\5\3\0\35\5\43\0\10\5\1\0\34\5"+
    "\2\51\31\0\66\5\12\0\26\5\12\0\23\5\15\0"+
    "\22\5\156\0\111\5\67\0\63\5\15\0\63\5\15\0"+
    "\44\5\4\51\10\0\12\51\306\0\35\5\12\0\1\5"+
    "\10\0\26\5\13\51\217\0\27\5\11\0\3\51\65\5"+
    "\17\51\37\0\12\51\17\0\4\51\55\5\13\51\25\0"+
    "\31\5\7\0\12\51\6\0\3\51\44\5\16\51\1\0"+
    "\12\51\4\0\1\5\2\51\11\0\43\5\1\51\2\0"+
    "\1\5\11\0\3\51\60\5\16\51\4\5\4\0\4\51"+
    "\3\0\12\51\1\5\1\0\1\5\43\0\22\5\1\0"+
    "\31\5\14\51\6\0\1\51\101\0\7\5\1\0\1\5"+
    "\1\0\4\5\1\0\17\5\1\0\12\5\7\0\57\5"+
    "\14\51\5\0\12\51\6\0\4\51\1\0\10\5\2\0"+
    "\2\5\2\0\26\5\1\0\7\5\1\0\2\5\1\0"+
    "\5\5\1\0\2\51\1\5\7\51\2\0\2\51\2\0"+
    "\3\51\2\0\1\5\6\0\1\51\5\0\5\5\2\51"+
    "\2\0\7\51\3\0\5\51\213\0\65\5\22\51\4\5"+
    "\5\0\12\51\4\0\1\51\1\5\40\0\60\5\24\51"+
    "\2\5\1\0\1\5\10\0\12\51\246\0\57\5\7\51"+
    "\2\0\11\51\27\0\4\5\2\51\42\0\60\5\21\51"+
    "\3\0\1\5\13\0\12\51\46\0\53\5\15\51\1\5"+
    "\7\0\12\51\66\0\33\5\2\0\17\51\4\0\12\51"+
    "\306\0\54\5\17\51\145\0\100\5\12\51\25\0\1\5"+
    "\240\0\10\5\2\0\47\5\7\51\2\0\7\51\1\5"+
    "\1\0\1\5\1\51\33\0\1\5\12\51\50\5\7\51"+
    "\1\5\4\51\10\0\1\51\10\0\1\5\13\51\56\5"+
    "\20\51\3\0\1\5\42\0\71\5\7\0\11\5\1\0"+
    "\45\5\10\51\1\0\10\51\1\5\17\0\12\51\30\0"+
    "\36\5\2\0\26\51\1\0\16\51\111\0\7\5\1\0"+
    "\2\5\1\0\46\5\6\51\3\0\1\51\1\0\2\51"+
    "\1\0\7\51\1\5\1\51\10\0\12\51\6\0\6\5"+
    "\1\0\2\5\1\0\40\5\5\51\1\0\2\51\1\0"+
    "\5\51\1\5\7\0\12\51\u0136\0\23\5\4\51\11\0"+
    "\232\5\146\0\157\5\21\0\304\5\274\0\57\5\321\0"+
    "\107\5\271\0\71\5\7\0\37\5\1\0\12\51\146\0"+
    "\36\5\2\0\5\51\13\0\60\5\7\51\11\0\4\5"+
    "\14\0\12\51\11\0\25\5\5\0\23\5\260\0\100\5"+
    "\200\0\113\5\4\0\1\51\1\5\67\51\7\0\4\51"+
    "\15\5\100\0\2\5\1\0\1\5\34\0\370\5\10\0"+
    "\363\5\15\0\37\5\61\0\3\5\21\0\4\5\10\0"+
    "\u018c\5\4\0\153\5\5\0\15\5\3\0\11\5\7\0"+
    "\12\5\3\0\2\51\306\0\5\51\3\0\6\51\10\0"+
    "\10\51\2\0\7\51\36\0\4\51\224\0\3\51\273\0"+
    "\125\5\1\0\107\5\1\0\2\5\2\0\1\5\2\0"+
    "\2\5\2\0\4\5\1\0\14\5\1\0\1\5\1\0"+
    "\7\5\1\0\101\5\1\0\4\5\2\0\10\5\1\0"+
    "\7\5\1\0\34\5\1\0\4\5\1\0\5\5\1\0"+
    "\1\5\3\0\7\5\1\0\u0154\5\2\0\31\5\1\0"+
    "\31\5\1\0\37\5\1\0\31\5\1\0\37\5\1\0"+
    "\31\5\1\0\37\5\1\0\31\5\1\0\37\5\1\0"+
    "\31\5\1\0\10\5\2\0\151\51\4\0\62\51\10\0"+
    "\1\51\16\0\1\51\26\0\5\51\1\0\17\51\120\0"+
    "\7\51\1\0\21\51\2\0\7\51\1\0\2\51\1\0"+
    "\5\51\325\0\55\5\3\0\7\51\7\5\2\0\12\51"+
    "\4\0\1\5\u0171\0\54\5\16\51\6\0\305\5\13\0"+
    "\7\51\51\0\104\5\7\51\1\5\4\0\12\51\246\0"+
    "\4\5\1\0\33\5\1\0\2\5\1\0\1\5\2\0"+
    "\1\5\1\0\12\5\1\0\4\5\1\0\1\5\1\0"+
    "\1\5\6\0\1\5\4\0\1\5\1\0\1\5\1\0"+
    "\1\5\1\0\3\5\1\0\2\5\1\0\1\5\2\0"+
    "\1\5\1\0\1\5\1\0\1\5\1\0\1\5\1\0"+
    "\1\5\1\0\2\5\1\0\1\5\2\0\4\5\1\0"+
    "\7\5\1\0\4\5\1\0\4\5\1\0\1\5\1\0"+
    "\12\5\1\0\21\5\5\0\3\5\1\0\5\5\1\0"+
    "\21\5\104\0\327\5\51\0\65\5\13\0\336\5\2\0"+
    "\u0182\5\16\0\u0131\5\37\0\36\5\342\0\360\51\20\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[29440];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\3\1\1\1\4\1\5"+
    "\1\6\1\7\1\10\1\3\2\11\1\12\1\13\1\14"+
    "\4\3\1\15\1\16\1\0\1\17\2\0\1\20\1\11"+
    "\2\3\1\21\6\0\10\3\1\11\1\0\1\11\1\22"+
    "\1\23\1\24\7\3\1\25\1\3\1\26\1\27\1\30"+
    "\1\31\1\32";

  private static int [] zzUnpackAction() {
    int [] result = new int[66];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\53\0\126\0\201\0\254\0\327\0\53\0\53"+
    "\0\u0102\0\53\0\u012d\0\u0158\0\u0183\0\u01ae\0\53\0\53"+
    "\0\53\0\u01d9\0\u0204\0\u022f\0\u025a\0\53\0\53\0\201"+
    "\0\53\0\u0285\0\327\0\53\0\u02b0\0\u02db\0\u0306\0\u0331"+
    "\0\u035c\0\u0387\0\u03b2\0\u03dd\0\u0408\0\u0433\0\u045e\0\u0489"+
    "\0\u04b4\0\u04df\0\u050a\0\u0535\0\u0560\0\u058b\0\u05b6\0\u05e1"+
    "\0\u060c\0\u0637\0\u0662\0\u068d\0\u06b8\0\u06e3\0\u070e\0\u0739"+
    "\0\u0764\0\u078f\0\u07ba\0\254\0\u07e5\0\254\0\254\0\254"+
    "\0\254\0\254";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[66];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\3\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\5\1\14\1\15\3\16\1\17\2\5"+
    "\1\20\1\2\1\21\1\2\3\5\1\22\3\5\1\23"+
    "\2\5\1\24\1\25\2\5\1\26\1\27\2\2\54\0"+
    "\3\3\47\0\4\30\1\31\21\30\1\32\24\30\5\0"+
    "\1\5\5\0\7\5\1\0\2\5\3\0\17\5\2\0"+
    "\1\5\1\0\6\33\1\34\44\33\16\0\1\35\3\16"+
    "\36\0\1\5\5\0\3\5\1\36\3\37\1\0\2\5"+
    "\3\0\17\5\2\0\1\5\6\0\1\5\5\0\2\5"+
    "\1\40\4\5\1\0\2\5\3\0\17\5\2\0\1\5"+
    "\15\0\1\41\7\0\1\42\5\0\1\43\1\42\5\0"+
    "\1\44\4\0\1\45\20\0\1\41\1\0\4\16\2\0"+
    "\1\42\3\0\1\46\2\0\1\42\24\0\1\5\5\0"+
    "\7\5\1\0\2\5\3\0\1\5\1\47\3\5\1\50"+
    "\11\5\2\0\1\5\6\0\1\5\5\0\7\5\1\0"+
    "\2\5\3\0\11\5\1\51\5\5\2\0\1\5\6\0"+
    "\1\5\5\0\7\5\1\0\2\5\3\0\11\5\1\52"+
    "\5\5\2\0\1\5\6\0\1\5\5\0\7\5\1\0"+
    "\2\5\3\0\12\5\1\53\4\5\2\0\1\5\1\0"+
    "\2\30\2\0\46\30\15\0\1\41\7\0\1\42\6\0"+
    "\1\42\24\0\1\5\5\0\1\5\1\54\5\5\1\0"+
    "\1\5\1\55\3\0\3\5\1\55\13\5\2\0\1\5"+
    "\6\0\1\5\5\0\1\5\1\54\1\5\4\37\1\0"+
    "\1\5\1\55\3\0\1\56\2\5\1\55\13\5\2\0"+
    "\1\5\1\0\2\40\1\0\50\40\16\0\4\57\42\0"+
    "\1\60\1\0\1\60\2\0\4\61\47\0\2\62\51\0"+
    "\3\63\50\0\4\64\1\0\2\64\4\0\4\64\34\0"+
    "\4\16\36\0\1\5\5\0\7\5\1\0\2\5\3\0"+
    "\5\5\1\65\1\66\10\5\2\0\1\5\6\0\1\5"+
    "\5\0\7\5\1\0\2\5\3\0\10\5\1\67\6\5"+
    "\2\0\1\5\6\0\1\5\5\0\7\5\1\0\2\5"+
    "\3\0\10\5\1\70\6\5\2\0\1\5\6\0\1\5"+
    "\5\0\7\5\1\0\2\5\3\0\7\5\1\71\7\5"+
    "\2\0\1\5\6\0\1\5\5\0\7\5\1\0\2\5"+
    "\3\0\15\5\1\72\1\5\2\0\1\5\6\0\1\5"+
    "\5\0\3\5\4\73\1\0\2\5\3\0\17\5\2\0"+
    "\1\5\6\0\1\5\3\0\1\60\1\0\7\5\1\0"+
    "\2\5\3\0\17\5\2\0\1\5\6\0\1\5\5\0"+
    "\3\5\4\37\1\0\2\5\3\0\17\5\2\0\1\5"+
    "\17\0\4\57\2\0\1\42\3\0\1\41\2\0\1\42"+
    "\35\0\4\61\47\0\4\61\6\0\1\60\40\0\2\62"+
    "\10\0\1\43\40\0\3\63\7\0\1\44\40\0\4\64"+
    "\1\0\2\64\3\0\1\45\4\64\23\0\1\5\5\0"+
    "\7\5\1\0\2\5\3\0\6\5\1\74\10\5\2\0"+
    "\1\5\6\0\1\5\5\0\7\5\1\0\2\5\3\0"+
    "\13\5\1\75\3\5\2\0\1\5\6\0\1\5\5\0"+
    "\7\5\1\0\2\5\3\0\3\5\1\76\13\5\2\0"+
    "\1\5\6\0\1\5\5\0\7\5\1\0\2\5\3\0"+
    "\3\5\1\77\13\5\2\0\1\5\6\0\1\5\5\0"+
    "\7\5\1\0\2\5\3\0\3\5\1\100\13\5\2\0"+
    "\1\5\6\0\1\5\5\0\7\5\1\0\2\5\3\0"+
    "\3\5\1\101\13\5\2\0\1\5\6\0\1\5\5\0"+
    "\3\5\4\73\1\0\1\5\1\55\3\0\1\54\2\5"+
    "\1\55\13\5\2\0\1\5\6\0\1\5\5\0\7\5"+
    "\1\0\2\5\3\0\3\5\1\102\13\5\2\0\1\5"+
    "\1\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[2064];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\2\11\1\1\1\11\4\1\3\11"+
    "\4\1\2\11\1\0\1\11\2\0\1\11\4\1\6\0"+
    "\11\1\1\0\22\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[66];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  protected int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _WionLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public com.intellij.psi.tree.IElementType advance() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return BAD_CHARACTER;
            }
          // fall through
          case 27: break;
          case 2:
            { return WHITE_SPACE;
            }
          // fall through
          case 28: break;
          case 3:
            { return SYMBOL;
            }
          // fall through
          case 29: break;
          case 4:
            { return PARENTHESIS_L;
            }
          // fall through
          case 30: break;
          case 5:
            { return PARENTHESIS_R;
            }
          // fall through
          case 31: break;
          case 6:
            { return ADD;
            }
          // fall through
          case 32: break;
          case 7:
            { return COMMA;
            }
          // fall through
          case 33: break;
          case 8:
            { return SUB;
            }
          // fall through
          case 34: break;
          case 9:
            { return DEC;
            }
          // fall through
          case 35: break;
          case 10:
            { return EQUAL;
            }
          // fall through
          case 36: break;
          case 11:
            { return BRACKET_L;
            }
          // fall through
          case 37: break;
          case 12:
            { return BRACKET_R;
            }
          // fall through
          case 38: break;
          case 13:
            { return BRACE_L;
            }
          // fall through
          case 39: break;
          case 14:
            { return BRACE_R;
            }
          // fall through
          case 40: break;
          case 15:
            { return STRING_S2;
            }
          // fall through
          case 41: break;
          case 16:
            { return STRING_S1;
            }
          // fall through
          case 42: break;
          case 17:
            { return COMMENT_LINE;
            }
          // fall through
          case 43: break;
          case 18:
            { return BIN;
            }
          // fall through
          case 44: break;
          case 19:
            { return OCT;
            }
          // fall through
          case 45: break;
          case 20:
            { return HEX;
            }
          // fall through
          case 46: break;
          case 21:
            { return KW_FAIL;
            }
          // fall through
          case 47: break;
          case 22:
            { return KW_FINE;
            }
          // fall through
          case 48: break;
          case 23:
            { return KW_NONE;
            }
          // fall through
          case 49: break;
          case 24:
            { return KW_SOME;
            }
          // fall through
          case 50: break;
          case 25:
            { return KW_TRUE;
            }
          // fall through
          case 51: break;
          case 26:
            { return KW_FALSE;
            }
          // fall through
          case 52: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
