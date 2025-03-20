package Week4Calender;

public class DateInfo
{
	
    public int day;
	public int month; 
	public int year;
	
	
	 public void getDateInfo(int day, int month, int year){
	  this.day = day;
	  this.month = month;
	  this.year = year;
	  
	
			 
	 }
	 
	 public static String getDateformat(int day, int month, int year){
	        return day + "/" + month + "/" + year;
	    }
	
	
}





