// This is a generated file. Not intended for manual editing.
package com.github.bytecodealliance.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.bytecodealliance.language.psi.WitTypes.*;
import com.github.bytecodealliance.language.mixin.MixinResource;
import com.github.bytecodealliance.language.psi.*;

public class WitResourceNode extends MixinResource implements WitResource {

  public WitResourceNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WitVisitor visitor) {
    visitor.visitResource(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WitVisitor) accept((WitVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public WitAnnotations getAnnotations() {
    return findNotNullChildByClass(WitAnnotations.class);
  }

  @Override
  @NotNull
  public List<WitConstructor> getConstructorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitConstructor.class);
  }

  @Override
  @Nullable
  public WitIdentifier getIdentifier() {
    return findChildByClass(WitIdentifier.class);
  }

  @Override
  @NotNull
  public List<WitMethod> getMethodList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitMethod.class);
  }

}
