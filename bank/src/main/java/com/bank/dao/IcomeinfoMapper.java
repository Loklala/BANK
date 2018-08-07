package com.bank.dao;

import com.bank.pojo.Icomeinfo;

public interface IcomeinfoMapper {
    int deleteByPrimaryKey(Integer incomeId);

    int insert(Icomeinfo record);

    int insertSelective(Icomeinfo record);

    Icomeinfo selectByPrimaryKey(Integer incomeId);

    int updateByPrimaryKeySelective(Icomeinfo record);

    int updateByPrimaryKey(Icomeinfo record);
}