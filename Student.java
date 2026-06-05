package student;
import java.util.Scanner;
public class Student {
	String name;
	int rollno;
   void display()
	{
		System.out.println("Student Name: "+name+"\n"+"Student Rollno: "+rollno);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Student s1 = new Student();
		Student s2 = new Student();
		System.out.print("Student1 details:\n");
		System.out.print("Enter your name: ");
		s1.name = scanner.next();
		System.out.print("Enter your Rollno: ");
		s1.rollno = scanner.nextInt();
		s1.display();
		System.out.print("--------------------------------------------------\n");
		
		System.out.print("Student2 details:\n");
		System.out.print("Enter your name: ");
		s2.name = scanner.next();
		System.out.print("Enter your Rollno: ");
		s2.rollno = scanner.nextInt();
		
		s2.display();
		System.out.print("--------------------------------------------------\n");
		scanner.close();
	}

}
