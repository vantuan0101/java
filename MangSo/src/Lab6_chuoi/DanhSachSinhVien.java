package Lab6_chuoi;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSinhVien {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Nhap ho ten :");
            String hoten = s.nextLine();
            if(hoten.isEmpty()){
                break;
            }
            list.add(hoten);
        }while (true);
        for (String item:list
             ) {
            item=item.trim();
                if(item.startsWith("Huynh ") || item.endsWith(" Tuan")){
                    String ho = item.substring(0, item.indexOf(" "));
                    String ten = item.substring(item.lastIndexOf(" "));
                    String tenDem = item.substring(item.indexOf(" "),item.lastIndexOf(" "));
                    System.out.printf("Ho ten : %s %s %s \n",ho,ten,tenDem);
                }
        }
    }
}
