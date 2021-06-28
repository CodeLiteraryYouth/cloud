package com.dmj.cloud.api;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dmj.cloud.base.BaseResult;
import com.dmj.cloud.model.SysRole;
import com.dmj.cloud.service.SysRoleService;
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
@RequestMapping("/sys-role")
@Api(tags = "系统管理-角色管理")
public class SysRoleController {

    @Autowired
    private SysRoleService service;

    @PostMapping("/save")
    public BaseResult<SysRole> save(@RequestBody SysRole entity) {
        service.saveOrUpdate(entity);
        return BaseResult.success(entity);
    }

    @PutMapping("/update")
    public BaseResult<SysRole> update(@RequestBody SysRole entity) {
        service.saveOrUpdate(entity);
        return BaseResult.success(entity);
    }


    @DeleteMapping("/delete")
    public BaseResult delete(@RequestParam String id) {
        service.removeById(id);
        return BaseResult.success();
    }

    @GetMapping("/get")
    public BaseResult<SysRole> select(@RequestParam String id) {
        SysRole data = service.getById(id);
        return BaseResult.success(data);
    }

    @PostMapping("/page")
    public BaseResult<Page<SysRole>> page(@RequestBody Page<SysRole> page) {
        page = service.page(page);
        return BaseResult.success(page);
    }
}

