package student;

public class Employee {
	String employeeName;
    static int count;
     Employee()
    {
    	count++;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		Employee emp1 = new Employee();
		emp.employeeName = "Raja";
		emp1.employeeName = "Arun";
		System.out.println("The total number of employees: "+count);
		
	}

}
