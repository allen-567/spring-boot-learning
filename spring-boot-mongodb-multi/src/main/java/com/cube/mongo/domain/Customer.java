package com.cube.mongo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/**
 * Author:   滕飞
 * Date:    2019/9/17 3:48 PM
 * Description:
 */
@Data
@NoArgsConstructor
public class Customer {
    /**
     * 客户编号
     */
    @Id
    public String id;

    public String name;

    public int age;

    public Customer(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}


