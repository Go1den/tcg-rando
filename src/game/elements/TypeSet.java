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

    public TypeSet(boolean isFire, boolean isWater, boolean isElectric, boolean isGround, boolean isPsychic, boolean isGrass) {
        this.isFire = isFire;
        this.isWater = isWater;
        this.isElectric = isElectric;
        this.isGround = isGround;
        this.isPsychic = isPsychic;
        this.isGrass = isGrass;
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
