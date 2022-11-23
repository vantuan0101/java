/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.demo.lab5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vantuan
 */
public class FileOutputSteamDemo {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("/user/code/data.dat");
            String st = "Hello world";
            fos.write(st.getBytes());
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
            e.printStackTrace();
        }finally{
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(FileOutputSteamDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
