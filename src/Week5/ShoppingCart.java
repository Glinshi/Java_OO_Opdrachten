package Week5;

import java.util.ArrayList;

public class ShoppingCart {
	

    ArrayList<Item> items = new ArrayList<Item>();

    // Methode om items toe te voegen aan winkelwagen
    public void addItem(Item item) {
        items.add(item); // Voeg item toe aan ArrayList
    }

    
    public void printItems() {
        System.out.println("Item:");
        for (Item item : items) { // Loop door de items
            System.out.println(item.name + " $" + item.price); // Print naam en prijs
        }
    }

}
