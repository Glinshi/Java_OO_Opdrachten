package Week4;

public class StringClass2 
{
	public static void main(String[] args) {
    String text = "If you love what you do, you will never have to work.";
    String text2 = "Julia";
    String text3 = "Julia";
    String text4 = "julia";
    String text5 = "Java #is #a #popular #programming #language.";

    System.out.println("Number of characters: " + text.length()); //De .length() methode geeft het aantal karakters in de text String.
    System.out.println("Uppercase: " + text.toUpperCase()); //De .toUpperCase() methode zet alle letters in de String text om naar hoofdletters.
    System.out.println("Lower case: " + text.toLowerCase()); //De .toLowerCase() methode zet alle letters in de String text om naar kleine letters.
    System.out.println("Substring: " + text.substring(12, 28)); //De .substring(int beginIndex, int endIndex) methode geeft een deel van de String terug, beginnend bij beginIndex (12) en eindigend bij endIndex (28) (niet inclusief 28).
    // the index starts with 0
    System.out.println("The seventh character: " + text.charAt(7)); //De .charAt(int index) methode geeft het karakter op de opgegeven index terug. In dit geval is de 7e index de letter 'o' in het woord "you". 
    System.out.println("------------------------------------");
    System.out.println("is text2 = text3: " + text2.equals(text3));//text2 en text3 bevatten allebei "Julia", dus de vergelijking text2.equals(text3) geeft true.
    // case sensitive
    System.out.println("is text3 = text4: " + text3.equals(text4));//text3 bevat "Julia", en text4 bevat "julia" (met een kleine 'j'), dus de vergelijking text3.equals(text4) geeft false, omdat .equals() hoofdlettergevoelig is.
    System.out.println("------------------------------------");
    System.out.println("Replace #: " + text5.replace("#", ""));//De .replace(CharSequence target, CharSequence replacement) methode vervangt alle voorkomens van een specifiek karakter of String.
    System.out.println("Replace # with $: " + text5.replace("#", "$"));//In de tweede regel wordt elke # vervangen door een $, zelfde methode als de regel hierboven.
}
	

}
