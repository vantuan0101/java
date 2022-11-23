package Lab6_chuoi;

import java.util.Scanner;

public class TimKiemVaThayThe {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Nhap thong tin :");
        String content = s.nextLine();
        System.out.println("Nhap noi dung can tim :");
        String find = s.nextLine();
        System.out.println("Nhap noi dung can thay the :");
        String re = s.nextLine();
        String result = content.replaceAll(find , re);
        System.out.println("Noi dung sau khi thay the :" + result);
    }
}
