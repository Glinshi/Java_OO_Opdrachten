package Week5;

public class Printitmes {

	    public static void main(String[] args) {
	        ShoppingCart cart = new ShoppingCart(); // Maak een nieuw winkelwagentje

	        
	        cart.addItem(new Item("Shirt, Price: " , 20.39));
	        cart.addItem(new Item("Pants, Price: ", 32.85));
	        cart.addItem(new Item("Socks, Price: ", 11.25));
	        cart.addItem(new Item("Jacket, Price: ", 120.65));


	        cart.printItems();
	    }
	}


