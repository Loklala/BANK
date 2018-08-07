package com.bank.pojo;

import java.util.Date;

public class Creditincomeinfo {
    private Integer creditincomeId;

    private Integer creditid;

    private Long creditincomeMoney;

    private Date creditincomeTime;

    public Integer getCreditincomeId() {
        return creditincomeId;
    }

    public void setCreditincomeId(Integer creditincomeId) {
        this.creditincomeId = creditincomeId;
    }

    public Integer getCreditid() {
        return creditid;
    }

    public void setCreditid(Integer creditid) {
        this.creditid = creditid;
    }

    public Long getCreditincomeMoney() {
        return creditincomeMoney;
    }

    public void setCreditincomeMoney(Long creditincomeMoney) {
        this.creditincomeMoney = creditincomeMoney;
    }

    public Date getCreditincomeTime() {
        return creditincomeTime;
    }

    public void setCreditincomeTime(Date creditincomeTime) {
        this.creditincomeTime = creditincomeTime;
    }
}