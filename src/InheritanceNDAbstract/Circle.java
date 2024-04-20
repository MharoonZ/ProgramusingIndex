package InheritanceNDAbstract;

public class Circle extends Shape {
     double radius;
      static int price= 20;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radiu) {
        this.radius = radiu;
    }
    @Override
    public double calcArea() {
        return getRadius()*getRadius() * price;
    }



    }

