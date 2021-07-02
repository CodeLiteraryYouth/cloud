package com.dmj.cloud.service;

import com.dmj.cloud.base.BaseResult;
import com.dmj.cloud.model.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dmj.cloud.model.dto.SysUserDTO;
import com.dmj.cloud.model.query.UserQuery;
import com.dmj.cloud.model.vo.SysUserVO;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zd
 * @since 2021-06-28
 */
public interface SysUserService extends IService<SysUser> {

    SysUserDTO getUserByName(String userName);

    BaseResult<PageInfo<SysUserVO>> pageUserList(UserQuery userQuery);

    BaseResult insertUser(SysUserDTO sysUserDTO);

    BaseResult updateUser(SysUserDTO sysUserDTO);


}
