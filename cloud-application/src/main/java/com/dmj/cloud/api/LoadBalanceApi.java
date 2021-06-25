package com.dmj.cloud.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoadBalanceApi {

    @GetMapping("/nacos-provider/loadBanlance/print")
    public String balanceApi() {
        return "11111";
    }
}
