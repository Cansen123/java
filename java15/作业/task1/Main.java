package task1;

public class Main {
    public static void main(String[]args){
        Rectangle p1 = new Rectangle(5);
        Round p2 = new Round(5,10);
        System.out.println("圆的周长:"+p1.perimeter());
        System.out.println("圆的面积:"+ p1.area());
        System.out.println("长方形的周长"+p2.perimeter());
        System.out.println("长方形的面积"+p2.area());

    }
}
