package oop;

import static oop.SavingsAccount.print;

public class MyBank {
    public static void main(String[] args) {
        Account myAccount= new Account();
        myAccount.deposit(500);
        myAccount.withDraw(50);
        myAccount.setAccountName("Savings Account");
        myAccount.setAddress("268 NE 112th St");
        System.out.println(myAccount);

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.deposit(200);
        checkingAccount.withDraw(50);
        checkingAccount.setAccountName("Checking account");
        checkingAccount.setAddress("7917 west drive");
        System.out.println(checkingAccount);
        checkingAccount.wordCount("This is so easy");
        System.out.println(checkingAccount.reverseString("BELEN"));

        SavingsAccount savingsAccount = new SavingsAccount(4);
        System.out.println(savingsAccount);
        print();

    }
}
