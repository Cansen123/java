package task2;

public class newPhone extends Phone implements IPlay{
    @Override
    public void playGame() {
        System.out.println("玩游戏");
    }
}
