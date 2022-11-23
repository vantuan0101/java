package Truu_tuong;

public class SinhVienBiz extends SinhVien{
    protected float diemKeToan, diemBanHang;
    public SinhVienBiz(String hoten,float diemKeToan ,float diemBanHang ){
        super(hoten);
        this.diemKeToan =diemKeToan;
        this.diemBanHang=diemBanHang;

    }
    @Override
    float tinhDiemTB(){
        return (diemKeToan*2 + diemBanHang) /3;

    }
}
