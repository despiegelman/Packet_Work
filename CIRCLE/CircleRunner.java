package CIRCLE;

public class CircleRunner{
    public static void main (String[]args){
        Circle mark = new Circle(3);
        System.out.println("The circumference is " + mark.getC());
        System.out.println("The area is " + mark.getArea());
        mark.changeR(1);
        System.out.println("The new area is " + mark.getArea());
    }
}
