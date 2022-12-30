package com.driver;

public class Student {

    private String name;
    private int age;
    private double averageScore;

    public Student(){
        // setting the parametees
//        this.age= getAge();
//        this.name = getName();
//        this.averageScore = getAverageScore();
    }

    public Student(String name, int age, double averageScore) {
        this.name = name;
        this.age = age;
        this.averageScore = averageScore;
    }

    //GETTERES ANDS SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }
}
