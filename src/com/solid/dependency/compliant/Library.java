////-------------------------DEPENDENCY INVERSION PRINCIPLE-----------------------------//
//high-level modules should not depend upon low-level modules; they should depend on abstractions or interfaces.
// Secondly, abstractions should not depend upon details; details should depend upon abstractions.
package com.solid.dependency.compliant;

interface Books{
    void borrow();
    void read();
}
public class Library {
    Books book;
    void add(Books book){
        System.out.println("add book");
    }
}

class Member implements Books{
    public void borrow() {
        System.out.println("visit library");
    }
    public void read() {
        System.out.println("Read books");
    }
}

