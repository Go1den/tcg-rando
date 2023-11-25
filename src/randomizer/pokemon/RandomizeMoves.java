package randomizer.pokemon;

import constants.settings.MoveEnum;
import game.elements.GameData;
import game.elements.Move;
import game.elements.PokemonPower;
import game.elements.UsableMove;
import game.elements.card.PokemonCard;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomizeMoves {

    public static void randomizeMoves(GameData gameData, Random random, MoveEnum moveEnum, int oneMovePercent) {
        switch (moveEnum) {
            case RANDOM:
                randomizeAllMoves(gameData, random, oneMovePercent);
                break;
            case RANDOM_SAME_NUMBER:
                randomizeMovesSameNumber(gameData, random);
                break;
            case RANDOM_SAME_TYPE:
                randomizeMovesSameType(gameData,random, oneMovePercent);
                break;
            default:
        }
    }


    //TODO this needs to bias more towards the actual type. There are too many colorless moves.
    private static void randomizeMovesSameType(GameData gameData, Random random, int oneMovePercent) {
        int moveIndex1;
        int moveIndex2;
        for (PokemonCard card : gameData.getAllPokemonCards()) {
            List<Move> movesOfMyType = gameData.getAllMovesOfType(card.getType(), true);
            moveIndex1 = random.nextInt(movesOfMyType.size());
            moveIndex2 = 0;
            int rng = random.nextInt(100) + 1;
            if (rng <= oneMovePercent) {
                card.setMove1(movesOfMyType.get(moveIndex1));
                card.setMove2(null);
                continue;
            }
            boolean isSameMove = true;
            int moveID1 = movesOfMyType.get(moveIndex1).getMoveID();
            int moveID2 = 0;
            while (isSameMove) {
                if (gameData.getMoveMap().get(moveID1) instanceof PokemonPower) {
                    movesOfMyType = movesOfMyType.stream().filter(UsableMove.class::isInstance).collect(Collectors.toList());
                }
                moveIndex2 = random.nextInt(movesOfMyType.size());
                moveID2 = movesOfMyType.get(moveIndex2).getMoveID();
                String move1Name = gameData.getMoveMap().get(moveID1).getName();
                String move2Name = gameData.getMoveMap().get(moveID2).getName();
                if (moveID1 != moveID2 && !move1Name.equals(move2Name)) {
                    isSameMove = false;
                }
            }
            if (moveID1 > moveID2) { //Make sure Pokemon Powers are move slot #1 always
                card.setMove1(gameData.getMoveMap().get(moveID1));
                card.setMove2(gameData.getMoveMap().get(moveID2));
            } else {
                card.setMove1(gameData.getMoveMap().get(moveID2));
                card.setMove2(gameData.getMoveMap().get(moveID1));
            } //TODO why can we still get duplicates with this method
        }
    }

    //TODO we might need to bias this in some way?
    private static void randomizeMovesSameNumber(GameData gameData, Random random) {
        int moveID1;
        int moveID2;
        int firstPokemonPowerID = gameData.getAllPokemonPowers().stream().mapToInt(PokemonPower::getMoveID).min().orElse(0);
        int moveCount = gameData.getAllMoves().size();
        for (PokemonCard card : gameData.getAllPokemonCards()) {
            if (card.getNumberOfMoves() == 1) {
                moveID1 = random.nextInt(firstPokemonPowerID - 1) + 1; //Pick a non-Pokemon Power since they only get 1 move
                card.setMove1(gameData.getMoveMap().get(moveID1));
                continue;
            }
            moveID1 = random.nextInt(moveCount) + 1;
            moveID2 = 0;
            boolean isSameMove = true;
            while (isSameMove) {
                if (gameData.getMoveMap().get(moveID1) instanceof PokemonPower) {
                    moveID2 = random.nextInt(firstPokemonPowerID - 1) + 1;
                } else {
                    moveID2 = random.nextInt(moveCount) + 1;
                }
                if (moveID1 != moveID2 && !gameData.getMoveMap().get(moveID1).getName().equals(gameData.getMoveMap().get(moveID2).getName())) {
                    isSameMove = false;
                }
            }
            if (moveID1 > moveID2) {
                card.setMove1(gameData.getMoveMap().get(moveID1));
                card.setMove2(gameData.getMoveMap().get(moveID2));
            } else {
                card.setMove1(gameData.getMoveMap().get(moveID2));
                card.setMove2(gameData.getMoveMap().get(moveID1));
            }
        }
    }

    //TODO we might need to bias this in some way??
    private static void randomizeAllMoves(GameData gameData, Random random, int oneMovePercent) {
        int moveID1;
        int moveID2;
        int firstPokemonPowerID = gameData.getAllPokemonPowers().stream().mapToInt(PokemonPower::getMoveID).min().orElse(0);
        int moveCount = gameData.getAllMoves().size();
        for (PokemonCard card : gameData.getAllPokemonCards()) {
            moveID1 = random.nextInt(moveCount) + 1;
            moveID2 = 0;
            int rng = random.nextInt(100) + 1;
            if (rng <= oneMovePercent) {
                card.setMove1(gameData.getMoveMap().get(moveID1));
                card.setMove2(null);
                continue;
            }
            boolean isSameMove = true;
            while (isSameMove) {
                if (gameData.getMoveMap().get(moveID1) instanceof PokemonPower) {
                    moveID2 = random.nextInt(firstPokemonPowerID - 1) + 1;
                } else {
                    moveID2 = random.nextInt(moveCount) + 1;
                }
                if (moveID1 != moveID2 && !gameData.getMoveMap().get(moveID1).getName().equals(gameData.getMoveMap().get(moveID2).getName())) {
                    isSameMove = false;
                }
            }
            if (moveID1 > moveID2) {
                card.setMove1(gameData.getMoveMap().get(moveID1));
                card.setMove2(gameData.getMoveMap().get(moveID2));
            } else {
                card.setMove1(gameData.getMoveMap().get(moveID2));
                card.setMove2(gameData.getMoveMap().get(moveID1));
            }
        }
    }
}
