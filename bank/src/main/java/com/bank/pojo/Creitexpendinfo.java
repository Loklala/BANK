package com.bank.pojo;

import java.util.Date;

public class Creitexpendinfo {
    private Integer creditexpendId;

    private Integer creditid;

    private Long creitexpendMoney;

    private Date creitexpendTime;

    public Integer getCreditexpendId() {
        return creditexpendId;
    }

    public void setCreditexpendId(Integer creditexpendId) {
        this.creditexpendId = creditexpendId;
    }

    public Integer getCreditid() {
        return creditid;
    }

    public void setCreditid(Integer creditid) {
        this.creditid = creditid;
    }

    public Long getCreitexpendMoney() {
        return creitexpendMoney;
    }

    public void setCreitexpendMoney(Long creitexpendMoney) {
        this.creitexpendMoney = creitexpendMoney;
    }

    public Date getCreitexpendTime() {
        return creitexpendTime;
    }

    public void setCreitexpendTime(Date creitexpendTime) {
        this.creitexpendTime = creitexpendTime;
    }
}