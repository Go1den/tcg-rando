package randomizer;

import game.elements.Duelist;
import game.elements.GameData;
import game.elements.Move;
import game.elements.card.PokemonCard;

public class Logger {

    public static void log(GameData gameData, int seed) {
        System.out.println("Spoiler Log");
        System.out.println("Seed: " + seed);
        System.out.println("-----------------");

        System.out.println();
        System.out.println("Moves:");
        System.out.println();
        for (Move move : gameData.getAllMoves()) {
            System.out.println(move.getName()
                    + ", Cost: " + move.getMoveCost().toString());
        }

        System.out.println();
        System.out.println("Pokemon Cards:");
        System.out.println();
        for (PokemonCard card : gameData.getAllPokemonCards()) {
            System.out.println(card.getName()
                    + ", " + card.getHp() + "HP"
                    + ", Type: " + card.getType().getTypeName()
                    + ", Weakness: " + card.getWeakness().getTypeName()
                    + ", Resistance: " + card.getResistance().getTypeName()
                    + ", Retreat Cost: " + card.getRetreatCost().toString());
        }

        System.out.println();
        System.out.println("Duelists:");
        System.out.println();
        for (Duelist duelist : gameData.getAllDuelists()) {
            System.out.println(duelist.getName() + ", " + "Prizes: " + duelist.getPrizes());
        }
    }
}
