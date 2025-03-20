package Week2;

public class Continuestatementles4 
{
	public static void main(String[]args)
	{
		int year = 1990;
		
		while(year< 2020)
		{
			year++;
			if(year % 4 != 0)
			{
				continue;
			}
			System.out.println(year + ", ");
		}
		}

}
