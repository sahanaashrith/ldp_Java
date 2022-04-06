package com.javastreams;

public class StudentDetail {
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfEnrollment;
    double perTillDate;

    public StudentDetail(int id, String name, int age, String gender, String department, int yearOfEnrollment, double perTillDate)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfEnrollment= yearOfEnrollment;
        this.perTillDate = perTillDate;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

    public String getDepartment()
    {
        return department;
    }

    public int getYearOfEnrollment()
    {
        return yearOfEnrollment;
    }

    public double getPerTillDate()
    {
        return perTillDate;
    }

    public String toString()
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Enrollment: "+yearOfEnrollment
                +", Performance : "+perTillDate;
    }
}
