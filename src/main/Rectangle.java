package main;
import java.util.Scanner;
public class Rectangle {
	int length;
	int breadth;
	int findArea(int l,int b)
	{
		int area = l*b;
		return area;
		
	}
	public static void main(String[] args)
	{
		Rectangle obj = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Length = ");
		obj.length = scanner.nextInt();
		System.out.print("Breadth = ");
		obj.breadth = scanner.nextInt();
		System.out.println("Area = "+obj.findArea(obj.length,obj.breadth));
	}
}
