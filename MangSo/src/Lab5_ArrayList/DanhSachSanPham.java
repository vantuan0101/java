package Lab5_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachSanPham {

    private ArrayList<SanPham> list = new ArrayList<>();
    public void Nhap(){
        Scanner s= new Scanner(System.in);
        int i=1;
        do{
            System.out.println("Nhap san pham thu %d " + i);
            String st = s.nextLine();
            if(st.isEmpty()){
                break;
            }
            System.out.println("Nhap Gia san pham : ");
            double p = s.nextDouble();
            list.add(new SanPham(st,p));
            s.nextLine();
        } while(true);
    }
    public void Xuat(){
        for (SanPham sp:list
             ) {
            System.out.printf("%20s | %.2f \n" , sp.getTen() ,sp.getGia());

        }
    }
public void SapXepTheoGia(){
    Collections.sort(list,(a,b)-> (int) (a.getGia() - b.getGia()));
    Xuat();
}
    public void TimKiemTheoTen(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten can tim kiem:");
        String st = s.nextLine();
        for (SanPham item:list
             ) {
            if(item.getTen().equals(st)){
                System.out.println("Kq la : " + item);
                break;
            }else {
                System.out.println("Ko tim thay");
            }

        }
    }
}
