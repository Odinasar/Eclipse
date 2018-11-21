
public class BankAccountClass {

	public static void main(String[] args) {
		
//BankAccount account=new BankAccount();
//account.setBalance(1000);
//
//System.out.println(account.Deposit(1000));
//
//account.Withdraw(2000);
		
		
		//ozzy
		
		BankAccount account=new BankAccount();
		account.setAccountNumber("5555555");
		account.setBalance(2.5);
		account.setCustomerName("Mike");
		account.Withdrawl(100.00);
		account.Deposit(150.000);
		account.Withdrawl(50.00);
		
		System.out.println(account.getCustomerName()); 
		
	}

}
