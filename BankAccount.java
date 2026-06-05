package student;

public class BankAccount {
	int accountNumber;
	int balance;
	static String bankName = "State Bank";
	void display(BankAccount account1,BankAccount account2)
	{
		System.out.println("-------Account1 Details--------");
		System.out.println("BankName: "+ bankName);
		System.out.println("Account Number: "+ account1.accountNumber);
		System.out.println("Balance: "+ account1.balance);
		System.out.println("-------Account2 Details--------");
		System.out.println("BankName: "+ bankName);
		System.out.println("Account Number: "+ account2.accountNumber);
		System.out.println("Balance: "+ account2.balance);
		System.out.println("------------------------------");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		account1.accountNumber = 123456;
		account1.balance = 70000;
		account2.accountNumber = 987456;
		account2.balance = 200000;
		account1.display(account1,account2);
		
		
	}

}
