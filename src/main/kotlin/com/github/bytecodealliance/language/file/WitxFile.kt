package com.github.bytecodealliance.language.file

import com.github.bytecodealliance.MessageBundle
import com.github.bytecodealliance.WitxLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class WitxFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, WitxLanguage) {
    override fun getFileType(): FileType = WitxFileType.INSTANCE

    override fun toString(): String = MessageBundle.message("action.create_file")
}