package game.elements;

public class MoveCost {

    private int fire;
    private int water;
    private int electric;
    private int ground;
    private int psychic;
    private int grass;
    private int colorless;

    public MoveCost() {
        fire = 0;
        water = 0;
        electric = 0;
        ground = 0;
        psychic = 0;
        grass = 0;
        colorless = 0;
    }

//    public MoveCost(int fire, int water, int electric, int ground, int psychic, int grass, int colorless) {
//        this.fire = fire;
//        this.water = water;
//        this.electric = electric;
//        this.ground = ground;
//        this.psychic = psychic;
//        this.grass = grass;
//        this.colorless = colorless;
//    }

    public MoveCost(String cost) {
        this.fire = cost.length() - cost.replace("F", "").length();
        this.water = cost.length() - cost.replace("W", "").length();
        this.electric = cost.length() - cost.replace("E", "").length();
        this.ground = cost.length() - cost.replace("D", "").length();
        this.psychic = cost.length() - cost.replace("P", "").length();
        this.grass = cost.length() - cost.replace("G", "").length();
        this.colorless = cost.length() - cost.replace("*", "").length();
    }

    public int getFire() {
        return fire;
    }

    public void setFire(int fire) {
        this.fire = fire;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getElectric() {
        return electric;
    }

    public void setElectric(int electric) {
        this.electric = electric;
    }

    public int getGround() {
        return ground;
    }

    public void setGround(int ground) {
        this.ground = ground;
    }

    public int getPsychic() {
        return psychic;
    }

    public void setPsychic(int psychic) {
        this.psychic = psychic;
    }

    public int getGrass() {
        return grass;
    }

    public void setGrass(int grass) {
        this.grass = grass;
    }

    public int getColorless() {
        return colorless;
    }

    public void setColorless(int colorless) {
        this.colorless = colorless;
    }
}
