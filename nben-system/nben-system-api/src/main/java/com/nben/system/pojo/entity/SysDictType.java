package com.nben.system.pojo.entity;

import com.nben.common.core.annotation.Excel;
import com.nben.common.core.annotation.Excel.ColumnType;
import com.nben.common.core.web.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/** 字典类型表 sys_dict_type */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysDictType extends BaseEntity {

  /** 字典主键 */
  @Excel(name = "字典主键", cellType = ColumnType.NUMERIC)
  private Long dictId;

  /** 字典名称 */
  @Excel(name = "字典名称")
  @NotBlank(message = "字典名称不能为空")
  @Size(min = 0, max = 100, message = "字典类型名称长度不能超过100个字符")
  private String dictName;

  /** 字典类型 */
  @Excel(name = "字典类型")
  @NotBlank(message = "字典类型不能为空")
  @Size(min = 0, max = 100, message = "字典类型类型长度不能超过100个字符")
  private String dictType;

  /** 状态（0正常 1停用） */
  @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
  private String status;
}
