package InheritanceNDAbstract;

import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rad;
        System.out.println("Enter the shape you want to change: 1 for InheritanceNDAbstract.Circle\n 2 for rectangle\n 3 for InheritanceNDAbstract.square\n 4 for InheritanceNDAbstract.square\n 5 for triangle");
        int number = sc.nextInt();

        Rectangle r = null;
        Circle c =null;
        switch (number) {

            case 1:
                System.out.println("enter the radius of circle");
                rad = sc.nextDouble();
                c = new Circle(rad);
                c.setRadius(rad);


                double ans2= Painter.calcPaintingcost(c);
                System.out.println(ans2);

                break;
            case 2:
                System.out.println("enter the length of rectangle");
                double M = sc.nextDouble();
                System.out.println("enter the width of rectangle");
                double P = sc.nextDouble();
                r = new Rectangle(M, P);
                r.setLength(M);
                r.setWidth(P);

                double ans1= Painter.calcPaintingcost(r);
                System.out.println(ans1);
                break;
            default:
                System.out.println("enter a valid number");
        }




    }}