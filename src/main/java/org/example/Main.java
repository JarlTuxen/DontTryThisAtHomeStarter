package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Don't try this at home!");
        student student1 = new student("Ann Ooby", "123");
        Course programmingCourse = new Course("Java Programming 001");
        programmingCourse.Enroll(student1);
        programmingCourse.allocateroomandTAs();
        student foundStudent = programmingCourse.findstudent("456");
        System.out.println(foundStudent.name);
        }
    }