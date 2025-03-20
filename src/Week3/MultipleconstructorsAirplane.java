package Week3;

public class MultipleconstructorsAirplane 
{
	
		String code;
		String flight;
		int nrSeats;
		
		MultipleconstructorsAirplane(){
			
			System.out.println("no-argument");
		}
		MultipleconstructorsAirplane(String code, int nrSeats)
		{
			this.code = code;
			this.nrSeats = nrSeats;
			System.out.println("2-argument");
	
		}
		MultipleconstructorsAirplane(String code, String flight, int nrSeats)
		{
			this.code = code;
			this.flight = flight;
			this.nrSeats = nrSeats;
			System.out.println("3-argument");
		
		}

}
