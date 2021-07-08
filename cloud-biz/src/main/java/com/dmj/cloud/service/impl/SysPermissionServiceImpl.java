package com.dmj.cloud.service.impl;

import com.dmj.cloud.base.BaseResult;
import com.dmj.cloud.model.SysPermission;
import com.dmj.cloud.mapper.SysPermissionMapper;
import com.dmj.cloud.model.dto.SysPermissionDTO;
import com.dmj.cloud.model.query.PermissionQuery;
import com.dmj.cloud.model.vo.SysPermissionVO;
import com.dmj.cloud.service.SysPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zd
 * @since 2021-06-28
 */
@Service
public class SysPermissionServiceImpl extends ServiceImpl<SysPermissionMapper, SysPermission> implements SysPermissionService {


    @Autowired
    private SysPermissionMapper sysPermissionMapper;

    @Override
    public BaseResult<PageInfo<SysPermissionVO>> pagePermission(PermissionQuery query) {
        Assert.notNull(query,"bad request");
        Assert.notNull(query.getPageNo(),"pageNo is null");
        PageHelper.startPage(query.getPageNo(),query.getPageSize());
        List<SysPermissionVO> sysPermissionVOS=sysPermissionMapper.listPermission(query);
        PageInfo<SysPermissionVO> pageInfo=new PageInfo<>(sysPermissionVOS);
        return BaseResult.success(pageInfo);
    }

    @Override
    public List<SysPermissionDTO> listPermissionRole() {
        return sysPermissionMapper.listPermissionRole();
    }
}
