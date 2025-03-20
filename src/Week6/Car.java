package Week6;

public class Car extends Vehicle{
	
	int maxpassengers;
	
	  public Car(String brand, int manufactureyear, String color, int maxpassengers) { 
	      super(brand, manufactureyear, color ); 
	      this.maxpassengers = maxpassengers; 
	      
	  }
		
	  public void Print() { 
		  System.out.println("Brand:   " + brand);
		  System.out.println("Manufacture year:   " + manufactureyear);
		  System.out.println("Color:   " + color);
		  System.out.println("Max passengers:   " + maxpassengers);
	  }

}
