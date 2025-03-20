package Week3;

public class MethodsthatreturnavalueLes62Employee {
	double getNetSalary(double grossSalary, double taxrate)
	{
		double totalTax = grossSalary * taxrate;
		double netSalary = grossSalary - totalTax ;
		return netSalary;
	}
	public static void main(String[] args)
	{
		MethodsthatreturnavalueLes62Employee emp = new MethodsthatreturnavalueLes62Employee();
		System.out.println(emp.getNetSalary(3200, 0.30));
		System.out.println(emp.getNetSalary(2200, 0.20));
		System.out.println(emp.getNetSalary(4200, 0.50));
		
	}


}
