package com.cube.mybatis.multids.datasource.config;


import com.cube.mybatis.multids.datasource.aop.DynamicDataSourceAnnotationAdvisor;
import com.cube.mybatis.multids.datasource.aop.DynamicDataSourceAnnotationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author: 滕飞
 * Created: 2019-11-05 11:45
 * Description:
 */
@Configuration
public class DataSourceConfig {

    @Bean
    public DynamicDataSourceAnnotationAdvisor dynamicDatasourceAnnotationAdvisor() {
        return new DynamicDataSourceAnnotationAdvisor(new DynamicDataSourceAnnotationInterceptor());
    }

}
