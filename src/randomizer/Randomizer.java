package randomizer;

import constants.settings.*;
import game.elements.GameData;

import java.util.Random;

import static randomizer.duelist.RandomizePrizes.randomizePrizes;
import static randomizer.move.RandomizeMoveCost.randomizeMoveCost;
import static randomizer.pokemon.RandomizeDeck.getRandomizedStarterDeck;
import static randomizer.pokemon.RandomizeHP.randomizeHP;
import static randomizer.pokemon.RandomizeMoves.randomizeMoves;
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
        randomizeMoveCost(gameData, random, MoveCostEnum.RANDOM_PRESERVE_TOTAL_COST_AND_TYPE);

        //Randomize Pokemon stuff
        randomizeHP(gameData, random, HPEnum.RANDOM_BY_STAGE);
        randomizeType(gameData, random, PokemonTypeEnum.RANDOM_BY_EVOLUTION);
        randomizeMoves(gameData, random, MoveEnum.RANDOM);
        randomizeWeakness(gameData, random, WeaknessEnum.RANDOM_BY_EVOLUTION, 10);
        randomizeResistance(gameData, random, ResistanceEnum.RANDOM_BY_EVOLUTION, 25);
        randomizeRetreatCost(gameData, random, RetreatCostEnum.RANDOM_PRESERVE_TYPE); //must randomize type before retreat cost

        //Randomize Duelist stuff
        randomizePrizes(gameData, PrizeEnum.RANDOM, random, 0, 0);

        Logger.log(gameData, seed);
//        Logger.logPatchNotes(gameData, seed);

        getRandomizedStarterDeck(gameData, random);
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
