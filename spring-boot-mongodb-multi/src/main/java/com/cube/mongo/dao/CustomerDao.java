package com.cube.mongo.dao;

import com.cube.mongo.domain.Customer;
import com.cube.mongo.ds.base.MongoCommonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

/**
 * Author: 滕飞
 * Date: 2019-09-23 16:55
 * Description:
 */
@Repository
public class CustomerDao extends MongoCommonDao<Customer> {

    /**
     * 注入mongodbTemplate
     *
     * @param mongoTemplate
     */
    @Autowired
    @Qualifier("alarm_current")
    @Override
    protected void setMongoTemplate(MongoTemplate mongoTemplate) {
        this.mongoTemplate=mongoTemplate;
    }

}
