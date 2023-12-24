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

public class WionInterfaceBodyNode extends WionElement implements WionInterfaceBody {

  public WionInterfaceBodyNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WionVisitor visitor) {
    visitor.visitInterfaceBody(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WionVisitor) accept((WionVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<WionDefineType> getDefineTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WionDefineType.class);
  }

  @Override
  @NotNull
  public List<WionEnum> getEnumList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WionEnum.class);
  }

  @Override
  @NotNull
  public List<WionFlags> getFlagsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WionFlags.class);
  }

  @Override
  @NotNull
  public List<WionFunction> getFunctionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WionFunction.class);
  }

  @Override
  @NotNull
  public List<WionRecord> getRecordList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WionRecord.class);
  }

  @Override
  @NotNull
  public List<WionResource> getResourceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WionResource.class);
  }

  @Override
  @NotNull
  public List<WionUse> getUseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WionUse.class);
  }

  @Override
  @NotNull
  public List<WionVariant> getVariantList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WionVariant.class);
  }

}
