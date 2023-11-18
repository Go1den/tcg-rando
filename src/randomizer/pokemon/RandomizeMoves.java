package randomizer.pokemon;

import constants.settings.MoveEnum;
import game.elements.GameData;
import game.elements.PokemonPower;
import game.elements.card.PokemonCard;

import java.util.Random;

public class RandomizeMoves {

    public static void randomizeMoves(GameData gameData, Random random, MoveEnum moveEnum) {
        if (MoveEnum.RANDOM.equals(moveEnum)) {
            randomizeAllMoves(gameData, random);
        }
    }

    private static void randomizeAllMoves(GameData gameData, Random random) {
        int moveID1;
        int moveID2;
        int firstPokemonPowerID = gameData.getAllPokemonPowers().stream().mapToInt(PokemonPower::getMoveID).min().orElse(0);
        int moveCount = gameData.getAllMoves().size();
        for (PokemonCard card : gameData.getAllPokemonCards()) {
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
}
