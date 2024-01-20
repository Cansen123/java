package task2;
import java.util.Scanner;
public class CarTest {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Car[] arr = new Car[3];
        for(int i=0;i<arr.length;i++){
            Car p = new Car();
            System.out.println("请输入汽车的品牌:");
            String brand = sc.next();
            p.setBrand(brand);
            System.out.println("请输入汽车的价格:");
            int price = sc.nextInt();
            p.setPrice(price);
            System.out.println("请输入汽车的颜色:");
            String color = sc.next();
            p.setColor(color);
            arr[i] = p;
        }

        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i].getBrand() + ", " + arr[i].getPrice() + ", " + arr[i].getColor());
        }

    }
}
