package game.elements;

public class Move {
    private MoveCost moveCost;
    private String name;
    private int power;

    public Move() {
        moveCost = null;
        name = null;
        power = 0;
    }

    public Move(MoveCost moveCost, String name, int power) {
        this.moveCost = moveCost;
        this.name = name;
        this.power = power;
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
}
