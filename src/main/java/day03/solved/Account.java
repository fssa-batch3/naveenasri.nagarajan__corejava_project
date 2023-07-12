package day03.solved;

public class Account {

	public String accNo;

	public String name;

	public double balance;

	public  Account(String accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	
	public static void main(String[] args) {
		// create Account
				Account acct1 = new Account("A0107", "Naveena", 1000);
				System.out.println(acct1.accNo + "-" + acct1.name + "-" + acct1.balance);

		
	}
}
