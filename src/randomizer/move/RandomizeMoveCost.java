package randomizer.move;

import constants.Type;
import constants.settings.MoveCostEnum;
import game.elements.*;

import java.util.Random;

public class RandomizeMoveCost {

    public static void randomizeMoveCost(GameData gameData, Random random, MoveCostEnum moveCostEnum) {
        switch (moveCostEnum) {
            case RANDOM:
                randomizeMoveCosts(gameData, random);
                break;
            case RANDOM_PRESERVE_MOVE_TYPE:
                randomizeMoveCostsPreserveMoveType(gameData, random);
                break;
            case RANDOM_PRESERVE_TOTAL_COST:
                randomizeMoveCostsPreserveTotalCost(gameData, random);
                break;
            case RANDOM_PRESERVE_TOTAL_COST_AND_TYPE:
                randomizeMoveCostsPreserveTotalCostAndType(gameData, random);
                break;
            default:
        }
    }

    private static void randomizeMoveCostsPreserveMoveType(GameData gameData, Random random) {
        for (UsableMove move : gameData.getAllUsableMoves()) {
            int cost = random.nextInt(4) + 1;
            Type type;
            switch (move.getMoveCost().toString().charAt(0)) {
                case 'F':
                    type = Type.FIRE;
                    break;
                case 'W':
                    type = Type.WATER;
                    break;
                case 'E':
                    type = Type.ELECTRIC;
                    break;
                case 'D':
                    type = Type.FIGHTING;
                    break;
                case 'P':
                    type = Type.PSYCHIC;
                    break;
                case 'G':
                    type = Type.GRASS;
                    break;
                default:
                    type = Type.COLORLESS;
                    break;
            }
            move.setMoveCost(new MoveCost(cost, random, type));
            gameData.getMoveMap().put(move.getMoveID(), move);
        }
    }

    private static void randomizeMoveCostsPreserveTotalCostAndType(GameData gameData, Random random) {
        for (UsableMove move : gameData.getAllUsableMoves()) {
            int cost = move.getMoveCost().toString().length();
            Type type;
            switch (move.getMoveCost().toString().charAt(0)) {
                case 'F':
                    type = Type.FIRE;
                    break;
                case 'W':
                    type = Type.WATER;
                    break;
                case 'E':
                    type = Type.ELECTRIC;
                    break;
                case 'D':
                    type = Type.FIGHTING;
                    break;
                case 'P':
                    type = Type.PSYCHIC;
                    break;
                case 'G':
                    type = Type.GRASS;
                    break;
                default:
                    type = Type.COLORLESS;
                    break;
            }
            move.setMoveCost(new MoveCost(cost, random, type));
            gameData.getMoveMap().put(move.getMoveID(), move);
        }
    }

    private static void randomizeMoveCostsPreserveTotalCost(GameData gameData, Random random) {
        for (UsableMove move : gameData.getAllUsableMoves()) {
            int cost = move.getMoveCost().toString().length();
            int rng = random.nextInt(6) + 1;
            switch (rng) {
                case 1:
                    move.setMoveCost(new MoveCost(cost, random, Type.FIRE));
                    break;
                case 2:
                    move.setMoveCost(new MoveCost(cost, random, Type.WATER));
                    break;
                case 3:
                    move.setMoveCost(new MoveCost(cost, random, Type.ELECTRIC));
                    break;
                case 4:
                    move.setMoveCost(new MoveCost(cost, random, Type.FIGHTING));
                    break;
                case 5:
                    move.setMoveCost(new MoveCost(cost, random, Type.PSYCHIC));
                    break;
                default:
                    move.setMoveCost(new MoveCost(cost, random, Type.GRASS));
                    break;
            }
            gameData.getMoveMap().put(move.getMoveID(), move);
        }
    }

    private static void randomizeMoveCosts(GameData gameData, Random random) {
        for (UsableMove move : gameData.getAllUsableMoves()) {
            int cost = random.nextInt(4) + 1;
            int rng = random.nextInt(6) + 1;
            switch (rng) {
                case 1:
                    move.setMoveCost(new MoveCost(cost, random, Type.FIRE));
                    break;
                case 2:
                    move.setMoveCost(new MoveCost(cost, random, Type.WATER));
                    break;
                case 3:
                    move.setMoveCost(new MoveCost(cost, random, Type.ELECTRIC));
                    break;
                case 4:
                    move.setMoveCost(new MoveCost(cost, random, Type.FIGHTING));
                    break;
                case 5:
                    move.setMoveCost(new MoveCost(cost, random, Type.PSYCHIC));
                    break;
                default:
                    move.setMoveCost(new MoveCost(cost, random, Type.GRASS));
                    break;
            }
            gameData.getMoveMap().put(move.getMoveID(), move);
        }
    }
}
