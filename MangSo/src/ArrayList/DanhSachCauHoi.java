package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachCauHoi {
    public static void main(String[] args) {
        ArrayList<String> ds = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        for (int i=0; i<5;i++){
            System.out.printf("Nhap cau hoi thu %d " , i);
            String st = s.nextLine();
            ds.add(st);
        }
//        Xáo trộn các phần tử
        Collections.shuffle(ds);
        for (String item:
                ds) {
            System.out.print(" " + item);

        }
    }
}
