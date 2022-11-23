package varargs;

public class MainClass {
    public static int sum(int ...nums){
        int s=0;
        for (int item:nums
             ) {
            s += item;
        }
        return s;
    }
    public static String concat(String ...args){
        String st = "";
        for (String item:args
             ) {
            st += " " +item;
        }
        return st;
    }
    public static void main(String[] args) {
        System.out.println("Sum "+ sum(1));
        System.out.println("Sum "+ sum(1,2,3));
        int[] a = new int[]{1,2,4,6,4};
        System.out.println("Sum "+ sum(a));
        System.out.println("Chuoi :" + concat("anh" , "yeu" , "em"));
    }
}
