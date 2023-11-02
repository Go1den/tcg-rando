package game.elements;

import constants.BoosterPack;
import constants.Gender;
import game.elements.card.Card;

import java.util.List;

public class Trainer {

    private int trainerID;
    private String name;
    private String deckName;
    private List<Card> deck;
    private BoosterPack reward;
    private Gender gender;
}
