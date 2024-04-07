package daili;

public class Test {
    public static void main(String[]args){
        JG bigstar = new JG("鸡哥");
        Star star = CProxy.creatProxy(bigstar);

        String result = star.sing("只因那天没");
        System.out.println(result);

        star.dance();
    }
}
