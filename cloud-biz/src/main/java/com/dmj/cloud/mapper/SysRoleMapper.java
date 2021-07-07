package com.dmj.cloud.mapper;

import com.dmj.cloud.model.SysRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dmj.cloud.model.query.RoleQuery;
import com.dmj.cloud.model.vo.SysRoleVO;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zd
 * @since 2021-06-28
 */
public interface SysRoleMapper extends BaseMapper<SysRole> {

    List<SysRoleVO> listRole(RoleQuery roleQuery);
}
