package task6;

public class Cat extends Animal{
    public Cat(int age, String color) {
        super(age, color);
    }

    public Cat() {
    }

    @Override
    public void eat(String something) {
        System.out.println("在吃"+something);
    }
    public void catchMouse(){
        System.out.println("在抓老鼠");
    }
}
