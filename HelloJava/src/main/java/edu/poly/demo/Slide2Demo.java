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
public class Slide2Demo {

    public static void main(String args[]) {
        int n;
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhap vao so duong n");
            n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Vui long nhap so duong");
            } else {
                double result = Math.sqrt(n);
                System.out.printf("Can bac hai cua %d la : %f", n, result);

            }
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }
        System.out.println("Completed !");

    }

}
