package com.cube.hive.controller;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author: 滕飞
 * @Date: 2019/8/20 11:39 AM
 * @Description:
 */
@RestController
public class HiveController {

    @GetMapping("/test")
    public String test() {
        //testHive();
        //testUpdate();
        //
        //testHive();
        testInsert();
        return "test";
    }

    @Resource
    private DataSource jdbcDataSource;

    public void testInsert(){
        try {
            Connection connection = jdbcDataSource.getConnection();
            Statement statement = connection.createStatement();

            String sql = "insert into student (id, name, age ) values (1, '张三', 12)";
            ResultSet res = statement.executeQuery(sql);

        } catch (SQLException e) {
            System.out.println("异常。");
            e.printStackTrace();
        }
    }

    public void testHive () {

        try {
            Connection connection = jdbcDataSource.getConnection();
            Statement statement = connection.createStatement();

            String sql = "select * from bank_point limit 10";
            ResultSet res = statement.executeQuery(sql);
            while (res.next()) {
                System.out.println(res.getInt("id"));
                System.out.println(res.getString("name"));
                System.out.println(res);
            }
        } catch (SQLException e) {
            System.out.println("异常。");
            e.printStackTrace();
        }

    }

    public void testUpdate () {
        try {
            Connection connection = jdbcDataSource.getConnection();
            Statement statement = connection.createStatement();

            String sql = "update bank_point set city = \"上海\" where id = 1";
            ResultSet res = statement.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
