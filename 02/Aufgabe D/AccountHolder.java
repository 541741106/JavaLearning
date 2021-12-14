public class AccountHolder
{
	private Account account;//declare variable account
	private String firstName;//declare variable firstName
	private String lastName;//declare variable lastName
	private int accountHolderNumber;//declare variable accountHolderNumber
	
	/*
	The attributes "Account account","String firstName","String lastName","int accountHolderNumber",
	they wild be used by output.So we should use the getters. 
	*/
	public Account getAccount(){
		return account;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public int getAccountHolderNumber(){
		return accountHolderNumber;
	}
	
	//Constructor 
	AccountHolder(Account account,String firstName,String lastName,int accountHolderNumber){
		//variables initialize
		this.account = account;
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountHolderNumber = accountHolderNumber;
	}
}