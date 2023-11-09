package randomizer;

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
            System.out.println(card.getName() + ", " + card.getHp() + "HP");
        }
    }
}
