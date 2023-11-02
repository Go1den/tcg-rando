package game.elements;

public class Move {

    private int moveID;
    private MoveCost moveCost;
    private String name;
    private int power;
    private int evolutionStage; //The evolution stage that a Pokemon with this move IS
    private int maxEvolutionStage; //The highest evolution stage that a Pokemon with this move COULD get to

    public Move() {
        moveID = 0;
        moveCost = null;
        name = null;
        power = 0;
        evolutionStage = 0;
        maxEvolutionStage = 0;
    }

    public Move(int moveID, MoveCost moveCost, String name, int power, int evolutionStage, int maxEvolutionStage) {
        this.moveID = moveID;
        this.moveCost = moveCost;
        this.name = name;
        this.power = power;
        this.evolutionStage = evolutionStage;
        this.maxEvolutionStage = maxEvolutionStage;
    }

    public int getMoveID() {
        return moveID;
    }

    public void setMoveID(int moveID) {
        this.moveID = moveID;
    }

    public MoveCost getMoveCost() {
        return moveCost;
    }

    public void setMoveCost(MoveCost moveCost) {
        this.moveCost = moveCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
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
