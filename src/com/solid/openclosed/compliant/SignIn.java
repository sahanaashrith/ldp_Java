//--------------Open-Closed Principle-------------//
//the module should be open for extension but closed for modification

package com.solid.openclosed.compliant;

interface SignIn {
    void login(String id, String password);
    void newLogin();
}

class Member implements SignIn
{
    public void login(String id, String password)
    {
        System.out.println("Enter Employee Id: "+id);
        System.out.println("Enter Employee password: "+password);
    }
    public void newLogin() {
        System.out.println("Welcome New member");
    }
}

class Manager implements SignIn
{
    public void login(String id, String password)
    {
        System.out.println("Enter Manager Id: "+id);
        System.out.println("Enter Manager password: "+password);
    }
    public void newLogin() {
        System.out.println("Welcome New Manager");
    }
}
