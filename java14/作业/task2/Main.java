package task2;

public class Main {
    public static void main(String []args){
        Person p = new Person("老王",30);
        Animal d = new Dog(2,"黑");
        Animal c = new Cat(3,"灰");
        p.keepPet(d,"骨头");
        p.keepPet(c,"鱼");
    }
}
