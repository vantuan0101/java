package KeThua;

public class LaoCong extends NhanVien {
    protected double luonggio;
    protected int soGioLam;
    public LaoCong(String hoTen , double luong , double luonggio ,int soGioLam){
        super( hoTen ,  luong);
        this.luonggio =luonggio;
        this.soGioLam =soGioLam;
    }
    public double TinhThuNhap(){
        return luonggio*soGioLam;
    }
}
