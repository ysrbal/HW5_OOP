package com.yasar.question1.entity;

import java.util.Random;

public class Bank {
    public Long id;
    public String name;
    public String swiftCode;
    public String address;
    public String phoneNumber;

    public Bank() {
        this.id = new Random().nextLong(0,999999);
    }

    public Bank(String name, String swiftCode, String address, String phoneNumber) {
        this();
        this.name = name;
        this.swiftCode = swiftCode;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String printInfo() {
        return "ID : " + id + "\n" +
                "name : " + name + "\n" +
                "Swift Code : " + swiftCode + "\n" +
                "Address : " + address + "\n" +
                "Phone Number : " + phoneNumber;
    }
}
