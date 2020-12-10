package com.lz.springmvc.bean;


import javax.xml.crypto.Data;
import java.io.Serializable;

public class Account implements Serializable {
    private int id;
    private String accountName;
    private Data accountData;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Data getAccountData() {
        return accountData;
    }

    public void setAccountData(Data accountData) {
        this.accountData = accountData;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountName='" + accountName + '\'' +
                ", accountData=" + accountData +
                '}';
    }
}
