package GAME;

public class Game {
    private int tokens;
    private String name;

    public Game(int t, String s){
        tokens = t;
        name = s;
    }

    public void play(){
        if (tokens <= 0){
            System.exit(0);
        }
        double n1 = (int)(Math.random() * 6 + 1);
        double n2 = (int)(Math.random() * 6 + 1);
        System.out.print(name + " has a " + n1 + " and a " + n2);

        if (n1 + n2 == 7){
            tokens += 2;
            System.out.print(" WIN 2 \n");
        }
        else if (n1 == n2){
            tokens += 1;
            System.out.print(" WIN 1 \n");
        }
        else{
            tokens -= 1;
            System.out.print(" LOSE 1 \n");
        }
    }

    public int tokens(){
        return tokens;
    }

    public void status(){
        System.out.println(name + " has " + tokens + " tokens");
    }
}
