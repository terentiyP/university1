package io.github.terentiyp.school.model;

import io.github.terentiyp.school.enums.YearOfUniversity;

import java.util.Date;

public class Person {

    final String name;
    final Date dob;

    public void display() {

        System.out.println("io.github.terentiyp.school.\nName: " + name + "\nAge: " + dob);
    }

    public Person(String name, Date dob) {

        this.name = name;
        this.dob = dob;
    }

    public Date getDob() {
        return dob;
    }


    public String getName() {
        return name;
    }


    public void sd(){
        System.out.println("Year of university: "+ YearOfUniversity.FIFTH);}

}
