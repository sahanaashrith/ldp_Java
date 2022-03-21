//-------------------------DEPENDENCY INVERSION PRINCIPLE violation-----------------------------//
package com.solid.dependency.violation;

class Member  {
    public void borrow() {
        System.out.println("borrow book from library");
    }
    public void read() {
        System.out.println("Read books");
    }
}
public class Library {
    Member m;
    void add(Member m){
        System.out.println("Add member to read"+ m);
    }
}

