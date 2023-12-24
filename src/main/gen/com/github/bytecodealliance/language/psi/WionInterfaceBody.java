// This is a generated file. Not intended for manual editing.
package com.github.bytecodealliance.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WionInterfaceBody extends PsiElement {

  @NotNull
  List<WionDefineType> getDefineTypeList();

  @NotNull
  List<WionEnum> getEnumList();

  @NotNull
  List<WionFlags> getFlagsList();

  @NotNull
  List<WionFunction> getFunctionList();

  @NotNull
  List<WionRecord> getRecordList();

  @NotNull
  List<WionResource> getResourceList();

  @NotNull
  List<WionUse> getUseList();

  @NotNull
  List<WionVariant> getVariantList();

}
