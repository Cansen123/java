package task5;

public class manager extends Employee{
    private int bonus;

    public manager(int bonus) {
        this.bonus = bonus;
    }

    public manager(String name, String id, int salary, int bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("项目经理正在工作");
    }
}
