package KeThua;

public class TruongPhong extends NhanVien{
    protected double trachNhiem;
    public TruongPhong(String hoTen , double luong , double trachNhiem){
        super(hoTen , luong);
        this.trachNhiem=trachNhiem;

    }
    public double TinhThuNhap(){
        return luong + trachNhiem;
    }
    public void Xuat(){
        System.out.printf("Trach nhiem : %f",trachNhiem);
    }
}
