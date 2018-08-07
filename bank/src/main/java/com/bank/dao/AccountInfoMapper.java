package com.bank.dao;

import java.util.List;

import com.bank.pojo.AccountInfo;

public interface AccountInfoMapper {
    int deleteByPrimaryKey(Integer accountId);

    int insert(AccountInfo record);

    int insertSelective(AccountInfo record);

    AccountInfo selectByPrimaryKey(Integer accountId);

    int updateByPrimaryKeySelective(AccountInfo record);

    int updateByPrimaryKey(AccountInfo record);
    
    List<AccountInfo> getAccountInfo();
}