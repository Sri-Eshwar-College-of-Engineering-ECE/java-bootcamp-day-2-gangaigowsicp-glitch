package main;
import java.util.Scanner;
public class BankAccount {
	int balance = 10000;
	void deposite(int depositAmount,int balance)
	{
		 balance = depositAmount+balance;
		 System.out.println("Updated Balance: "+balance);
	}
	public static void main(String[] args)
	{
		BankAccount obj = new BankAccount();
		System.out.println("Current Balance: "+obj.balance);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Deposit Amount: ");
		int amount = scanner.nextInt();
		obj.deposite(amount,obj.balance);
		
	}
}
