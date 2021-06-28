package batle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Player jouer1 = new Player("Jerem");
        Player jouer2 = new Player("Aurelien");

        jouer1.initCards(13);
        jouer2.initCards(13);

        System.out.println(jouer1.getDeck());
        System.out.println(jouer2.getDeck());

    }




}
