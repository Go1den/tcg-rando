package randomizer.pokemon;

import constants.Type;
import constants.settings.Weakness;
import game.elements.GameData;
import game.elements.TypeSet;
import game.elements.card.PokemonCard;

import java.util.Collections;
import java.util.Random;

public class RandomizeWeakness {

    public static void randomizeWeakness(GameData gameData, Random random, Weakness weakness, int noWeaknessPercent) {
        if (Weakness.RANDOM.equals(weakness)) {
            randomizeWeaknessAtCardLevel(gameData, random, noWeaknessPercent);
        } else if (Weakness.RANDOM_BY_EVOLUTION.equals(weakness)) {
            randomizeWeaknessByEvolutionSeries(gameData, random, noWeaknessPercent);
        }
    }

    private static void randomizeWeaknessByEvolutionSeries(GameData gameData, Random random, int noWeaknessPercent) {
        //TODO
    }

    private static void randomizeWeaknessAtCardLevel(GameData gameData, Random random, int noWeaknessPercent) {
        for (PokemonCard card : gameData.getAllPokemonCards()) {
            int rng = random.nextInt(100) + 1;
            if (rng > noWeaknessPercent) { //hasWeakness
                int weakness = random.nextInt(6) + 1;
                switch (weakness) {
                    case 1:
                        card.setWeakness(new TypeSet(Collections.singletonList(Type.FIRE)));
                        break;
                    case 2:
                        card.setWeakness(new TypeSet(Collections.singletonList(Type.WATER)));
                        break;
                    case 3:
                        card.setWeakness(new TypeSet(Collections.singletonList(Type.ELECTRIC)));
                        break;
                    case 4:
                        card.setWeakness(new TypeSet(Collections.singletonList(Type.GROUND)));
                        break;
                    case 5:
                        card.setWeakness(new TypeSet(Collections.singletonList(Type.PSYCHIC)));
                        break;
                    default:
                        card.setWeakness(new TypeSet(Collections.singletonList(Type.GRASS)));
                        break;
                }
            } else {
                card.setWeakness(new TypeSet());
            }
            gameData.getCardMap().put(card.getCardID(), card);
        }
    }
}
