package com.cube.hive.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class HiveJdbcConfig {
    private static final Logger logger = LoggerFactory.getLogger(HiveJdbcConfig.class);
    @Value("${Hive.url}")
    String url;
    @Value("${Hive.driver-class-name}")
    String driver_class_name;
    @Value("${Hive.user}")
    String user;
    @Value("${Hive.password}")
    String password;
    @Bean("hiveJdbcDataSource")

//    @Qualifier("hiveJdbcDataSource")
    public DataSource dataSource() {
        DataSource dataSource = new DataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driver_class_name);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        System.out.println("Hive DataSource Inject Successfully...");
        return dataSource;
    }

}
