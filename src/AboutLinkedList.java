//The LinkedList class is a collection which can contain many objects of the same type
//can add items, change items, remove items and clear the list just like ArrayList
//stores its items in "containers." The list has a link to the first container and each container has a link to the next container in the list.
//To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.
//Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.

import java.util.LinkedList;
public class AboutLinkedList {
        public static void main(String[] args) {
            LinkedList<String> cars = new LinkedList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.addFirst("Bugati");
            // Use addLast() to add the item to the end
            cars.addLast("Mazda");
            cars.getFirst();
            cars.getLast();
            System.out.println(cars);
            cars.removeFirst();
            cars.removeLast();
            System.out.println(cars);
        }
    }

