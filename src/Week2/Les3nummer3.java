package Week2;

public class Les3nummer3 
{
	
	public static void main(String[] args) 
	{
		int cijfer = 4;
		
		switch(cijfer)
		{
		case 1:
		case 2:
			System.out.println("Not passed");
			break;
		case 3:
			System.out.println("Passed");
			break;
		case 4:
			System.out.println("Good");
			break;
		case 5:
			System.out.println("Very good");
			break;
			default:
			System.out.println("Not valid");
        }
    }
}