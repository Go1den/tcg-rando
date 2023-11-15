package game.elements;

import java.util.List;

public class Deck {

    private List<Integer> cards;
    private String name;

    public Deck() {
        cards = null;
        name = null;
    }

    public Deck(List<Integer> cards, String name) {
        this.cards = cards;
        this.name = name;
    }

    public List<Integer> getCards() {
        return cards;
    }

    public void setCards(List<Integer> cards) {
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
