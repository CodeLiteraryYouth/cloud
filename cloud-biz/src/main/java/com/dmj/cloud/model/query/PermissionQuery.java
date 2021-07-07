package com.dmj.cloud.model.query;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zd
 */
@Data
public class PermissionQuery extends BaseQuery implements Serializable {

    private static final long serialVersionUID=1L;

    private String permissionName;
}
