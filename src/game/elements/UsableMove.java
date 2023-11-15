package game.elements;

public class UsableMove extends Move {

    private MoveCost moveCost;
    private int power;
    private int damageCoinFlips; //How many coin flips are used by this attack if those coin flips are only for determining damage.

    public UsableMove() {
        super();
        moveCost = null;
        power = 0;
        damageCoinFlips = 0;
    }

    public UsableMove(int moveID, MoveCost moveCost, String name, int power, int evolutionStage, int maxEvolutionStage,
                int damageCoinFlips) {
        super(moveID, name, evolutionStage, maxEvolutionStage);
        this.moveCost = moveCost;
        this.power = power;
        this.damageCoinFlips = damageCoinFlips;
    }

    public MoveCost getMoveCost() {
        return moveCost;
    }

    public void setMoveCost(MoveCost moveCost) {
        this.moveCost = moveCost;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDamageCoinFlips() {
        return damageCoinFlips;
    }

    public void setDamageCoinFlips(int damageCoinFlips) {
        this.damageCoinFlips = damageCoinFlips;
    }
}
