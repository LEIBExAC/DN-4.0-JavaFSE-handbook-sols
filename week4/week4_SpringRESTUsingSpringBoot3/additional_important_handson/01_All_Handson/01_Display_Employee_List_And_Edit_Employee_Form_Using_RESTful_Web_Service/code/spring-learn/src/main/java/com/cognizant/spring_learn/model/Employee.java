package com.cognizant.spring_learn.model;

import java.util.Date;
import java.util.List;
import com.cognizant.spring_learn.model.*;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private boolean permanent;
    private Date dateOfBirth;
    private Department department;
    private List<Skill> skillList;

    public Employee() {
        System.out.println("Inside Employee Constructor");
    }

    public int getId() {
        System.out.println("Getting id");
        return id;
    }

    public void setId(int id) {
        System.out.println("Setting id");
        this.id = id;
    }

    public String getName() {
        System.out.println("Getting name");
        return name;
    }

    public void setName(String name) {
        System.out.println("Setting name");
        this.name = name;
    }

    public double getSalary() {
        System.out.println("Getting salary");
        return salary;
    }

    public void setSalary(double salary) {
        System.out.println("Setting salary");
        this.salary = salary;
    }

    public boolean isPermanent() {
        System.out.println("Getting permanent");
        return permanent;
    }

    public void setPermanent(boolean permanent) {
        System.out.println("Setting permanent");
        this.permanent = permanent;
    }

    public Date getDateOfBirth() {
        System.out.println("Getting dateOfBirth");
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        System.out.println("Setting dateOfBirth");
        this.dateOfBirth = dateOfBirth;
    }

    public Department getDepartment() {
        System.out.println("Getting department");
        return department;
    }

    public void setDepartment(Department department) {
        System.out.println("Setting department");
        this.department = department;
    }

    public List<Skill> getSkillList() {
        System.out.println("Getting skillList");
        return skillList;
    }

    public void setSkillList(List<Skill> skillList) {
        System.out.println("Setting skillList");
        this.skillList = skillList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", permanent=" + permanent +
                ", dateOfBirth=" + dateOfBirth +
                ", department=" + department +
                ", skillList=" + skillList +
                '}';
    }
}
