package task1;

public class Lecturer extends Empolyee{
    public Lecturer() {
    }

    public Lecturer(String name, String id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println("讲师正在工作");
    }
}
