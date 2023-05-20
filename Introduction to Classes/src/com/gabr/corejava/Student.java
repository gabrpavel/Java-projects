package com.gabr.corejava;
public class Student {

    private String name;
    private int age;
    private float GPA;

    public Student(String name, int age, float GPA) {
        setName(name);
        setAge(age);
        setGPA(GPA);
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getGPA() {
        return GPA;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setGPA(float GPA) {
        this.GPA = GPA;
    }

}
