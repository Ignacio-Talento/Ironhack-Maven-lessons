package com.ironhack.w1.d3;

public class Course {
    private String classId;
    private int capacity;
    private int studentCount;
    private String title;

    public Course(String classId, int capacity, int studentCount, String title) {
        this.classId = classId;
        this.capacity = capacity;
        this.studentCount = studentCount;
        this.title = title;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static void main(String[] args) {
        Course javaProgramming = new Course("JAVA-101", 10, 0, "Java Programming");
        System.out.println("Course ID: " + javaProgramming.getClassId());
        System.out.println("Course Title: " + javaProgramming.getTitle());
        System.out.println("Course Capacity: " + javaProgramming.getCapacity());
        System.out.println("Course Student Count: " + javaProgramming.getStudentCount());
    }
}
