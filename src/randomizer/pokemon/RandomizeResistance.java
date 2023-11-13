package randomizer.pokemon;

import constants.Type;
import constants.settings.Resistance;
import game.elements.GameData;
import game.elements.card.PokemonCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static randomizer.utilites.Utilities.getRandomNonColorlessType;

public class RandomizeResistance {

    public static void randomizeResistance(GameData gameData, Random random, Resistance resistance, int noResistancePercent) {
        switch (resistance) {
            case RANDOM:
                randomizeResistanceAtCardLevel(gameData, random, noResistancePercent);
                break;
            case RANDOM_BY_EVOLUTION:
                randomizeResistanceByEvolutionSeries(gameData, random, noResistancePercent);
                break;
            default:
        }
    }

    private static void randomizeResistanceByEvolutionSeries(GameData gameData, Random random, int noResistancePercent) {
        List<Integer> updatedCardIDs = new ArrayList<>();
        Type type;
        for (PokemonCard card : gameData.getAllPokemonCards()) {
            if (updatedCardIDs.contains(card.getCardID())) {
                continue;
            }
            int rng = random.nextInt(100) + 1;
            type = rng > noResistancePercent ? getRandomNonColorlessType(random) : Type.NONE;
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
                tempCard.setResistance(type);
                gameData.getCardMap().put(tempCard.getCardID(), tempCard);
                updatedCardIDs.add(tempCard.getCardID());
            }
        }
    }

    private static void randomizeResistanceAtCardLevel(GameData gameData, Random random, int noResistancePercent) {
        for (PokemonCard card : gameData.getAllPokemonCards()) {
            int rng = random.nextInt(100) + 1;
            if (rng > noResistancePercent) { //hasResistance
                int resistance = random.nextInt(6) + 1;
                switch (resistance) {
                    case 1:
                        card.setResistance(Type.FIRE);
                        if (!card.getResistance().toString().equals(card.getWeakness().toString())) {
                            break;
                        }
                    case 2:
                        card.setResistance(Type.WATER);
                        if (!card.getResistance().toString().equals(card.getWeakness().toString())) {
                            break;
                        }
                    case 3:
                        card.setResistance(Type.ELECTRIC);
                        if (!card.getResistance().toString().equals(card.getWeakness().toString())) {
                            break;
                        }
                    case 4:
                        card.setResistance(Type.GROUND);
                        if (!card.getResistance().toString().equals(card.getWeakness().toString())) {
                            break;
                        }
                    case 5:
                        card.setResistance(Type.PSYCHIC);
                        if (!card.getResistance().toString().equals(card.getWeakness().toString())) {
                            break;
                        }
                    case 6:
                        card.setResistance(Type.GRASS);
                        if (!card.getResistance().toString().equals(card.getWeakness().toString())) {
                            break;
                        }
                    default:
                        card.setResistance(Type.FIRE);
                        break;
                }
            } else {
                card.setResistance(Type.NONE);
            }
            gameData.getCardMap().put(card.getCardID(), card);
        }
    }
}
