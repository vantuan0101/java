package Lab6_chuoi;

import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private double donGia;
    private String hang;

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void Nhap(){
        Scanner s= new Scanner(System.in);
        System.out.println("Nhap Ten san pham :");
         tenSp = s.nextLine();
        System.out.println("Nhap don gia :");
         donGia = s.nextDouble();
        s.nextLine();
        System.out.println("Nhap ten hang:");
        hang= s.nextLine();
    }
    public void Xuat(){
        System.out.printf("Ten san pham : %s -- don gia : %f --- hang : %s",tenSp,donGia,hang);
    }
}
