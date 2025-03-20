package Week3;

public class ConstructorswithargumentsAirplaneMain 
{
	public static void main(String[] args)
	{
		ConstructorswithargumentsAirplane ap1 = new ConstructorswithargumentsAirplane("UUO23", "KLM", 120);
		ConstructorswithargumentsAirplane ap2 = new ConstructorswithargumentsAirplane("SS098", "SAS", 164);
		
		System.out.print(ap1.code +", " + ap1.flight + ", " + ap1.nrSeats);
	    System.out.println(); 
		System.out.print(ap2.code +", " + ap2.flight + ", " + ap2.nrSeats);
	}

}
