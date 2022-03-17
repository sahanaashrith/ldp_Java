// Method overloading : multiple methods can have the same name with different parameters

public class AboutMethods {
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    // Recursive method
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.2);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
// for recursion
        int result = sum(5);
        System.out.println(result);
    }
}

// a static method, which means that it can be accessed without creating an object of the class
//a public method , which can only be accessed by objects