package com.dmj.cloud.mapper;

import com.dmj.cloud.model.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dmj.cloud.model.dto.SysUserDTO;
import com.dmj.cloud.model.query.UserQuery;
import com.dmj.cloud.model.vo.SysUserVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zd
 * @since 2021-06-28
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    SysUserDTO getUserByName(@Param("userName") String userName);

    List<SysUserVO> listSysUser(UserQuery userQuery);
}
