//--------------Open-Closed Principle violation-------------//
//the module should be open for extension but closed for modification
package com.solid.openclosed.violation;

public class SignIn {
    void memLogin(String id, String password){
        System.out.println("Enter Member Id: "+id);
        System.out.println("Enter Member password: "+password);
    }
    void newLogin(){
        System.out.println("Welcome New member");
    }
}
