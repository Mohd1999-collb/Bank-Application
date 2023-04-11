package com.company;

public class Main {
    public static void main(String[] args) {
	// write your code here
        // we'll be creating a bank app today
        // features to be added -
        // 1. create bank account
        // 2. withdraw balance
        // 3. add balance
        // 4. check balance
        System.out.println("first project - bank app");
        SBIAccount obj = new SBIAccount();
        obj.addBalance(2000);
        obj.checkBalance();
        System.out.println("Your interest is : " + obj.getROI());

    }
}
