package batle;

import java.util.Random;

public class Player {
    private String name;
    private Deck deck;

    /** méthodes **/
    public Card pullCard() {
        return deck.pullTopCard();
    }

    public void initCards(int nbCardsInDeck) {
        setDeck(new Deck(nbCardsInDeck));
        for(int i=0; i<nbCardsInDeck;i++){
            Card card = new Card();
            deck.addCard(card);
            System.out.println(card.getColor());
            System.out.println(card.getValue());
        }
    }

    /** getters and setters **/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Deck getDeck() {
        return deck;
    }

    private void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Player(String name){
        this.name=name;
    }

    public Player(){
//        this.name="Chat Nonyme";
    }
}
