package Week3;

public class Math 
{
	void printLargest(int i, int i2, int i3)
	{
		if(i > i2 && i2 > i3) {
			System.out.println(i);
		}
		else if(i2 > i && i2 > i3) {
			System.out.println(i2);
			}
		else{
			System.out.println("Enter unique numbers!");
		}
		}
	public static void main(String[] args)
	{
		Math m = new Math();
		m.printLargest(-9, 7, 1);
		m.printLargest(22, 123, 123);
		m.printLargest(21, 22, 21);
	}
	
			
}
