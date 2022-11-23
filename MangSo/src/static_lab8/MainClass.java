package static_lab8;

public class MainClass {
    public static void changeStudent(Student stud){
        stud.id ="New9";
        System.out.println("Id in change student :" + stud.id);
    }
    public static void main(String[] args) {
        Student std = new Student();
        std.id = "STOP9";
        System.out.println("ID before :"+std.id); // STOP9
        changeStudent(std);
        System.out.println("ID after :" + std.id); // New9
        int m =5;
        System.out.println("Before m :" + m);
        Number number = new Number();
        number.change1(m);
        System.out.println("After m :" + m);
        System.out.println("-----------------");
        int mars[]= new int[]{6};
        System.out.println("Before m :" + m);
        number.change2(mars);
        System.out.println("After m :" + m);
    }
}
