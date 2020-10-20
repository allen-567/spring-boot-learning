package com.cube.mybatis.multids;


import com.cube.mybatis.multids.datasource.aop.DynamicDataSourceAnnotationAdvisor;
import com.cube.mybatis.multids.datasource.aop.DynamicDataSourceAnnotationInterceptor;
import com.cube.mybatis.multids.datasource.register.DynamicDataSourceRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * @Author: 滕飞
 * @Date: 2019/8/14 1:01 PM
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.cube.mybatis.multids.mapper")
@EnableAutoConfiguration
@Import({DynamicDataSourceRegister.class}) // 注册动态多数据源
public class MMApplication {

    public static void main(String[] args) {
        SpringApplication.run(MMApplication.class, args);
    }
}
