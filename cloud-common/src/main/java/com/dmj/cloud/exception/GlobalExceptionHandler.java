package com.dmj.cloud.exception;

import com.dmj.cloud.base.BaseResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zd
 */
@RestController
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 参数异常全局处理
     */
    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseBody
    public BaseResult illegalArgument(HttpServletRequest request, IllegalArgumentException e){
        return BaseResult.fail(400,e.getMessage());
    }

    /**
     * 业务异常全局处理
     */
    @ExceptionHandler(value = BizException.class)
    @ResponseBody
    public BaseResult illegalArgument(BizException e){
        return BaseResult.fail(e.getErrorCode(),e.getMessage());
    }

}
