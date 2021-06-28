package com.dmj.cloud.common.exception;


import com.dmj.cloud.base.BaseResult;
import com.dmj.cloud.base.ResultStatusCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.oauth2.common.exceptions.InvalidGrantException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class OAuthExceptionHandler {

    /**
     * 用户不存在
     *
     * @param e
     * @return
     */
    @ExceptionHandler(UsernameNotFoundException.class)
    public BaseResult handleUsernameNotFoundException(UsernameNotFoundException e) {
        return BaseResult.fail(ResultStatusCode.USER_NOT_EXIST);
    }

    /**
     * 用户名和密码异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(InvalidGrantException.class)
    public BaseResult handleInvalidGrantException(InvalidGrantException e) {
        return BaseResult.fail(ResultStatusCode.USERNAME_OR_PASSWORD_ERROR);
    }


    /**
     * 账户异常(禁用、锁定、过期)
     *
     * @param e
     * @return
     */
    @ExceptionHandler({InternalAuthenticationServiceException.class})
    public BaseResult handleInternalAuthenticationServiceException(InternalAuthenticationServiceException e) {
        return BaseResult.fail(ResultStatusCode.USER_AUTHORIZED_ERRROR);
    }

}
