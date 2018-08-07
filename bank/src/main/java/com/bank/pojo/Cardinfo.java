package com.bank.pojo;

import java.util.Date;

public class Cardinfo {
    private Integer id;

    private Integer cardid;

    private String cardPwd;

    private Integer accountId;

    private Date cardState;

    private Long cardMoney;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCardid() {
        return cardid;
    }

    public void setCardid(Integer cardid) {
        this.cardid = cardid;
    }

    public String getCardPwd() {
        return cardPwd;
    }

    public void setCardPwd(String cardPwd) {
        this.cardPwd = cardPwd == null ? null : cardPwd.trim();
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Date getCardState() {
        return cardState;
    }

    public void setCardState(Date cardState) {
        this.cardState = cardState;
    }

    public Long getCardMoney() {
        return cardMoney;
    }

    public void setCardMoney(Long cardMoney) {
        this.cardMoney = cardMoney;
    }
}