package com.cube.mongo.ds.config;

import com.cube.mongo.ds.register.MongoMultiDataSourceRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Author:   滕飞
 * Date:    2019/9/19 6:51 PM
 * Description:
 * 开启mongo多数据源
 * 不能用sit作为后缀，不能修改配置文件名称，只能使用bootstrap开头
 * bootstrap-dev.yml
 * bootstrap-pro.yml
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({MongoMultiDataSourceRegistrar.class})
public @interface EnableMongoMultiDataSource {
}
