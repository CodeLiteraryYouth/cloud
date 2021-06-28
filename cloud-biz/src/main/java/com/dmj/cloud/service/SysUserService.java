package com.dmj.cloud.service;

import com.dmj.cloud.model.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dmj.cloud.model.dto.SysUserDTO;

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
}
