package game.elements;

import constants.Type;

import java.util.List;

public class TypeSet {

    private boolean isFire;
    private boolean isWater;
    private boolean isElectric;
    private boolean isGround;
    private boolean isPsychic;
    private boolean isGrass;
    private boolean isNormal;

    public TypeSet() {
        isFire = false;
        isWater = false;
        isElectric = false;
        isGround = false;
        isPsychic = false;
        isGrass = false;
        isNormal = false;
    }

    public TypeSet(List<Type> types) {
        if (types.contains(Type.FIRE)) {
            isFire = true;
        }
        if (types.contains(Type.WATER)) {
            isWater = true;
        }
        if (types.contains(Type.ELECTRIC)) {
            isElectric = true;
        }
        if (types.contains(Type.GROUND)) {
            isGround = true;
        }
        if (types.contains(Type.PSYCHIC)) {
            isPsychic = true;
        }
        if (types.contains(Type.GRASS)) {
            isGrass = true;
        }
        if (types.contains(Type.NORMAL)) {
            isNormal = true;
        }
    }

    public TypeSet(String types) {
        if (types.contains(Type.FIRE.getTypeName())) {
            isFire = true;
        }
        if (types.contains(Type.WATER.getTypeName())) {
            isWater = true;
        }
        if (types.contains(Type.ELECTRIC.getTypeName())) {
            isElectric = true;
        }
        if (types.contains(Type.GROUND.getTypeName())) {
            isGround = true;
        }
        if (types.contains(Type.PSYCHIC.getTypeName())) {
            isPsychic = true;
        }
        if (types.contains(Type.GRASS.getTypeName())) {
            isGrass = true;
        }
        if (types.contains(Type.NORMAL.getTypeName())) {
            isNormal = true;
        }
    }

    public TypeSet(boolean isFire, boolean isWater, boolean isElectric, boolean isGround, boolean isPsychic,
                   boolean isGrass, boolean isNormal) {
        this.isFire = isFire;
        this.isWater = isWater;
        this.isElectric = isElectric;
        this.isGround = isGround;
        this.isPsychic = isPsychic;
        this.isGrass = isGrass;
        this.isNormal = isNormal;
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

    public boolean isNormal() {
        return isNormal;
    }

    public void setNormal(boolean normal) {
        isNormal = normal;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (isFire) {
            stringBuilder.append("Fire,");
        }
        if (isWater) {
            stringBuilder.append("Water,");
        }
        if (isElectric) {
            stringBuilder.append("Electric,");
        }
        if (isGround) {
            stringBuilder.append("Ground,");
        }
        if (isPsychic) {
            stringBuilder.append("Psychic,");
        }
        if (isGrass) {
            stringBuilder.append("Grass,");
        }
        if (isNormal) {
            stringBuilder.append("Normal,");
        }
        String result = stringBuilder.toString();
        if (result.isEmpty()) {
            return "None";
        }
        return result.substring(0, result.length() - 1);
    }
}
