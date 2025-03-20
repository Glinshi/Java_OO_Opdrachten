package Week5nm2;

public class Group 
{
	public static void main(String[] args)
	{
		Student student1 = new Student("David");
		Student student2 = new Student("Bianca");
		Student student3 = new Student("Eric");
		
		System.out.println(student1.numberStudents);
		System.out.println(student2.numberStudents);
		System.out.println(student3.numberStudents);
		
		System.out.println(Student.numberStudents);
	}

}
