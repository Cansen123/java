package task1;

public class Round extends Image{
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Round(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Round() {
    }

    @Override
    public double area() {
        double ans = length*width;
        return ans;
    }

    @Override
    public double perimeter() {
        double ans = (length+width)*2;
        return ans;
    }
}
