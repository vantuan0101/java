/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.demo;

import java.util.Scanner;

/**
 *
 * @author vantuan
 */
public class PersonInfo {
    public static void main(String args[]){
        String hoten;
        int tuoi;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap ho va ten");
        hoten = scanner.nextLine();
        System.out.print("Nhap tuoi");
        tuoi = scanner.nextInt();
        
        System.out.printf("%s nam nay da %d roi ! " , hoten , tuoi);
    }
    
}
