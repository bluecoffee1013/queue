package com.bluecoffee.queue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qianlong on 2017/7/3.
 */
@RestController
@SpringBootApplication
@Configuration
@ServletComponentScan
@MapperScan(basePackages = "com.bluecoffee.queue.mapper")
//@ImportResource("classpath:applicationContext-mybatis.xml")
@EnableAutoConfiguration
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) throws Exception {
        System.out.println("------------Queue Application is start---------------");
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        logger.info("----------Queue Application configure-------");
        return builder.sources(this.getClass());
    }
}
