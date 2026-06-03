package main;
import java.util.Scanner;
public class Employee {
	
	int basicSalary;
	public void calculateSalary(int value){
		int bonus = 5000;
		int total = bonus+value;
		
		System.out.println("Bonus: "+bonus);
		System.out.println("Total Salary: "+total);
	}
	public static void main(String[] args)
	{
		Employee obj = new Employee();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Basic Salary: ");
		obj.basicSalary  = scanner.nextInt();
		
		obj.calculateSalary(obj.basicSalary);
		scanner.close();
		
	}
}
