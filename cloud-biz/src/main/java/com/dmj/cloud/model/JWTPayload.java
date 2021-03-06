package com.dmj.cloud.model;

import lombok.Data;

/**
 * @author hxr
 * @date 2021-03-10
 */
@Data
public class JWTPayload {

    private String jti;

    private Long exp;
}
