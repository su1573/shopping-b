package com.su.shoppingb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.su.shoppingb.mapper")
public class ShoppingBApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingBApplication.class, args);
    }

}
