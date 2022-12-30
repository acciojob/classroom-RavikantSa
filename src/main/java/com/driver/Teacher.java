package com.driver;

public class Teacher {

    private String name;

    private int numberOfStudents;

    private int age;

    public Teacher() {
//        // setting thee parameters
//            this.name = getName();
//            this.age = getAge();
//            this.numberOfStudents = getNumberOfStudents();
    }
    public Teacher(String name, int numberOfStudents, int age) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.age = age;
    }

    // implementing Getters and zSetters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public static void main(String[] args) {
//        Teacher t = new Teacher();
//        t.name = "Radhika";
//        System.out.println(t.getName());
//    }
}