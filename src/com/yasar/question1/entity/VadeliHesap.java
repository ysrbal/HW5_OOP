package com.yasar.question1.entity;

public class VadeliHesap extends Hesap{
    public Integer maturityRate;
    public Integer termDay;

    public void netGain() {
        System.out.println("Term Day : " + this.termDay);
        System.out.println("Maturity Rate : " + this.maturityRate);
        Integer netGain = (this.money * this.maturityRate * this.termDay) / 36500;
        System.out.println("Capital : " + this.money);
        System.out.println("Net Gain : " + netGain);
    }
}
