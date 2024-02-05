package task6;

public class Test {
    public static void main(String[]args){
        InterB p = new InterB(){
            @Override
            public void showB(){
                System.out.println("showB");
            }
        };
        B b = new B(p);
        b.methodB();
    }
}
