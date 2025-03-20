package Week4;

public class StringClass3 
{
	public static void main(String[] args) {
	    String sentence = "His";
	    sentence += " name"; //De += operator betekent dat de nieuwe waarde aan de bestaande waarde wordt toegevoegd. Dus, "His" wordt gecombineerd met " name". De nieuwe waarde van sentence is nu "His name".
	    sentence += " is Jack.";
	    System.out.println(sentence);
	}
}
