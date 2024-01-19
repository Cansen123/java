package task2;

public class GirlFirend {
    private String name;
    private double height;
    private double weight;

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setHeight(double h){
        height = h;
    }

    public double getHeight(){
        return height;
    }

    public void setWeight(double w){
        weight = w;
    }

    public double getWeight(){
        return weight;
    }

    public void wash(){
        System.out.println("女朋友帮我洗衣服");
    }
    public void cook(){
        System.out.println("女朋友给我做饭");
    }
}
