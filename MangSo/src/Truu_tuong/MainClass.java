package Truu_tuong;

public class MainClass {
    public static void main(String[] args) {
//        SinhVien sv =new SinhVien() ; Ko the tao thong qua new , ma tao thong qua lop con
        SinhVien sv;
//        Day la da hinh : neu sv it tinh thep diem trung binh SVIT
        sv = new SinhVienIT("Thanh" , 12 ,321);
        System.out.println("Diem Trung Binh : " + sv.tinhDiemTB());
//Neu sv biz tinh diem theo biz
        sv = new SinhVienBiz("Tuan" ,9,3);
        System.out.println("Diem Trung Binh : " + sv.tinhDiemTB());


    }
}
