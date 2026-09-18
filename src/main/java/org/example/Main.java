package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Don't try this at home!");
        Student student1 = new Student(123, "Ann Ooby");
        Course programmingCourse = new Course("Java Programming 001");
        programmingCourse.Enroll(student1);
        programmingCourse.allocateRoomAndTAs();
        Student foundStudent = programmingCourse.findStudent(123);
        if (foundStudent != null) {
            System.out.println(foundStudent.getName());
        }else{
            System.out.println("Student not found");
        }
        }
    }