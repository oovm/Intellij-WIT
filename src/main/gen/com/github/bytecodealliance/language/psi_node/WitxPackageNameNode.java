// This is a generated file. Not intended for manual editing.
package com.github.bytecodealliance.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.bytecodealliance.language.psi.WitxTypes.*;
import com.github.bytecodealliance.language.psi.WitElement;
import com.github.bytecodealliance.language.psi.*;

public class WitxPackageNameNode extends WitElement implements WitxPackageName {

  public WitxPackageNameNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WitxVisitor visitor) {
    visitor.visitPackageName(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WitxVisitor) accept((WitxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public WitxModuleName getModuleName() {
    return findNotNullChildByClass(WitxModuleName.class);
  }

  @Override
  @Nullable
  public WitxOrganizationName getOrganizationName() {
    return findChildByClass(WitxOrganizationName.class);
  }

}