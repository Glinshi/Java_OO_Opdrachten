package Week4;

public class StringClass4 
{
    public static void main(String[] args) 
    {
        StringBuffer sb = new StringBuffer("The universe is 13.8 billion years");
        System.out.println(sb.append(" old.")); //De .append() methode voegt een string toe aan het einde van de bestaande StringBuffer-inhoud. Hier wordt de tekst " old." toegevoegd aan het bestaande StringBuffer-object sb.
        System.out.println(sb.insert(16, "approximately "));//De .insert(int offset, String str) methode voegt de string str in op de opgegeven positie
        System.out.println(sb.delete(3, 12));//De .delete(int start, int end) methode verwijdert het gedeelte van de string dat begint bij de positie start (3) en eindigt bij end (12),
    }
}




