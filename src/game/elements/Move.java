package game.elements;

public class Move {

    private int moveID;
    private String name;
    private int evolutionStage; //The evolution stage that a Pokemon with this move IS
    private int maxEvolutionStage; //The highest evolution stage that a Pokemon with this move COULD get to

    public Move() {
        moveID = 0;
        name = null;
        evolutionStage = 0;
        maxEvolutionStage = 0;
    }

    public Move(int moveID, String name, int evolutionStage, int maxEvolutionStage) {
        this.moveID = moveID;
        this.name = name;
        this.evolutionStage = evolutionStage;
        this.maxEvolutionStage = maxEvolutionStage;
    }

    public int getMoveID() {
        return moveID;
    }

    public void setMoveID(int moveID) {
        this.moveID = moveID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEvolutionStage() {
        return evolutionStage;
    }

    public void setEvolutionStage(int evolutionStage) {
        this.evolutionStage = evolutionStage;
    }

    public int getMaxEvolutionStage() {
        return maxEvolutionStage;
    }

    public void setMaxEvolutionStage(int maxEvolutionStage) {
        this.maxEvolutionStage = maxEvolutionStage;
    }

}
