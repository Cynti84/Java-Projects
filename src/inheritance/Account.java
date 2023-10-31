package inheritance;

class BankAccount{
	int acNo;
	String acName, acPhone, acEmail;
	double acBal;
	
	public BankAccount(int acNo, String acName, String acPhone, String acEmail, double acBal) {
		this.acNo = acNo;
		this.acName = acName;
		this.acPhone = acPhone;
		this.acEmail = acEmail;
		this.acBal = acBal;		
	}
	
	public void accountholder() {
		System.out.println("Account Number: "+acNo);
		System.out.println("Account Holder Name: "+acName);
		System.out.println("Account Holder Address: "+acEmail);
		System.out.println("Account Holder Phone: "+acPhone);
		System.out.println("Account Holder Balance: "+acBal);
	}
	
	public void deposit(double amount) {
		acBal += amount;
		System.out.println("Deposited: $"+amount);
	}
	
	public void displayBalance() {
		System.out.println("Account Number: " +acNo+ "  Balance: $"+acBal);
	}	
	
}

class SavingsAccount extends BankAccount{

	public SavingsAccount(int acNo, String acName, String acPhone, String acEmail, double acBal) {
		super(acNo, acName, acPhone, acEmail, acBal);
		// TODO Auto-generated constructor stub
	}
	
}

class currentAccount extends BankAccount{

	public currentAccount(int acNo, String acName, String acPhone, String acEmail, double acBal) {
		super(acNo, acName, acPhone, acEmail, acBal);
		// TODO Auto-generated constructor stub
	}
	
}

public class Account {

	public static void main(String[] args) {
		System.out.println("SAVINGS ACCOUNT DETAILS");
		SavingsAccount sac = new SavingsAccount(1001, "Ann Kamau", "0720000000", "test@gmail.com", 1000);
		sac.accountholder();
		sac.deposit(500);
		sac.displayBalance();
		
		System.out.println("\nCURRENT ACCOUNT DETAILS");
		currentAccount cac = new currentAccount(1001, "Peter Smith", "0810000000", "admin@gmail.com", 0);
		cac.accountholder();
		cac.deposit(300);
		cac.displayBalance();

	}

}
