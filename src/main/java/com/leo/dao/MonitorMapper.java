package com.leo.dao;

import com.leo.pojo.Monitor;

public interface MonitorMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(Monitor record);

    int insertSelective(Monitor record);

    Monitor selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(Monitor record);

    int updateByPrimaryKey(Monitor record);
}