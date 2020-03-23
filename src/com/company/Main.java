package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> student1Friends = new ArrayList<>();
        ArrayList<String> student2Friends = new ArrayList<>();
        ArrayList<String> student3Friends = new ArrayList<>();
        ArrayList<String> student4Friends = new ArrayList<>();

        student1Friends.add("Alice");
        student1Friends.add("Jane");

        student2Friends.add("Bob");
        student2Friends.add("Jane");

        student3Friends.add("Jane");

        student4Friends.add("John");
        student4Friends.add("Alice");
        student4Friends.add("Bob");



        Student student1= new Student("Bob", 36, false, "Berlin", student1Friends);

	// write your code here
    }
}
