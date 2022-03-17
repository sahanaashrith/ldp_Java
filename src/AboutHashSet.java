//A HashSet is a collection of items where every item is unique
//to add items to it, use the add() method
//To check whether an item exists in a HashSet, use the contains() method
//To remove an item, use the remove() method
//To remove all items, use the clear() method



import java.util.HashSet;


    public class AboutHashSet {
        public static void main(String[] args) {

            // Create a HashSet object called numbers
            HashSet<Integer> numbers = new HashSet<Integer>();

            // Add values to the set
            numbers.add(4);
            numbers.add(7);
            numbers.add(8);

            // Show which numbers between 1 and 10 are in the set
            for(int i = 1; i <= 10; i++) {
                if(numbers.contains(i)) {
                    System.out.println(i + " was found in the set.");
                } else {
                    System.out.println(i + " was not found in the set.");
                }
            }
        }
    }

