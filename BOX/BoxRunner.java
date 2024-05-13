package BOX;

public class BoxRunner{
    public static void main (String[]args){
        Box boxOne = new Box(2, 6);
        System.out.println(boxOne.getArea());
        boxOne.bigger(2);
        System.out.println(boxOne.getPerimeter());
    }
}
