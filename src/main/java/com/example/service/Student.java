package com.example.service;

public class Student {
    private String name;
    private int age;
    private Course course; // Dependency

    // Constructor for Dependency Injection
    public Student(String name, int age, Course course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayStudentInfo() {
        System.out.println("Student: " + name + ", Age: " + age);
        System.out.println("Enrolled Course: " + course.getCourseName());
    }
}