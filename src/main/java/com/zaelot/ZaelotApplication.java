package com.zaelot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author waein
 */
@EnableTransactionManagement
@ServletComponentScan
@MapperScan("com.zaelot.*.dao")
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@EnableCaching
public class ZaelotApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZaelotApplication.class, args);
        System.out.println("Server Start!!!");
    }
}
