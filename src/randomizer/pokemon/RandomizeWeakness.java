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

import static randomizer.utilites.Utilities.getRandomNonColorlessType;

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
            type = rng > noWeaknessPercent ? getRandomNonColorlessType(random) : Type.NONE;
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
                card.setWeakness(getRandomNonColorlessType(random));
            } else {
                card.setWeakness(Type.NONE);
            }
            gameData.getCardMap().put(card.getCardID(), card);
        }
    }
}
