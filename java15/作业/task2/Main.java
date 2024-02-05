package task2;

public class Main {
    public static void main(String[]args){
        newPhone p1 = new newPhone();
        oldPhone p2 = new oldPhone();
        p2.call();
        p2.sendMessage();
        p1.call();
        p1.sendMessage();
        p1.playGame();
    }
}
