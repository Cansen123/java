package task1;

public class Buyer extends AdminStaff{
    public Buyer() {
    }

    public Buyer(String name, String id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println("采购专员正在工作");
    }
}
