package interface__diw;

public class Main implements DAO{

    @Override
    public void insert() {
        System.out.println("Insert ok");
    }

    @Override
    public void deleted() {
        System.out.println("deleted ok");

    }

    @Override
    public void update() {
        System.out.println("update ok");

    }

    @Override
    public void select() {
        System.out.println("select ok");

    }
}
