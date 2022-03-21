// SR: Single Responsibility----//
//A class should be focused on a single functionality, address a specific concern.
package com.solid.singleresp.compliant;

class SignUp {
    public void signUp(){
        System.out.println("Please Sign Up  ");
    }
}

class SignIn{
    public void login(String id, String password)
    {
        System.out.println("Enter Employee Id: "+id);
        System.out.println("Enter Employee password: "+password);
    }
}