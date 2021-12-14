package edu.kit.informatik;
public class Account {
    private int accountNumber;
    private int bankCode;
    private int balance;
    
    //No setters for the accountNumber and bankCode,because they will never be changed
    //No setter for balance because all the operation will be done by withdraw and deposit
    
    public int getBankCode() {
        return bankCode;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public int getBalance() {
        return balance;
    }
    
    //constructor
    public Account(int bankCode, int accountNumber) {
        this.bankCode = bankCode;
        this.accountNumber = accountNumber;
    }
    
    public boolean withdraw(int amount) {
        if (amount < balance) {
            return false;
        }
        balance -= amount;
        return true;
    }
    
    public void deposit(int amount) {
        balance += amount;
    }
}