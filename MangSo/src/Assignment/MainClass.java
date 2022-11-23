package Assignment;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        DanhSachNhanVien ds = new DanhSachNhanVien();
        ds.Nhap();
        ds.Xuat();
        Scanner s= new Scanner(System.in);
        ds.TimVaHienThiTheoMa(s);
        ds.XoaNhanVienTheoMa(s);
    }
}
