package com.xx;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xiexing
 * @description 用户服务启动器
 * @date 2021/3/1
 */
@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class MicroserviceUserBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceUserBootstrap.class,args);
        log.info("micro service user boot successfully...");
    }
}
