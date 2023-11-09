package randomizer.pokemon;

import constants.Type;
import constants.settings.Resistance;
import game.elements.GameData;
import game.elements.TypeSet;
import game.elements.card.PokemonCard;

import java.util.Collections;
import java.util.Random;

public class RandomizeResistance {

    public static void randomizeResistance(GameData gameData, Random random, Resistance resistance, int noResistancePercent) {
        if (Resistance.RANDOM.equals(resistance)) {
            randomizeResistanceAtCardLevel(gameData, random, noResistancePercent);
        } else if (Resistance.RANDOM_BY_EVOLUTION.equals(resistance)) {
            randomizeResistanceByEvolutionSeries(gameData, random, noResistancePercent);
        }
    }

    private static void randomizeResistanceByEvolutionSeries(GameData gameData, Random random, int noResistancePercent) {
        //TODO
    }

    private static void randomizeResistanceAtCardLevel(GameData gameData, Random random, int noResistancePercent) {
        for (PokemonCard card : gameData.getAllPokemonCards()) {
            int rng = random.nextInt(100) + 1;
            if (rng > noResistancePercent) { //hasResistance
                int weakness = random.nextInt(6) + 1;
                switch (weakness) {
                    case 1:
                        card.setResistance(new TypeSet(Collections.singletonList(Type.FIRE)));
                        if (!card.getResistance().toString().equals(card.getWeakness().toString())) {
                            break;
                        }
                    case 2:
                        card.setResistance(new TypeSet(Collections.singletonList(Type.WATER)));
                        if (!card.getResistance().toString().equals(card.getWeakness().toString())) {
                            break;
                        }
                    case 3:
                        card.setResistance(new TypeSet(Collections.singletonList(Type.ELECTRIC)));
                        if (!card.getResistance().toString().equals(card.getWeakness().toString())) {
                            break;
                        }
                    case 4:
                        card.setResistance(new TypeSet(Collections.singletonList(Type.GROUND)));
                        if (!card.getResistance().toString().equals(card.getWeakness().toString())) {
                            break;
                        }
                    case 5:
                        card.setResistance(new TypeSet(Collections.singletonList(Type.PSYCHIC)));
                        if (!card.getResistance().toString().equals(card.getWeakness().toString())) {
                            break;
                        }
                    case 6:
                        card.setResistance(new TypeSet(Collections.singletonList(Type.GRASS)));
                        if (!card.getResistance().toString().equals(card.getWeakness().toString())) {
                            break;
                        }
                    default:
                        card.setResistance(new TypeSet(Collections.singletonList(Type.FIRE)));
                        break;
                }
            } else {
                card.setResistance(new TypeSet());
            }
            gameData.getCardMap().put(card.getCardID(), card);
        }
    }
}
