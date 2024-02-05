package task3;

public class Main {
    public static void main(String[]args){
        P p1 = new P();
        IPlay p2 = new IPlay(){

            @Override
            public void playGame() {
                System.out.println("玩游戏");
            }
        };
        Fun p3 = new Fun(){

            @Override
            public void fun() {
                System.out.println("have fun");
            }
        };

        p1.playGame();
        p1.fun();
        p2.playGame();
        p3.fun();
    }
}
