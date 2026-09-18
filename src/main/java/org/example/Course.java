package org.example;

import java.util.ArrayList;
import java.util.List;

public class Course {
    String courseName;
    List<Student> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }


    public void Enroll(Student s) {
        if (!students.contains(s)) {
            students.add(s);}
        else {System.out.println(s.getName() + " is already enrolled."); }
    }
//refactor så udskrift i Main. Room og TAs skal returneres som værdier - evt. to metoder
    public void allocateRoomAndTAs() {
        String room = allocateRoom();
        String ta = allocateTA();
        System.out.println("Room: " + room + " TA: " + ta);
    }

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

    public String allocateTA(){
        String ta;
        if (students.size() < 10) {
            ta = "1";
        } else if (students.size() < 20) {
            ta = "1";
        } else if (students.size() < 30) {
            ta = "2";
        } else if (students.size() < 40) {
            ta = "3";
        }else if (students.size() < 50) {
            ta = "4";
        }
        else {
            ta = "Room 5";
        }
        return ta;
    }

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

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
