package Week6;

public class Truck extends Vehicle
{
	double maxload;
	
	  public Truck(String brand, int manufactureyear, String color, double maxload) { 
	      super(brand, manufactureyear, color ); 
	      this.maxload = maxload; 
	      
	  }
		
	  public void Print() { 
		  System.out.println("Brand:   " + brand);
		  System.out.println("Manufacture year:   " + manufactureyear);
		  System.out.println("Color:   " + color);
		  System.out.println("Maximum load:   " + maxload);
	  }

}


