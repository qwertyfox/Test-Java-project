package com.hayden;

public class Staff {
    private int staff_id;
    private String name;
    private Department department;

    public Staff(int staff_id, String name, Department department) {
        this.staff_id = staff_id;
        this.name = name;
        this.department = department;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
