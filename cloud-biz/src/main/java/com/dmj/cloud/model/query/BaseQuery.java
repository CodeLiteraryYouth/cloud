package com.dmj.cloud.model.query;

import cn.hutool.core.util.StrUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author zd
 */
@Data
public class BaseQuery implements Serializable {

    private Integer pageNo;

    private Integer pageSize;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endTime;

    @ApiModelProperty(value = "升序:asc 倒叙:desc")
    private String sort;

    @ApiModelProperty(value = "排序字段")
    private String sortField;

}
