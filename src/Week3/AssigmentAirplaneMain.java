package Week3;

public class AssigmentAirplaneMain 
{
	public static void main(String[] args) 
	{
		AssigmentAirplane em1 = new AssigmentAirplane("Olivia", 3100.45, "Canada");
		
		AssigmentAirplane em2 = new AssigmentAirplane();
		
		em2.name = "James";
		em2.salary = 2400.55; 
		em2.country = "France";
		
		System.out.println("------Employees------");
		System.out.println("Name:         "+ em1.name);
		System.out.println("Salary:       "+ em1.salary);
		System.out.println("Country:      "+ em1.country);
		System.out.println("------------");
		System.out.println("Name:         "+ em2.name);
		System.out.println("Salary:       "+ em2.salary);
		System.out.println("Country:      "+ em2.country);
		
	}

}
