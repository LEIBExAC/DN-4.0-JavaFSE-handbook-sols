package com.cognizant.spring_learn.model;

public class Department {
    private int id;
    private String name;

    public Department() {
        System.out.println("Inside Department Constructor");
    }

    public int getId() {
        System.out.println("Getting Department id");
        return id;
    }

    public void setId(int id) {
        System.out.println("Setting Department id");
        this.id = id;
    }

    public String getName() {
        System.out.println("Getting Department name");
        return name;
    }

    public void setName(String name) {
        System.out.println("Setting Department name");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
