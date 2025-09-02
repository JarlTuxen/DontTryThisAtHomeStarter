package org.example;

import java.util.ArrayList;

public class Course {
    String courseName;
    ArrayList Students = new ArrayList();

    public Course(String courseName_) {
        courseName = courseName_;
    }


    public void Enroll(student s) {
        if (!Students.contains(s)) {Students.add(s);}
        else {System.out.println(s.name + " is already enrolled."); }
    }

    public void allocateroomandTAs() {
        if (Students.size() < 10) {
            System.out.println("Room 1");
        } else if (Students.size() >= 10 && Students.size() < 20) {
            System.out.println("Room 2");
        } else if (Students.size() >= 20 && Students.size() < 30) {
            System.out.println("Room 3");
        } else if (Students.size() >= 30 && Students.size() < 40) {
            System.out.println("Room 4");
        }else if (Students.size() >= 40 && Students.size() < 50) {
            System.out.println("Room 5");
        }
        else {
            System.out.println("Room 6");
        }


        if (Students.size() < 10) {
            System.out.println("1");
        } else if (Students.size() >= 10 && Students.size() < 20) {
            System.out.println("2");
        } else if (Students.size() >= 20 && Students.size() < 30) {
            System.out.println("3");
        } else if (Students.size() >= 30 && Students.size() < 40) {
            System.out.println("4");
        }else if (Students.size() >= 40 && Students.size() < 50) {
            System.out.println("5");
        }
        else {
            System.out.println("6");
        }

    }


 public student findstudent(String id) {
        student student = null;
        for(int i = 0; i < Students.size(); i++) {
                student s = (student) Students.get(i);
            if (s.id == id) {
                return s;
            }
                }return student;
 }

}
