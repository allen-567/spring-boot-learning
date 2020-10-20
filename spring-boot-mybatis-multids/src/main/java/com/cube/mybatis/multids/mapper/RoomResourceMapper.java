package com.cube.mybatis.multids.mapper;

import com.cube.mybatis.multids.datasource.annotation.DataSource;
import com.cube.mybatis.multids.model.RoomResource;

@DataSource
public interface RoomResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoomResource record);

    int insertSelective(RoomResource record);

    RoomResource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoomResource record);

    int updateByPrimaryKey(RoomResource record);
}