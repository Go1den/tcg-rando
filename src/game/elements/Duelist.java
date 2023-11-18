package game.elements;

import constants.BoosterPack;
import constants.Gender;

public class Duelist {

    private int duelistID;
    private String name;
    private Deck deck;
    private BoosterPack reward;
    private Gender gender;
    private int prizes; //How many prizes needed to beat them in a duel
    private boolean isBoss;

    public Duelist() {}

    public Duelist(int duelistID, String name, Deck deck, BoosterPack reward,
                   Gender gender, int prizes, boolean isBoss) {
        this.duelistID = duelistID;
        this.name = name;
        this.deck = deck;
        this.reward = reward;
        this.gender = gender;
        this.prizes = prizes;
        this.isBoss = isBoss;
    }

    public int getDuelistID() {
        return duelistID;
    }

    public void setDuelistID(int duelistID) {
        this.duelistID = duelistID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public BoosterPack getReward() {
        return reward;
    }

    public void setReward(BoosterPack reward) {
        this.reward = reward;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getPrizes() {
        return prizes;
    }

    public void setPrizes(int prizes) {
        this.prizes = prizes;
    }

    public boolean isBoss() {
        return isBoss;
    }

    public void setBoss(boolean boss) {
        isBoss = boss;
    }
}
