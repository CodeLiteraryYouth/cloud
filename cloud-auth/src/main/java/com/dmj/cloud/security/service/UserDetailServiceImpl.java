package com.dmj.cloud.security.service;

import com.dmj.cloud.base.ResultStatusCode;
import com.dmj.cloud.common.enums.OAuthClientEnum;
import com.dmj.cloud.common.jwt.JwtUtils;
import com.dmj.cloud.domain.OAuthUserDetails;
import com.dmj.cloud.model.dto.SysUserDTO;
import com.dmj.cloud.service.SysUserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author zd
 */
@Service
@Slf4j
@AllArgsConstructor
public class UserDetailServiceImpl implements UserDetailsService {


    @Autowired
    private SysUserService userService;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //获取客户端信息
        String clientId = JwtUtils.getAuthClientId();
        OAuthClientEnum client = OAuthClientEnum.getByClientId(clientId);
        OAuthUserDetails oauthUserDetails = null;
        try {
            SysUserDTO sysUserDTO=userService.getUserByName(username);
            oauthUserDetails=new OAuthUserDetails(sysUserDTO);
        } catch (Exception e) {
            log.error("获取用户信息异常",e);
        }
        if (oauthUserDetails == null || oauthUserDetails.getId() == null) {
            throw new UsernameNotFoundException(ResultStatusCode.USER_NOT_EXIST.getMsg());
        } else if (!oauthUserDetails.isEnabled()) {
            throw new DisabledException("该账户已被禁用!");
        } else if (!oauthUserDetails.isAccountNonLocked()) {
            throw new LockedException("该账号已被锁定!");
        } else if (!oauthUserDetails.isAccountNonExpired()) {
            throw new AccountExpiredException("该账号已过期!");
        }
        return oauthUserDetails;
    }
}
