package com.dmj.cloud.base;

public enum ResultStatusCode {

    OK(200, "OK"),
    SYSTEM_ERR(500, "服务器运行异常"),

    USER_NOT_EXIST(1000,"用户不存在"),
    USERNAME_OR_PASSWORD_ERROR(1001,"用户名或者密码异常"),
    USER_AUTHORIZED_ERRROR(1002,"账户异常");





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
