package Week3;

public class CallaconstructorwithinaconstructorAirplane 
{
	String code;
	String flight;
	int nrSeats;
	
	CallaconstructorwithinaconstructorAirplane(String code, int nrSeats)
	{
		this(code, "KLM", nrSeats);
	}
	CallaconstructorwithinaconstructorAirplane(String code, String flight, int nrSeats)
	{
		this.code = code;
		this.flight = flight;
		this.nrSeats = nrSeats;
	}
}
