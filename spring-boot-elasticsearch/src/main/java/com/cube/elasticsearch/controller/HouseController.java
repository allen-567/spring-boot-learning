package com.cube.elasticsearch.controller;

import com.cube.elasticsearch.dao.HouseRepository;
import com.cube.elasticsearch.domain.HouseResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 滕飞
 * @Date: 2019/9/5 8:13 PM
 * @Description:
 */
@RestController
public class HouseController {

    @Resource
    private HouseRepository houseRepository;

    @GetMapping("save")
    public String save(){


        HouseResource houseResource = new HouseResource();

        houseResource.setId(12312321L);
        houseResource.setActivityName("asdfsdf");
        houseResource.setCity("北京市");
        List<HouseResource> objects = new ArrayList<>();
        HouseResource save = houseRepository.save(houseResource);

        //houseRepository.save(objects);
        return "success";
    }

}
