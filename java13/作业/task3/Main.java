package task3;

public class Main {
    public static void main(String[]args){
        Phone p1 = new Phone("小米",4999);
        System.out.println(p1.getBrand()+" "+p1.getPrice()+" "+p1.getSize());
        p1.call();
        p1.sendMessage();
        p1.playGame();

    }
}
