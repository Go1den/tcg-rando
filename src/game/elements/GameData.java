package game.elements;

import game.elements.card.Card;
import game.elements.card.EnergyCard;
import game.elements.card.TrainerCard;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GameData {

    public GameData() {}

    public List<Move> getAllMoves() {
        return Arrays.asList(
                new Move(),
                new Move()
        );
    }

    public List<Trainer> getAllTrainers() {
        return Arrays.asList(
                new Trainer(),
                new Trainer()
        );
    }

    public List<Card> getAllCards() {
        return Arrays.asList(
                new EnergyCard(1, "01", "Grass Energy"),
                new EnergyCard(2, "02", "Fire Energy"),
                new EnergyCard(3, "03", "Water Energy"),
                new EnergyCard(4, "04", "Lightning Energy"),
                new EnergyCard(5, "05", "Fighting Energy"),
                new EnergyCard(6, "06", "Psychic Energy"),
                new EnergyCard(7, "07", "Double Colorless Energy"),
                new TrainerCard(195, "C3", "Professor Oak", true, false, false, false),
                new TrainerCard(196, "C4", "Imposter Professor Oak", false, true, false, false),
                new TrainerCard(197, "C5", "Bill", true, false, false, false),
                new TrainerCard(198, "C6", "Mr. Fuji", false, false, false, false),
                new TrainerCard(199, "C7", "Lass", false, true, false, false),
                new TrainerCard(200, "C8", "Imakuni?", false, false, false, false),
                new TrainerCard(201, "C9", "Pokemon Trader", false, false, true, false),
                new TrainerCard(202, "CA", "Pokemon Breeder", false, false, false, false),
                new TrainerCard(203, "CB", "Clefairy Doll", false, false, false, false),
                new TrainerCard(204, "CC", "Mysterious Fossil", false, false, false, false),
                new TrainerCard(205, "CD", "Energy Retrieval", false, false, false, false),
                new TrainerCard(206, "CE", "Super Energy Retrieval", false, false, false, false),
                new TrainerCard(207, "CF", "Energy Search", false, false, true, false),
                new TrainerCard(208, "D0", "Energy Removal", false, true, false, false),
                new TrainerCard(209, "D1", "Super Energy Removal", false, true, false, false),
                new TrainerCard(210, "D2", "Switch", false, false, false, false),
                new TrainerCard(211, "D3", "Pokemon Center", false, false, false, true),
                new TrainerCard(212, "D4", "Poke Ball", false, false, true, false),
                new TrainerCard(213, "D5", "Scoop Up", false, false, false, true),
                new TrainerCard(214, "D6", "Computer Search", false, false, true, false),
                new TrainerCard(215, "D7", "Pokedex", false, false, true, false),
                new TrainerCard(216, "D8", "PlusPower", false, false, false, false),
                new TrainerCard(217, "D9", "Defender", false, false, false, false),
                new TrainerCard(218, "DA", "Item Finder", false, false, false, false),
                new TrainerCard(219, "DB", "Gust of Wind", false, true, false, false),
                new TrainerCard(220, "DC", "Devolution Spray", false, false, false, true),
                new TrainerCard(221, "DD", "Potion", false, false, false, true),
                new TrainerCard(222, "DE", "Super Potion", false, false, false, true),
                new TrainerCard(223, "DF", "Full Heal", false, false, false, true),
                new TrainerCard(224, "E0", "Revive", false, false, false, false),
                new TrainerCard(225, "E1", "Maintenance", true, false, false, false),
                new TrainerCard(226, "E2", "Pokemon Flute", false, true, false, false),
                new TrainerCard(227, "E3", "Gambler", true, false, false, false),
                new TrainerCard(228, "E4", "Recycle", false, false, false, false)
        );
    }
}
