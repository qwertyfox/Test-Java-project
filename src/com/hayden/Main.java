package com.hayden;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new LinkedList<Student>();
        Student student = new Student(1,"Peter","Engineering");
        Student student1 = new Student(2,"Pepper","Management");
        Student student2 = new Student(3,"Rowan","Acting");
        students.add(student);
        students.add(student1);
        students.add(student2);


        for(Student s : students){
            System.out.println(s.getName());
        }


    }
}
