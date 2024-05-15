package TRAVEL;


public class RunTravel{
    public static void main(String[]args){
        for (int i = 6; i <= 40; i += 2) {
            Travel group = new Travel(i);
            System.out.print("people = " + i + ", ");
            System.out.print("vans = " + group.goByVan() + ", ");
            System.out.print("canoes = " + group.goByCanoe() + ", ");
            System.out.print("planes = " + group.goByPlane());
            System.out.print("\n");
        }
    }
}