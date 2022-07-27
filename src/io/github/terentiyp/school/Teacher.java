package io.github.terentiyp.school;

import io.github.terentiyp.school.model.Person;

import java.util.Date;

public class Teacher extends Person {
    public Course course;


    public Teacher(String name, Date date, Course course) {
        super(name, date);
        this.course = course;
    }
}

