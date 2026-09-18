package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Don't try this at home!");
        Student student1 = new Student(123, "Ann Ooby");
        Student student2 = new Student(444, "Al Kazam");
        Course programmingCourse = new Course("Java Programming 001");
        System.out.println(programmingCourse.enroll(student1));
        System.out.println(programmingCourse.enroll(student1));

        Allocation allocation= programmingCourse.allocateRoomAndTAs();
        System.out.println("Room: " + allocation.getRoom() + " Tas: " + allocation.getTas());

        //matematisk allokering
        Course mathCourse = new Course("Math Algebra 001");
        System.out.println(mathCourse.enroll(student1));
        System.out.println(mathCourse.enroll(student2));
        allocation= mathCourse.allocateRoomAndTAsMath();
        System.out.println("Room: " + allocation.getRoom() + " Tas: " + allocation.getTas());


        Student foundStudent = programmingCourse.findStudent(123);
        if (foundStudent != null) {
            System.out.println(foundStudent.getName());
        }else{
            System.out.println("Student not found");
        }
        Student notFoundStudent = programmingCourse.findStudent(456);
        if (notFoundStudent != null) {
            System.out.println(notFoundStudent.getName());
        }else{
            System.out.println("Student not found");
        }
    }
}