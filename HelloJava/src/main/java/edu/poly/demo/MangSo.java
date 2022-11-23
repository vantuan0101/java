package HelloJava.src.main.java.edu.poly.demo;

import java.util.Scanner;

public class MangSo {
    public static void main (String[] args){
        int[]  mang = new int [10];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<10 ; i++){
            System.out.printf("Nhap phan tu mang[%d] = ",i);
            mang[i] = scanner.nextInt();
        }
    }
}
