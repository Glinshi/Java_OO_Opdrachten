package Week6nm2;

public class Login 
{
	final int NUMBER_HOURS_IN_DAY = 24;
	final static int MAX_LOGIN_ATTEMPTS = 3;
	int numberAttempts;
	
	static boolean inloggen(String username, String password)
	{
		if(username.equals("Jack") && password.equals("JacPassword"))
				{
			System.out.print("You are logged in!");
			return true;
			
				}
		else
		{
			System.out.print("Your data is not correct!");
			return false;
		}
	}
	
	
	public static void main(String[] args)
	{
		Login login = new Login();
		while(login.numberAttempts < MAX_LOGIN_ATTEMPTS)
		{
			login.numberAttempts ++;
		}
	}
	
}
