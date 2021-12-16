package com.nben.system.pojo.dto;

import com.nben.system.pojo.entity.SysUser;
import lombok.Data;

import java.util.Set;

/** 用户信息 */
@Data
public class LoginUser {

  /** 用户唯一标识 */
  private String token;

  /** 用户名id */
  private Long userid;

  /** 用户名 */
  private String username;

  /** 登录时间 */
  private Long loginTime;

  /** 过期时间 */
  private Long expireTime;

  /** 登录IP地址 */
  private String ipaddr;

  /** 权限列表 */
  private Set<String> permissions;

  /** 角色列表 */
  private Set<String> roles;

  /** 用户信息 */
  private SysUser sysUser;
}
