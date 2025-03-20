package Week5;

public class Mylist2 
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
		int[] intList = new int[6];
		
		//assign values to elements
		intList[0] = 23;
		intList[3] = 14;
	    intList[5] = 678;
	    
	    // display element values
	    for(int i=0; i< intList.length; i++)
	    {
	    	System.out.println(intList[i]);
	    }
		
	}
	
	

}
