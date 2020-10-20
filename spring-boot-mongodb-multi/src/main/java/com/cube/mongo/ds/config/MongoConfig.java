package com.cube.mongo.ds.config;

import lombok.Data;

/**
 * Author: 滕飞
 * Date: 2019-09-19 19:21
 * Description: mongo多数据源属性配置类
 */
@Data
public class MongoConfig {

    private String host;

    private Integer port;

    private String database;

}
