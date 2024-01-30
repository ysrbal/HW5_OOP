package com.yasar.question1;

import com.yasar.question1.entity.Bank;
import com.yasar.question1.entity.Hesap;
import com.yasar.question1.entity.VadeliHesap;
import com.yasar.question1.entity.VadesizHesap;

public class Runner {
    public static void main(String[] args) {
        Bank bank = new Bank("Garanti Bankasi", "TGBATRIS", "Ankara", "0312 444 4 444");
        System.out.println(bank.printInfo());

        Hesap hesap = new VadesizHesap();
        hesap.id = 123L;
        hesap.name = "Vadesiz TRY";
        hesap.bankId = bank.id;
        hesap.branchNumber = 555;
        hesap.accountNumber = 456789L;
        hesap.ibanNumber = "TR0000000000000456789";
        hesap.currency = "TRY";
        hesap.money = 45_000;
        hesap.isActive = true;

        System.out.println(hesap.toString());
        System.out.println(hesap.creationDate());
        System.out.println(hesap.isActive());

        VadeliHesap vadeliHesap = new VadeliHesap();
        vadeliHesap.id = 124L;
        vadeliHesap.name = "Vadeli TRY";
        vadeliHesap.bankId = bank.id;
        vadeliHesap.branchNumber = 555;
        vadeliHesap.accountNumber = 456788L;
        vadeliHesap.ibanNumber = "TR0000000000000456788";
        vadeliHesap.currency = "TRY";
        vadeliHesap.money = 20_000;
        vadeliHesap.isActive = true;
        vadeliHesap.maturityRate=45;
        vadeliHesap.termDay = 32;

        vadeliHesap.deposit(5000);
        vadeliHesap.withdraw(10000);
        vadeliHesap.netGain();


    }
}
