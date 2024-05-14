package CIRCLE;

public class Circle{
    private double radius;

    public Circle(double r){
        radius = r;
    }

    public double getArea(){
        double a = Math.PI * radius * radius;
        return a;
    }

    public double getC(){
        double c = Math.PI * 2 * radius;
        return c;
    }
    public void changeR(double r){
        radius = r;
    }
}
