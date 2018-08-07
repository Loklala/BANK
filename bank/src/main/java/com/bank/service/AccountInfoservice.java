package com.bank.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.AccountInfoMapper;
import com.bank.pojo.AccountInfo;

@Service
public class AccountInfoservice {
	@Autowired
	private AccountInfoMapper accountinfomapper;

	public List<AccountInfo> getAccount() {
		return accountinfomapper.getAccountInfo();
		
	}
}
