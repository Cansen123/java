package task6;

public class B {
    InterB b;
    public B(InterB b){
        this.b=b;
    }
    public void methodB(){
        b.showB();
    }

    public InterB getB() {
        return b;
    }

    public void setB(InterB b) {
        this.b = b;
    }

    public B() {
    }
}
