package org.example;

import java.util.ArrayList;
import java.util.List;

public class Course {
    //courseName immutable - kan ikke ændres efter oprettelse af kurset
    private final String courseName;
    private final List<Student> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }


    public String enroll(Student s) {
        if (!students.contains(s)) {
            students.add(s);
            return s.getName() + " is enrolled";
        }
        else {
            return s.getName() + " is already enrolled.";
        }
    }
//refactor så udskrift i Main. Room og TAs skal returneres som værdier - evt. to metoder
    public Allocation allocateRoomAndTAs() {

        return new Allocation(allocateRoom(), allocateTA());
    }

    //allokeringsberegning opdelt i hver sin metode
    public String allocateRoom(){
        String room;
        if (students.size() < 10) {
            room = "Room 1";
        } else if (students.size() < 20) {
            room = "Room 2";
        } else if (students.size() < 30) {
            room = "Room 3";
        } else if (students.size() < 40) {
            room = "Room 4";
        }else if (students.size() < 50) {
            room = "Room 5";
        }
        else {
            room = "Room 6";
        }
        return room;
    }

    //allokeringsberegning opdelt i hver sin metode
    public String allocateTA(){
        String ta;
        if (students.size() < 10) {
            ta = "TA 1";
        } else if (students.size() < 20) {
            ta = "TA 1";
        } else if (students.size() < 30) {
            ta = "TA 2";
        } else if (students.size() < 40) {
            ta = "TA 3";
        }else if (students.size() < 50) {
            ta = "TA 4";
        }
        else {
            ta = "TA 5";
        }
        return ta;
    }

    //en alternativ allokeringsberegning, der er mere matematisk - og sværere at læse
    /*public Allocation allocateRoomAndTAsMath(){
        int numberOfStudents = students.size();
        int level = numberOfStudents / 10;

        String room = "Room " + Math.min(level + 1, 6);
        String ta = "TA " + Math.min(level + 1, 6);

        return new Allocation(room, ta);
    }*/

    public Student findStudent(long id) {
        for (Student s : students) {
            if (s.getId() == id) {
                 return s;
            }
        }
        return null;
    }

    public String getCourseName() {
        return courseName;
    }

}
