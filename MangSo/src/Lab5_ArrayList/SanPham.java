package Lab5_ArrayList;

public class SanPham {
    private String ten;
    private double gia;

    public SanPham(){
        this.ten = null;
        this.gia = 0;
    }

    public SanPham(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public String getTen(){
        return ten;
    }
    public void setTen(String ten){
        this.ten =ten;
    }
    public double getGia(){
        return gia;
    }
    public void setGia(double gia){
        this.gia =gia;
    }

}
