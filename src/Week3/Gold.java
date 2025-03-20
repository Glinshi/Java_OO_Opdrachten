package Week3;

import java.util.Scanner;

public class Gold {
	
	double getounce() // double getounce(double amount, double pri)
	{
		double pricePerOunce = 1.0/1300.0;	
		Scanner input = new Scanner(System.in);
		double totalPrice = input.nextInt();  
		double amount = totalPrice * pricePerOunce;
		input.close();
		return amount;
		
	}

	
	public static void main(String[] args)
	{
		Gold pri = new Gold();
		double amount = pri.getounce();
		double totalPrice = amount * 1300; 
		System.out.printf("$ %d = %.1f", (int) totalPrice, amount);

    }
	}

