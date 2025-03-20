package Week4Les8;

import Week4Les8.subpackage.Boat;

public class Person 
{
	    Car car; 
	    Boat boat; // different package as person

	    public static void main(String[] args) {
	    Person p = new Person();

	 
	        System.out.println(p.car.brand); // public
	        System.out.println(p.car.manufactureYear); // default
	        System.out.println(p.car.color); // protected
	        System.out.println(p.car.fuel); // private (no access)

	        System.out.println(p.boat.brand); // public
	        System.out.println(p.boat.manufactureYear); // default (no access)
	        System.out.println(p.boat.color); // protected (no access)
	        System.out.println(p.boat.fuel); // private (no access)
	    }
	}



