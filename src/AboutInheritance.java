//it is possible to inherit attributes and methods from one class to another
//subclass (child) - the class that inherits from another class
//superclass (parent) - the class being inherited from
//To inherit from a class we use the extends keyword.

class Animal{
    void eat() {
        System.out.println("I am eating");
    }
 // if a class includes protected fields and methods, then these fields and methods are accessible from the subclass of the class.
    protected void display() {
        System.out.println("I am an animal.");
    }
}
class Dog extends Animal{
    // the super keyword is used to call the method of the parent class from the method of the child class
    void eat(){
        super.eat();
        System.out.println("eating...");
    }
    void bark(){
        System.out.println("barking...");
    }
}
public class AboutInheritance {
    public static void main(String args[]){
        Dog d=new Dog();
        d.bark();
        d.eat();
        d.display();
    }
}
