package Lab6_chuoi;

import java.util.Scanner;

public class ChuoiSo {
    public static void main(String[] args) {
        String chuoi;
        Scanner s= new Scanner(System.in);
        System.out.println("Nhap chuoi so  phan cach bang dau phay");
        chuoi = s.nextLine();
        String ars[] = chuoi.split(",");
        for (String item:
                ars ) {
            int num = Integer.parseInt(item);
            System.out.println("So la " + num);
        }
    }
}
