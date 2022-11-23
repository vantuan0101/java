package Lab5_ArrayList;

public class main {
    public static void main(String[] args) {
//        DanhSachSoThuc ds = new DanhSachSoThuc();
//        int choice =0;
//        Scanner s= new Scanner(System.in);
//        do {
//            System.out.println("\nMenu Chuong trinh");
//            System.out.println("\n1 : Nhap");
//            System.out.println("\n2 : Tinh tong");
//            System.out.println("\n3 : Xuat");
//            System.out.println("\n0 : Thoat");
//            choice = s.nextInt();
//            if (choice !=0){
//                switch (choice){
//                    case 1: ds.Nhap();break;
//                    case 2: ds.TinhTong();break;
//                    case 3: ds.Xuat();break;
//                    case 0: System.exit(0);
//                }
//            }
//        }while (choice!=0);
        DanhSachHoTen ds = new DanhSachHoTen();
        ds.HienThiMenu();
    }
}
