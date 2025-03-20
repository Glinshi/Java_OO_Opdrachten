package Week6;

public class Student extends Person
{
	/*String group;
	
	Student(String name, String email, String group)
	{
		super(name, email);
		this.group = group;
	}
	*/
	
	//methods
  String klas;
  
  public Student(String name, String email, String klas) { 
      super(name, email); 
      this.klas = klas; 
      
  }
	
	public void printData(){
	
		System.out.println("Name:   " + name);
		System.out.println("Email:   " + email);
		System.out.println("Klas:   " + klas);
	}
}
	

