package task3;

public class P extends Fun implements IPlay{

    @Override
    public void fun() {
        System.out.println("have fun");
    }

    public P() {
    }

    @Override
    public void playGame() {
        System.out.println("玩游戏");
    }
}
