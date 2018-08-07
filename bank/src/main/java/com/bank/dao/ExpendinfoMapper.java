package com.bank.dao;

import com.bank.pojo.Expendinfo;

public interface ExpendinfoMapper {
    int deleteByPrimaryKey(Integer expendId);

    int insert(Expendinfo record);

    int insertSelective(Expendinfo record);

    Expendinfo selectByPrimaryKey(Integer expendId);

    int updateByPrimaryKeySelective(Expendinfo record);

    int updateByPrimaryKey(Expendinfo record);
}