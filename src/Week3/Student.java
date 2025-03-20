package Week3;
//MethodsthatreturnavalueLes62Employee
public class Student 
{
	String name;
	String email;
	String mobile;
	
	Student (String name, String email, String mobile){
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}
	Student updateStudent(String email, String mobile) {
		this.email = email;
		this.mobile = mobile;
		return this;
	}
	
	public static void main(String[] args) {
		Student mijnStudent = new Student("David", "david@mail.nl", "06-33557788");
		System.out.println(mijnStudent.name+",  "+mijnStudent.email+", "+mijnStudent.mobile);
		mijnStudent.updateStudent("david@xs4all.nl","06-22222222");
		System.out.println(mijnStudent.name+",  "+mijnStudent.email+", "+mijnStudent.mobile);
		
		}
	}
	


