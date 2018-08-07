package com.bank.dao;

import com.bank.pojo.Creditincomeinfo;

public interface CreditincomeinfoMapper {
    int deleteByPrimaryKey(Integer creditincomeId);

    int insert(Creditincomeinfo record);

    int insertSelective(Creditincomeinfo record);

    Creditincomeinfo selectByPrimaryKey(Integer creditincomeId);

    int updateByPrimaryKeySelective(Creditincomeinfo record);

    int updateByPrimaryKey(Creditincomeinfo record);
}