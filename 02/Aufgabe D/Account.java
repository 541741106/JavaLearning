public class Account
{
	private int accountNumber;
	private int bankCode;
	private int balance;
	static int counter = 0;       //count the number of the Accounts
	
	/*
	The attributes "int accountNumber","int bankCode","int balance",
	they are privat,and they will be used by output.So we should use the getters. 
	*/
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public int getBankCode(){
		return bankCode;
	}
	
	public int getBalance(){
		return balance;
	}
	
	/*
	The attribute "int bankCode" will be changed by the method"depoist" and "transfer"
	So we should use setter.
	*/
	public void setBalance(int balance){
		this.balance  =  balance;
	}
	
	//Constructor Account,bankCode as parament
	public Account(int bankCode){
		this.bankCode = bankCode;
		this.balance = 0;            //when initialize this balance is always 0
		this.accountNumber = counter;
		++counter;
	}
	
	//this method "withdraw" is to judge if this act allowed to executed,and if the amount bigger than balance,this act is impossible
	public boolean withdraw(int amount){
		if(amount <= balance){
			return true;
		}else {
			return false;
		}
	}
	
	//this method "deposit" stand for save the money
	public void deposit(int amount){
		balance = balance + amount;
	}
	
	//Account account as Zielkonto
	public void transfer(Account account,int amount){
		balance = balance - amount;
		account.balance = account.balance + amount;
	}
}