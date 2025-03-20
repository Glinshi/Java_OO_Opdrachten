package Week6;

public class Maincar {
	
public static void main(String[] args)
	
	{
        Car c1 = new Car("Toyota", 2013, "red", 5);
        Car c2 = new Car("Mazda", 2017, "blue", 8);
        Truck t1 = new Truck("BMW", 2016, "green", 6550);
        Truck t2 = new Truck("Volvo", 2014, "black", 4000);
	
        
        System.out.println("---Car---");
        c1.Print(); 
        
        System.out.println("---Car---");
        c2.Print(); 
        
        System.out.println(); 
        
        System.out.println("---Truck---");
        t1.Print(); 
        
        System.out.println("---Truck---");
        t2.Print();  
         
    }

		

}
