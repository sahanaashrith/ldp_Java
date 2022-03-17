//An interface is a fully abstract class. It includes a group of abstract methods (methods without a body).
//We use the interface keyword to create an interface in Java.
//we cannot create objects of interfaces.

// create an interface
interface Language {
    void getName(String name);
}

// class implements interface
class ProgrammingLanguage implements Language {
    // implementation of abstract method
    public void getName(String name) {
        System.out.println("Programming Language: " + name);
    }
}

public class AboutInterface {
    public static void main(String[] args) {
        ProgrammingLanguage language = new ProgrammingLanguage();
        language.getName("Java");
    }
}