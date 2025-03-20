package Week3;

public class Rectangle2 
{
	int width;
	int height;
	int area;

	void setArea(int width, int height)
	{
		this.width = width;
		this.height = height;
		this.area = width * height;
	}
	public static void main(String[] args) 
	{
		Rectangle2 rec = new Rectangle2();
		rec.setArea(20,8);
		System.out.println(rec.width + ", "+ rec.height+ ", "+ rec.area);
		}
}

	


