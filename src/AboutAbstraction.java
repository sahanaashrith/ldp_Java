//use the abstract keyword to create abstract classes and methods.
//An abstract method doesn't have any implementation (method body).
//A class containing abstract methods should also be abstract.
//We cannot create objects of an abstract class.
//To implement features of an abstract class, we inherit subclasses from it and create objects of the subclass.
//A subclass must override all abstract methods of an abstract class.
abstract class MotorBike {
    abstract void brake();
}
class SportsBike extends MotorBike {
    // implementation of abstract method
    public void brake() {
        System.out.println("SportsBike Brake");
    }
}
class MountainBike extends MotorBike {
    // implementation of abstract method
    public void brake() {
        System.out.println("MountainBike Brake");
    }
}
public class AboutAbstraction {
    public static void main(String[] args) {
        MountainBike m1 = new MountainBike();
        m1.brake();
        SportsBike s1 = new SportsBike();
        s1.brake();
    }
}
