package static_demo;

public class Shape {
    static public int x =50;
    static  {
        x = 60;
        System.out.println("static block" + x);
    }
    public static void moveTo(){
        System.out.println("Move from : "+x);
        x=100;
        System.out.println("Move to :" +x);
    }
}
