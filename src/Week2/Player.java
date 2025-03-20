package Week2;

import java.util.Scanner;

public class Player {

	public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the name: ");
			String name = input.nextLine();
			System.out.print("Enter the age: ");
			int age = input.nextInt();
			System.out.print("Enter the height: ");
			int height = input.nextInt();
			
			if(age <16 && age>30 && height < 180)
			{
				System.out.print("The player is selected");
			}
			else
			{System.out.print("The player is rejected");
			}
			input.close();

	}


}
