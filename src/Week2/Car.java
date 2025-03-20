package Week2;

import java.util.Scanner;

public class Car 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the price: ");
		double price = input.nextDouble();
		System.out.print("Enter the manufacture year: ");
		int manufactureYear = input.nextInt();
		
		if(price > 6000 && price < 9000)
		{
			price -= 400;
		}
		if(manufactureYear < 2010)
		{
			price -= 300;
		}
		System.out.print("The price of the car is: $" + price);
		input.close();
	}

}
