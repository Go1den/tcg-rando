package game.elements.card;

import game.elements.Move;
import game.elements.MoveCost;
import game.elements.TypeSet;

import java.util.Collections;
import java.util.List;

public class PokemonCard extends Card {

    private int level;
    private int evolutionStage;
    private int hp;
    private Move move1;
    private Move move2;
    private TypeSet weaknesses;
    private TypeSet resistances;
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
        weaknesses = null;
        resistances = null;
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
                       TypeSet weaknesses,
                       TypeSet resistances,
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
        this.weaknesses = weaknesses;
        this.resistances = resistances;
        this.retreatCost = retreatCost;
        this.evolvesFromCardIDs = evolvesFromCardIDs;
        this.evolvesIntoCardIDs = evolvesIntoCardIDs;
        this.evolvesFromFossil = evolvesFromFossil;
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
}
