package Week4;

public class ClassManipulation {

    	public static void main(String[] args) {
            String text = "Brazil $ is $ one $of the largest country in the $ world.";

	    
	    System.out.println("Uppercase: " + text.toUpperCase()); //De .toUpperCase() methode zet alle letters in de String text om naar hoofdletters.
	    System.out.println("Lower case: " + text.toLowerCase()); //De .toLowerCase() methode zet alle letters in de String text om naar kleine letters.
	    System.out.println("Number of characters: " + text.length()); //De .length() methode geeft het aantal karakters in de text String.
	    System.out.println("Remove $: " + text.replace("$", ""));//De .replace(CharSequence target, CharSequence replacement) methode vervangt alle voorkomens van een specifiek karakter of String.
	    System.out.println("Remove: " + text.substring(14)); //De .substring(int beginIndex, int endIndex) methode geeft een deel van de String terug, beginnend bij beginIndex (12) en eindigend bij endIndex (28) (niet inclusief 28).
	    // the index starts with 0
	    System.out.println("Last index of $ symbol: " + text.lastIndexOf('$'));
	    System.out.println("Replace Brazil: " + text.replace("Brazil", "Canada"));//In de tweede regel wordt elke # vervangen door een $, zelfde methode als de regel hierboven.
	}

}
