package game.elements;

public class Card {

    private int cardID;
    private String name;
    private int level;
    private int hp;
    private Move move1;
    private Move move2;
    private TypeSet weaknesses;
    private TypeSet resistances;

    public Card() {
        cardID = 0;
        name = null;
        level = 0;
        hp = 0;
        move1 = null;
        move2 = null;
        weaknesses = null;
        resistances = null;
    }

    public Card(int cardID, String name, int level, int hp, Move move1, Move move2, TypeSet weaknesses, TypeSet resistances) {
        this.cardID = cardID;
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.move1 = move1;
        this.move2 = move2;
        this.weaknesses = weaknesses;
        this.resistances = resistances;
    }

    public int getCardID() {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Move getMove1() {
        return move1;
    }

    public void setMove1(Move move1) {
        this.move1 = move1;
    }

    public Move getMove2() {
        return move2;
    }

    public void setMove2(Move move2) {
        this.move2 = move2;
    }

    public TypeSet getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(TypeSet weaknesses) {
        this.weaknesses = weaknesses;
    }

    public TypeSet getResistances() {
        return resistances;
    }

    public void setResistances(TypeSet resistances) {
        this.resistances = resistances;
    }
}
