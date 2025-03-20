package Week5nm2;

public class ProgrammingLanguage {
    static int numberOfLanguages = 0; 
    static String languages = "";

    public ProgrammingLanguage(String language) {
        languages += language + ", "; 
        numberOfLanguages++; 
    }
}

