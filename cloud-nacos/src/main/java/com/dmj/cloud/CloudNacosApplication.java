package com.dmj.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zd
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
public class CloudNacosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudNacosApplication.class, args);
	}

}
