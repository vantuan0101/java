package LopvaDoituong;

import java.util.Scanner;

public class SinhVien {
   String HoTen;
   double DiemTB;
   public SinhVien(){
       HoTen ="Tuan ne";
       DiemTB = 10.0;
   }
   public SinhVien(String HoTen ,double DiemTB )
   {
       this.HoTen = HoTen;
       this.DiemTB = DiemTB;
   }
   public void Nhap(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Nhap Ho ten :");
       HoTen = scanner.nextLine();
       System.out.println("Nhap diem trung binh");
       DiemTB = scanner.nextDouble();
   }
   public void Xuat(){
       System.out.println("\n----------------------");
       System.out.printf("\nHo ten Sinh vien la : %s - diem trung binh : %f - xep loai : %s" , HoTen,DiemTB , XepLoai());
   }
   public String XepLoai(){

    if ( DiemTB >=9) {
        return "Xuat sac";
    }else {
        return "Gioi";
    }
   }
}
