/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.demo.model;

/**
 *
 * @author vantuan
 */
public class Student {
    private String studentId , name , major , capacity;
    private float mark;

    public Student() {
    }

    public Student(String studentId, String name, String major, float mark) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.mark = mark;
    }
    public String getTypeStudent(){
        if(mark>=9){
            return "Xuat sac";
        }
       
        return "Gioi";
    }
    public boolean isBonus(){
        return mark >= 7.5;
    }
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
    
    
}
