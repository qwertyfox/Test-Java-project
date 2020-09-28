package com.hayden;

public class Student {
    private int student_id;
    private String name;
    private String course;

    public Student(int student_id, String name, String course) {
        this.student_id = student_id;
        this.name = name;
        this.course = course;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
