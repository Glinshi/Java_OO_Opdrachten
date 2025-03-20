package Week5;

import java.util.ArrayList;

public class Company {
	
	String address;
	String email;
	ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public void addEmployee() {
		Employee e1 = new Employee("Jack");
		Employee e2 = new Employee("Emma");
		Employee e3 = new Employee("David");
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
	}
	
	public static void main(String[] args)
	{
		Company comp = new Company();
		comp.addEmployee();
		comp.employees.remove(1);
		
		for(int i=0; i< comp.employees.size(); i++)
		{
			System.out.println(comp.employees.get(i).name);
		}
	}

}
