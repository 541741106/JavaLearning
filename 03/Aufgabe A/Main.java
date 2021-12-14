public class Main
{
	public static void main(String[] args){
		Bank ICBC = new Bank(45678);
		
        ICBC.createAccount(1);
        ICBC.createAccount(2);
        ICBC.createAccount(3);
        ICBC.createAccount(4);
        ICBC.createAccount(5);
        ICBC.createAccount(6);
        ICBC.createAccount(7);
        ICBC.createAccount(8);
        ICBC.createAccount(9);
        ICBC.createAccount(10);
        ICBC.createAccount(11);
        ICBC.createAccount(12);
        ICBC.createAccount(13);
        ICBC.createAccount(14);
        ICBC.createAccount(15);
        ICBC.createAccount(16);
        
        ICBC.removeAccount(10);
        ICBC.removeAccount(9);
        ICBC.removeAccount(8);
        ICBC.removeAccount(7);
        ICBC.removeAccount(6);
        ICBC.removeAccount(5);
        ICBC.removeAccount(4);
        ICBC.removeAccount(3);
        ICBC.removeAccount(2);
        ICBC.removeAccount(1);
        ICBC.removeAccount(16);
        ICBC.removeAccount(15);
        ICBC.removeAccount(14);
        ICBC.removeAccount(13);
        ICBC.removeAccount(11);
        
        
        
        System.out.println(ICBC.length());
        
        System.out.println(ICBC.size());
        
        
        System.out.println(ICBC.getAccount(0).getAccountNumber());
	}
}