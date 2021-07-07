package com.dmj.cloud.mapper;

import com.dmj.cloud.model.SysPermission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dmj.cloud.model.dto.SysPermissionDTO;
import com.dmj.cloud.model.query.PermissionQuery;
import com.dmj.cloud.model.vo.SysPermissionVO;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zd
 * @since 2021-06-28
 */
public interface SysPermissionMapper extends BaseMapper<SysPermission> {

    List<SysPermissionVO> listPermission(PermissionQuery query);

    List<SysPermissionDTO> listPermissionRole();
}
