package com.cube.mongodb.controller;

import com.cube.mongodb.dao.CustomerDao;
import com.cube.mongodb.domain.Customer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author:   滕飞
 * Date:    2019/9/17 5:09 PM
 * Description:
 */
@RestController
public class CustomerController {

    @Resource
    private CustomerDao customerDao;

    @RequestMapping("save")
    public String save(){
        Customer Customer = new Customer();
        Customer.setName("张三");
        Customer.setAge(20);
        customerDao.save(Customer);
        Customer = new Customer();
        Customer.setName("李四");
        Customer.setAge(30);
        customerDao.save(Customer);
        return "ok";
    }



    @RequestMapping("find")
    public List<Customer> find(){
        return customerDao.findAll();
    }

    @RequestMapping("findByName")
    public Customer findByName(){

        return customerDao.findByName("张三");

    }
}
