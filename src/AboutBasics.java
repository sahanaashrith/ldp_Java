public class AboutBasics {
    public static void main(String[] args) {
       // data types
        int myNum = 5;               // integer (whole number)
        float myFloatNum = 5.99f;    // floating point number
        char myLetter = 'D';         // character
        boolean myBool = true;       // boolean
        String myText = "Hello";     // String
        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);

        //if-else
        System.out.println("IF else example");
        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time > 20) {
            System.out.println("Good day.");
        }  else {
            System.out.println("Good evening.");
        }
        String result = (time < 18) ? "Good day." : "Good night.";
        System.out.println(result);

        //switch
        System.out.println("switch example");
        int day = 2;
        switch (day) {
           case 1: System.out.println("Saturday");
                   break;
           case 2: System.out.println("Sunday");
                   break;
           default:System.out.println("Looking forward to the Weekend");
        }

        //while loop
        System.out.println("while loop example");
        int i=5;
        while(i<8){
            System.out.print(i + " ");
            i++;
        }
      // do while
        int a=5;
        do{
            System.out.print(a + " ");
            a++;
        }while(a<8);
        System.out.println("");

        // for loop
        System.out.println("For loop example");
        for (int l = 0; l < 5; l++) {
            System.out.print(l + " ");
            }
        System.out.println("");

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String c : cars) {
            System.out.print(c + " ");
            }
        System.out.println("");

        //arrays
        System.out.println("array example");
        String[] toys = {"Truck", "Bus", "Car", "Fire engine"};
        for (int t = 0; t < cars.length; t++) {
            System.out.print(toys[t]);
            System.out.print(" ");
        }
        System.out.println("");
        // multidimensional arrays
        System.out.println("multi dimensional array example");
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int m = 0; m < myNumbers.length; ++m) {
            for(int n = 0; n < myNumbers[m].length; ++n) {
                System.out.print(myNumbers[m][n]);
                System.out.print(" ");
            }
        }
    }
}
