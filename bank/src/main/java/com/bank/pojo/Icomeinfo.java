package com.bank.pojo;

import java.util.Date;

public class Icomeinfo {
    private Integer incomeId;

    private String incomeMoney;

    private Date icomeTime;

    private Integer cardid;

    public Integer getIncomeId() {
        return incomeId;
    }

    public void setIncomeId(Integer incomeId) {
        this.incomeId = incomeId;
    }

    public String getIncomeMoney() {
        return incomeMoney;
    }

    public void setIncomeMoney(String incomeMoney) {
        this.incomeMoney = incomeMoney == null ? null : incomeMoney.trim();
    }

    public Date getIcomeTime() {
        return icomeTime;
    }

    public void setIcomeTime(Date icomeTime) {
        this.icomeTime = icomeTime;
    }

    public Integer getCardid() {
        return cardid;
    }

    public void setCardid(Integer cardid) {
        this.cardid = cardid;
    }
}