package Lab6_chuoi;

import java.util.ArrayList;

public class MainSanPham {
    public static void main(String[] args) {
        ArrayList<SanPham> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            SanPham sp = new SanPham();
            sp.Nhap();
            list.add(sp);
        }
        for (SanPham item:list
             ) {
                if(item.getTenSp().equalsIgnoreCase("Nokia")){
                    item.Xuat();
                    System.out.println("");
                }
        }
    }
}
