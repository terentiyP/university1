package io.github.terentiyp.school.model;

import io.github.terentiyp.school.enums.Course;

import java.util.Date;

public class Teacher extends Person {
    public Course course;

    @Override
    public void display() {
        super.display();
        System.out.println(Course.ENGLISH);
    }

    public Teacher(String name, Date date, Course course) {
        super(name, date);
        this.course = course;
    }
}

