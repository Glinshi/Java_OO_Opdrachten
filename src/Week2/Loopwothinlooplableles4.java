package Week2;

public class Loopwothinlooplableles4 
{
	
	public static void main(String[]args)
	{
		outer:for(int row=1; row <=4; row++)
		
		{
			for(int chair=1; chair<=6; chair++)
			{
			System.out.println("Row:"+row + "chair:"+chair);
			if(row == 2 && chair == 4)
			{
				System.out.println("The chair:"+chair + "of row:"+ row + "is found!" );
				break outer;
			}
		}
		}
	}
}


