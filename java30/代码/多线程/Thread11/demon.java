package 多线程.Thread11;

public class demon {
    public static void main(String[] args){
        cooker c = new cooker();
        diner d = new diner();

        c.start();
        d.start();
    }
}
