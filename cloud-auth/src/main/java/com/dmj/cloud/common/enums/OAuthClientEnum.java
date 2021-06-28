package com.dmj.cloud.common.enums;
import lombok.Getter;


public enum OAuthClientEnum {

    TEST("client", "测试客户端"),
    ADMIN("cloud-application", "系统管理端"),
    WEAPP("cloud-app", "微信小程序端");


    @Getter
    private String clientId;

    @Getter
    private String  desc;

    OAuthClientEnum(String clientId, String desc){
        this.clientId=clientId;
        this.desc=desc;
    }

    public static OAuthClientEnum getByClientId(String clientId) {
        for (OAuthClientEnum client : OAuthClientEnum.values()) {
            if(client.getClientId().equals(clientId)){
                return client;
            }
        }
        return null;
    }


}
