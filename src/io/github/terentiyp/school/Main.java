package io.github.terentiyp.school;

import io.github.terentiyp.school.model.Person;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Person students = new Person("Serega", new Date(1990,12,21));
        students.display();
        students.sd();

    }

}
