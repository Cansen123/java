package task1;

public class Tutor extends Empolyee{
    public Tutor() {
    }

    public Tutor(String name, String id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println("助教正在工作");
    }
}
