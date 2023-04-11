package com.company;

public class SBIAccount implements BankInterface {
    private int balance;
    @Override
    public void addBalance(int bal) {
        balance += bal;
        System.out.println("Rs. " + bal + " Credit to account.");
    }

    @Override
    public void checkBalance() {
        System.out.println("Total balance : Rs. " + balance);
    }

    @Override
    public int getROI() {
        return 5 * balance;
    }
}
