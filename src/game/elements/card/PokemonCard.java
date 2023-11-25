package game.elements.card;

import constants.Type;
import game.elements.Move;
import game.elements.MoveCost;

import java.util.Collections;
import java.util.List;

public class PokemonCard extends Card {

    private int level;
    private int evolutionStage;
    private int hp;
    private Move move1;
    private Move move2;
    private Type type;
    private Type weakness;
    private Type resistance;
    private MoveCost retreatCost;
    private List<Integer> evolvesFromCardIDs;
    private List<Integer> evolvesIntoCardIDs;
    private boolean evolvesFromFossil;

    public PokemonCard() {
        super();
        level = 0;
        evolutionStage = 0;
        hp = 0;
        move1 = null;
        move2 = null;
        type = null;
        weakness = null;
        resistance = null;
        retreatCost = null;
        evolvesFromCardIDs = Collections.EMPTY_LIST;
        evolvesIntoCardIDs = Collections.EMPTY_LIST;
        evolvesFromFossil = false;
    }

    public PokemonCard(int cardID,
                       String hex,
                       String name,
                       int level,
                       int evolutionStage,
                       int hp,
                       Move move1,
                       Move move2,
                       Type type,
                       Type weakness,
                       Type resistance,
                       MoveCost retreatCost,
                       List<Integer> evolvesFromCardIDs,
                       List<Integer> evolvesIntoCardIDs,
                       boolean evolvesFromFossil) {
        super(cardID, hex, name);
        this.level = level;
        this.evolutionStage = evolutionStage;
        this.hp = hp;
        this.move1 = move1;
        this.move2 = move2;
        this.type = type;
        this.weakness = weakness;
        this.resistance = resistance;
        this.retreatCost = retreatCost;
        this.evolvesFromCardIDs = evolvesFromCardIDs;
        this.evolvesIntoCardIDs = evolvesIntoCardIDs;
        this.evolvesFromFossil = evolvesFromFossil;
        //this.rarity
        //this.boosterPack
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getEvolutionStage() {
        return evolutionStage;
    }

    public void setEvolutionStage(int evolutionStage) {
        this.evolutionStage = evolutionStage;
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getWeakness() {
        return weakness;
    }

    public void setWeakness(Type weakness) {
        this.weakness = weakness;
    }

    public Type getResistance() {
        return resistance;
    }

    public void setResistance(Type resistance) {
        this.resistance = resistance;
    }

    public MoveCost getRetreatCost() {
        return retreatCost;
    }

    public void setRetreatCost(MoveCost retreatCost) {
        this.retreatCost = retreatCost;
    }

    public List<Integer> getEvolvesFromCardIDs() {
        return evolvesFromCardIDs;
    }

    public void setEvolvesFromCardIDs(List<Integer> evolvesFromCardIDs) {
        this.evolvesFromCardIDs = evolvesFromCardIDs;
    }

    public List<Integer> getEvolvesIntoCardIDs() {
        return evolvesIntoCardIDs;
    }

    public void setEvolvesIntoCardIDs(List<Integer> evolvesIntoCardIDs) {
        this.evolvesIntoCardIDs = evolvesIntoCardIDs;
    }

    public boolean isEvolvesFromFossil() {
        return evolvesFromFossil;
    }

    public void setEvolvesFromFossil(boolean evolvesFromFossil) {
        this.evolvesFromFossil = evolvesFromFossil;
    }

    public int getNumberOfMoves() {
        int a = move1 != null ? 1 : 0;
        int b = move2 != null? 1 : 0;
        return a + b;
    }
}
