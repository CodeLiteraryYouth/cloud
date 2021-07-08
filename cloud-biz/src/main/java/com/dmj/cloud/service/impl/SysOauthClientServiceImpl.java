package com.dmj.cloud.service.impl;

import com.dmj.cloud.base.BaseResult;
import com.dmj.cloud.model.SysOauthClient;
import com.dmj.cloud.mapper.SysOauthClientMapper;
import com.dmj.cloud.model.query.OauthClientQuery;
import com.dmj.cloud.service.SysOauthClientService;
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
public class SysOauthClientServiceImpl extends ServiceImpl<SysOauthClientMapper, SysOauthClient> implements SysOauthClientService {

    @Autowired
    private SysOauthClientMapper sysOauthClientMapper;

    @Override
    public BaseResult<PageInfo<SysOauthClient>> pageOauthClient(OauthClientQuery query) {
        Assert.notNull(query,"bad request");
        Assert.notNull(query.getPageNo(),"pageNo is null");
        PageHelper.startPage(query.getPageNo(),query.getPageSize());
        List<SysOauthClient> sysOauthClients=sysOauthClientMapper.listOauthClients(query);
        PageInfo<SysOauthClient> pageInfo=new PageInfo<>(sysOauthClients);
        return BaseResult.success(pageInfo);
    }
}
