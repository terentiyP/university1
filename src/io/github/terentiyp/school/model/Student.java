package io.github.terentiyp.school.model;

import io.github.terentiyp.school.enums.YearOfUniversity;

import java.util.Date;

public class Student extends Person {
    public YearOfUniversity yearOfUniversity;

    public Student(String name, Date date, YearOfUniversity yearOfUniversity) {
        super(name, date);
        this.yearOfUniversity = yearOfUniversity;


    }

    @Override
    public void display() {
        super.display();
        System.out.println("Year of university: " + YearOfUniversity.FIFTH);
    }

}
