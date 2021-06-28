package com.dmj.cloud.service.impl;

import com.dmj.cloud.model.SysUser;
import com.dmj.cloud.mapper.SysUserMapper;
import com.dmj.cloud.model.dto.SysUserDTO;
import com.dmj.cloud.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zd
 * @since 2021-06-28
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUserDTO getUserByName(String userName) {
        return sysUserMapper.getUserByName(userName);
    }
}
