// This is a generated file. Not intended for manual editing.
package com.github.bytecodealliance.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.bytecodealliance.language.psi.WitTypes.*;
import com.github.bytecodealliance.language.psi.WitElement;
import com.github.bytecodealliance.language.psi.*;

public class WitTypeHNode extends WitElement implements WitTypeH {

  public WitTypeHNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WitVisitor visitor) {
    visitor.visitTypeH(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WitVisitor) accept((WitVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WitTypeGeneric getTypeGeneric() {
    return findChildByClass(WitTypeGeneric.class);
  }

  @Override
  @Nullable
  public WitTypeTuple getTypeTuple() {
    return findChildByClass(WitTypeTuple.class);
  }

}
