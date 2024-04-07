package 多线程.Thread33.Test4;

public class Test {
    public static void main(String[]args){
        UPMT mt1 = new UPMT();
        UPMT mt2 = new UPMT();
        UPMT mt3 = new UPMT();
        UPMT mt4 = new UPMT();
        UPMT mt5 = new UPMT();


        mt1.setName("宵崎奏");
        mt2.setName("真冬");
        mt3.setName("绘名");
        mt4.setName("瑞希");
        mt5.setName("凌地宁宁");

        mt3.start();
        mt2.start();
        mt1.start();
        mt4.start();
        mt5.start();
    }
}
