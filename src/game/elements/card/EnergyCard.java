package game.elements.card;

import constants.Type;

public class EnergyCard extends Card {

    private Type type;

    public EnergyCard() {
        super();
    }

    public EnergyCard(int cardID, String hex, String name, Type type) {
        super(cardID, hex, name);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
