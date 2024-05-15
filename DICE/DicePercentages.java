package DICE;

public class DicePercentages {
    public static void main(String[]args){
        int countSevenEleven = 0;
        int countTwoThreeTwelve = 0;
        for (int i = 1; i <= 100; i++) {
            Dice d = new Dice();
            d.roll();
            int n = d.getTotal();
            if (n == 7 || n == 1) {
                countSevenEleven += 1;
            }
            else if (n == 2 || n == 3 || n == 12) {
                countTwoThreeTwelve += 1;
            }
        }
        System.out.println("You rolled a 7 or 11 " + countSevenEleven + "% of the time.");
        System.out.println("You rolled a 2, 3 or 12 " + countTwoThreeTwelve + "% of the time.");

    }
}
