package com.bank.pojo;

import java.util.Date;

public class Creditinfo {
    private Integer id;

    private Integer creditid;

    private String creditPwd;

    private Integer accountId;

    private String creditState;

    private Date creditTime;

    private Long creditMoney;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCreditid() {
        return creditid;
    }

    public void setCreditid(Integer creditid) {
        this.creditid = creditid;
    }

    public String getCreditPwd() {
        return creditPwd;
    }

    public void setCreditPwd(String creditPwd) {
        this.creditPwd = creditPwd == null ? null : creditPwd.trim();
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getCreditState() {
        return creditState;
    }

    public void setCreditState(String creditState) {
        this.creditState = creditState == null ? null : creditState.trim();
    }

    public Date getCreditTime() {
        return creditTime;
    }

    public void setCreditTime(Date creditTime) {
        this.creditTime = creditTime;
    }

    public Long getCreditMoney() {
        return creditMoney;
    }

    public void setCreditMoney(Long creditMoney) {
        this.creditMoney = creditMoney;
    }
}