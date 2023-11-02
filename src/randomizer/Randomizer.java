package randomizer;

import game.elements.card.Card;
import game.elements.GameData;
import game.elements.Move;
import game.elements.Trainer;

import java.util.List;
import java.util.Random;

public class Randomizer {

    public void run(int seed) {
        GameData gameData = new GameData();
        Random random = new Random(seed);
        List<Card> cards = gameData.getAllCards();
        List<Trainer> trainers = gameData.getAllTrainers();
        List<Move> moves = gameData.getAllMoves();
        System.out.println("Pokemon TCG Randomizer. Seed: " + seed + ", First RNG value: " + random.nextInt());
    }
}
