package Week4Les8;

public class BankAccount 
{
	private double balance = 500;

	 public void neemOp(double amount) 
	    {
	 if (amount > 0) 
	        {
	 if (amount <= balance) 
	            {
	                balance -= amount; // balance = balance - bedrag;
	                System.out.println("Balance is: " + balance);
	            } 
	 else 
	            {
	                System.out.println("Insufficient balance " + balance);
	            }
	        } 
	 else 
	        {
	            System.out.println("You may not withdraw negative amounts or zero " + balance);
	        }
	    }

}
