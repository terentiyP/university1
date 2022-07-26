package io.github.terentiyp.school.model;

import java.util.Date;

public class Person {

    String name;
    Date dob;

    public void display() {

        System.out.println("io.github.terentiyp.school.Name: " + name + "\nAge: " + dob);
    }
    public Person(String name, Date dob) {

        this.name=name;
        this.dob = dob;
    }

    public Date getDob() {
        return dob;
    }


    public String getName() {
        return name;
    }


}
