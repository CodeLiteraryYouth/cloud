package com.dmj.cloud.mapper;

import com.dmj.cloud.model.SysOauthClient;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dmj.cloud.model.query.OauthClientQuery;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zd
 * @since 2021-06-28
 */
public interface SysOauthClientMapper extends BaseMapper<SysOauthClient> {

    List<SysOauthClient> listOauthClients(OauthClientQuery query);
}
