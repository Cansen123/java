package task2;

public class Person {
    private String name;
    private int age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
    public void keepPet(Animal a,String something){
        if (a instanceof Dog dog) {
            System.out.print("年龄为" + age + "岁的" + name + "养了一只" + dog.getColor() + "颜色的" + dog.getAge() + "岁的狗");
            dog.eat(something);
        }else if(a instanceof Cat cat){
            System.out.print("年龄为" + age + "岁的" + name + "养了一只" + cat.getColor() + "颜色的" + cat.getAge() + "岁的猫");
            cat.eat(something);
        }else{
            System.out.println("没有该类型，无法转换");
        }
    }
}
