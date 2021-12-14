package edu.kit.informatik;
public class Bank {
    private int bankCode;
    private Account[] account;
    int i; //to Mark the be found account in containsAccount

   
    public int getBankCode() {
        return bankCode;
    }
        
    //Constructor
    public Bank(int bankCode) {
        this.bankCode = bankCode;
        this.account = new Account[8];
    }
    
    public int createAccount(int accountNumber) {
        int accountAmount = size(); 
        Account user = new Account(this.bankCode, accountNumber);
        //if accountAmount < length of Array,just put the new account into the Array
        if (accountAmount < length()) {
            account[accountAmount] = user;
        }
        if (accountAmount == (length() - 1)) {
        //When the index of Array == length-1,start a new Array named expandAccount to save the accounts
            Account[] expandAccount = new Account[length()];
            for (int a = 0; a < length(); a++) {
                expandAccount[a] = this.account[a];
            }
            //Start the new account Array,and transport the accounts from changeAccount to the new account
            this.account = new Account[length() * 2];
            for (int b = 0; b < length() / 2; b++) {
                this.account[b] = expandAccount[b];
            }
        
        }
        return accountAmount;        
    }
    
    //remove account
    //When a account is removed,return true;if the account don't exist,return false
    public boolean removeAccount(int accountNumber) {
        if (containsAccount(accountNumber)) {
            account[i] = null;  
            //let the accounts after the removed account take the place before
            for (; i < size(); i++) {
                this.account[i] = this.account[i + 1];                
            }
            //If the the be taken Arrays less than 1/8 of the length of Array,then shrink the Array
            //but the shortest length of Array is 8 
            if ((size() <= length() / 8) && (length() >= 16)) {
                Account shrinkAccount[] = new Account[length() / 2];
                for (int a = 0; a < length() / 2; a++) {
                    shrinkAccount[a] = this.account[a];
                }
                this.account = new Account[length() / 2];
                for (int b = 0; b < length(); b++) {
                    this.account[b] = shrinkAccount[b];
                }            
            }            
            return true;
        }
        return false;
    }
       
    public boolean containsAccount(int accountNumber) {
        for (int j = 0; j < size(); j++) {
            if (account[j].getAccountNumber() == accountNumber) {
                this.i = j; //Mark the account
                return true;
            }
        }
        return false;
    }
    
    public boolean internalBankTransfer(int fromAccoutNumber, int toAccountNumber, int amount) {
        if (containsAccount(toAccountNumber)) {
            int t = this.i; //Mark the account of the toAccount
            if (containsAccount(fromAccoutNumber)) {
                if (account[i].withdraw(amount)) {
                    account[t].deposit(amount);
                    return true;
                }
            }
        }
        return false;
    }
    
        
    public int length() {
        return this.account.length;
    }    
    
    //the Variable size is to count the not null elements of the Array
    public int size() {
        int size = 0;
        for (int j = 0; j < length(); j++) {            
        if (account[j] != null) {  
        size += 1;                
            }
        }
        return size;
    }
    
    public Account getAccount(int index) {
        if (index < size()) {
            return this.account[index];
        } 
            return null;
        
    }
}