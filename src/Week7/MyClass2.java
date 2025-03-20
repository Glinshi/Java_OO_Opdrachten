package Week7;

public class MyClass2 
{
	String[] bedrijven = {"Microsoft", "Oracle", "Google"};
	
	public String getElement(int index) 
	{
		return bedrijven[index];
	}
	
	public static void main(String[] args)
	{
		MyClass mc = new MyClass();
		try
		{
			mc.getElement(4);
		}
			catch (ArrayIndexOutOfBoundsException e)
			{
		System.out.print("Element does not exist!");
	}
	}
	}


//??