package com.dmj.cloud.common.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.jwt.JwtHelper;
import org.springframework.security.jwt.crypto.sign.RsaSigner;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.KeyPair;
import java.security.interfaces.RSAPrivateKey;
import java.util.Map;
import java.util.Set;


/**
 * @author zd
 */
@Component
public class JwtGenerator {


    @Autowired
    private KeyPair keyPair;

    public String createAccessToken(Set<String> authorities, Map<String, String> additional) {
        String payload = new JwtPayloadBuilder()
                .exp(12 * 3600) // 默认12小时
                .authorities(authorities)
                .additional(additional)
                .builder();
        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
        RsaSigner signer = new RsaSigner(privateKey);
        String accessToken = JwtHelper.encode(payload, signer).getEncoded();
        return accessToken;
    }

}



