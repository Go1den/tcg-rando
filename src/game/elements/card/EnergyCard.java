package game.elements.card;

public class EnergyCard extends Card {

    public EnergyCard() {
        cardID = 0;
        hex = "00";
        name = null;
    }

    public EnergyCard(int cardID, String hex, String name) {
        super(cardID, hex, name);
    }
}
