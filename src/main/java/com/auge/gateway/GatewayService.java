package com.auge.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class, //不使用数据库
        GsonAutoConfiguration.class  //spring-boot2.0.0以上版本需要引入高版本的gson依赖，如果不引用gson依赖需要加此属性
}, scanBasePackages = "com.auge.gateway")
public class GatewayService {
    private static final Logger logger = LoggerFactory.getLogger(GatewayService.class);

    public static void main(String[] args) {
//        SpringApplication.run(new Class[]{BasicComponentService.class, BaseDataService.class}, args);
        SpringApplication.run(GatewayService.class, args);
    }
}
