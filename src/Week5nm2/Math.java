package Week5nm2;

public class Math {
	public static double getAverage(double nr1, double nr2, double nr3)
	{
		double average = (nr1+nr2+nr3)/3;
		return average;
	}
	public static void main(String[] args)
	{
		System.out.println(Math.getAverage(10, 11, 12));
	}

}
