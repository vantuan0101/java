package static_demo;

public class MainClass {
    public static void main(String[] args) {
        Shape p = new Shape();
        System.out.println("Before : " + Shape.x);
        Shape.moveTo();
        System.out.println("after X :" + Shape.x);
    }
}
