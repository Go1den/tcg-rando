package randomizer;

import game.elements.Duelist;
import game.elements.GameData;
import game.elements.UsableMove;
import game.elements.card.PokemonCard;

public class Logger {

    public static void logPatchNotes(GameData gameData, int seed) {
        System.out.println("Spoiler Log - Patch Notes");
        System.out.println("Seed: " + seed);
        System.out.println("-----------------");

        GameData originalGameData = new GameData();

        System.out.println();
        System.out.println("Changed Moves:");
        System.out.println();
        for (UsableMove move : gameData.getAllUsableMoves()) {
            UsableMove originalMove = (UsableMove) originalGameData.getMoveMap().get(move.getMoveID());
            if (!originalMove.getMoveCost().toString().equals(move.getMoveCost().toString())) {
                System.out.println(originalMove.getName() + " move cost changed from " + originalMove.getMoveCost().toString() + " to " + move.getMoveCost().toString());
            }
        }

//        System.out.println();
//        System.out.println("Pokemon Cards:");
//        System.out.println();
//        for (PokemonCard card : gameData.getAllPokemonCards()) {
//            System.out.println(card.getName()
//                    + ", " + card.getHp() + "HP"
//                    + ", Type: " + card.getType().getTypeName()
//                    + ", Weakness: " + card.getWeakness().getTypeName()
//                    + ", Resistance: " + card.getResistance().getTypeName()
//                    + ", Retreat Cost: " + card.getRetreatCost().toString());
//        }
//
//        System.out.println();
//        System.out.println("Duelists:");
//        System.out.println();
//        for (Duelist duelist : gameData.getAllDuelists()) {
//            System.out.println(duelist.getName() + ", " + "Prizes: " + duelist.getPrizes());
//        }
    }

    public static void log(GameData gameData, int seed) {
        System.out.println("Spoiler Log");
        System.out.println("Seed: " + seed);
        System.out.println("-----------------");

        System.out.println();
        System.out.println("Moves:");
        System.out.println();
        for (UsableMove move : gameData.getAllUsableMoves()) {
            System.out.println(move.getName()
                    + ", Cost: " + move.getMoveCost().toString());
        }

        System.out.println();
        System.out.println("Pokemon Cards:");
        System.out.println();
        for (PokemonCard card : gameData.getAllPokemonCards()) {
            String move1;
            String move2;
            if (card.getMove1() instanceof UsableMove) {
                move1 = ((UsableMove) card.getMove1()).getMoveCost().toString() + " " + card.getMove1().getName();
            } else {
                move1 = "PKMN POWER " + card.getMove1().getName();
            }
            if (card.getMove2() instanceof UsableMove) {
                move2 = ((UsableMove) card.getMove2()).getMoveCost().toString() + " " + card.getMove2().getName();
            } else {
                if (card.getMove2() != null) {
                    move2 = "PKMN POWER " + card.getMove2().getName();
                } else {
                    move2 = "None";
                }
            }
            System.out.println(card.getName()
                    + ", " + card.getHp() + "HP"
                    + ", Type: " + card.getType().getTypeName()
                    + ", Weakness: " + card.getWeakness().getTypeName()
                    + ", Resistance: " + card.getResistance().getTypeName()
                    + ", Retreat Cost: " + card.getRetreatCost().toString()
                    + ", Move 1: " + move1
                    + ", Move 2: " + move2);
        }

        System.out.println();
        System.out.println("Duelists:");
        System.out.println();
        for (Duelist duelist : gameData.getAllDuelists()) {
            System.out.println(duelist.getName() + ", " + "Prizes: " + duelist.getPrizes());
        }
    }
}
