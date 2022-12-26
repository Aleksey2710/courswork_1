package com.skypro.courswork_1;

public class Employee {
    private final String fullName;
    private int department;
    private double salary;
    public static int idCounter = 0;
    private int id = idCounter++;

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = idCounter;
    }

    @Override
    public String toString() {
        return id + ", Ф.И.О. сотрудника: " + fullName + ", отдел: " + department +
                ", зарплата: " + salary +
                " руб.";
    }
}
