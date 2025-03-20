package Week3;

import java.util.Scanner;

public class Gold2 {
    
    double getounce(double priceGold, double clientMoney) {
    	double amountOunce = clientMoney / priceGold;
        return amountOunce;
    }

    public static void main(String[] args) {
        Gold2 gold = new Gold2(); 

        Scanner input = new Scanner(System.in);

  
        System.out.print("Enter the price for one ounce of gold $: ");
        double priceGold = input.nextDouble();

   
        System.out.print("Enter your total spending: $ ");
        double clientMoney = input.nextDouble();

    
        double finalAmount = gold.getounce(priceGold, clientMoney);

    
        System.out.printf((int)clientMoney + " = " + finalAmount + " ounces of gold");

        input.close();
    }
}





