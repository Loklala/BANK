package com.bank.pojo;

import java.util.Date;

public class Expendinfo {
    private Integer expendId;

    private Integer cardid;

    private Long expendMoney;

    private Date expendTime;

    public Integer getExpendId() {
        return expendId;
    }

    public void setExpendId(Integer expendId) {
        this.expendId = expendId;
    }

    public Integer getCardid() {
        return cardid;
    }

    public void setCardid(Integer cardid) {
        this.cardid = cardid;
    }

    public Long getExpendMoney() {
        return expendMoney;
    }

    public void setExpendMoney(Long expendMoney) {
        this.expendMoney = expendMoney;
    }

    public Date getExpendTime() {
        return expendTime;
    }

    public void setExpendTime(Date expendTime) {
        this.expendTime = expendTime;
    }
}