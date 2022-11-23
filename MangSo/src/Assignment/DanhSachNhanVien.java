package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachNhanVien {
    ArrayList<NhanVien> list = new ArrayList<>();
    public void Nhap(){
        Scanner s= new Scanner(System.in);
        do {
            System.out.println("Nhap loai nhan vien : 1. Nhan vien hanh chinh , 2: truong phong , 3 Nhan vien tiep thi");
            String loai = s.nextLine();
            if (loai.isEmpty()){
                break;
            }
            int choice = Integer.parseInt(loai);
            switch (choice){
                case 1:
                    NhanVienHanhChinh nvhc = new NhanVienHanhChinh();
                    nvhc.Nhap(s);
                    list.add(nvhc);
                    break;
                case 2 :
                    TruongPhong tp = new TruongPhong();
                    tp.Nhap(s);
                    list.add(tp);

                    break;
                case 3 :
                    NhanVienTiepThi nvtt = new NhanVienTiepThi();
                    nvtt.Nhap(s);
                    list.add(nvtt);

                    break;
            }
        }while (true);
    }
    public void Xuat(){
        for (NhanVien nv:list
             ) {
            if(nv instanceof NhanVienHanhChinh){
                ((NhanVienHanhChinh)nv).Xuat();
            }else if(nv instanceof NhanVienTiepThi){
                ((NhanVienTiepThi)nv).Xuat();
            }else if(nv instanceof TruongPhong){
                ((TruongPhong)nv).Xuat();
            }
        }
    }
    public void TimVaHienThiTheoMa(Scanner s){
        System.out.println("\nNhap thong tin ma can tim:");
        String ma = s.nextLine();
        for (NhanVien nv:list
             ) {
            if(nv.getMa().equalsIgnoreCase(ma)){
                nv.Xuat();
            }else{
                System.out.println("Ko tim thay");
            }

        }
    }
    public void XoaNhanVienTheoMa(Scanner s){
        System.out.println("\n Nhap ma nhan vien can xoa");
        String ma = s.nextLine();
        for (NhanVien nv:list
             ) {
                if(nv.getMa().equalsIgnoreCase(ma)){
                    list.remove(nv);
                    System.out.println("\n Nhan vien da dc xoa");
                }else {
                    System.out.println("\n Ko tim thay nhan vien");
                }
        }
    }
}
