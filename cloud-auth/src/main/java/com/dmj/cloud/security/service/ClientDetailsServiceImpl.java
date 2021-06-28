package com.dmj.cloud.security.service;

import com.dmj.cloud.common.enums.PasswordEncoderTypeEnum;
import com.dmj.cloud.model.SysOauthClient;
import com.dmj.cloud.service.SysOauthClientService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.NoSuchClientException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Service;

import java.util.Objects;


/**
 * @author zd
 */
@Service
@Slf4j
public class ClientDetailsServiceImpl implements ClientDetailsService {

    @Autowired
    private SysOauthClientService sysOauthClientService;

    @Override
    @SneakyThrows
    public ClientDetails loadClientByClientId(String clientId) {
        try {
            SysOauthClient oauthClient = sysOauthClientService.getById(clientId);
            if (Objects.isNull(oauthClient)) {
                BaseClientDetails clientDetails = new BaseClientDetails(
                        oauthClient.getClientId(),
                        oauthClient.getResourcesIds(),
                        oauthClient.getScope(),
                        oauthClient.getAuthorizedGrantType(),
                        oauthClient.getAuthorities(),
                        oauthClient.getWebserverRedirectUrl());
                clientDetails.setClientSecret(PasswordEncoderTypeEnum.NOOP.getPrefix() + oauthClient.getClientSecret());
                return clientDetails;
            } else {
                throw new NoSuchClientException("No client with requested id: " + clientId);
            }
        } catch (EmptyResultDataAccessException var4) {
            throw new NoSuchClientException("No client with requested id: " + clientId);
        }
    }
}
