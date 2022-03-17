//Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
//capability of a method to do different things based on the object that it is acting upon
//can achieve polymorphism in Java using the following ways:
//Method Overriding : if the same method is present in both the superclass and the subclass.
//                    Then, the method in the subclass overrides the same method in the superclass.
//                    also known as run time polymorphism.
//Method Overloading : we can create methods with the same name if they differ in parameters also known as compile time polymorphism.

class Polygon {
    // method to render a shape
    public void render() {
        System.out.println("Rendering Polygon...");
    }
}
class Square extends Polygon {
    // renders Square
    public void render() {
        System.out.println("Rendering Square...");
    }
}
class Circle extends Polygon {
    // renders circle
    public void render() {
        System.out.println("Rendering Circle...");
    }
}

public class AboutPolymorphism {
    public static void main(String[] args) {

        // create an object of Square
        Square s1 = new Square();
        s1.render();

        // create an object of Circle
        Circle c1 = new Circle();
        c1.render();
    }
}
