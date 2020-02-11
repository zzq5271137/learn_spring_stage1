package com.mycomp.demo2;

public class Person {

    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public void init() {
        System.out.println("person init...");
    }

    public void destroy() {
        System.out.println("person destroy...");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
