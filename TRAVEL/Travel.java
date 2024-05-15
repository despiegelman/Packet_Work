package TRAVEL;

public class Travel {
    private int people;

    public Travel(int n){
        people = n;
    }

    public int goByVan(){
        if (people % 8 == 0){
            return (int)(people/8);
        }
        else{
            return (int)(people/8 + 1);
        }
    }

    public int goByCanoe(){
        if (people % 3 == 0){
            return (int)(people/3);
        }
        else{
            return (int)(people/3 + 1);
        }
    }

    public int goByPlane(){
        if (people % 12 == 0){
            return (int)(people/12);
        }
        else{
            return (int)(people/12 + 1);
        }
    }
}
