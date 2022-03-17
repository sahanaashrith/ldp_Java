//store items in "key/value" pairs
//One object is used as a key (index) to another object (value).
// It can store different types: String keys and Integer values, or the same type, like: String keys and String values
//to add items to it, use the put() method
//to access a value use the get() method and refer to its key
//To remove an item, use the remove() method and refer to the key
//To remove all items, use the clear() method

import java.util.HashMap;

public class AboutHashMap {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.remove("Germany");
        System.out.println(capitalCities);
    }
}
