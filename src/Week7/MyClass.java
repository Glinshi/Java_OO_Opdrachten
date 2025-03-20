package Week7;

public class MyClass 
{
	StringBuffer sb;
	int z;
	
	public void updateObject()

	{
		sb.append("x"); //is niks waard geeft error aan
	}
	public static void main(String[] args){
		MyClass mc = new MyClass();
		try
		{

	mc.updateObject();
		}
		catch(NullPointerException npe)
		{
			System.out.print("The object \"sb\" is not created yet!");
		}
	
	}
}
