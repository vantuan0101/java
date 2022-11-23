package LopvaDoituong;

import java.util.Scanner;

public class SanPham {
    String tenSp;
    double donGia;
    double giamGia;
    public String getTenSp(){
        return this.tenSp;
    }
    public void setTenSp(String tenSp){
        this.tenSp =tenSp;
    }
    public double getDonGia(){
        return this.donGia;
    }
    public void setDonGia(double donGia){
        this.donGia =donGia;
    }
    public double getGiamGia(){
        return this.giamGia;
    }
    public void setGiamGia(double giamGia){
        this.giamGia =giamGia;
    }
    public  SanPham(){}
    public SanPham(String tenSp, double donGia, double giamGia){
        this.tenSp =tenSp;
        this.donGia =donGia;
        this.giamGia =giamGia;
    }
    public SanPham(String tenSp, double donGia){
        this.tenSp =tenSp;
        this.donGia =donGia;
        this.giamGia =0;
    }
    private double getThueNhapKhau(){
        return donGia*0.1;
    }
    public void Nhap(){
        Scanner s= new Scanner(System.in);
        System.out.println("Nhap ten san pham");
        tenSp = s.nextLine();
        System.out.println("Nhap don gia");
        donGia = s.nextDouble();

        System.out.println("Nhap giam gia");
        giamGia = s.nextDouble();
    }
    public void Xuat(){
        System.out.printf("Ten san pham %s - don gia : %f - giam gia : %f - Thue nhap khau %f " ,tenSp , donGia , giamGia ,getThueNhapKhau());

    }
}
