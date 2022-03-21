////---------------------LSP :Liskov Substitution Principle -----------------//
//// derived classes must be completely substitutable for their base classes.
//an object of a superclass should be replaceable by objects of its subclasses without causing issues in the application
package com.solid.lishkov.compliant;

public class Access {
    public void poolAccess(){
        System.out.println("All are Allowed to use pool");
    }
    public void gymAccess(){
        System.out.println("only members are Allowed to use gym");
    }

}

class Guest extends Access{
    public void poolAccess(){
        System.out.println("All are Allowed to use pool");
    }
}

class Member extends Access{
    public void gymAccess(){
        System.out.println("only members are Allowed to use gym");
    }
}