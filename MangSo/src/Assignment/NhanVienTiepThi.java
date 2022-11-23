package Assignment;

import java.util.Scanner;

public class NhanVienTiepThi extends NhanVien{
    private  double doanhSo , hoaHong;

    public NhanVienTiepThi() {
    }

    public NhanVienTiepThi(String ma, String hoTen, double luong, double doanhSo, double hoaHong) {
        super(ma, hoTen, "Tiep thi", luong);
        this.doanhSo = doanhSo;
        this. hoaHong= hoaHong;
    }

    public void Nhap(Scanner s){
        super.Nhap(s);
        System.out.println("doanh so :");
        this.doanhSo = s.nextDouble();
        s.nextLine();
        System.out.println("Hoa hong :");
        this.hoaHong=s.nextDouble();
        s.nextLine();
    }
    public void Xuat(){
    super.Xuat();
        System.out.printf("- doanh so : %f - hoa hong : %f",doanhSo,hoaHong);
    }
    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }

}
