package main;

public class Student {
	 String name = "Gangai Gowsic.P";
	 int rollno = 123;
	void display()
	{
		String college = "ABC Engineering College";
		System.out.println("Name: "+name);
		System.out.println("Roll No: "+rollno);
		System.out.println("College: "+college);
		
	}
	public static void main(String[] args)
	{
		Student s = new Student();
		s.display();
	}
}
