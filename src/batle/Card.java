package batle;

import java.util.Random;

public class Card {
    private final int value;
    private final Color color;

    public enum Color{
        PIQUE, TREFLE, COEUR, CARREAU
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    private Color setColor(){
       int rand =0;
        while (rand ==0){
            rand = new Random().nextInt(5);
        }
        System.out.println("rand " + rand);
        Color color = null;
        switch (rand) {
            case 1 -> color = Color.PIQUE;
            case 2 -> color = Color.TREFLE;
            case 3 -> color = Color.COEUR;
            case 4 -> color = Color.CARREAU;
        }
        return color;
    }

    private int setValue(){
        int value = new Random().nextInt(14);
        if (value== 0){
            value++;
        }
        return value;
    }

    public Card(){
        this.value = setValue();
        this.color = setColor();
    }
}

