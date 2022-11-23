package Lab6_chuoi;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Nhap username :");
        String username = s.nextLine();
        System.out.println("Nhap password :");
        String password = s.nextLine();
        if(username.equalsIgnoreCase("hello") && password.length() > 6){
            System.out.println("Login ok");
        }else {
            System.out.println("Login fail");
        }
    }
}
