package Truu_tuong;

public class SinhVienIT extends SinhVien{
    protected float diemJava, diemCSS;
    public SinhVienIT(String hoten , float diemJava , float diemCSS){
        super(hoten);
        this.diemJava=diemJava;
        this.diemCSS=diemCSS;

    }
    @Override
     float tinhDiemTB(){
        return (diemJava*2 + diemCSS) / 3;
    }
}
