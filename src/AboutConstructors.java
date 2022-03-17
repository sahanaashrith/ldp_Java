//A constructor in Java is a special method that is used to initialize objects.
//The constructor is called when an object of a class is created. It can be used to set initial values for object attributes
//the constructor name must match the class name
//All classes have constructors by default
public class AboutConstructors {
    int modelYear;
    String modelName;

    public AboutConstructors(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        AboutConstructors myCar = new AboutConstructors(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
