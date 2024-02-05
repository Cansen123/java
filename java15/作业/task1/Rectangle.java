package task1;

public class Rectangle extends Image{
    private double radius;
    private final double pi = 3.14;

    public Rectangle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    public Rectangle() {
    }

    @Override
    public double area() {
        double ans = radius*radius*pi;
        return ans;
    }

    @Override
    public double perimeter() {
        double ans = radius*2*pi;
        return ans;
    }
}
