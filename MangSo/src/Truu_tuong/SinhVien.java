package Truu_tuong;

 public abstract class SinhVien {
    protected String hoten;

    public  SinhVien(String hoten){
        this.hoten =hoten;
    }
    abstract float tinhDiemTB();
}
