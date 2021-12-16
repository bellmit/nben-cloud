package com.nben.system.pojo.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.nben.system.pojo.entity.SysDept;
import com.nben.system.pojo.entity.SysMenu;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

/** Treeselect树结构实体类 */
@Data
public class TreeSelect {

  /** 节点ID */
  private Long id;

  /** 节点名称 */
  private String label;

  /** 子节点 */
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<TreeSelect> children;

  public TreeSelect() {}

  public TreeSelect(SysDept dept) {
    this.id = dept.getDeptId();
    this.label = dept.getDeptName();
    this.children = dept.getChildren().stream().map(TreeSelect::new).collect(Collectors.toList());
  }

  public TreeSelect(SysMenu menu) {
    this.id = menu.getMenuId();
    this.label = menu.getMenuName();
    this.children = menu.getChildren().stream().map(TreeSelect::new).collect(Collectors.toList());
  }
}
