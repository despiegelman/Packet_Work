package BOX;

public class BoxRunner{
    public static void main (String[]args){
        Box delia = new Box(2.0, 6.0);
        double area = delia.getArea();
        System.out.println("The area is " + area);
        delia.bigger(2);
        double perimeter = delia.getPerimeter();
        System.out.println("The perimeter is " + perimeter);
    }
}