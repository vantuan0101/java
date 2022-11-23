package KeThua;

public class NhanVien {
    protected String hoTen;
    protected double luong;

    public NhanVien(String hoTen , double luong) {
        this.hoTen = hoTen;
this.luong =luong;
    }
    public double TinhThue(){
    return luong*0.1;
    }
    public void Xuat(){
        System.out.printf("Ho ten : %s -- luong : %f",hoTen,luong);
    }

    public double TinhThuNhap(){
        return luong;

    }
}
