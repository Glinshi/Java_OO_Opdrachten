package Week2;

public class Breakstatementles4 
{
	public static void main(String[]args)
	{
		int id = 8; 
		for(int i=1; i<100; i++)
		{
			if(i == id)
			{
			System.out.println("Is found!");
			break;
		}
		System.out.println("Id: "+i);
		}
	}
}
