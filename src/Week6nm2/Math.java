package Week6nm2;

public class Math 
{
	public static int getSum(int i, int i2, int i3)
	{
		return i + i2 + i3;
	}
	public static int getResult(int i, int i2, int i3)
	{
		return i * i2 * i3;
	}
	public static int getMax(int i1, int i2, int i3)
	{
	
		int max = i1;
		
		if(i2 > max)
			max = i2;
		if(i3 > max)
		max = i3;
		
		return max;
	}
	
	public static double random() {
		return java.lang.Math.random();
	}
	public static int max(int i, int j) {
	    if (i < j) {
	        return j;
	    } else {
	        return i;
	    }
	}
	public static double min(double d, double e) {
	    if (d < e) {
	        return d;
	    } else {
	        return e;
	    }
	}
	public static double sqrt(double d) {
		// TODO Auto-generated method stub
		return java.lang.Math.sqrt(d);
	}

}
