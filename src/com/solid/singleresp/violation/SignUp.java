// SR: Single Responsibility violation----//
//A class should be focused on a single functionality, address a specific concern.
package com.solid.singleresp.violation;

class SignUp{
    public void signUp(){
        System.out.println("Please Sign Up  ");
    }
    public void login(String id, String password)
    {
        System.out.println("Enter Member Id: "+id);
        System.out.println("Enter Member password: "+password);
    }
}