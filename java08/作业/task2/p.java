package task2;
import java.util.Scanner;
public class p {
    public static void main(String [] args){
        GirlFirend t = new GirlFirend();
        Scanner sc = new Scanner(System.in);
        t.setName("宵崎奏");
        t.setHeight(154);
        t.setWeight(48);
        show(t);
        t.wash();
        t.cook();
    }

    public static void show(GirlFirend t){
        System.out.println("我女朋友叫"+t.getName()+",身高"+ t.getHeight()+"厘米,体重"+t.getWeight()+"斤");
    }
}
