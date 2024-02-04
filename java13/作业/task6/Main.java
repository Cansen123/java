package task6;

public class Main {
    public static void main(String []args){
        Dog dog = new Dog(2,"黑色");
        Cat cat = new Cat(2,"白色");
        Person p = new Person("张三",18);
        p.keepPet(dog,"骨头");
        p.keepPet(cat,"鱼干");
    }
}
