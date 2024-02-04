package task1;

public class Maintainer extends AdminStaff{
    public Maintainer() {
    }

    public Maintainer(String name, String id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println("维护专员正在工作");
    }
}
