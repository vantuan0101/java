package Lab5_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachHoTen {
    private ArrayList<String> list = new ArrayList<>();
    public void Nhap(){
        Scanner s = new Scanner(System.in);
do {
    System.out.println("Nhap ho ten :");
    String st = s.nextLine();
    if(!st.isEmpty()){
        list.add(st);
    }else {
        break;
    }

}while (true);
    }
    public void Xuat(){
        for (String item: list
             ) {
            System.out.println("Hoten : " + item);
        }
    }
    public void XuatNgauNhien(){
        Collections.shuffle(list);
        Xuat();
    }
    public void SapXep(){
        Collections.sort(list , (a,b)->a.compareTo(b));
        Xuat();
    }
    public void TimVaXoa(){
        Scanner s= new Scanner(System.in);
        System.out.println("Nhap ho ten can tim va xoa");
        String hoTen = s.nextLine();
        for (String item:list
             ) {
            if(item.equals(hoTen)){
                list.remove(item);
                break;
            }
        }
    }
    public void HienThiMenu(){
        do {
            Scanner s= new Scanner(System.in);
            System.out.println("\nMenu Chuong trinh");
            System.out.println("\n1 : Nhap");
            System.out.println("\n2 : Hien thi danh sach");
            System.out.println("\n3 : Sap xep danh sach");
            System.out.println("\n4 : Hien thi ngau nhien danh sach");
            System.out.println("\n5 : Tim kiem va xoa danh sach");
            System.out.println("\n0 : Thoat");
            int choice = s.nextInt();
            switch (choice){
                case 1 : Nhap();break;
                case 2:Xuat();break;
                case 3: SapXep();break;
                case 4 : XuatNgauNhien();break;
                case 5 :  TimVaXoa();break;
                case 0 : System.exit(0);break;
            }
        }while (true);

    }
}
