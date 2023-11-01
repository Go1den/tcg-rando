package game.elements;

public class TypeSet {

    private boolean isFire;
    private boolean isWater;
    private boolean isElectric;
    private boolean isGround;
    private boolean isPsychic;
    private boolean isGrass;

    public TypeSet() {
        isFire = false;
        isWater = false;
        isElectric = false;
        isGround = false;
        isPsychic = false;
        isGrass = false;
    }

    public boolean isFire() {
        return isFire;
    }

    public void setFire(boolean fire) {
        isFire = fire;
    }

    public boolean isWater() {
        return isWater;
    }

    public void setWater(boolean water) {
        isWater = water;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public boolean isGround() {
        return isGround;
    }

    public void setGround(boolean ground) {
        isGround = ground;
    }

    public boolean isPsychic() {
        return isPsychic;
    }

    public void setPsychic(boolean psychic) {
        isPsychic = psychic;
    }

    public boolean isGrass() {
        return isGrass;
    }

    public void setGrass(boolean grass) {
        isGrass = grass;
    }
}
