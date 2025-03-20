package Week3;

public class CallaconstructorwithinaconstructorAirplaneMain 
{
	public static void main(String[] args)
	{
		CallaconstructorwithinaconstructorAirplane ap1 = new CallaconstructorwithinaconstructorAirplane("RRE23", "EasyJet", 120);
		CallaconstructorwithinaconstructorAirplane ap2 = new CallaconstructorwithinaconstructorAirplane("UYT19", 150);
		
		System.out.println("Airplane 1: " + ap1.code +  ", " + ap1.flight + ", " + ap1.nrSeats);
		System.out.println("Airplane 2: " + ap2.code +  ", " + ap2.flight + ", " + ap2.nrSeats);
	}

}
