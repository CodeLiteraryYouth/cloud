package com.dmj.cloud.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author zd
 * @since 2021-07-02
 */
@Data
@TableName("sys_user_role")
@ApiModel(value="SysUserRole对象", description="")
public class SysUserRole implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Integer id;

    @TableField("user_id")
    private Integer userId;

    @TableField("role_id")
    private String roleId;

}
