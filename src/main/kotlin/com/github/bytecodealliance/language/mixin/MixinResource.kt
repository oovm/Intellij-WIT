package com.github.bytecodealliance.language.mixin

import com.github.bytecodealliance.ide.view.WitItemPresentation
import com.github.bytecodealliance.language.psi.WitElement
import com.github.bytecodealliance.language.psi.WitResource
import com.intellij.icons.AllIcons
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner

abstract class MixinResource(node: ASTNode) : WitElement(node),
    PsiNameIdentifierOwner,
    WitResource {
    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): PsiElement? {
        return this.identifierSafe
    }


    override fun getPresentation(): ItemPresentation? {
        return WitItemPresentation(AllIcons.Nodes.Record, nameIdentifier?.text ?: "missing interface")
    }
}