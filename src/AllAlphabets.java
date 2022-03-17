import java.util.Scanner;

public class AllAlphabets {
       public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the string: ");
        String str = myObj.nextLine();       // read input
        str = str.toLowerCase();

        boolean success = true;
        for(char c = 'a';c <= 'z'; ++c) {
            if(!str.contains(String.valueOf(c))) {
                success = false;
                break;
            }
        }
        if (success)
            System.out.println("String contains all alphabets");
        else
            System.out.println("String DOESN'T contains all alphabets");
    }
}

