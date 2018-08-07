package com.bank.dao;

import com.bank.pojo.Creditinfo;

public interface CreditinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Creditinfo record);

    int insertSelective(Creditinfo record);

    Creditinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Creditinfo record);

    int updateByPrimaryKey(Creditinfo record);
}