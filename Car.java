package student;
import java.util.Scanner;
public class Car {
	String Brand;
	int price;
	static String company = "ABC Motors";
	void Bmw(Car Bmw)
	{
		System.out.println("The Car Brand: "+Bmw.Brand);
		System.out.println("The Car Price: "+Bmw.price);
		System.out.println("The Company: "+company);
	}
	void Porsche(Car Porsche)
	{
		
		System.out.println("The Car Brand: "+Porsche.Brand);
		System.out.println("The Car Price: "+Porsche.price);
		System.out.println("The Company: "+company);
		
	}
	void Ferrari(Car Ferrari)
	{
		
		System.out.println("The Car Brand: "+Ferrari.Brand);
		System.out.println("The Car Price: "+Ferrari.price);
		System.out.println("The Company: "+company);
		
	}
	void display(Car Bmw,Car Porsche,Car Ferrari)
	{
		System.out.println("---------------------------------------------");
		Bmw.Bmw(Bmw);
		System.out.println("---------------------------------------------");
		Porsche.Porsche(Porsche);
		System.out.println("---------------------------------------------");
		Ferrari.Ferrari(Ferrari);
		System.out.println("---------------------------------------------");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		Car Bmw = new Car();
		Bmw.Brand = "Bmw";
		Bmw.price = 15000000;
		Car Porsche = new Car();
		Porsche.Brand = "Porsche";
		Porsche.price = 50000000;
		Car Ferrari = new Car();
		Ferrari.Brand = "Ferrari";
		Ferrari.price = 100000000;
		Bmw.display(Bmw, Porsche, Ferrari);
		scanner.close();
		
	}

}
