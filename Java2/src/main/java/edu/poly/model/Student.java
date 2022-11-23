/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.model;

import java.io.Serializable;

/**
 *
 * @author vantuan
 */
public class Student  implements Serializable {
    private String studentId ;
    private String name ;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public Student() {
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
    
}
