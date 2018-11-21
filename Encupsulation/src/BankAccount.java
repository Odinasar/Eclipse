
public class BankAccount {
	
	private String accountNumber;
	private double balance;
	private String CustomerName;
	private String Email;
	private String PhoneNumber;
	
	
	//ozzy+++++++++++++++++++++++++++++
	public void Deposit(double depositAmount) {
		this.balance+=depositAmount;
		
	}
	
	
	public void Withdrawl(double withdrawalAmount) {
		if(this.balance-withdrawalAmount<0){
			System.out.println("ONLY "+this.balance+" available" );	
		}else {
			this.balance-=withdrawalAmount;
			System.out.println("Withdrawal of "+ withdrawalAmount+ " processed.Remaining Balance is"+this.balance );
		}
	}
	//ozzy+++++++++++++++++++++++++++++++
//	public double Deposit(int depo) {
//		return this.balance+=depo;
//	}
//	
//	public void  Withdraw(int deduction) {
//		if (this.balance-deduction<0) {
//			System.out.println("Insufficient Funds");
//		}else{
//			System.out.println(this.balance-deduction); 
//		}
//	}
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

}
