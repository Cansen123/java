package task1;

public class AdminStaff extends Empolyee{
    public AdminStaff() {
    }

    public AdminStaff(String name, String id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println("行政部员工正在工作");
    }
}
