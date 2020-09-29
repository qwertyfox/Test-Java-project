package com.hayden;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new LinkedList<>();
        Student student = new Student(1,"Peter","Engineering");
        Student student1 = new Student(2,"Pepper","Management");
        Student student2 = new Student(3,"Rowan","Acting");
        Student student3 = new Student(4, "Ant-man","Quantum Physics");
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);

        for(Student s : students){
            System.out.println(s.getName());
        }

        Staff staff = new Staff(1,"Tony", Department.RESEARCH);
        Staff staff1 = new Staff(2,"Steve", Department.MORAL_STUDIES);
        Staff staff2 = new Staff(3,"Dr.Strange",Department.MYSTIC_ARTS);
        Staff newStaff = new Staff(8,"Hank",Department.QUANTUM_PHYSICS);
        Staff newStaff1 = new Staff(9,"Vision",Department.PHILOSOPHY);

        List<Staff> staffs = new LinkedList<>();
        staffs.add(staff);
        staffs.add(staff1);
        staffs.add(staff2);
        staffs.add(newStaff);
        staffs.add(newStaff1);

        for(Staff s : staffs){
            System.out.println(s.getName()+ " Department : "+ s.getDepartment());
        }

        Set<Staff> staffSet = new HashSet<>();
        staffSet.add(staff);
        staffSet.add(staff1);
        staffSet.add(staff2);
        staffSet.add(newStaff);
        staffSet.add(newStaff1);

        for(Staff s : staffSet){
            System.out.println(s.getName()+ " works on " +s.getDepartment());
        }
    }
}
