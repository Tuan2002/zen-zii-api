package com.tuandev.zen_zii;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@MapperScan("com.tuandev.zen_zii")
public class ZenZIi_API {

    public static void main(String[] args) {
        SpringApplication.run(ZenZIi_API.class, args);
    }

}
