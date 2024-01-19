package task4;

public class Main {
    public static void main(String [] args) {
        Cat p1 = new Cat("花色", "波斯猫");
        Dog p2 = new Dog("黑色", "藏獒");

        p1.eat();
        p1.catchMouse();
        p2.eat();
        p2.lookHome();
    }
}
