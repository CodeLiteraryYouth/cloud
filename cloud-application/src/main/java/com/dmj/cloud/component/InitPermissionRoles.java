package com.dmj.cloud.component;

import com.dmj.cloud.service.SysRoleService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 容器启动完成时加载角色权限规则至Redis缓存
 * @author zd
 */
@Component
@AllArgsConstructor
public class InitPermissionRoles implements CommandLineRunner {

    private SysRoleService sysRoleService;

    @Override
    public void run(String... args) {
        sysRoleService.refreshPermRolesRules();
    }
}
