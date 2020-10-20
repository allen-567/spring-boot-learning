package com.cube.mongodb.dao;

import com.cube.mongodb.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Author:   滕飞
 * Date:    2019/9/17 5:07 PM
 * Description:
 */
@Repository
public interface CustomerDao extends MongoRepository<Customer, String> {

    Customer findByName(String name);
}
