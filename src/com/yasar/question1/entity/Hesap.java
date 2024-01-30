package com.yasar.question1.entity;

import java.util.Random;

public class Hesap {
    public Long id;
    public Long bankId;
    public String name;
    public Integer branchNumber;
    public Long accountNumber;
    public String ibanNumber;
    public Long creationDate;
    public String currency;
    public Integer money;
    public Boolean isActive;

    public Hesap() {
        this.id = new Random().nextLong(999999L);
    }

    public Hesap(String name, Integer branchNumber, Long accountNumber, String ibanNumber, Long creationDate, String currency, Integer money, Boolean isActive) {
        this.name = name;
        this.branchNumber = branchNumber;
        this.accountNumber = accountNumber;
        this.ibanNumber = ibanNumber;
        this.creationDate = creationDate;
        this.currency = currency;
        this.money = money;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hesap{");
        sb.append("id=").append(id);
        sb.append(", bankId=").append(bankId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", branchNumber=").append(branchNumber);
        sb.append(", accountNumber=").append(accountNumber);
        sb.append(", ibanNumber='").append(ibanNumber).append('\'');
        sb.append(", creationDate=").append(creationDate);
        sb.append(", currency='").append(currency).append('\'');
        sb.append(", money=").append(money);
        sb.append(", isActive=").append(isActive);
        sb.append('}');
        return sb.toString();
    }

    public Boolean isActive() {
        if (isActive) {
            return true;
        } else return false;
    }

    public Long creationDate() {
        return this.creationDate = System.currentTimeMillis();
    }

    public void withdraw(Integer cash) {
        System.out.println("Balance : " + this.money);
        System.out.println("Amount of money to withdraw : " + cash);
        this.money -= cash;
        System.out.println("Current Balance : " +  this.money);

    }

    public void deposit(Integer cash) {
        System.out.println("Balance : " + this.money);
        System.out.println("Amount of money to deposit : " + cash);
        this.money += cash;
        System.out.println("Current Balance : " + this.money);

    }
}
