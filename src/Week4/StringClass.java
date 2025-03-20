package Week4;

public class StringClass 
{
	public static void main(String[] args)
	{
		String brand = "Philips";
		String brand2 = new String("Philips"); //door het new-keywoord te gebruiken is brand 2 een nieuw apart object en dus niet === met brand.
		System.out.println(brand);
		System.out.println(brand2);
	}
}
