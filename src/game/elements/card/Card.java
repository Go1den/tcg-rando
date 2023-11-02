package game.elements.card;

import game.elements.Move;
import game.elements.MoveCost;
import game.elements.TypeSet;

import java.util.Collections;
import java.util.List;

public abstract class Card {

//  Converting an integer (in decimal) to hex can be done with the following line:
//
//  String hex = Integer.toHexString(blockNo);
//  Then to convert it to byte, you can use
//
//  Byte.parseByte(hex,16);
//  But if all you wanted to do is convert the parameter to bytes:
//
//  Byte.parseByte(blockNo);
    protected int cardID;
    protected String hex; //int representation of the hex value of the card
    protected String name;

    protected Card() {
        cardID = 0;
        hex = "00";
        name = null;
    }

    protected Card(int cardID, String hex, String name) {
        this.cardID = cardID;
        this.hex = "00";
        this.name = name;
    }

    public int getCardID() {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
