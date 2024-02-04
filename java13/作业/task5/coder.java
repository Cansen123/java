package task5;

public class coder extends Employee{
    public coder() {
    }

    public coder(String name, String id, int salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("程序员正在工作");


    }
}
