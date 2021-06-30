package com.dmj.cloud.base;

public enum ResultStatusCode {

    OK(200, "OK"),
    SYSTEM_ERR(500, "服务器运行异常"),

    USER_NOT_EXIST(1000,"用户不存在"),
    USERNAME_OR_PASSWORD_ERROR(1001,"用户名或者密码异常"),
    USER_AUTHORIZED_ERRROR(1002,"账户异常"),
    CLIENT_AUTHENTICATION_FAILED(1003, "客户端认证失败"),


    FLOW_LIMITING(2000, "系统限流"),


    ACCESS_UNAUTHORIZED(3000, "访问未授权"),
    TOKEN_INVALID_OR_EXPIRED(3001, "token无效或已过期"),
    TOKEN_ACCESS_FORBIDDEN(3002, "token已被禁止访问"),


    FORBIDDEN_OPERATION(4000, "演示环境禁止修改、删除重要数据，请本地部署后测试");





    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private ResultStatusCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
