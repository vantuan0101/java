import java.util.Arrays;
import java.util.Scanner;

public class MangSo {
    public static void main(String[] args) {
//        int[]  mang = new int [10];
//        Scanner scanner = new Scanner(System.in);
//        for (int i=0; i<10 ; i++){
//            System.out.printf("Nhap phan tu mang[%d] = ",i);
//            mang[i] = scanner.nextInt();
//        }
//        for (int i=0; i<10 ; i++){
//            System.out.printf(" phan tu thu mang[%d] = %d \t",i , mang[i]);
//        }
        // Mang nang cao
        int a[] = {5,2,7,2,9,32,9,1};
        // để in nhanh ra màn hình các phần tử của mảng t dùng toString
        System.out.printf("Cac phan tu cua mang la : " + Arrays.toString(a));
//        để sắp xếp mảng dùng sort
        Arrays.sort(a);
        System.out.printf("\nMang sau khi sap xep la : "+ Arrays.toString(a));
//        để tìm vị trí của một số dùng binarySearch theo mảng tăng dần
        System.out.printf("\nVi trí của 7 trong mang sau khi sap xep la : " + Arrays.binarySearch(a,7));
//        Thay các phần tử của mảng thành 0
        Arrays.fill(a,0);
        System.out.printf("\nCac phan tu cua mang la : " + Arrays.toString(a));
    }
}
