package Week3;

public class ObjectReferencesAirplaneMain 
{
	static ObjectReferencesAirplane ap3;
	
	public static void main(String[] args)
	{
		ObjectReferencesAirplane ap1 = new ObjectReferencesAirplane("UUU22", "EasyJet", 146);
		ObjectReferencesAirplane ap2 = new ObjectReferencesAirplane("WQQ99", "AirFance", 156);
		ap2 = ap1;
		
		System.out.println("===================");
		System.out.println("Airplane 1: "+ap1.code+", " + ap1.flight + ", " + ap1.nrSeats);
		System.out.println("Airplane 2: "+ap2.code +", " + ap2.flight + ", " + ap2.nrSeats);
		System.out.println("Airplane 3: "+ap3.code +", " + ap3.flight + ", " + ap3.nrSeats);
		}
	
}


