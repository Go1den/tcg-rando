package game.elements;

import constants.Type;

import java.util.Random;

public class MoveCost {

    private int fire;
    private int water;
    private int electric;
    private int fighting;
    private int psychic;
    private int grass;
    private int colorless;

    public MoveCost() {
        fire = 0;
        water = 0;
        electric = 0;
        fighting = 0;
        psychic = 0;
        grass = 0;
        colorless = 0;
    }

    public MoveCost(String cost) {
        this.fire = cost.length() - cost.replace("F", "").length();
        this.water = cost.length() - cost.replace("W", "").length();
        this.electric = cost.length() - cost.replace("E", "").length();
        this.fighting = cost.length() - cost.replace("D", "").length();
        this.psychic = cost.length() - cost.replace("P", "").length();
        this.grass = cost.length() - cost.replace("G", "").length();
        this.colorless = cost.length() - cost.replace("*", "").length();
    }

    public MoveCost(int cost, Random random) {
        fire = 0;
        water = 0;
        electric = 0;
        fighting = 0;
        psychic = 0;
        grass = 0;
        colorless = 0;
        getRandomCost(cost, random);
    }

    public MoveCost(int cost, Random random, Type type) {
        fire = 0;
        water = 0;
        electric = 0;
        fighting = 0;
        psychic = 0;
        grass = 0;
        colorless = 0;
        getRandomCostByType(cost, random, type);
    }

    private void getRandomCostByType(int cost, Random random, Type type) {
        colorless = random.nextInt(cost + 1);
        switch (type) {
            case FIRE:
                fire = cost - colorless;
                break;
            case WATER:
                water = cost - colorless;
                break;
            case ELECTRIC:
                electric = cost - colorless;
                break;
            case FIGHTING:
                fighting = cost - colorless;
                break;
            case PSYCHIC:
                psychic = cost - colorless;
                break;
            case GRASS:
                grass = cost - colorless;
                break;
            default:
                colorless = cost;
        }
    }

    private void getRandomCost(int cost, Random random) {
        colorless = random.nextInt(cost + 1);
        int rng = random.nextInt(6) + 1;
        switch (rng) {
            case 1:
                fire = cost - colorless;
                break;
            case 2:
                water = cost - colorless;
                break;
            case 3:
                electric = cost - colorless;
                break;
            case 4:
                fighting = cost - colorless;
                break;
            case 5:
                psychic = cost - colorless;
                break;
            default:
                grass = cost - colorless;
                break;
        }
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

    public int getFighting() {
        return fighting;
    }

    public void setFighting(int fighting) {
        this.fighting = fighting;
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

    public String toString() {
        if (getTotalCost() == 0) {
            return "None";
        }
        String result = "";
        if (fire > 0) {
            result = addOntoCostString(result, fire, Type.FIRE);
        }
        if (water > 0) {
            result = addOntoCostString(result, water, Type.WATER);
        }
        if (electric > 0) {
            result = addOntoCostString(result, electric, Type.ELECTRIC);
        }
        if (fighting > 0) {
            result = addOntoCostString(result, fighting, Type.FIGHTING);
        }
        if (psychic > 0) {
            result = addOntoCostString(result, psychic, Type.PSYCHIC);
        }
        if (grass > 0) {
            result = addOntoCostString(result, grass, Type.GRASS);
        }
        if (colorless > 0) {
            result = addOntoCostString(result, colorless, Type.COLORLESS);
        }
        return result;
    }

    private String addOntoCostString(String result, int amount, Type type) {
        StringBuilder resultBuilder = new StringBuilder(result);
        for (int i = 0; i < amount; i++) {
            resultBuilder.append(type.getTypeLetter());
        }
        return resultBuilder.toString();
    }

    public int getTotalCost() {
        return fire + water + electric + fighting + psychic + grass + colorless;
    }
}
