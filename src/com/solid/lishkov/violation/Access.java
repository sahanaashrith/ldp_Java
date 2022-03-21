//---------------------LSP :Liskov Substitution Principle violation-----------------//
package com.solid.lishkov.violation;

public class Access {
    public void poolAccess(){
        System.out.println("All are Allowed to use pool");
    }
    public void gymAccess(){
        System.out.println("only members are Allowed to use gym");
    }

}

class Guest extends Access {
    public void poolAccess(){
        System.out.println("All are Allowed to use pool");
    }
}
