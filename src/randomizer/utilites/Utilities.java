package randomizer.utilites;

import constants.Type;

import java.util.Random;

public class Utilities {
    
    public static Type getRandomNonColorlessType(Random random) {
        int rng = random.nextInt(6) + 1;
        switch (rng) {
            case 1:
                return Type.FIRE;
            case 2:
                return Type.WATER;
            case 3:
                return Type.ELECTRIC;
            case 4:
                return Type.FIGHTING;
            case 5:
                return Type.PSYCHIC;
            default:
                return Type.GRASS;
        }
    }
}
