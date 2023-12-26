// This is a generated file. Not intended for manual editing.
package com.github.bytecodealliance.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.bytecodealliance.language.psi.WionTypes.*;
import com.github.bytecodealliance.language.psi.WionElement;
import com.github.bytecodealliance.language.psi.*;

public class WionVariantItemNode extends WionElement implements WionVariantItem {

  public WionVariantItemNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WionVisitor visitor) {
    visitor.visitVariantItem(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WionVisitor) accept((WionVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public WionIdentifier getIdentifier() {
    return findNotNullChildByClass(WionIdentifier.class);
  }

  @Override
  @Nullable
  public WionTypeHint getTypeHint() {
    return findChildByClass(WionTypeHint.class);
  }

}
