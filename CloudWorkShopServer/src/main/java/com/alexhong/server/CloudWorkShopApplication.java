package com.alexhong.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.alexhong.server.mapper")
public class CloudWorkShopApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudWorkShopApplication.class, args);
    }
}
