// SR: Single Responsibility violation ------------//

class SignUp{
    public void login(){
        System.out.println("Please login ");
    }
    public void signUp(){
        System.out.println("Please Sign Up  ");
    }
    public void printDetails(){
        System.out.println("Printing details of Employee");
    }
}

//--------------Open-Closed Principle violation-------------//

class Payment {
    public void employeePay(){
        System.out.println("Employee payment");
    }
    public void managerPay(){
        System.out.println("Manager payment");
    }
}

//---------------------LSP :Liskov Substitution Principle violation-----------------//

class Bonus{
    public void bonusDetails(){
        System.out.println("Bonus details ");
    }
    public void calBonus(){
        System.out.println("calculate bonus");
    }
}

class Emp extends Bonus{
    public void bonusDetails(){
        System.out.println("Bonus Details");
    }
}

//-----------------INTERFACE SEGREGATION PRINCIPLE violation---------------------//

interface Access{
    void empAccess();
    void manAccess();
    void guestAccess();
}

class Guests implements Access{
     public void empAccess() {
       System.out.println("Access given for employees");
    }

   public void manAccess() {
        System.out.println("Access given for manager");
    }

    public void guestAccess() {
        System.out.println("Access given for guests");
    }
}


//------------------DEPENDENCY INVERSION PRINCIPLE violation-----------------------------//

class Software{
    void buildIt() {
        System.out.println("build software");
    }
}

class Product{
    Software soft;
    void prod(Software soft){
        System.out.println("Final product");
    }
    void deploy(){
        System.out.println("deploy product");
    }
}



public class SolidViolations {
    public static void main(String[] args) {
        SignUp s=new SignUp();
        s.printDetails();
        Payment p = new Payment();
        p.employeePay();
        Bonus b=new Bonus();
        b.bonusDetails();
        Product f = new Product();
        f.deploy();
    }
}
