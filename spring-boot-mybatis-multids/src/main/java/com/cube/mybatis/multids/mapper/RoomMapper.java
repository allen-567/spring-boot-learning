package com.cube.mybatis.multids.mapper;


import com.cube.mybatis.multids.datasource.annotation.DataSource;
import com.cube.mybatis.multids.model.Room;

@DataSource("laputa")
public interface RoomMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Room record);

    int insertSelective(Room record);

    Room selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKeyWithBLOBs(Room record);

    int updateByPrimaryKey(Room record);
}