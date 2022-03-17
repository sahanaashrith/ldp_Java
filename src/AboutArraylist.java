//resizable array
//elements can be added and removed from an ArrayList whenever you want.
//When an element is added, it is placed into the array.
// If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.
//To access an element in the ArrayList, use the get() method and refer to the index number
//To modify an element, use the set() method and refer to the index number
//To remove an element, use the remove() method and refer to the index number
//To remove all the elements in the ArrayList, use the clear() method
//to find out how many elements an ArrayList have, use the size method
import java.util.ArrayList;
public class AboutArraylist {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}
