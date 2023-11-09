package randomizer;

import game.elements.Duelist;
import game.elements.GameData;
import game.elements.card.PokemonCard;

public class Logger {

    public static void log(GameData gameData, int seed) {
        System.out.println("Spoiler Log");
        System.out.println("Seed: " + seed);
        System.out.println("-----------------");
        System.out.println("Pokemon Cards:");
        System.out.println();
        for (PokemonCard card : gameData.getAllPokemonCards()) {
            System.out.println(card.getName() + ", " + card.getHp() + "HP, Weakness: " + card.getWeakness().toString()
                    + ", Resistance: " + card.getResistance().toString());
        }

        System.out.println();
        System.out.println("Duelists:");
        System.out.println();
        for (Duelist duelist : gameData.getAllDuelists()) {
            System.out.println(duelist.getName() + ", " + "Prizes: " + duelist.getPrizes());
        }
    }
}
