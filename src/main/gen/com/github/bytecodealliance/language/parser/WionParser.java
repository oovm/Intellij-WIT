// This is a generated file. Not intended for manual editing.
package com.github.bytecodealliance.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.bytecodealliance.language.psi.WionTypes.*;
import static com.github.bytecodealliance.language.psi.ParserExtension.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class WionParser implements PsiParser, LightPsiParser {

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
    return wion(b, l + 1);
  }

  /* ********************************************************** */
  // SYMBOL | ESCAPED
  public static boolean alias_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_name")) return false;
    if (!nextTokenIs(b, "<alias name>", ESCAPED, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALIAS_NAME, "<alias name>");
    r = consumeToken(b, SYMBOL);
    if (!r) r = consumeToken(b, ESCAPED);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier
  public static boolean dict_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dict_item")) return false;
    if (!nextTokenIs(b, "<dict item>", ESCAPED, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DICT_ITEM, "<dict item>");
    r = identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier? BRACE_L (dict-item (COMMA dict-item)* COMMA?)? BRACE_R {
  // //    mixin = "com.github.bytecodealliance.language.mixin.MixinInclude"
  // }
  public static boolean dict_object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dict_object")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DICT_OBJECT, "<dict object>");
    r = dict_object_0(b, l + 1);
    r = r && consumeToken(b, BRACE_L);
    r = r && dict_object_2(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    r = r && dict_object_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // identifier?
  private static boolean dict_object_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dict_object_0")) return false;
    identifier(b, l + 1);
    return true;
  }

  // (dict-item (COMMA dict-item)* COMMA?)?
  private static boolean dict_object_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dict_object_2")) return false;
    dict_object_2_0(b, l + 1);
    return true;
  }

  // dict-item (COMMA dict-item)* COMMA?
  private static boolean dict_object_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dict_object_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dict_item(b, l + 1);
    r = r && dict_object_2_0_1(b, l + 1);
    r = r && dict_object_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA dict-item)*
  private static boolean dict_object_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dict_object_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dict_object_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dict_object_2_0_1", c)) break;
    }
    return true;
  }

  // COMMA dict-item
  private static boolean dict_object_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dict_object_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && dict_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean dict_object_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dict_object_2_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // {
  // //    mixin = "com.github.bytecodealliance.language.mixin.MixinInclude"
  // }
  private static boolean dict_object_4(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // SYMBOL | ESCAPED
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    if (!nextTokenIs(b, "<identifier>", ESCAPED, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIER, "<identifier>");
    r = consumeToken(b, SYMBOL);
    if (!r) r = consumeToken(b, ESCAPED);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier {
  // //	extends = interface
  // //	mixin = "com.github.bytecodealliance.language.mixin.MixinInterface"
  // }
  public static boolean list_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_item")) return false;
    if (!nextTokenIs(b, "<list item>", ESCAPED, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIST_ITEM, "<list item>");
    r = identifier(b, l + 1);
    r = r && list_item_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // {
  // //	extends = interface
  // //	mixin = "com.github.bytecodealliance.language.mixin.MixinInterface"
  // }
  private static boolean list_item_1(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // BRACKET_L (list-item (COMMA list-item)* COMMA?)? BRACKET_R {
  // //    mixin = "com.github.bytecodealliance.language.mixin.MixinInterface"
  // }
  public static boolean list_object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_object")) return false;
    if (!nextTokenIs(b, BRACKET_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACKET_L);
    r = r && list_object_1(b, l + 1);
    r = r && consumeToken(b, BRACKET_R);
    r = r && list_object_3(b, l + 1);
    exit_section_(b, m, LIST_OBJECT, r);
    return r;
  }

  // (list-item (COMMA list-item)* COMMA?)?
  private static boolean list_object_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_object_1")) return false;
    list_object_1_0(b, l + 1);
    return true;
  }

  // list-item (COMMA list-item)* COMMA?
  private static boolean list_object_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_object_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = list_item(b, l + 1);
    r = r && list_object_1_0_1(b, l + 1);
    r = r && list_object_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA list-item)*
  private static boolean list_object_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_object_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!list_object_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_object_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA list-item
  private static boolean list_object_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_object_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && list_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean list_object_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_object_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // {
  // //    mixin = "com.github.bytecodealliance.language.mixin.MixinInterface"
  // }
  private static boolean list_object_3(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // dict-object
  public static boolean variant_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIANT_ITEM, "<variant item>");
    r = dict_object(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier PARENTHESIS_L variant-item? PARENTHESIS_R {
  // //    mixin = "com.github.bytecodealliance.language.mixin.MixinWorld"
  // }
  public static boolean variant_object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_object")) return false;
    if (!nextTokenIs(b, "<variant object>", ESCAPED, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIANT_OBJECT, "<variant object>");
    r = identifier(b, l + 1);
    r = r && consumeToken(b, PARENTHESIS_L);
    r = r && variant_object_2(b, l + 1);
    r = r && consumeToken(b, PARENTHESIS_R);
    r = r && variant_object_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // variant-item?
  private static boolean variant_object_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_object_2")) return false;
    variant_item(b, l + 1);
    return true;
  }

  // {
  // //    mixin = "com.github.bytecodealliance.language.mixin.MixinWorld"
  // }
  private static boolean variant_object_4(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // dict-object
  //   | list-object
  //   | variant-object
  static boolean wion(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wion")) return false;
    boolean r;
    r = dict_object(b, l + 1);
    if (!r) r = list_object(b, l + 1);
    if (!r) r = variant_object(b, l + 1);
    return r;
  }

}
