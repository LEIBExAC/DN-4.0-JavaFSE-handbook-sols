package com.cognizant.spring_learn.model;

public class Skill {
    private int id;
    private String name;

    public Skill() {
        System.out.println("Inside Skill Constructor");
    }

    public int getId() {
        System.out.println("Getting Skill id");
        return id;
    }

    public void setId(int id) {
        System.out.println("Setting Skill id");
        this.id = id;
    }

    public String getName() {
        System.out.println("Getting Skill name");
        return name;
    }

    public void setName(String name) {
        System.out.println("Setting Skill name");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
