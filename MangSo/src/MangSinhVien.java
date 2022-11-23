import java.util.Arrays;
import java.util.Scanner;

public class MangSinhVien {
    public static void main(String[] args) {
        String ds_sv[]   = new String[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.printf("Nhap sv thu %d :",i);
            ds_sv[i] = scanner.nextLine();
        }
        for (String item:
             ds_sv) {
            System.out.printf("\nSv : %s",item);
        }
//        Cach 2
        System.out.printf("DS SV : "+ Arrays.toString(ds_sv));
    }
}
