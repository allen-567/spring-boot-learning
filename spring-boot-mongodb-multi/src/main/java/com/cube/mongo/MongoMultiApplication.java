package com.cube.mongo;

import com.cube.mongo.ds.config.EnableMongoMultiDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

/**
 * Author:   滕飞
 * Date:    2019/9/19 6:42 PM
 * Description:
 */
@EnableMongoMultiDataSource
@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
public class MongoMultiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoMultiApplication.class, args);

    }
}
