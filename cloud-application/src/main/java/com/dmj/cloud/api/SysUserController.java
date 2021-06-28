package com.dmj.cloud.api;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dmj.cloud.base.BaseResult;
import com.dmj.cloud.model.SysUser;
import com.dmj.cloud.service.SysUserService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 * 
 * </p>
 *
 * @author zd
 * @since 2021-06-28
 */
@RestController
@RequestMapping("/sys-user")
@Api(tags = "系统管理-用户管理")
public class SysUserController {

    @Resource
    private SysUserService service;

    @PostMapping("/save")
    public BaseResult<SysUser> save(@RequestBody SysUser entity) {
        service.saveOrUpdate(entity);
        return BaseResult.success(entity);
    }

    @PutMapping("/update")
    public BaseResult<SysUser> update(@RequestBody SysUser entity) {
        service.saveOrUpdate(entity);
        return BaseResult.success(entity);
    }


    @DeleteMapping("/delete/{id}")
    public BaseResult delete(@PathVariable String id) {
        service.removeById(id);
        return BaseResult.success();
    }

    @GetMapping("/get")
    public BaseResult<SysUser> select(@RequestParam String id) {
        SysUser data = service.getById(id);
        return BaseResult.success(data);
    }

    @PostMapping("/page")
    public BaseResult<Page<SysUser>> page(@RequestBody Page<SysUser> page) {
        page = service.page(page);
        return BaseResult.success(page);
    }
}

