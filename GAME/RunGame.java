package GAME;

public class RunGame {
    public static void main(String[]args){
        Game tosia = new Game(25, "Tosia");
        Game kiersten = new Game(25, "Kiersten");
        while (tosia.tokens() != 0 && kiersten.tokens() != 0){
            tosia.play();
            kiersten.play();
        }
        tosia.status();
        kiersten.status();
    }
}
