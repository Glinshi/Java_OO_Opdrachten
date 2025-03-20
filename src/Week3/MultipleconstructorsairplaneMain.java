package Week3;

public class MultipleconstructorsairplaneMain 
{
	public static void main(String[] args) {
		MultipleconstructorsAirplane ap1 = new MultipleconstructorsAirplane();
		MultipleconstructorsAirplane ap2 = new MultipleconstructorsAirplane("UYT19", 150);
		MultipleconstructorsAirplane ap3 = new MultipleconstructorsAirplane("RRE23", "EasyJet",120);
		
		System.out.println("===================");
		System.out.println("Airplane 1: "+ap1.code+", " + ap1.flight + ", " + ap1.nrSeats);
		System.out.println("Airplane 2: "+ap2.code +", " + ap2.flight + ", " + ap2.nrSeats);
		System.out.println("Airplane 3: "+ap3.code +", " + ap3.flight + ", " + ap3.nrSeats);
	}

}
