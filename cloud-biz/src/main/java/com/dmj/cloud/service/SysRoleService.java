package com.dmj.cloud.service;

import com.dmj.cloud.base.BaseResult;
import com.dmj.cloud.model.SysRole;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dmj.cloud.model.dto.SysPermissionDTO;
import com.dmj.cloud.model.dto.SysRoleDTO;
import com.dmj.cloud.model.query.RoleQuery;
import com.dmj.cloud.model.vo.SysRoleVO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zd
 * @since 2021-06-28
 */
public interface SysRoleService extends IService<SysRole> {

    BaseResult<PageInfo<SysRoleVO>> pageRole(RoleQuery roleQuery);

    List<SysPermissionDTO> listPermRoles();

    boolean refreshPermRolesRules();

    BaseResult insertRole(SysRoleDTO sysRoleDTO);

    BaseResult updateRole(SysRoleDTO sysRoleDTO);
}
