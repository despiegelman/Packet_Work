package CUBE;

public class RunCube {
    public static void main (String[]args){
        Cube ann = new Cube(3);
        System.out.println("The surface area is " + ann.surfaceArea() + " sq. units");
        System.out.println("The volume is " + ann.volume() + " sq. units");
        ann.setSideForVolume(125);
        System.out.println("The side is now " + ann.getSide() + " units");
        System.out.println("The surface area is now " + ann.surfaceArea() + " sq. units");
    }
}