package com.javastreams;
//sequence of elements from a source.
//a pipeline, through which the data will flow and the functions to operate on the data.
//java.util.Stream interface represents a stream on which one or more operations can be performed.
// Stream operations are either intermediate or terminal.
//Intermediate operations such as filter, map, or sort return a stream so that we can chain multiple intermediate operations.
//Terminal operations receive a stream and they can either return void or
// they can return a non stream result such as a reduction, e.g. reduce items to a list.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreams {
    public static void main(String[] args) {
        //Stream.of()
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(System.out::println);

        //Stream from Array, sort, filter
        //filter() It returns a Stream consisting of the elements of the given stream that match the given predicate.
        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarah","Sony"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);

        //Stream from List, filter
        //The map() operation takes a Function, which is called for each value in the input stream and produces one result value,
        // which is sent to the output stream.
        List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda");
        people
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        long count1 = numbers.stream().count();
        System.out.println("count of Numbers is = " + count1);
    }

}
