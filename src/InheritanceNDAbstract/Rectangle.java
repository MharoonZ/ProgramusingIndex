package InheritanceNDAbstract;

public class Rectangle extends Shape{


    double length;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    double width;

@Override
    public double calcArea() {
        return length * width;
    }


}
