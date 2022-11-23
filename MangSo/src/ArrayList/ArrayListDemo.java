package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo
{
    public static void main(String[] args) {
        ArrayList<Double> nums = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        for (int i=0; i<5;i++){
            System.out.printf("Nhap phan tu thu %d " , i);
            double d = s.nextDouble();
            nums.add(d);
        }
        for (Double item:
             nums) {
            System.out.print(" " + item);

        }
    }
}
