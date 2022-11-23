package MangSo.Lap1;

public class Lap1 {
    public static void main(String[] args) {
int n=5;
boolean ok = true;
        for (int i = 1; i <= 5 ; i++) {
            if(n%2 == 0){
ok=false; break;
            }
        }
        if(ok){
            System.out.printf("%d la so nguyen to",n);
        }else {
            System.out.printf("%d ko la so nguyen to",n);
        }
    }
}
