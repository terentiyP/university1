package io.github.terentiyp.school.model;

import io.github.terentiyp.school.enums.YearOfUniversity;

import java.util.Date;

public class Student extends Person {
    public YearOfUniversity yearOfUniversity;

    public Student(String name, Date date, YearOfUniversity yearOfUniversity) {
        super(name, date);
        this.yearOfUniversity = yearOfUniversity;



    }

    public void sd(){
        System.out.println("Year of university: "+ YearOfUniversity.FIFTH);
    }
}
