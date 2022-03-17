//Single Responsibility Principle states that every Java class must perform a single functionality. All classes obey SRP here

//--------------Open-Closed Principle-------------//
//the module should be open for extension but closed for modification
interface SignIn{
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
//---------------------LSP :Liskov Substitution Principle -----------------//
// derived classes must be completely substitutable for their base classes.
class Address {

    public void printDetails(int houseNo,String streetName,String city){
        System.out.println(houseNo);
        System.out.println(streetName);
        System.out.println(city);
    }
}
class MemberAddress extends Address{

    public void printDetails(int houseNo,String streetName,String city){
        System.out.println(houseNo);
        System.out.println(streetName);
        System.out.println(city);
    }
}

//----------------------INTERFACE SEGREGATION PRINCIPLE---------------------//
//clients should not be forced to deal with the methods that they don’t use.

interface Booking{
    public void bookCourt();
    public void bookTime(int t);
}

interface GuestBooking{
    public void bookTable();
}

class MemberBooking implements Booking{
    public void bookCourt(){
        System.out.println("the court is booked");
    }

    public void bookTime(int time) {
        System.out.println("The court is booked at time : "+time + "o'clock");
    }
}

class Guest implements GuestBooking{

    public void bookTable() {
        System.out.println("table is booked for guest");
    }
}

//-------------------------DEPENDENCY INVERSION PRINCIPLE-----------------------------//
//the high-level modules should not depend on low-level modules; both should depend on the abstractions.

class Login{
    public void checkLogin(SignIn signIn){
        signIn.newLogin();
    }
}


public class SolidPrinciples {
    public static void main(String[] args) {
        Member member=new Member();
        member.login("Sahana","qa_123");

        Address memberAdd = new MemberAddress();
        memberAdd.printDetails(206,"bank street","Pune");

        MemberBooking book = new MemberBooking();
        book.bookCourt();
        book.bookTime(2);

        Guest booking = new Guest();
        booking.bookTable();

        Login l = new Login();
        l.checkLogin(new Manager());
    }
}
