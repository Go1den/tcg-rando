package randomizer.pokemon;

import constants.Type;
import constants.settings.Weakness;
import game.elements.GameData;
import game.elements.TypeSet;
import game.elements.card.PokemonCard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomizeWeakness {

    public static void randomizeWeakness(GameData gameData, Random random, Weakness weakness, int noWeaknessPercent) {
        if (Weakness.RANDOM.equals(weakness)) {
            randomizeWeaknessAtCardLevel(gameData, random, noWeaknessPercent);
        } else if (Weakness.RANDOM_BY_EVOLUTION.equals(weakness)) {
            randomizeWeaknessByEvolutionSeries(gameData, random, noWeaknessPercent);
        }
    }

    private static void randomizeWeaknessByEvolutionSeries(GameData gameData, Random random, int noWeaknessPercent) {
        List<Integer> updatedCardIDs = new ArrayList<>();
        Type type;
        for (PokemonCard card : gameData.getAllPokemonCards()) {
            if (updatedCardIDs.contains(card.getCardID())) {
                continue;
            }
            int rng = random.nextInt(100) + 1;
            if (rng > noWeaknessPercent) { //hasWeakness
                int weakness = random.nextInt(6) + 1;
                switch (weakness) {
                    case 1:
                        type = Type.FIRE;
                        break;
                    case 2:
                        type = Type.WATER;
                        break;
                    case 3:
                        type = Type.ELECTRIC;
                        break;
                    case 4:
                        type = Type.GROUND;
                        break;
                    case 5:
                        type = Type.PSYCHIC;
                        break;
                    default:
                        type = Type.GRASS;
                        break;
                }
            } else {
                type = Type.NONE;
            }
            List<Integer> evolutionChainIDs = new ArrayList<>();
            evolutionChainIDs.add(card.getCardID());
            PokemonCard tempCard;
            for (int i = 0; i < evolutionChainIDs.size(); i++) {
                tempCard = (PokemonCard) gameData.getCardMap().get(evolutionChainIDs.get(i));
                evolutionChainIDs.addAll(tempCard.getEvolvesFromCardIDs());
                evolutionChainIDs.addAll(tempCard.getEvolvesIntoCardIDs());
                evolutionChainIDs = evolutionChainIDs.stream().distinct().collect(Collectors.toList());
            }
            for (Integer evolutionChainID : evolutionChainIDs) {
                tempCard = (PokemonCard) gameData.getCardMap().get(evolutionChainID);
                tempCard.setWeakness(type);
                gameData.getCardMap().put(tempCard.getCardID(), tempCard);
                updatedCardIDs.add(tempCard.getCardID());
            }
        }
    }

    private static void randomizeWeaknessAtCardLevel(GameData gameData, Random random, int noWeaknessPercent) {
        for (PokemonCard card : gameData.getAllPokemonCards()) {
            int rng = random.nextInt(100) + 1;
            if (rng > noWeaknessPercent) { //hasWeakness
                int weakness = random.nextInt(6) + 1;
                switch (weakness) {
                    case 1:
                        card.setWeakness(Type.FIRE);
                        break;
                    case 2:
                        card.setWeakness(Type.WATER);
                        break;
                    case 3:
                        card.setWeakness(Type.ELECTRIC);
                        break;
                    case 4:
                        card.setWeakness(Type.GROUND);
                        break;
                    case 5:
                        card.setWeakness(Type.PSYCHIC);
                        break;
                    default:
                        card.setWeakness(Type.GRASS);
                        break;
                }
            } else {
                card.setWeakness(Type.NONE);
            }
            gameData.getCardMap().put(card.getCardID(), card);
        }
    }
}
