package com.xian.culturaland;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xian.culturaland.mapper")
public class CulturalandApplication {

    public static void main(String[] args) {
        SpringApplication.run(CulturalandApplication.class, args);
    }

}
