package Week2;

public class Les3nummer1 
{
	public static void main(String[] args) {
		double price = 5000;
		boolean isClient = true;
		int manufractureYear = 2014;
		
		if(price > 4000)
		{
			price -= 200; // price = price - 200;
		}
		if(isClient)
		{
			price = price -300;
		}
		if(manufractureYear < 2010)
		{
			price -= 100;     // price = price -100
		}
		System.out.println("The price of the car is: "+ price);
	}
	

}
