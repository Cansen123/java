package task4;

public class Worker extends Person{
    private String unit;
    private int workAge;

    public Worker(String unit, int workAge) {
        this.unit = unit;
        this.workAge = workAge;
    }

    public Worker(String name, char gender, int age, String nationality, String unit, int workAge) {
        super(name, gender, age, nationality);
        this.unit = unit;
        this.workAge = workAge;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    @Override
    public void work() {
        System.out.println("工人的工作是盖房子!");
    }
}
