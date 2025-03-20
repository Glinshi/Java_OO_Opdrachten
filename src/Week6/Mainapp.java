package Week6;

public class Mainapp 
{
	public static void main(String[] args)
	
	{   //basic manier
		/*Student st = new Student("Emma", "emma@mail.com", "7B");
		Teacher tc = new Teacher("David", "David@mail.com", "C++", 3500);
		
		System.out.println(st.name);
		System.out.println(st.email);
		System.out.println(st.group);
		System.out.println(tc.name);
		System.out.println(tc.email);
		System.out.println(tc.course);
		System.out.println(tc.salary);
	}*/
		
		
		
		
		//methods manier 2
        Student st = new Student("Emma", "emma@mail.com", "7B");
        Teacher tc = new Teacher("David", "David@mail.com", "C++", 3500);
        
        System.out.println("Student");
        st.printData(); 
        
        System.out.println(); 

        System.out.println("Teacher");
        tc.printData(); 
    }

		

}
