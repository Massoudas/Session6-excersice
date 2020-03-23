package com.company;

import java.util.ArrayList;

public class Student {
    String studentName;
    int age;
    boolean studentSingle;
    String studentCity;
    ArrayList<String> studentFriends = new ArrayList<>();

    public Student(String studentName, int age, boolean studentSingle, String studentCity, ArrayList<String> studentFriends) {
        this.studentName = studentName;
        this.age = age;
        this.studentSingle = studentSingle;
        this.studentCity = studentCity;
        this.studentFriends = studentFriends;
    }

    public void introduce(){
        System.out.println("My name is " + studentName);
        System.out.println("I'm " + age+ " years old");
        if (studentSingle) {
            System.out.println("I'm single");
        } else {
            System.out.println("I'm in a relationship ^_^ ");
        }
        System.out.println("My friends are:");
        studentFriends.forEach(System.out::println);

    }


}
