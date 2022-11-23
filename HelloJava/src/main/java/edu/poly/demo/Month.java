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
public class Month {
    public static void main(String args[]){
        int thang;
        int nam;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui long nhap thang : ");
        thang = scanner.nextInt();
        System.out.print("Vui long nhap nam : ");
        nam = scanner.nextInt();
        switch(thang){
            case 2 -> {
                if (nam % 4 == 0 && nam % 100 != 0){
                    System.out.println("Thang co 29 ngay");
                }else {
                    System.out.println("Thang co 28 ngay");
                }
            }
            case 4, 6, 9, 11 -> System.out.printf("Thang %d nay co 30 ngay", thang);
            default -> System.out.println("Thang nay co 31 ngay");
        }
        
    }
    
}
