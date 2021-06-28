package com.dmj.cloud.api;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dmj.cloud.base.BaseResult;
import com.dmj.cloud.model.SysPermission;
import com.dmj.cloud.service.SysPermissionService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 
 * </p>
 *
 * @author zd
 * @since 2021-06-28
 */
@RestController
@RequestMapping("/sys-permission")
@Api(tags = "系统管理-权限管理")
public class SysPermissionController {
    @Autowired
    private SysPermissionService service;

    @PostMapping("/save")
    public BaseResult<SysPermission> save(@RequestBody SysPermission entity) {
        service.saveOrUpdate(entity);
        return BaseResult.success(entity);
    }

    @PutMapping("/update")
    public BaseResult<SysPermission> update(@RequestBody SysPermission entity) {
        service.saveOrUpdate(entity);
        return BaseResult.success(entity);
    }


    @DeleteMapping("/delete")
    public BaseResult delete(@RequestParam String id) {
        service.removeById(id);
        return BaseResult.success();
    }

    @GetMapping("/get")
    public BaseResult<SysPermission> select(@RequestParam String id) {
        SysPermission data = service.getById(id);
        return BaseResult.success(data);
    }

    @PostMapping("/page")
    public BaseResult<Page<SysPermission>> page(@RequestBody Page<SysPermission> page) {
        page = service.page(page);
        return BaseResult.success(page);
    }
}

