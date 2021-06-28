package com.dmj.cloud.api;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dmj.cloud.base.BaseResult;
import com.dmj.cloud.model.SysOauthClient;
import com.dmj.cloud.service.SysOauthClientService;
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
@RequestMapping("/sys-oauth-client")
@Api(tags = "系统管理-客户端管理")
public class SysOauthClientController {
    @Autowired
    private SysOauthClientService service;

    @PostMapping("/save")
    public BaseResult<SysOauthClient> save(@RequestBody SysOauthClient entity) {
        service.saveOrUpdate(entity);
        return BaseResult.success(entity);
    }

    @PutMapping("/update")
    public BaseResult<SysOauthClient> update(@RequestBody SysOauthClient entity) {
        service.saveOrUpdate(entity);
        return BaseResult.success(entity);
    }


    @DeleteMapping("/delete")
    public BaseResult delete(@RequestParam String id) {
        service.removeById(id);
        return BaseResult.success();
    }

    @GetMapping("/get")
    public BaseResult<SysOauthClient> select(@RequestParam String id) {
        SysOauthClient data = service.getById(id);
        return BaseResult.success(data);
    }

    @PostMapping("/page")
    public BaseResult<Page<SysOauthClient>> page(@RequestBody Page<SysOauthClient> page) {
        page = service.page(page);
        return BaseResult.success(page);
    }
}

