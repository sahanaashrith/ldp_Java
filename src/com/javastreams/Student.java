package com.javastreams;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {
    public static void main(String[] args) {
        List<StudentDetail> studentList = new ArrayList<StudentDetail>();
        studentList.add(new StudentDetail(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentList.add(new StudentDetail(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentList.add(new StudentDetail(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentList.add(new StudentDetail(144, "Murali Gowda", 18, "Male","Electrical", 2018, 80));
        studentList.add(new StudentDetail(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentList.add(new StudentDetail(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentList.add(new StudentDetail(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentList.add(new StudentDetail(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentList.add(new StudentDetail(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentList.add(new StudentDetail(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentList.add(new StudentDetail(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentList.add(new StudentDetail(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentList.add(new StudentDetail(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentList.add(new StudentDetail(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentList.add(new StudentDetail(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentList.add(new StudentDetail(266, "Sanvi Pandey", 17, "Female","Electrical", 2019, 72.4));
        studentList.add(new StudentDetail(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        //Print the name of all departments in the college
        System.out.println("Names of all departments : ");
        studentList.stream()
                .map(StudentDetail::getDepartment)
                .distinct()
                .forEach(System.out::println);

        //Get the names of all students who have enrolled after 2018
        System.out.println("names of all students who have enrolled after 2018 : ");
        studentList.stream()
                .filter(e -> e.getYearOfEnrollment() > 2018)
                .map(StudentDetail::getName)
                .forEach(System.out::println);

        //Get the details of all male student in the computer sci department
        System.out.println(" details of all male student in the computer sci department : ");
        studentList.stream()
                .filter(e -> e.getGender()=="Male" && e.getDepartment()=="Computer Science")
                .map(StudentDetail::toString)
                .forEach(System.out::println);

        //How many male and female student are there ?
        System.out.println(" number of male and female students : ");
        Map<String, Long> noOfMaleAndFemaleStudents=
                studentList.stream().collect(Collectors.groupingBy(StudentDetail::getGender, Collectors.counting()));
        System.out.println(noOfMaleAndFemaleStudents);

        //What is the average age of male and female students?
        System.out.println(" average age of male and female students : ");
        Map<String, Double> avgAgeOfMaleAndFemaleStudents=
                studentList.stream().collect(Collectors.groupingBy(StudentDetail::getGender, Collectors.averagingInt(StudentDetail::getAge)));
        System.out.println(avgAgeOfMaleAndFemaleStudents);

        //Get the details of highest student having highest percentage ?
        System.out.println(" the details of student having highest percentage : ");
        System.out.println(studentList.stream()
                //.collect(Collectors.maxBy(Comparator.comparingDouble(StudentDetail::getPerTillDate)))
                        .max(Comparator.comparingDouble(StudentDetail::getPerTillDate))
                        .map(StudentDetail::toString));

        //Count the number of students in each department?
        System.out.println(" the number of students in each department : ");
        Map<String, Long> noOfStudents=
                studentList.stream().collect(Collectors.groupingBy(StudentDetail::getDepartment, Collectors.counting()));
        System.out.println(noOfStudents);

        //the average percentage achieved in each department
        System.out.println(" the average percentage achieved in each department: ");
        Map<String, Double> avgPercentAchieved=
                studentList.stream().collect(Collectors.groupingBy(StudentDetail::getDepartment, Collectors.averagingDouble(StudentDetail::getPerTillDate)));
        System.out.println(avgPercentAchieved);

        //the details of youngest male student in the Electronic department?
        System.out.println(" details of youngest male student in the Electronic department : ");
        System.out.println(studentList.stream()
                .filter(e -> e.getGender()=="Male" && e.getDepartment()=="Electronic")
                .min(Comparator.comparingInt(StudentDetail::getAge)));

        //How many male and female students are there in the computer science department
        System.out.println(" number of male and female students in computer science : ");
        Map<String, Long> noOfStudentsInCs=
                studentList
                        .stream()
                        .filter(e -> e.getDepartment() == "Computer Science")
                        .collect(Collectors.groupingBy(StudentDetail::getGender, Collectors.counting()));
        System.out.println(noOfStudentsInCs);

    }
}