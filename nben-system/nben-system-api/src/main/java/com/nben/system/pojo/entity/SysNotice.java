package com.nben.system.pojo.entity;

import com.nben.common.core.web.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/** 通知公告表 sys_notice */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysNotice extends BaseEntity {

  /** 公告ID */
  private Long noticeId;

  /** 公告标题 */
  @NotBlank(message = "公告标题不能为空")
  @Size(min = 0, max = 50, message = "公告标题不能超过50个字符")
  private String noticeTitle;

  /** 公告类型（1通知 2公告） */
  private String noticeType;

  /** 公告内容 */
  private String noticeContent;

  /** 公告状态（0正常 1关闭） */
  private String status;
}
