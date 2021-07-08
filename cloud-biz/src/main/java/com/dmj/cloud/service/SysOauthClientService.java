package com.dmj.cloud.service;

import com.dmj.cloud.base.BaseResult;
import com.dmj.cloud.model.SysOauthClient;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dmj.cloud.model.query.OauthClientQuery;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zd
 * @since 2021-06-28
 */
public interface SysOauthClientService extends IService<SysOauthClient> {

    BaseResult<PageInfo<SysOauthClient>> pageOauthClient(OauthClientQuery query);
}
