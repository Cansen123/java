package task3;

public class Main {
    public static void main(String [] args){
        Coder p1 = new Coder("李四",135,10000);
        Manager p2 = new Manager("张三",123,15000,6000);

        p2.work();
        p1.work();
    }
}
