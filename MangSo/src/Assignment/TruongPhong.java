package Assignment;

import java.util.Scanner;

public class TruongPhong extends NhanVien{
    private double trachnhiem;

    public TruongPhong() {
    }

    public TruongPhong(String ma, String hoTen, double luong, double trachnhiem) {
        super(ma, hoTen, "Truong phong", luong);
        this.trachnhiem = trachnhiem;
    }

    public void Nhap(Scanner s){
        super.Nhap(s);
        System.out.println("luong trach nhiem :");
        this.trachnhiem = s.nextDouble();
        s.nextLine();

    }
    public void Xuat(){
        super.Xuat();
        System.out.printf("- luong trach nhiem:%f",trachnhiem);
    }
    public double getTrachnhiem() {
        return trachnhiem;
    }

    public void setTrachnhiem(double trachnhiem) {
        this.trachnhiem = trachnhiem;
    }

}
