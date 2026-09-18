package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Don't try this at home!");
        Student student1 = new Student(123, "Ann Ooby");
        Student student2 = new Student(444, "Al Kazam");

        System.out.println("Java Course");
        Course programmingCourse = new Course("Java Programming 001");
        System.out.println(programmingCourse.enroll(student1));
        //enroll the same student again
        System.out.println(programmingCourse.enroll(student1));

        Allocation allocation= programmingCourse.allocateRoomAndTAs();
        System.out.println("Course: " + programmingCourse.getCourseName() + "\n" + "Room: " + allocation.getRoom() + " Tas: " + allocation.getTas());

        System.out.println("Math Course");
        Course mathCourse = new Course("Math Algebra 001");
        System.out.println(mathCourse.enroll(student1));
        System.out.println(mathCourse.enroll(student2));

        allocation = mathCourse.allocateRoomAndTAs();
        //brug af alternativ allokeringsmetode - og der bør ikke være to
        //allocation= mathCourse.allocateRoomAndTAsMath();
        System.out.println("Course: " + mathCourse.getCourseName() + "\n" + allocation.getRoom() + " Tas: " + allocation.getTas());

        System.out.println("Find existing student");
        Student foundStudent = programmingCourse.findStudent(123);
        if (foundStudent != null) {
            System.out.println(foundStudent.getName());
        }else{
            System.out.println("Student not found");
        }

        System.out.println("Find non-existing student");
        Student notFoundStudent = programmingCourse.findStudent(456);
        if (notFoundStudent != null) {
            System.out.println(notFoundStudent.getName());
        }else{
            System.out.println("Student not found");
        }
    }
}