package com.serenitydojo;

public abstract class Pet {
    String name;
    int age;
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String play() {
        return "plays witg";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
