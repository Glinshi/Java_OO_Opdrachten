package Week1;

public class EmployeeMain {
	
	public static void main(String [] args)
	{
		//create an object
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		

		
		// assign values to the variables
		emp1.name = "David";
		emp1.age = 34; 
		emp1.salary = 3000;
		emp1.isMarried = true;
		emp1.mail = "david@mail.com";
		emp2.name = "Emma";
		emp2.age = 22; 
		emp2.salary = 2200;
		emp2.isMarried = false;
		emp2.mail = "Emma@mail.com";
		
		// display employee
		System.out.println(emp1.name);
		System.out.println(emp1.age);
		System.out.println(emp1.salary);
		System.out.println(emp1.isMarried);
		System.out.println("--------------");
		System.out.println(emp2.name);
		System.out.println(emp2.age);
		System.out.println(emp2.salary);
		System.out.println(emp2.isMarried);
}
	
}


