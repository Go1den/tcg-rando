package game.elements;

import constants.Gender;
import constants.Type;
import game.elements.card.Card;
import game.elements.card.EnergyCard;
import game.elements.card.PokemonCard;
import game.elements.card.TrainerCard;

import java.util.*;
import java.util.stream.Collectors;

public class GameData {

    private Map<Integer, Move> moveMap = new HashMap<>();
    private Map<Integer, Duelist> duelistMap = new HashMap<>();
    private Map<Integer, Card> cardMap = new HashMap<>();

    public GameData() {
        populateMoveMap();
        populateDuelistMap();
        populateCardMap();
    }

    private void populateMoveMap() {
        moveMap.put(1, new Move(1, new MoveCost("GG"), "Leech Seed", 20, 1, 3, 0));
        moveMap.put(2, new Move(2, new MoveCost("G**"), "Vine Whip", 30, 2, 3, 0));
        moveMap.put(3, new Move(3, new MoveCost("GGG"), "Poisonpowder", 20, 2, 3, 0));
        moveMap.put(4, new Move(4, new MoveCost("GGGG"), "Mega Drain", 40, 3, 3, 0));
        moveMap.put(5, new Move(5, new MoveCost("GGGG"), "Solarbeam", 60, 3, 3, 0));
        moveMap.put(6, new Move(6, new MoveCost("G"), "String Shot", 10, 1, 3, 0));
        moveMap.put(7, new Move(7, new MoveCost("**"), "Stiffen", 0, 2, 3, 0)); //Metapod
        moveMap.put(8, new Move(8, new MoveCost("GG"), "Stun Spore", 20, 2, 3, 0));
        moveMap.put(9, new Move(9, new MoveCost("**"), "Whirlwind", 20, 3, 3, 0));
        moveMap.put(10, new Move(10, new MoveCost("GGGG"), "Mega Drain", 40, 3, 3, 0));
        moveMap.put(11, new Move(11, new MoveCost("G"), "Poison Sting", 10, 1, 3, 0));
        moveMap.put(12, new Move(12, new MoveCost("**"), "Stiffen", 0, 2, 3, 0)); //Kakuna
        moveMap.put(13, new Move(13, new MoveCost("GG"), "Poisonpowder", 20, 2, 3, 0));
        moveMap.put(14, new Move(14, new MoveCost("***"), "Twineedle", 30, 3, 3, 2));
        moveMap.put(15, new Move(15, new MoveCost("GGG"), "Poison Sting", 40, 3, 3, 0));
        moveMap.put(16, new Move(16, new MoveCost("G"), "Spit Poison", 0, 1, 2, 0));
        moveMap.put(17, new Move(17, new MoveCost("G*"), "Wrap", 20, 1, 2, 0));
        moveMap.put(18, new Move(18, new MoveCost("G"), "Terror Strike", 10, 2, 2, 0));
        moveMap.put(19, new Move(19, new MoveCost("GG*"), "Poison Fang", 20, 2, 2, 0));
        moveMap.put(20, new Move(20, new MoveCost("G"), "Fury Swipes", 10, 1, 3, 3));
        moveMap.put(21, new Move(21, new MoveCost("GG"), "Call For Family", 0, 1, 3, 0));
        moveMap.put(22, new Move(22, new MoveCost("G"), "Supersonic", 0, 2, 3, 0));
        moveMap.put(23, new Move(23, new MoveCost("G**"), "Double Kick", 30, 2, 3, 2));
        moveMap.put(24, new Move(24, new MoveCost("G*"), "Boyfriends", 20, 3, 3, 0));
        moveMap.put(25, new Move(25, new MoveCost("GG**"), "Mega Punch", 50, 3, 3, 0));
        moveMap.put(26, new Move(26, new MoveCost("G"), "Horn Hazard", 30, 1, 3, 0));
        moveMap.put(27, new Move(27, new MoveCost("G**"), "Double Kick", 30, 2, 3, 2));
        moveMap.put(28, new Move(28, new MoveCost("GG**"), "Horn Drill", 50, 2, 3, 0));
        moveMap.put(29, new Move(29, new MoveCost("G**"), "Thrash", 30, 3, 3, 0));
        moveMap.put(30, new Move(30, new MoveCost("GGG"), "Toxic", 20, 3, 3, 0));
    }

    private void populateDuelistMap() {
        duelistMap.put(1, new Duelist(1, "Ronald", "Legendary", Collections.EMPTY_LIST, null, Gender.MALE, 6, true));
        duelistMap.put(2, new Duelist(2, "Ronald", "Legendary", Collections.EMPTY_LIST, null, Gender.MALE, 6, true));
        duelistMap.put(3, new Duelist(3, "Ronald", "Legendary", Collections.EMPTY_LIST, null, Gender.MALE, 6, true));
    }

    private void populateCardMap() {
        cardMap.put(1, new EnergyCard(1, "01", "Grass Energy"));
        cardMap.put(2, new EnergyCard(2, "02", "Fire Energy"));
        cardMap.put(3, new EnergyCard(3, "03", "Water Energy"));
        cardMap.put(4, new EnergyCard(4, "04", "Lightning Energy"));
        cardMap.put(5, new EnergyCard(5, "05", "Fighting Energy"));
        cardMap.put(6, new EnergyCard(6, "06", "Psychic Energy"));
        cardMap.put(7, new EnergyCard(7, "07", "Double Colorless Energy"));
        cardMap.put(8, new PokemonCard(8, "08", "Bulbasaur", 13, 1, 40, moveMap.get(1), null, Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("*"), Collections.EMPTY_LIST, Collections.singletonList(9), false));
        cardMap.put(9, new PokemonCard(9, "09", "Ivysaur", 20, 2, 60, moveMap.get(2), moveMap.get(3), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("*"), Collections.singletonList(8), Arrays.asList(10, 11), false));
        cardMap.put(10, new PokemonCard(10, "0A", "Venusaur", 64, 3, 100, moveMap.get(4), null, Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("**"), Collections.singletonList(9), Collections.EMPTY_LIST, false));
        cardMap.put(11, new PokemonCard(11, "OB", "Venusaur", 67, 3, 100, moveMap.get(5), null, Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("**"), Collections.singletonList(9), Collections.EMPTY_LIST, false));
        cardMap.put(12, new PokemonCard(12, "0C", "Caterpie", 13, 1, 40, moveMap.get(6), null, Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("*"), Collections.EMPTY_LIST, Collections.singletonList(13), false));
        cardMap.put(13, new PokemonCard(13, "0D", "Metapod", 21, 2, 70, moveMap.get(7), moveMap.get(8), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("**"), Collections.singletonList(12), Collections.singletonList(14), false));
        cardMap.put(14, new PokemonCard(14, "0E", "Butterfree", 28, 3, 70, moveMap.get(9), moveMap.get(10), Type.GRASS, Type.FIRE, Type.GROUND, new MoveCost(), Collections.singletonList(13), Collections.EMPTY_LIST, false));
        cardMap.put(15, new PokemonCard(15, "OF", "Weedle", 12, 1, 40, moveMap.get(11), null, Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("*"), Collections.EMPTY_LIST, Collections.singletonList(16), false));
        cardMap.put(16, new PokemonCard(16, "10", "Kakuna", 23, 2, 80, moveMap.get(12), moveMap.get(13), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("**"), Collections.singletonList(15), Collections.singletonList(17), false));
        cardMap.put(17, new PokemonCard(17, "11", "Beedrill", 32, 3, 80, moveMap.get(14), moveMap.get(15), Type.GRASS, Type.FIRE, Type.GROUND, new MoveCost(), Collections.singletonList(16), Collections.EMPTY_LIST, false));
        cardMap.put(18, new PokemonCard(18, "12", "Ekans", 10, 1, 40, moveMap.get(16), moveMap.get(17), Type.GRASS, Type.PSYCHIC, Type.NONE, new MoveCost("*"), Collections.EMPTY_LIST, Collections.singletonList(19), false));
        cardMap.put(19, new PokemonCard(19, "13", "Arbok", 27, 2, 60, moveMap.get(18), moveMap.get(19), Type.GRASS, Type.PSYCHIC, Type.NONE, new MoveCost("**"), Collections.singletonList(18), Collections.EMPTY_LIST, false));
        cardMap.put(20, new PokemonCard(20, "14", "Nidoran♀", 13, 1, 60, moveMap.get(20), moveMap.get(21), Type.GRASS, Type.PSYCHIC, Type.NONE, new MoveCost("*"), Collections.EMPTY_LIST, Collections.singletonList(21), false));
        cardMap.put(21, new PokemonCard(21, "15", "Nidorina", 24, 2, 70, moveMap.get(22), moveMap.get(23), Type.GRASS, Type.PSYCHIC, Type.NONE, new MoveCost("*"), Collections.singletonList(20), Collections.singletonList(22), false));
        cardMap.put(22, new PokemonCard(22, "16", "Nidoqueen", 43, 3, 90, moveMap.get(24), moveMap.get(25), Type.GRASS, Type.PSYCHIC, Type.NONE, new MoveCost("***"), Collections.singletonList(21), Collections.EMPTY_LIST, false));
        cardMap.put(23, new PokemonCard(23, "17", "Nidoran♂", 20, 1, 40, moveMap.get(26), null, Type.GRASS, Type.PSYCHIC, Type.NONE, new MoveCost("*"), Collections.EMPTY_LIST, Collections.singletonList(24), false));
        cardMap.put(24, new PokemonCard(24, "18", "Nidorino", 25, 2, 60, moveMap.get(27), moveMap.get(28), Type.GRASS, Type.PSYCHIC, Type.NONE, new MoveCost("*"), Collections.singletonList(23), Collections.singletonList(25), false));
        cardMap.put(25, new PokemonCard(25, "19", "Nidoking", 48, 3, 90, moveMap.get(29), moveMap.get(30), Type.GRASS, Type.PSYCHIC, Type.NONE, new MoveCost("***"), Collections.singletonList(24), Collections.EMPTY_LIST, false));
        cardMap.put(195, new TrainerCard(195, "C3", "Professor Oak", true, false, false, false, false));
        cardMap.put(196, new TrainerCard(196, "C4", "Imposter Professor Oak", false, true, false, false, false));
        cardMap.put(197, new TrainerCard(197, "C5", "Bill", true, false, false, false, false));
        cardMap.put(198, new TrainerCard(198, "C6", "Mr. Fuji", false, false, false, false, false));
        cardMap.put(199, new TrainerCard(199, "C7", "Lass", false, true, false, false, false));
        cardMap.put(200, new TrainerCard(200, "C8", "Imakuni?", false, false, false, false, false));
        cardMap.put(201, new TrainerCard(201, "C9", "Pokemon Trader", false, false, true, false, false));
        cardMap.put(202, new TrainerCard(202, "CA", "Pokemon Breeder", false, false, false, false, true));
        cardMap.put(203, new TrainerCard(203, "CB", "Clefairy Doll", false, false, false, false, false));
        cardMap.put(204, new TrainerCard(204, "CC", "Mysterious Fossil", false, false, false, false, false));
        cardMap.put(205, new TrainerCard(205, "CD", "Energy Retrieval", false, false, false, false, false));
        cardMap.put(206, new TrainerCard(206, "CE", "Super Energy Retrieval", false, false, false, false, false));
        cardMap.put(207, new TrainerCard(207, "CF", "Energy Search", false, false, true, false, false));
        cardMap.put(208, new TrainerCard(208, "D0", "Energy Removal", false, true, false, false, false));
        cardMap.put(209, new TrainerCard(209, "D1", "Super Energy Removal", false, true, false, false, false));
        cardMap.put(210, new TrainerCard(210, "D2", "Switch", false, false, false, false, false));
        cardMap.put(211, new TrainerCard(211, "D3", "Pokemon Center", false, false, false, true, false));
        cardMap.put(212, new TrainerCard(212, "D4", "Poke Ball", false, false, true, false, false));
        cardMap.put(213, new TrainerCard(213, "D5", "Scoop Up", false, false, false, true, false));
        cardMap.put(214, new TrainerCard(214, "D6", "Computer Search", false, false, true, false, false));
        cardMap.put(215, new TrainerCard(215, "D7", "Pokedex", false, false, true, false, false));
        cardMap.put(216, new TrainerCard(216, "D8", "PlusPower", false, false, false, false, false));
        cardMap.put(217, new TrainerCard(217, "D9", "Defender", false, false, false, false, false));
        cardMap.put(218, new TrainerCard(218, "DA", "Item Finder", false, false, true, false, false));
        cardMap.put(219, new TrainerCard(219, "DB", "Gust of Wind", false, true, false, false, false));
        cardMap.put(220, new TrainerCard(220, "DC", "Devolution Spray", false, false, false, true, true));
        cardMap.put(221, new TrainerCard(221, "DD", "Potion", false, false, false, true, false));
        cardMap.put(222, new TrainerCard(222, "DE", "Super Potion", false, false, false, true, false));
        cardMap.put(223, new TrainerCard(223, "DF", "Full Heal", false, false, false, true, false));
        cardMap.put(224, new TrainerCard(224, "E0", "Revive", false, false, false, false, false));
        cardMap.put(225, new TrainerCard(225, "E1", "Maintenance", true, false, false, false, false));
        cardMap.put(226, new TrainerCard(226, "E2", "Pokemon Flute", false, true, false, false, false));
        cardMap.put(227, new TrainerCard(227, "E3", "Gambler", true, false, false, false, false));
        cardMap.put(228, new TrainerCard(228, "E4", "Recycle", false, false, true, false, false));
    }

    public List<Move> getAllMoves() {
        return new ArrayList<>(moveMap.values());
    }

    public List<Duelist> getAllDuelists() {
        return new ArrayList<>(duelistMap.values());
    }

    public List<Card> getAllCards() {
        return new ArrayList<>(cardMap.values());
    }

    public List<PokemonCard> getAllPokemonCards() {
        List<PokemonCard> pokemonCards = new ArrayList<>();
        for (Card card : cardMap.values()) {
            if (card instanceof PokemonCard) {
                pokemonCards.add((PokemonCard) card);
            }
        }
        return pokemonCards;
    }

    public List<TrainerCard> getAllTrainerCards() {
        List<TrainerCard> trainerCards = new ArrayList<>();
        for (Card card : cardMap.values()) {
            if (card instanceof TrainerCard) {
                trainerCards.add((TrainerCard) card);
            }
        }
        return trainerCards;
    }

    public Map<Integer, Move> getMoveMap() {
        return moveMap;
    }

    public Map<Integer, Duelist> getDuelistMap() {
        return duelistMap;
    }

    public Map<Integer, Card> getCardMap() {
        return cardMap;
    }

    public int getMaxEvolution(PokemonCard card) {
        int result = card.getEvolutionStage();
        while (!card.getEvolvesIntoCardIDs().isEmpty()) {
            result++;
            card = (PokemonCard) cardMap.get(card.getEvolvesIntoCardIDs().get(0));
        }
        return result;
    }
}
