package randomizer;

import constants.Type;
import constants.randomized.Prizes;
import game.elements.*;
import game.elements.card.Card;
import game.elements.card.PokemonCard;
import game.elements.card.TrainerCard;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Randomizer {

    public void run(int seed) {
//        List<Card> cards = gameData.getAllCards();
//        List<Duelist> duelists = gameData.getAllDuelists();
//        List<Move> moves = gameData.getAllMoves();
        randomize(seed);
    }

    private void randomize(int seed) {
        GameData gameData = new GameData();
        Random random = new Random(seed);

        //Randomize Pokemon stuff
        randomizeHP(gameData, random);
        randomizeWeakness(gameData, random, 10);
        randomizeResistance(gameData, random, 25);

        //Randomize Duelist stuff
        randomizePrizes(gameData, Prizes.RANDOM, random, 0, 0);

        Logger.log(gameData, seed);
    }

//    private List<Card> getRandomizedDeck(GameData gameData, Random random, TypeSet typeSet) {
//        int maxTrainers = 20;
//        int minTrainers = 8;
//        int trainerCount = random.nextInt((maxTrainers - minTrainers) + 1) + minTrainers;
//        int maxEnergy = 28;
//        int minEnergy = 18;
//        int energyCount = random.nextInt((maxEnergy - minEnergy) + 1) + minEnergy;
//        int pokemonCount = 60 - trainerCount - energyCount;
//
//        List<TrainerCard> trainerCards = gameData.getAllTrainerCards();
//        while (trainerCount > 0) {
//            int length = trainerCards.size();
//            int index = random.nextInt((length-1))
//            trainerCards.remove();
//            trainerCount--;
//        }
//    }



    private void randomizeHP(GameData gameData, Random random) {
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

    private void randomizeWeakness(GameData gameData, Random random, int noWeaknessPercent) {
        for (PokemonCard card : gameData.getAllPokemonCards()) {
            int rng = random.nextInt(100) + 1;
            if (rng > noWeaknessPercent) { //hasWeakness
                int weakness = random.nextInt(6) + 1;
                switch (weakness) {
                    case 1:
                        card.setWeaknesses(new TypeSet(Collections.singletonList(Type.FIRE)));
                        break;
                    case 2:
                        card.setWeaknesses(new TypeSet(Collections.singletonList(Type.WATER)));
                        break;
                    case 3:
                        card.setWeaknesses(new TypeSet(Collections.singletonList(Type.ELECTRIC)));
                        break;
                    case 4:
                        card.setWeaknesses(new TypeSet(Collections.singletonList(Type.GROUND)));
                        break;
                    case 5:
                        card.setWeaknesses(new TypeSet(Collections.singletonList(Type.PSYCHIC)));
                        break;
                    default:
                        card.setWeaknesses(new TypeSet(Collections.singletonList(Type.GRASS)));
                        break;
                }
            } else {
                card.setWeaknesses(new TypeSet());
            }
            gameData.getCardMap().put(card.getCardID(), card);
        }
    }

    private void randomizeResistance(GameData gameData, Random random, int noResistancePercent) {
        for (PokemonCard card : gameData.getAllPokemonCards()) {
            int rng = random.nextInt(100) + 1;
            if (rng > noResistancePercent) { //hasResistance
                int weakness = random.nextInt(6) + 1;
                switch (weakness) {
                    case 1:
                        card.setResistances(new TypeSet(Collections.singletonList(Type.FIRE)));
                        break;
                    case 2:
                        card.setResistances(new TypeSet(Collections.singletonList(Type.WATER)));
                        break;
                    case 3:
                        card.setResistances(new TypeSet(Collections.singletonList(Type.ELECTRIC)));
                        break;
                    case 4:
                        card.setResistances(new TypeSet(Collections.singletonList(Type.GROUND)));
                        break;
                    case 5:
                        card.setResistances(new TypeSet(Collections.singletonList(Type.PSYCHIC)));
                        break;
                    default:
                        card.setResistances(new TypeSet(Collections.singletonList(Type.GRASS)));
                        break;
                }
            } else {
                card.setResistances(new TypeSet());
            }
            gameData.getCardMap().put(card.getCardID(), card);
        }
    }

//    private void randomizeMoveCosts(GameData gameData) {
//        boolean isRandomizingCost = true;
//        for (Move move : gameData.getAllMoves()) {
//            MoveCost moveCostBefore = move.getMoveCost();
//            if (isRandomizingCost) {
//
//            }
//        }
//    }

    private void randomizePrizes(GameData gameData, Prizes prizes, Random random, int regularPrizes, int bossPrizes) {
        if (Prizes.RANDOM.equals(prizes)) {
            for (Duelist duelist : gameData.getAllDuelists()) {
                duelist.setPrizes(random.nextInt(6) + 1);
                gameData.getDuelistMap().put(duelist.getDuelistID(), duelist);
            }
        } else if (Prizes.SPECIFY.equals(prizes)) {
            for (Duelist duelist : gameData.getAllDuelists()) {
                duelist.setPrizes(duelist.isBoss() ? bossPrizes : regularPrizes);
                gameData.getDuelistMap().put(duelist.getDuelistID(), duelist);
            }
        }
    }
}
