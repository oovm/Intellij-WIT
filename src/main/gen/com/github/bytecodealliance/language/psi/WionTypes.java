// This is a generated file. Not intended for manual editing.
package com.github.bytecodealliance.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.bytecodealliance.language.psi_node.*;

public interface WionTypes {

  IElementType ALIAS_NAME = new WionElementType("ALIAS_NAME");
  IElementType CONSTRUCTOR = new WionElementType("CONSTRUCTOR");
  IElementType DEFINE_INTERFACE = new WionElementType("DEFINE_INTERFACE");
  IElementType DEFINE_TYPE = new WionElementType("DEFINE_TYPE");
  IElementType ENUM = new WionElementType("ENUM");
  IElementType EXPORT = new WionElementType("EXPORT");
  IElementType EXPORT_TERM = new WionElementType("EXPORT_TERM");
  IElementType FLAGS = new WionElementType("FLAGS");
  IElementType FUNCTION = new WionElementType("FUNCTION");
  IElementType FUNCTION_SIGNATURE = new WionElementType("FUNCTION_SIGNATURE");
  IElementType GENERIC = new WionElementType("GENERIC");
  IElementType IDENTIFIER = new WionElementType("IDENTIFIER");
  IElementType IMPORT = new WionElementType("IMPORT");
  IElementType INCLUDE = new WionElementType("INCLUDE");
  IElementType INCLUDE_NAME = new WionElementType("INCLUDE_NAME");
  IElementType INLINE_INTERFACE = new WionElementType("INLINE_INTERFACE");
  IElementType INTERFACE_BODY = new WionElementType("INTERFACE_BODY");
  IElementType INTERFACE_NAME = new WionElementType("INTERFACE_NAME");
  IElementType METHOD = new WionElementType("METHOD");
  IElementType MODIFIER = new WionElementType("MODIFIER");
  IElementType MODULE_NAME = new WionElementType("MODULE_NAME");
  IElementType PACKAGE = new WionElementType("PACKAGE");
  IElementType PACKAGE_NAME = new WionElementType("PACKAGE_NAME");
  IElementType PACKAGE_VERSION = new WionElementType("PACKAGE_VERSION");
  IElementType PARAMETER = new WionElementType("PARAMETER");
  IElementType RECORD = new WionElementType("RECORD");
  IElementType RECORD_FIELD = new WionElementType("RECORD_FIELD");
  IElementType RESOURCE = new WionElementType("RESOURCE");
  IElementType SEMANTIC_NUMBER = new WionElementType("SEMANTIC_NUMBER");
  IElementType TUPLE = new WionElementType("TUPLE");
  IElementType TYPE_GENERIC = new WionElementType("TYPE_GENERIC");
  IElementType TYPE_HINT = new WionElementType("TYPE_HINT");
  IElementType USE = new WionElementType("USE");
  IElementType USE_ALIAS = new WionElementType("USE_ALIAS");
  IElementType USE_ITEMS = new WionElementType("USE_ITEMS");
  IElementType VARIANT = new WionElementType("VARIANT");
  IElementType VARIANT_ITEM = new WionElementType("VARIANT_ITEM");
  IElementType WORLD = new WionElementType("WORLD");

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
  IElementType COMMENT_LINE = new WionTokenType("COMMENT_LINE");
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
      else if (type == CONSTRUCTOR) {
        return new WionConstructorNode(node);
      }
      else if (type == DEFINE_INTERFACE) {
        return new WionDefineInterfaceNode(node);
      }
      else if (type == DEFINE_TYPE) {
        return new WionDefineTypeNode(node);
      }
      else if (type == ENUM) {
        return new WionEnumNode(node);
      }
      else if (type == EXPORT) {
        return new WionExportNode(node);
      }
      else if (type == EXPORT_TERM) {
        return new WionExportTermNode(node);
      }
      else if (type == FLAGS) {
        return new WionFlagsNode(node);
      }
      else if (type == FUNCTION) {
        return new WionFunctionNode(node);
      }
      else if (type == FUNCTION_SIGNATURE) {
        return new WionFunctionSignatureNode(node);
      }
      else if (type == GENERIC) {
        return new WionGenericNode(node);
      }
      else if (type == IDENTIFIER) {
        return new WionIdentifierNode(node);
      }
      else if (type == IMPORT) {
        return new WionImportNode(node);
      }
      else if (type == INCLUDE) {
        return new WionIncludeNode(node);
      }
      else if (type == INCLUDE_NAME) {
        return new WionIncludeNameNode(node);
      }
      else if (type == INLINE_INTERFACE) {
        return new WionInlineInterfaceNode(node);
      }
      else if (type == INTERFACE_BODY) {
        return new WionInterfaceBodyNode(node);
      }
      else if (type == INTERFACE_NAME) {
        return new WionInterfaceNameNode(node);
      }
      else if (type == METHOD) {
        return new WionMethodNode(node);
      }
      else if (type == MODIFIER) {
        return new WionModifierNode(node);
      }
      else if (type == MODULE_NAME) {
        return new WionModuleNameNode(node);
      }
      else if (type == PACKAGE) {
        return new WionPackageNode(node);
      }
      else if (type == PACKAGE_NAME) {
        return new WionPackageNameNode(node);
      }
      else if (type == PACKAGE_VERSION) {
        return new WionPackageVersionNode(node);
      }
      else if (type == PARAMETER) {
        return new WionParameterNode(node);
      }
      else if (type == RECORD) {
        return new WionRecordNode(node);
      }
      else if (type == RECORD_FIELD) {
        return new WionRecordFieldNode(node);
      }
      else if (type == RESOURCE) {
        return new WionResourceNode(node);
      }
      else if (type == SEMANTIC_NUMBER) {
        return new WionSemanticNumberNode(node);
      }
      else if (type == TUPLE) {
        return new WionTupleNode(node);
      }
      else if (type == TYPE_GENERIC) {
        return new WionTypeGenericNode(node);
      }
      else if (type == TYPE_HINT) {
        return new WionTypeHintNode(node);
      }
      else if (type == USE) {
        return new WionUseNode(node);
      }
      else if (type == USE_ALIAS) {
        return new WionUseAliasNode(node);
      }
      else if (type == USE_ITEMS) {
        return new WionUseItemsNode(node);
      }
      else if (type == VARIANT) {
        return new WionVariantNode(node);
      }
      else if (type == VARIANT_ITEM) {
        return new WionVariantItemNode(node);
      }
      else if (type == WORLD) {
        return new WionWorldNode(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
