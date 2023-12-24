// Generated by JFlex 1.9.1 http://jflex.de/  (tweaked for IntelliJ platform)
// source: wion.flex

package com.github.bytecodealliance.language;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.bytecodealliance.language.psi.WionTypes.*;


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
    "\1\0\25\u0100\1\u0200\11\u0100\1\u0300\17\u0100\1\u0400\u10cf\u0100";

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
    "\11\0\1\1\1\2\2\1\1\2\22\0\1\1\3\0"+
    "\1\3\1\4\2\0\1\5\1\6\1\7\1\0\1\10"+
    "\1\11\1\12\1\13\12\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\0\1\22\32\23\1\24\1\0\1\25\1\26"+
    "\1\27\1\0\1\30\1\23\1\31\1\32\1\33\1\34"+
    "\1\35\1\23\1\36\1\23\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\23\1\45\1\46\1\47\1\50\1\51"+
    "\1\52\1\53\1\54\1\23\1\55\1\0\1\56\7\0"+
    "\1\1\32\0\1\1\u01df\0\1\1\177\0\13\1\35\0"+
    "\2\1\5\0\1\1\57\0\1\1\240\0\1\1\377\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1280];
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
    "\1\0\1\1\1\2\1\3\1\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\1\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\14\20\1\24"+
    "\1\25\1\26\1\27\1\0\1\30\3\0\1\31\15\20"+
    "\2\0\14\20\1\32\2\20\1\33\1\0\1\20\1\34"+
    "\2\20\1\35\6\20\1\36\2\20\1\37\2\20\1\40"+
    "\7\20\1\41\1\0\1\20\1\42\1\43\3\20\1\44"+
    "\2\20\1\37\1\20\1\45\1\20\1\46\1\20\1\47"+
    "\2\20\1\50\1\20\1\51\1\20\1\52";

  private static int [] zzUnpackAction() {
    int [] result = new int[126];
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
    "\0\0\0\57\0\136\0\57\0\215\0\57\0\57\0\57"+
    "\0\274\0\57\0\353\0\u011a\0\57\0\57\0\57\0\57"+
    "\0\57\0\57\0\u0149\0\57\0\57\0\57\0\57\0\u0178"+
    "\0\u01a7\0\u01d6\0\u0205\0\u0234\0\u0263\0\u0292\0\u02c1\0\u02f0"+
    "\0\u031f\0\u034e\0\57\0\57\0\215\0\57\0\u037d\0\u03ac"+
    "\0\u03db\0\u011a\0\u040a\0\u0149\0\u0439\0\u0468\0\u0497\0\u04c6"+
    "\0\u04f5\0\u0524\0\u0553\0\u0582\0\u05b1\0\u05e0\0\u060f\0\u063e"+
    "\0\u066d\0\u069c\0\u06cb\0\u06fa\0\u0729\0\u0758\0\u0787\0\u07b6"+
    "\0\u07e5\0\u0814\0\u0843\0\u0872\0\u08a1\0\u08d0\0\u08ff\0\u0149"+
    "\0\u092e\0\u095d\0\57\0\u098c\0\u09bb\0\u0149\0\u09ea\0\u0a19"+
    "\0\u0149\0\u0a48\0\u0a77\0\u0aa6\0\u0ad5\0\u0b04\0\u0b33\0\u0149"+
    "\0\u0b62\0\u0b91\0\u0bc0\0\u0bef\0\u0c1e\0\u0149\0\u0c4d\0\u0c7c"+
    "\0\u0cab\0\u0cda\0\u0d09\0\u0d38\0\u0d67\0\u0149\0\u0d96\0\u0dc5"+
    "\0\u0149\0\u0149\0\u0df4\0\u0e23\0\u0e52\0\u0149\0\u0e81\0\u0eb0"+
    "\0\u0d96\0\u0edf\0\u0149\0\u0f0e\0\u0149\0\u0f3d\0\u0149\0\u0f6c"+
    "\0\u0f9b\0\u0149\0\u0fca\0\u0149\0\u0ff9\0\u0149";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[126];
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
    "\1\2\2\3\1\4\1\5\1\6\1\7\1\2\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\23\1\32\1\33\1\23\1\34\5\23\1\35"+
    "\1\36\1\23\1\37\1\40\1\41\1\42\2\23\1\43"+
    "\1\44\60\0\2\3\65\0\1\45\2\0\1\45\6\0"+
    "\1\45\4\0\25\45\23\0\1\46\44\0\1\47\3\0"+
    "\1\50\55\0\1\51\1\0\1\52\53\0\1\53\2\0"+
    "\1\23\6\0\1\23\4\0\25\23\13\0\1\53\2\0"+
    "\1\23\6\0\1\23\4\0\16\23\1\54\6\23\13\0"+
    "\1\53\2\0\1\23\6\0\1\23\4\0\13\23\1\55"+
    "\11\23\13\0\1\53\2\0\1\23\6\0\1\23\4\0"+
    "\12\23\1\56\10\23\1\57\1\23\13\0\1\53\2\0"+
    "\1\23\6\0\1\23\4\0\10\23\1\60\7\23\1\61"+
    "\4\23\13\0\1\53\2\0\1\23\6\0\1\23\4\0"+
    "\11\23\1\62\1\63\12\23\13\0\1\53\2\0\1\23"+
    "\6\0\1\23\4\0\1\64\24\23\13\0\1\53\2\0"+
    "\1\23\6\0\1\23\4\0\3\23\1\65\21\23\13\0"+
    "\1\53\2\0\1\23\6\0\1\23\4\0\24\23\1\66"+
    "\13\0\1\53\2\0\1\23\6\0\1\23\4\0\16\23"+
    "\1\67\6\23\13\0\1\53\2\0\1\23\6\0\1\23"+
    "\4\0\1\70\24\23\13\0\1\53\2\0\1\23\6\0"+
    "\1\23\4\0\13\23\1\71\11\23\2\0\7\47\1\72"+
    "\47\47\2\50\1\0\54\50\14\0\1\73\65\0\1\23"+
    "\4\0\25\23\13\0\1\53\2\0\1\23\6\0\1\23"+
    "\4\0\12\23\1\74\12\23\13\0\1\53\2\0\1\23"+
    "\6\0\1\23\4\0\20\23\1\75\4\23\13\0\1\53"+
    "\2\0\1\23\6\0\1\23\4\0\14\23\1\76\10\23"+
    "\13\0\1\53\2\0\1\23\6\0\1\23\4\0\1\77"+
    "\24\23\13\0\1\53\2\0\1\23\6\0\1\23\4\0"+
    "\12\23\1\100\12\23\13\0\1\53\2\0\1\23\6\0"+
    "\1\23\4\0\14\23\1\101\10\23\13\0\1\53\2\0"+
    "\1\23\6\0\1\23\4\0\1\23\1\102\15\23\1\103"+
    "\5\23\13\0\1\53\2\0\1\23\6\0\1\23\4\0"+
    "\1\23\1\104\23\23\13\0\1\53\2\0\1\23\6\0"+
    "\1\23\4\0\1\23\1\105\14\23\1\106\6\23\13\0"+
    "\1\53\2\0\1\23\6\0\1\23\4\0\14\23\1\107"+
    "\10\23\13\0\1\53\2\0\1\23\6\0\1\23\4\0"+
    "\3\23\1\110\21\23\13\0\1\53\2\0\1\23\6\0"+
    "\1\23\4\0\15\23\1\111\7\23\13\0\1\53\2\0"+
    "\1\23\6\0\1\23\4\0\15\23\1\112\7\23\2\0"+
    "\7\47\1\72\3\47\1\113\43\47\12\0\1\114\1\0"+
    "\1\73\53\0\1\53\2\0\1\23\6\0\1\23\4\0"+
    "\16\23\1\115\6\23\13\0\1\53\2\0\1\23\6\0"+
    "\1\23\4\0\11\23\1\116\13\23\13\0\1\53\2\0"+
    "\1\23\6\0\1\23\4\0\13\23\1\117\11\23\13\0"+
    "\1\53\2\0\1\23\6\0\1\23\4\0\5\23\1\120"+
    "\17\23\13\0\1\53\2\0\1\23\6\0\1\23\4\0"+
    "\1\23\1\121\23\23\13\0\1\53\2\0\1\23\6\0"+
    "\1\23\4\0\13\23\1\122\11\23\13\0\1\53\2\0"+
    "\1\23\6\0\1\23\4\0\10\23\1\123\14\23\13\0"+
    "\1\53\2\0\1\23\6\0\1\23\4\0\3\23\1\124"+
    "\21\23\13\0\1\53\2\0\1\23\6\0\1\23\4\0"+
    "\7\23\1\125\15\23\13\0\1\53\2\0\1\23\6\0"+
    "\1\23\4\0\13\23\1\126\11\23\13\0\1\53\2\0"+
    "\1\23\6\0\1\23\4\0\13\23\1\127\11\23\13\0"+
    "\1\53\2\0\1\23\6\0\1\23\4\0\3\23\1\130"+
    "\21\23\13\0\1\53\2\0\1\23\6\0\1\23\4\0"+
    "\6\23\1\131\16\23\13\0\1\53\2\0\1\23\6\0"+
    "\1\23\4\0\10\23\1\132\14\23\16\0\1\133\53\0"+
    "\1\53\2\0\1\23\6\0\1\23\4\0\17\23\1\134"+
    "\5\23\13\0\1\53\2\0\1\23\6\0\1\23\4\0"+
    "\15\23\1\135\7\23\13\0\1\53\2\0\1\23\6\0"+
    "\1\23\4\0\16\23\1\136\6\23\13\0\1\53\2\0"+
    "\1\23\6\0\1\23\4\0\15\23\1\137\7\23\13\0"+
    "\1\53\2\0\1\23\6\0\1\23\4\0\20\23\1\140"+
    "\4\23\13\0\1\53\2\0\1\23\6\0\1\23\4\0"+
    "\15\23\1\141\7\23\13\0\1\53\2\0\1\23\6\0"+
    "\1\23\4\0\1\142\24\23\13\0\1\53\2\0\1\23"+
    "\6\0\1\23\4\0\15\23\1\143\7\23\13\0\1\53"+
    "\2\0\1\23\6\0\1\23\4\0\20\23\1\144\4\23"+
    "\13\0\1\53\2\0\1\23\6\0\1\23\4\0\1\145"+
    "\24\23\13\0\1\53\2\0\1\23\6\0\1\23\4\0"+
    "\2\23\1\146\22\23\13\0\1\147\2\0\1\133\53\0"+
    "\1\53\2\0\1\23\6\0\1\23\4\0\15\23\1\150"+
    "\7\23\13\0\1\53\2\0\1\23\6\0\1\23\4\0"+
    "\17\23\1\151\5\23\13\0\1\53\2\0\1\23\6\0"+
    "\1\23\4\0\17\23\1\152\5\23\13\0\1\53\2\0"+
    "\1\23\6\0\1\23\4\0\2\23\1\153\22\23\13\0"+
    "\1\53\2\0\1\23\6\0\1\23\4\0\4\23\1\154"+
    "\20\23\13\0\1\53\2\0\1\23\6\0\1\23\4\0"+
    "\5\23\1\155\17\23\13\0\1\53\2\0\1\23\6\0"+
    "\1\23\4\0\2\23\1\156\22\23\13\0\1\53\2\0"+
    "\1\23\6\0\1\23\4\0\15\23\1\157\7\23\13\0"+
    "\1\53\2\0\1\23\6\0\1\23\4\0\12\23\1\160"+
    "\12\23\13\0\1\161\2\0\1\161\6\0\1\161\4\0"+
    "\25\161\13\0\1\53\2\0\1\23\6\0\1\23\4\0"+
    "\20\23\1\162\4\23\13\0\1\53\2\0\1\23\6\0"+
    "\1\23\4\0\3\23\1\163\21\23\13\0\1\53\2\0"+
    "\1\23\6\0\1\23\4\0\1\164\24\23\13\0\1\53"+
    "\2\0\1\23\6\0\1\23\4\0\3\23\1\165\21\23"+
    "\13\0\1\53\2\0\1\23\6\0\1\23\4\0\1\23"+
    "\1\166\23\23\13\0\1\53\2\0\1\23\6\0\1\23"+
    "\4\0\17\23\1\167\5\23\13\0\1\53\2\0\1\23"+
    "\6\0\1\23\4\0\1\23\1\170\23\23\13\0\1\53"+
    "\2\0\1\23\6\0\1\23\4\0\1\23\1\171\23\23"+
    "\13\0\1\53\2\0\1\23\6\0\1\23\4\0\3\23"+
    "\1\172\21\23\13\0\1\53\2\0\1\23\6\0\1\23"+
    "\4\0\17\23\1\173\5\23\13\0\1\53\2\0\1\23"+
    "\6\0\1\23\4\0\3\23\1\174\21\23\13\0\1\53"+
    "\2\0\1\23\6\0\1\23\4\0\13\23\1\175\11\23"+
    "\13\0\1\53\2\0\1\23\6\0\1\23\4\0\15\23"+
    "\1\176\7\23\2\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[4136];
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
    "\1\0\1\11\1\1\1\11\1\1\3\11\1\1\1\11"+
    "\2\1\6\11\1\1\4\11\13\1\2\11\1\1\1\11"+
    "\1\0\1\1\3\0\16\1\2\0\17\1\1\11\1\0"+
    "\32\1\1\0\27\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[126];
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
          case 43: break;
          case 2:
            { return WHITE_SPACE;
            }
          // fall through
          case 44: break;
          case 3:
            { return DOLLAR;
            }
          // fall through
          case 45: break;
          case 4:
            { return PARENTHESIS_L;
            }
          // fall through
          case 46: break;
          case 5:
            { return PARENTHESIS_R;
            }
          // fall through
          case 47: break;
          case 6:
            { return COMMA;
            }
          // fall through
          case 48: break;
          case 7:
            { return HYPHEN;
            }
          // fall through
          case 49: break;
          case 8:
            { return DOT;
            }
          // fall through
          case 50: break;
          case 9:
            { return SLASH;
            }
          // fall through
          case 51: break;
          case 10:
            { return COLON;
            }
          // fall through
          case 52: break;
          case 11:
            { return SEMICOLON;
            }
          // fall through
          case 53: break;
          case 12:
            { return ANGLE_L;
            }
          // fall through
          case 54: break;
          case 13:
            { return EQ;
            }
          // fall through
          case 55: break;
          case 14:
            { return ANGLE_R;
            }
          // fall through
          case 56: break;
          case 15:
            { return AT;
            }
          // fall through
          case 57: break;
          case 16:
            { return SYMBOL;
            }
          // fall through
          case 58: break;
          case 17:
            { return BRACKET_L;
            }
          // fall through
          case 59: break;
          case 18:
            { return BRACKET_R;
            }
          // fall through
          case 60: break;
          case 19:
            { return ACCENT;
            }
          // fall through
          case 61: break;
          case 20:
            { return BRACE_L;
            }
          // fall through
          case 62: break;
          case 21:
            { return BRACE_R;
            }
          // fall through
          case 63: break;
          case 22:
            { return ESCAPED;
            }
          // fall through
          case 64: break;
          case 23:
            { return TO;
            }
          // fall through
          case 65: break;
          case 24:
            { return COMMENT_LINE;
            }
          // fall through
          case 66: break;
          case 25:
            { return KW_AS;
            }
          // fall through
          case 67: break;
          case 26:
            { return KW_USE;
            }
          // fall through
          case 68: break;
          case 27:
            { return COMMENT_BLOCK;
            }
          // fall through
          case 69: break;
          case 28:
            { return KW_ENUM;
            }
          // fall through
          case 70: break;
          case 29:
            { return KW_FUNCTION;
            }
          // fall through
          case 71: break;
          case 30:
            { return KW_TYPE;
            }
          // fall through
          case 72: break;
          case 31:
            { return VERSION;
            }
          // fall through
          case 73: break;
          case 32:
            { return KW_FLAGS;
            }
          // fall through
          case 74: break;
          case 33:
            { return KW_WORLD;
            }
          // fall through
          case 75: break;
          case 34:
            { return KW_EXPORT;
            }
          // fall through
          case 76: break;
          case 35:
            { return KW_IMPORT;
            }
          // fall through
          case 77: break;
          case 36:
            { return KW_RECORD;
            }
          // fall through
          case 78: break;
          case 37:
            { return KW_INCLUDE;
            }
          // fall through
          case 79: break;
          case 38:
            { return KW_PACKAGE;
            }
          // fall through
          case 80: break;
          case 39:
            { return KW_VARIANT;
            }
          // fall through
          case 81: break;
          case 40:
            { return KW_RESOURCE;
            }
          // fall through
          case 82: break;
          case 41:
            { return KW_INTERFACE;
            }
          // fall through
          case 83: break;
          case 42:
            { return KW_CONSTRUCTOR;
            }
          // fall through
          case 84: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
