package com.dmj.cloud.service;

import com.dmj.cloud.base.BaseResult;
import com.dmj.cloud.model.SysPermission;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dmj.cloud.model.dto.SysPermissionDTO;
import com.dmj.cloud.model.query.PermissionQuery;
import com.dmj.cloud.model.vo.SysPermissionVO;
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
public interface SysPermissionService extends IService<SysPermission> {

    BaseResult<PageInfo<SysPermissionVO>> pagePermission(PermissionQuery query);

    List<SysPermissionDTO> listPermissionRole();
}
