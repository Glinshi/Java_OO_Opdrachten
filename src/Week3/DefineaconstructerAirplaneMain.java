package Week3;

public class DefineaconstructerAirplaneMain 
{
	public static void main(String[] args)
	{
		DefineaconstructerAirplane ap = new DefineaconstructerAirplane();
		ap.code = "UYU78";
		ap.flight = "EasyJet";
		ap.nrSeats = 134;
		
		System.out.print(ap.code +", " + ap.flight + ", " + ap.nrSeats);
				
	}
	

}
