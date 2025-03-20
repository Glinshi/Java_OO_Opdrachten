package Week5nm2;

public class Main {
    public static void main(String[] args) {

        ProgrammingLanguage java = new ProgrammingLanguage("Java");
        ProgrammingLanguage cpp = new ProgrammingLanguage("C++");
        ProgrammingLanguage python = new ProgrammingLanguage("Python");
        ProgrammingLanguage php = new ProgrammingLanguage("PHP");
        ProgrammingLanguage ruby = new ProgrammingLanguage("Ruby");


        System.out.println("Nr:" + ProgrammingLanguage.numberOfLanguages);
        System.out.println("Languages: " + ProgrammingLanguage.languages);
    }
}