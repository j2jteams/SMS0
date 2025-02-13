package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load Spring configuration from XML
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        // Retrieve the bean from Spring container
        StudentService studentService = (StudentService) context.getBean("studentService");


       // Course course = new Course("Spring Framework");
       // Student st = new Student("Ramesh", 20, course);
        Student st = (Student)context.getBean("student");
        st.displayStudentInfo();

        // Close context
        context.close();

    }
}