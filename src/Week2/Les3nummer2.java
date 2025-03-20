package Week2;

public class Les3nummer2 {
	
	public static void main(String[] args) {
		double price = 4000;
		boolean isClient = true;
		
		
	
		if(isClient)
		{
			price = price -500; // price = price -500
		}
		else if(price > 3000)
		{
			price -= 200;     // price = price -200
		}
		else
		{
			price -= 100;     
		}
		System.out.println("The price of the car is: "+ price);
	}

}
