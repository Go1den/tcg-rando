package randomizer.pokemon;

import constants.settings.RetreatCost;
import game.elements.GameData;
import game.elements.MoveCost;
import game.elements.card.PokemonCard;

import java.util.Random;

public class RandomizeRetreatCost {

    public static void randomizeRetreatCost(GameData gameData, Random random, RetreatCost retreatCost) {
        if (RetreatCost.RANDOM.equals(retreatCost)) {
            randomizeRetreatCosts(gameData, random);
        } else if (RetreatCost.RANDOM_PRESERVE_TYPE.equals(retreatCost)) {
            randomizeRetreatCostsRespectingType(gameData, random);
        }
    }

    private static void randomizeRetreatCosts(GameData gameData, Random random) {
        for (PokemonCard card : gameData.getAllPokemonCards()) {
            int rng = random.nextInt(100) + 1;
            if (rng <= 5) {
                card.setRetreatCost(new MoveCost());
            } else if (rng <= 45) {
                card.setRetreatCost(new MoveCost(1, random));
            } else if (rng <= 75) {
                card.setRetreatCost(new MoveCost(2, random));
            } else if (rng <= 95) {
                card.setRetreatCost(new MoveCost(3, random));
            } else {
                card.setRetreatCost(new MoveCost(4, random));
            }
            gameData.getCardMap().put(card.getCardID(), card);
        }
    }

    private static void randomizeRetreatCostsRespectingType(GameData gameData, Random random) {
        for (PokemonCard card : gameData.getAllPokemonCards()) {
            int rng = random.nextInt(100) + 1;
            if (rng <= 5) {
                card.setRetreatCost(new MoveCost());
            } else if (rng <= 45) {
                card.setRetreatCost(new MoveCost(1, random, card.getType()));
            } else if (rng <= 75) {
                card.setRetreatCost(new MoveCost(2, random, card.getType()));
            } else if (rng <= 95) {
                card.setRetreatCost(new MoveCost(3, random, card.getType()));
            } else {
                card.setRetreatCost(new MoveCost(4, random, card.getType()));
            }
            gameData.getCardMap().put(card.getCardID(), card);
        }
    }
}
