package main;
import java.util.Scanner;
public class Circle {
	static int radius;
	static void calculateArea(int radius)
	{
		double pi = 3.14;
		double area = pi*radius*radius;
		System.out.println("Area = "+area);
		
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Radius = ");
		int rad = scanner.nextInt();
		calculateArea(rad);
	}
}
