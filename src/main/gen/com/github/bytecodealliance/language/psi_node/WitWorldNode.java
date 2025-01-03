// This is a generated file. Not intended for manual editing.
package com.github.bytecodealliance.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.bytecodealliance.language.psi.WitTypes.*;
import com.github.bytecodealliance.language.mixin.MixinWorld;
import com.github.bytecodealliance.language.psi.*;

public class WitWorldNode extends MixinWorld implements WitWorld {

  public WitWorldNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WitVisitor visitor) {
    visitor.visitWorld(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WitVisitor) accept((WitVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<WitAnnotation> getAnnotationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitAnnotation.class);
  }

  @Override
  @NotNull
  public List<WitDefineType> getDefineTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitDefineType.class);
  }

  @Override
  @NotNull
  public List<WitEnum> getEnumList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitEnum.class);
  }

  @Override
  @NotNull
  public List<WitExport> getExportList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitExport.class);
  }

  @Override
  @Nullable
  public WitIdentifier getIdentifier() {
    return findChildByClass(WitIdentifier.class);
  }

  @Override
  @NotNull
  public List<WitImport> getImportList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitImport.class);
  }

  @Override
  @NotNull
  public List<WitInclude> getIncludeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitInclude.class);
  }

  @Override
  @Nullable
  public WitModifier getModifier() {
    return findChildByClass(WitModifier.class);
  }

  @Override
  @NotNull
  public List<WitRecord> getRecordList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitRecord.class);
  }

  @Override
  @NotNull
  public List<WitResource> getResourceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitResource.class);
  }

  @Override
  @NotNull
  public List<WitUse> getUseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitUse.class);
  }

  @Override
  @NotNull
  public List<WitVariant> getVariantList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WitVariant.class);
  }

}
