package com.dmj.cloud.api;


import com.dmj.cloud.base.BaseResult;
import com.dmj.cloud.model.SysRole;
import com.dmj.cloud.model.dto.SysRoleDTO;
import com.dmj.cloud.model.query.RoleQuery;
import com.dmj.cloud.model.vo.SysRoleVO;
import com.dmj.cloud.service.SysRoleService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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

    @ApiOperation("查询角色列表")
    public BaseResult<PageInfo<SysRoleVO>> page(@ModelAttribute RoleQuery query) {
        return service.pageRole(query);
    }

    @ApiOperation("新增角色")
    @PostMapping("/save")
    public BaseResult<SysRole> save(@RequestBody SysRoleDTO entity) {
       return service.insertRole(entity);
    }

    @ApiOperation("修改角色")
    @PutMapping("/update")
    public BaseResult<SysRole> update(@RequestBody SysRoleDTO entity) {
        return service.updateRole(entity);
    }


    @DeleteMapping("/delete/{id}")
    public BaseResult delete(@PathVariable String id) {
        boolean result=service.removeById(id);
        if (result) {
            service.refreshPermRolesRules();
        }
        return BaseResult.success();
    }

}

