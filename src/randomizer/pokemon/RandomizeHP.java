package randomizer.pokemon;

import constants.settings.HP;
import game.elements.GameData;
import game.elements.card.PokemonCard;

import java.util.Random;

public class RandomizeHP {

    public static void randomizeHP(GameData gameData, Random random, HP hp) {
        if (HP.RANDOM_BY_STAGE.equals(hp)) {
            randomizeHPByStage(gameData, random);
        }
    }

    private static void randomizeHPByStage(GameData gameData, Random random) {
        for (PokemonCard card : gameData.getAllPokemonCards()) {
            int maxHP = 2;
            int minHP = 1;
            int maxEvolution = gameData.getMaxEvolution(card);
            switch (card.getEvolutionStage()) {
                case 1:
                    if (maxEvolution == 1) {
                        minHP = 5;
                        maxHP = 7;
                    } else if (maxEvolution == 2) {
                        minHP = 4;
                        maxHP = 6;
                    } else {
                        minHP = 3;
                        maxHP = 5;
                    }
                    break;
                case 2:
                    if (maxEvolution == 2) {
                        minHP = 6;
                        maxHP = 8;
                    } else {
                        minHP = 6;
                        maxHP = 8;
                    }
                    break;
                case 3:
                    minHP = 9;
                    maxHP = 12;
                    break;
            }
            int randomNum = 10 * (random.nextInt((maxHP - minHP) + 1) + minHP);
            card.setHp(randomNum);
            gameData.getCardMap().put(card.getCardID(), card);
        }
    }
}
