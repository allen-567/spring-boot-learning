package com.cube.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 滕飞
 * @Date: 2019/8/22 10:41 AM
 * @Description:
 */
@RestController
@RefreshScope
public class NacosController {

    @Value("${test}")
    private String test;
    @Value("${addTest}")
    private String addTest;

    @GetMapping("/test")
    public String testNacos () {

        String aaa = test;
        System.out.println(aaa);

        System.out.println(test);

        String bbb = addTest;
        System.out.println(bbb);

        System.out.println(addTest);


        System.out.println("asdsadas");
        return "success";
    }
}
