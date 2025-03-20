package Week7;

public class Math 
{
	public static int divide(int numerator, int denominator)
	{
		int result = numerator / denominator;
		return result;
	}
	public static void main(String[] args)
	{
		try
		{
			divide(5,0);
		}
		catch (ArithmeticException ae) //plaatsen zodat je door nul kan delen
		
		{
	System.out.println("Error: divide by zero");

}
		System.out.println("End main().");
	}

}
