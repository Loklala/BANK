package com.bank.dao;

import com.bank.pojo.Cardinfo;

public interface CardinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cardinfo record);

    int insertSelective(Cardinfo record);

    Cardinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cardinfo record);

    int updateByPrimaryKey(Cardinfo record);
}