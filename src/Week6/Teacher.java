package Week6;

public class Teacher extends Person
{
	/*String course;
	double salary;
	
	Teacher(String name, String email, String course, double salary)
	{
		super(name,email);
		this.course = course;
		this.salary = salary;
	}*/
	
	
	//methods
	String course;
	double salary;
	

    public Teacher(String name, String email, String course, double salary) { // Constructor om Teacher te initialiseren
        super(name, email); 
        this.course = course; 
        this.salary = salary; 
        
    }
	public void printData(){
	{
		System.out.println("Name:   " + name);
		System.out.println("Email:   " + email);
		System.out.println("Course:   " + course);
		System.out.println("Salary:   " + salary);
	}

}
}
