package com.github.bytecodealliance.ide.formatter

import com.github.bytecodealliance.language.psi.*
import com.intellij.formatting.*
import com.intellij.lang.ASTNode
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiFile

class WitFormatBuilder : FormattingModelBuilder {
    override fun getRangeAffectingIndent(file: PsiFile?, offset: Int, elementAtOffset: ASTNode?): TextRange? = null

    override fun createModel(formattingContext: FormattingContext): FormattingModel {
        val settings = formattingContext.codeStyleSettings
        val element = formattingContext.psiElement
        val ctx = WitFormatSpace.create(settings)
        val block = FormatBlock(element.node, null, Indent.getNoneIndent(), null, ctx)
        return FormattingModelProvider.createFormattingModelForPsiFile(element.containingFile, block, settings)
    }

    companion object {
        fun getChildAttributes(node: ASTNode, newChildIndex: Int): ChildAttributes {
            val indent = when (node.elementType) {
//                FluentTypes.SELECT_EXPRESSION -> Indent.getNormalIndent()
                else -> Indent.getNoneIndent()
            }
            return ChildAttributes(indent, null)
        }

        fun computeIndent(parent: ASTNode, child: ASTNode): Indent? {
            return when (parent.psi) {
                is WitWorldBody -> byCorner(parent, child)
                is WitInterfaceBody -> byCorner(parent, child)
                is WitUseItems -> parent.indentInRange(child, 2, 1)
                is WitResourceBody -> byCorner(parent, child)
                is WitRecordBody -> byCorner(parent, child)
                is WitFlagsBody -> byCorner(parent, child)
                is WitEnumBody -> byCorner(parent, child)
                is WitVariantBody -> byCorner(parent, child)
                is WitFunctionSignature -> parent.indentInRange(child, 1, 1)
                is WitTuple -> parent.indentInRange(child, 1, 1)
                is WitGeneric -> parent.indentInRange(child, 1, 1)

                else -> Indent.getNoneIndent()
            }
        }

        private fun byCorner(parent: ASTNode, child: ASTNode): Indent {
            val isCorner = parent.firstChildNode == child || parent.lastChildNode == child
            return when {
                isCorner -> Indent.getNoneIndent()
                else -> Indent.getNormalIndent()
            }
        }
        private fun ASTNode.indentInRange(child: ASTNode, head: Int, tail: Int): Indent {
            val children = this.getChildren(null);
            val index = children.indexOf(child)
            val last = children.size - tail
            return when {
                index <= head -> Indent.getNoneIndent()
                index >= last -> Indent.getNoneIndent()
                else -> Indent.getNormalIndent()
            }
        }
    }
}
