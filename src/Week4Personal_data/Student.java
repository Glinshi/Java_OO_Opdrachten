package Week4Personal_data;

import Week4Calender.DateInfo;

public class Student {
		
		String name;
		String birthDate;
		

	    public static void main(String[] args) {
	        Student s1 = new Student();
	        Student s2 = new Student();
	        s1.name = "Isabella";
	        s2.name = "David";
	        s1.birthDate = DateInfo.getDateformat(8,28,1998);
	        s2.birthDate = DateInfo.getDateformat(9,13,1996);
	        
	        System.out.println("---First Student---");
	        System.out.println("---Second Student---");
	        System.out.println("Name" +s1.name);
	        System.out.println("Birth date:" +s1.birthDate);
	        System.out.println("---Second Student---");
	        System.out.println("Name" +s2.name);
	        System.out.println("Birth date:" +s2.birthDate);
	}
	}
		


