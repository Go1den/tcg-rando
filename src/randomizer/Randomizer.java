package randomizer;

import constants.settings.*;
import game.elements.GameData;

import java.util.Random;

import static randomizer.duelist.RandomizePrizes.randomizePrizes;
import static randomizer.move.RandomizeMoveCost.randomizeMoveCost;
import static randomizer.pokemon.RandomizeHP.randomizeHP;
import static randomizer.pokemon.RandomizeResistance.randomizeResistance;
import static randomizer.pokemon.RandomizeRetreatCost.randomizeRetreatCost;
import static randomizer.pokemon.RandomizeType.randomizeType;
import static randomizer.pokemon.RandomizeWeakness.randomizeWeakness;

public class Randomizer {

    public void run(int seed) {
        randomize(seed);
    }

    private void randomize(int seed) {
        GameData gameData = new GameData();
        Random random = new Random(seed);

        //Randomize Move stuff
        randomizeMoveCost(gameData, random, PokemonMoveCost.RANDOM_PRESERVE_MOVE_TYPE);

        //Randomize Pokemon stuff
        randomizeHP(gameData, random, HP.RANDOM_BY_STAGE);
        randomizeType(gameData, random, PokemonType.RANDOM_BY_EVOLUTION);
        randomizeWeakness(gameData, random, Weakness.RANDOM_BY_EVOLUTION, 10);
        randomizeResistance(gameData, random, Resistance.RANDOM_BY_EVOLUTION, 25);
        randomizeRetreatCost(gameData, random, RetreatCost.RANDOM_PRESERVE_TYPE); //must randomize type before retreat cost

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

//    private void randomizeMoveCosts(GameData gameData) {
//        boolean isRandomizingCost = true;
//        for (Move move : gameData.getAllMoves()) {
//            MoveCost moveCostBefore = move.getMoveCost();
//            if (isRandomizingCost) {
//
//            }
//        }
//    }
}
