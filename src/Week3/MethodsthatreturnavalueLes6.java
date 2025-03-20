package Week3;

public class MethodsthatreturnavalueLes6 
{
	double getNetSalary()
	{
		double taxrate = 0.30;
		double totalTax = 3200 * taxrate;
		double netSalary = 3200 - totalTax;
		return netSalary;
	}
	public static void main(String[] args)
	{
		MethodsthatreturnavalueLes6 emp = new MethodsthatreturnavalueLes6();
		double netSalary = emp.getNetSalary();
		System.out.println(netSalary);
	}

	
	
	

}
