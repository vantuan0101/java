package Assignment;

import java.util.Scanner;

public class NhanVien {
    String ma ,hoTen ,loai;
    double luong;

    public NhanVien() {
    }

    public NhanVien(String ma, String hoTen, String loai, double luong) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.loai = loai;
        this.luong = luong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    public void Nhap(Scanner s){
        System.out.println("Ma :");
this.ma = s.nextLine();
        System.out.println("Ho ten :");
        this.hoTen = s.nextLine();
        System.out.println("Luong");
        this.luong=s.nextDouble();
        s.nextLine();
    }
    public void Xuat(){
        System.out.printf("Ma : %s - Hoten : %s - luong : %f",ma,hoTen,luong);
    }
}
