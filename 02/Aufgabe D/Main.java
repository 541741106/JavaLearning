public class Main
{
	
	public static void main(String[] args){
		//Create a new "Account" object called "account00"
		Account account00 = new Account(0);    
		
		//Create a new "AccountHolder" object called "accountHolder00"
		AccountHolder accountHolder00 = new AccountHolder(account00,"Haoshen","Zhang",0);
		
		//print all the attribute of the class "Account" and the class "AccountHolder"
		System.out.println(account00.getAccountNumber());
		System.out.println(account00.getBankCode());
		System.out.println(account00.getBalance());
		System.out.println(accountHolder00.getAccount().getAccountNumber());
		System.out.println(accountHolder00.getAccount().getBankCode());
		System.out.println(accountHolder00.getAccount().getBalance());
		System.out.println(accountHolder00.getFirstName());
		System.out.println(accountHolder00.getLastName());
		System.out.println(accountHolder00.getAccountHolderNumber());

	}
}