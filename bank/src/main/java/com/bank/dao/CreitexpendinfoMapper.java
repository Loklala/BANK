package com.bank.dao;

import com.bank.pojo.Creitexpendinfo;

public interface CreitexpendinfoMapper {
    int deleteByPrimaryKey(Integer creditexpendId);

    int insert(Creitexpendinfo record);

    int insertSelective(Creitexpendinfo record);

    Creitexpendinfo selectByPrimaryKey(Integer creditexpendId);

    int updateByPrimaryKeySelective(Creitexpendinfo record);

    int updateByPrimaryKey(Creitexpendinfo record);
}