package Lab6_chuoi;

import java.util.Scanner;

public class BiieuThucChinhQuy {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Nhap email");
        String email = s.nextLine();
        System.out.println("Nhap So dt");
        String phone = s.nextLine();

        String checkEmail = "\\w+@\\w+\\.\\w+";
        if(email.matches(checkEmail)){
            System.out.println("Email hop le");
        }else {
            System.out.println("Email ko hop le");
        }
        String chekSdt = "0\\d{9,10}";
        if(phone.matches(chekSdt)){
            System.out.println("phone hop le");
        }else {
            System.out.println("phone ko hop le");
        }
    }
}
