// This is a generated file. Not intended for manual editing.
package com.github.bytecodealliance.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.bytecodealliance.language.psi_node.*;

public interface WionTypes {

  IElementType ALIAS_NAME = new WionElementType("ALIAS_NAME");
  IElementType DICT_ITEM = new WionElementType("DICT_ITEM");
  IElementType DICT_OBJECT = new WionElementType("DICT_OBJECT");
  IElementType IDENTIFIER = new WionElementType("IDENTIFIER");
  IElementType LIST_ITEM = new WionElementType("LIST_ITEM");
  IElementType LIST_OBJECT = new WionElementType("LIST_OBJECT");
  IElementType VARIANT_ITEM = new WionElementType("VARIANT_ITEM");
  IElementType VARIANT_OBJECT = new WionElementType("VARIANT_OBJECT");

  IElementType ACCENT = new WionTokenType("^");
  IElementType ANGLE_L = new WionTokenType("<");
  IElementType ANGLE_R = new WionTokenType(">");
  IElementType AT = new WionTokenType("@");
  IElementType BRACE_L = new WionTokenType("{");
  IElementType BRACE_R = new WionTokenType("}");
  IElementType BRACKET_L = new WionTokenType("[");
  IElementType BRACKET_R = new WionTokenType("]");
  IElementType COLON = new WionTokenType(":");
  IElementType COMMA = new WionTokenType(",");
  IElementType COMMENT = new WionTokenType("Comment");
  IElementType COMMENT_BLOCK = new WionTokenType("Comment Block");
  IElementType COMMENT_DOCUMENT = new WionTokenType("Comment Document");
  IElementType DOLLAR = new WionTokenType("$");
  IElementType DOT = new WionTokenType(".");
  IElementType EQ = new WionTokenType("=");
  IElementType ESCAPED = new WionTokenType("ESCAPED");
  IElementType HYPHEN = new WionTokenType("-");
  IElementType KW_AS = new WionTokenType("as");
  IElementType KW_CONSTRUCTOR = new WionTokenType("constructor");
  IElementType KW_ENUM = new WionTokenType("enum");
  IElementType KW_EXPORT = new WionTokenType("export");
  IElementType KW_FLAGS = new WionTokenType("flags");
  IElementType KW_FUNCTION = new WionTokenType("func");
  IElementType KW_IMPORT = new WionTokenType("import");
  IElementType KW_INCLUDE = new WionTokenType("include");
  IElementType KW_INTERFACE = new WionTokenType("interface");
  IElementType KW_PACKAGE = new WionTokenType("package");
  IElementType KW_RECORD = new WionTokenType("record");
  IElementType KW_RESOURCE = new WionTokenType("resource");
  IElementType KW_TYPE = new WionTokenType("type");
  IElementType KW_USE = new WionTokenType("use");
  IElementType KW_VARIANT = new WionTokenType("variant");
  IElementType KW_WORLD = new WionTokenType("world");
  IElementType PARENTHESIS_L = new WionTokenType("(");
  IElementType PARENTHESIS_R = new WionTokenType(")");
  IElementType PLACE_HOLDER = new WionTokenType("_");
  IElementType REFERENCE = new WionTokenType("$Symbol");
  IElementType SELECTION_LINE = new WionTokenType("SELECTION_LINE");
  IElementType SEMICOLON = new WionTokenType(";");
  IElementType SLASH = new WionTokenType("/");
  IElementType STAR = new WionTokenType("*");
  IElementType STRING_CHAR = new WionTokenType("String Character");
  IElementType STRING_ESCAPE = new WionTokenType("String Escaped");
  IElementType STRING_QUOTE = new WionTokenType("String Quote");
  IElementType SYMBOL = new WionTokenType("Symbol");
  IElementType TO = new WionTokenType("->");
  IElementType URL = new WionTokenType("Url");
  IElementType VERSION = new WionTokenType("<<semver>>");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ALIAS_NAME) {
        return new WionAliasNameNode(node);
      }
      else if (type == DICT_ITEM) {
        return new WionDictItemNode(node);
      }
      else if (type == DICT_OBJECT) {
        return new WionDictObjectNode(node);
      }
      else if (type == IDENTIFIER) {
        return new WionIdentifierNode(node);
      }
      else if (type == LIST_ITEM) {
        return new WionListItemNode(node);
      }
      else if (type == LIST_OBJECT) {
        return new WionListObjectNode(node);
      }
      else if (type == VARIANT_ITEM) {
        return new WionVariantItemNode(node);
      }
      else if (type == VARIANT_OBJECT) {
        return new WionVariantObjectNode(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
