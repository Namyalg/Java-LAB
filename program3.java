import java.util.Scanner;

class Circle {
    //by default, it is of type package orivate, i.e accessibel by thus package, but not outer one
    double radius;
    String color;
    Circle(){
        this.radius = 0.0;
        this.color = "";
    }
    Circle(double radius){
        this.radius = radius;
        this.color = "red";
    }
    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public void getRadius(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle ");
        this.radius = input.nextDouble();
        System.out.println("Enter the color of the circle ");
        this.color = input.next();
    }
    public double getArea(){
        double ar = 3.14 * this.radius * this.radius;
        return ar;
    }

}

class Cylinder extends Circle{
    double height;
    Cylinder(){
        super();
        this.height = 0.0;
    }
    Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height = height;
    }
    public double getVolume(){
        double val = 3.14 * this.radius * this.radius * this.height;
        return val;
    }
    public double getArea(){
        double ar = 2 * 3.14 * this.radius * (this.radius + this.height);
        return ar;
    }
}

public class Shape {

    public static void main(String[] args){
        Cylinder obj1 = new Cylinder(7.5, 4.5, "blue");
        System.out.println(obj1.getArea());
        System.out.println(obj1.getVolume());
    }
}
