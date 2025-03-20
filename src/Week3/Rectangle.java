package Week3;

//Methodsthatdoesntreturnanyvalue(void)//

public class Rectangle {
	int width;
	int height;
	
	void setSize()
	{
		this.width = 12;
		this.height = 10;
	}
	void setSize(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	public static void main(String[] args) 
	{
		Rectangle rec = new Rectangle();
		System.out.println(rec.width + ", "+ rec.height);
		rec.setSize();
		System.out.println(rec.width + ", "+ rec.height);
		rec.setSize(24, 5);
		System.out.println(rec.width + ", "+ rec.height);
		}
}
