package com.cube.mybatis.multids.controller;


import com.cube.mybatis.multids.mapper.RoomMapper;
import com.cube.mybatis.multids.mapper.RoomResourceMapper;
import com.cube.mybatis.multids.model.Room;
import com.cube.mybatis.multids.model.RoomResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: 滕飞
 * @Date: 2019/8/14 1:17 PM
 * @Description:
 */
@RestController
public class AppController {

    @Resource
    private RoomMapper roomMapper;
    @Resource
    private RoomResourceMapper roomResourceMapper;

    @GetMapping("test/room/{id}")
    public String testRoom(@PathVariable Integer id) {
        Room room = roomMapper.selectByPrimaryKey(id);
        System.out.println(room);
        return "success";
    }


    @GetMapping("test/roomResource/{id}")
    public String testRoomResource(@PathVariable Integer id) {
        RoomResource roomResource = roomResourceMapper.selectByPrimaryKey(id);
        System.out.println(roomResource);
        return "success";
    }

}
