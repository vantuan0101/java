package Lab5_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSoThuc {
    private ArrayList<Double> list = new ArrayList<>();
    public void Nhap(){
        System.out.println("Nhap danh sach so thuc");
        int yes =1;
        Scanner s= new Scanner(System.in);
        do {
            System.out.print("Nhap so : ");
            double num = s.nextDouble();

            list.add(num);
            System.out.println("Ban co muon nhap tiep : 1 co / 0 khong");
            yes = s.nextInt();
        }while (yes==1);
    }
    public void Xuat(){
        for (Double item:
                list) {
            System.out.print(" " + item);

        }
    }
    public void TinhTong(){
        int sum=0;
        for (Double item:
                list) {
            sum += item;


        }
        System.out.println("Tong la :  " + sum);
    }
}
