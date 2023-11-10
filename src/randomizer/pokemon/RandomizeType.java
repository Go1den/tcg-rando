package randomizer.pokemon;

import constants.Type;
import constants.settings.PokemonType;
import game.elements.GameData;
import game.elements.card.PokemonCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomizeType {

    public static void randomizeType(GameData gameData, Random random, PokemonType type) {
        if (PokemonType.RANDOM.equals(type)) {
            randomizeTypeAtCardLevel(gameData, random);
        } else if (PokemonType.RANDOM_BY_EVOLUTION.equals(type)) {
            randomizeTypeByEvolutionSeries(gameData, random);
        }
    }

    private static void randomizeTypeByEvolutionSeries(GameData gameData, Random random) {
        List<Integer> updatedCardIDs = new ArrayList<>();
        Type type;
        for (PokemonCard card : gameData.getAllPokemonCards()) {
            if (updatedCardIDs.contains(card.getCardID())) {
                continue;
            }
            int rng = random.nextInt(7) + 1;
            switch (rng) {
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
                case 6:
                    type = Type.GRASS;
                    break;
                default:
                    type = Type.NORMAL;
                    break;
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
                tempCard.setType(type);
                gameData.getCardMap().put(tempCard.getCardID(), tempCard);
                updatedCardIDs.add(tempCard.getCardID());
            }
        }
    }

    private static void randomizeTypeAtCardLevel(GameData gameData, Random random) {
        for (PokemonCard card : gameData.getAllPokemonCards()) {
            int rng = random.nextInt(6) + 1;
            switch (rng) {
                case 1:
                    card.setType(Type.FIRE);
                    break;
                case 2:
                    card.setType(Type.WATER);
                    break;
                case 3:
                    card.setType(Type.ELECTRIC);
                    break;
                case 4:
                    card.setType(Type.GROUND);
                    break;
                case 5:
                    card.setType(Type.PSYCHIC);
                    break;
                case 6:
                    card.setType(Type.GRASS);
                    break;
                default:
                    card.setType(Type.FIRE);
                    break;
            }
            gameData.getCardMap().put(card.getCardID(), card);
        }
    }
}
