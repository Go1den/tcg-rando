package game.elements;

import constants.Gender;
import constants.Type;
import game.elements.card.Card;
import game.elements.card.EnergyCard;
import game.elements.card.PokemonCard;
import game.elements.card.TrainerCard;

import java.util.*;

import static java.util.Collections.EMPTY_LIST;
import static java.util.Collections.singletonList;

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
        moveMap.put(31, new Move(31, new MoveCost("**"), "Supersonic", 0, 1, 2, 0));
        moveMap.put(32, new Move(32, new MoveCost("G*"), "Leech Life", 10, 1, 2, 0));
        moveMap.put(33, new Move(33, new MoveCost("***"), "Wing Attack", 30, 2, 2, 0));
        moveMap.put(34, new Move(34, new MoveCost("GG*"), "Leech Life", 20, 2, 2, 0));
        moveMap.put(35, new Move(35, new MoveCost("G"), "Stun Spore", 10, 1, 3, 0));
        moveMap.put(36, new Move(36, new MoveCost("GG"), "Sprout", 0, 1, 3, 0)); //might be complicated to shuffle as it searches for pokemon with same name?
        moveMap.put(37, new Move(37, new MoveCost("G"), "Poisonpowder", 0, 2, 3, 0));
        moveMap.put(38, new Move(38, new MoveCost("GG"), "Foul Odor", 20, 2, 3, 0));
        moveMap.put(39, new Move(39, new MoveCost("GGG"), "Petal Dance", 40, 3, 3, 3));
        moveMap.put(40, new Move(40, new MoveCost("**"), "Scratch", 20, 1, 2, 0));
        moveMap.put(41, new Move(41, new MoveCost("GG"), "Spore", 0, 1, 2, 0));
        moveMap.put(42, new Move(42, new MoveCost("GG"), "Spore", 0, 2, 2, 0));
        moveMap.put(43, new Move(43, new MoveCost("***"), "Slash", 30, 2, 2, 0));
        moveMap.put(44, new Move(44, new MoveCost("G"), "Stun Spore", 10, 1, 2, 0));
        moveMap.put(45, new Move(45, new MoveCost("G*"), "Leech Life", 10, 1, 2, 0));
        moveMap.put(46, new Move(46, new MoveCost("GG"), "Venom Powder", 10, 2, 2, 0));
        moveMap.put(47, new Move(47, new MoveCost("G"), "Vine Whip", 10, 1, 3, 0));
        moveMap.put(48, new Move(48, new MoveCost("G"), "Call For Family", 0, 1, 3, 0));
        moveMap.put(49, new Move(49, new MoveCost("G"), "Poisonpowder", 10, 2, 3, 0));
        moveMap.put(50, new Move(50, new MoveCost("GG"), "Razor Leaf", 30, 2, 3, 0));
        moveMap.put(51, new Move(51, new MoveCost("G"), "Lure", 0, 3, 3, 0));
        moveMap.put(52, new Move(52, new MoveCost("GG"), "Acid", 20, 3, 3, 0));
        moveMap.put(53, new Move(53, new MoveCost("*"), "Nasty Goo", 10, 1, 2, 0));
        moveMap.put(54, new Move(54, new MoveCost("G"), "Minimize", 0, 1, 2, 0));
        moveMap.put(55, new Move(55, new MoveCost("GGG"), "Sludge", 30, 2, 2, 0));
        moveMap.put(56, new Move(56, new MoveCost("P"), "Hypnosis", 0, 1, 2, 0));
        moveMap.put(57, new Move(57, new MoveCost("GG"), "Leech Seed", 20, 1, 2, 0));
        moveMap.put(58, new Move(58, new MoveCost("P"), "Teleport", 0, 2, 2, 0));
        moveMap.put(59, new Move(59, new MoveCost("*"), "Big Eggsplosion", 20, 2, 2, 0)); //coinFlips is X = energy on Exeggutor
        moveMap.put(60, new Move(60, new MoveCost("GG"), "Foul Gas", 10, 1, 2, 0));
        moveMap.put(61, new Move(61, new MoveCost("GG"), "Smog", 20, 2, 2, 0));
        moveMap.put(62, new Move(62, new MoveCost("GG*"), "Selfdestruct", 60, 2, 2, 0));
        moveMap.put(63, new Move(63, new MoveCost("G*"), "Bind", 20, 1, 1, 0));
        moveMap.put(64, new Move(64, new MoveCost("GGG"), "Poisonpowder", 20, 1, 1, 0));
        moveMap.put(65, new Move(65, new MoveCost("G"), "Stun Spore", 10, 1, 1, 0));
        moveMap.put(66, new Move(66, new MoveCost("GG*"), "Poison Whip", 10, 1, 1, 0));
        moveMap.put(67, new Move(67, new MoveCost("G"), "Swords Dance", 0, 1, 1, 0));
        moveMap.put(68, new Move(68, new MoveCost("***"), "Slash", 30, 1, 1, 0));
        moveMap.put(69, new Move(69, new MoveCost("GG"), "Irongrip", 20, 1, 1, 0));
        moveMap.put(70, new Move(70, new MoveCost("GG**"), "Guillotine", 50, 1, 1, 0));
        moveMap.put(71, new Move(71, new MoveCost("*"), "Scratch", 10, 1, 3, 0));
        moveMap.put(72, new Move(72, new MoveCost("F*"), "Ember", 30, 1, 3, 0));
        moveMap.put(73, new Move(73, new MoveCost("***"), "Slash", 30, 2, 3, 0));
        moveMap.put(74, new Move(74, new MoveCost("FF*"), "Flamethrower", 50, 2, 3, 0));
        moveMap.put(75, new Move(75, new MoveCost("FFFF"), "Fire Spin", 100, 3, 3, 0));
        moveMap.put(76, new Move(76, new MoveCost("FF"), "Confuse Ray", 10, 1, 2, 0));
        moveMap.put(77, new Move(77, new MoveCost("**"), "Lure", 0, 2, 2, 0));
        moveMap.put(78, new Move(78, new MoveCost("FFFF"), "Fire Blast", 80, 2, 2, 0));
        moveMap.put(79, new Move(79, new MoveCost("FF"), "Mix-Up", 0, 2, 2, 0));
        moveMap.put(80, new Move(80, new MoveCost("FFF"), "Dancing Embers", 10, 2, 2, 8));
        moveMap.put(81, new Move(81, new MoveCost("F*"), "Flare", 20, 1, 2, 0));
        moveMap.put(82, new Move(82, new MoveCost("**"), "Quick Attack", 10, 2, 2, 0));
        moveMap.put(83, new Move(83, new MoveCost("FF"), "Flames of Rage", 40, 2, 2, 0));
        moveMap.put(84, new Move(84, new MoveCost("FF*"), "Flamethrower", 50, 2, 2, 0));
        moveMap.put(85, new Move(85, new MoveCost("FF**"), "Take Down", 80, 2, 2, 0));
        moveMap.put(86, new Move(86, new MoveCost("**"), "Smash Kick", 20, 1, 2, 0));
        moveMap.put(87, new Move(87, new MoveCost("FF"), "Flame Tail", 30, 1, 2, 0));
        moveMap.put(88, new Move(88, new MoveCost("**"), "Stomp", 20, 1, 2, 0));
        moveMap.put(89, new Move(89, new MoveCost("FF*"), "Agility", 30, 1, 2, 0));
        moveMap.put(90, new Move(90, new MoveCost("FF"), "Fire Punch", 30, 1, 1, 0));
        moveMap.put(91, new Move(91, new MoveCost("FF*"), "Flamethrower", 50, 1, 1, 0));
        moveMap.put(92, new Move(92, new MoveCost("F"), "Smokescreen", 10, 1, 1, 0));
        moveMap.put(93, new Move(93, new MoveCost("FF"), "Smog", 20, 1, 1, 0));
        moveMap.put(94, new Move(94, new MoveCost("***"), "Bite", 30, 2, 2, 0));
        moveMap.put(95, new Move(95, new MoveCost("***"), "Rage", 10, 2, 2, 0));
        moveMap.put(96, new Move(96, new MoveCost("**"), "Quick Attack", 10, 2, 2, 0));
        moveMap.put(97, new Move(97, new MoveCost("FF**"), "Flamethrower", 60, 2, 2, 0));
        moveMap.put(98, new Move(98, new MoveCost("F"), "Wildfire", 0, 1, 1, 0));
        moveMap.put(99, new Move(99, new MoveCost("FFFF"), "Dive Bomb", 80, 1, 1, 0));
        moveMap.put(100, new Move(100, new MoveCost("FFF"), "Dive Bomb", 70, 1, 1, 0));
        moveMap.put(101, new Move(101, new MoveCost("W"), "Bubble", 10, 1, 3, 0));
        moveMap.put(102, new Move(102, new MoveCost("W*"), "Withdraw", 0, 1, 3, 0));
        moveMap.put(103, new Move(103, new MoveCost("W*"), "Withdraw", 0, 2, 3, 0));
        moveMap.put(104, new Move(104, new MoveCost("W**"), "Bite", 40, 2, 3, 0));
        moveMap.put(105, new Move(105, new MoveCost("WWW"), "Hydro Pump", 40, 3, 3, 0));
        moveMap.put(106, new Move(106, new MoveCost("P"), "Headache", 0, 1, 2, 0));
        moveMap.put(107, new Move(107, new MoveCost("W"), "Fury Swipes", 10, 1, 2, 3));
        moveMap.put(108, new Move(108, new MoveCost("P"), "Psyshock", 10, 2, 2, 0));
        moveMap.put(109, new Move(109, new MoveCost("WW*"), "Hyper Beam", 20, 2, 2, 0));
        moveMap.put(110, new Move(110, new MoveCost("W"), "Water Gun", 10, 1, 3, 0));
        moveMap.put(111, new Move(111, new MoveCost("WW"), "Amnesia", 0, 2, 3, 0));
        moveMap.put(112, new Move(112, new MoveCost("WW*"), "Doubleslap", 30, 2, 3, 2));
        moveMap.put(113, new Move(113, new MoveCost("WW*"), "Water Gun", 30, 3, 3, 0));
        moveMap.put(114, new Move(114, new MoveCost("WW**"), "Whirlpool", 40, 3, 3, 0));
    }

    //TODO pokemon powers might need to be listed as moves?

    private void populateDuelistMap() {
        duelistMap.put(1, new Duelist(1, "Ronald", "Legendary", EMPTY_LIST, null, Gender.MALE, 6, true));
        duelistMap.put(2, new Duelist(2, "Ronald", "Legendary", EMPTY_LIST, null, Gender.MALE, 6, true));
        duelistMap.put(3, new Duelist(3, "Ronald", "Legendary", EMPTY_LIST, null, Gender.MALE, 6, true));
    }

    private void populateCardMap() {
        cardMap.put(1, new EnergyCard(1, "01", "Grass Energy"));
        cardMap.put(2, new EnergyCard(2, "02", "Fire Energy"));
        cardMap.put(3, new EnergyCard(3, "03", "Water Energy"));
        cardMap.put(4, new EnergyCard(4, "04", "Lightning Energy"));
        cardMap.put(5, new EnergyCard(5, "05", "Fighting Energy"));
        cardMap.put(6, new EnergyCard(6, "06", "Psychic Energy"));
        cardMap.put(7, new EnergyCard(7, "07", "Double Colorless Energy"));
        cardMap.put(8, new PokemonCard(8, "08", "Bulbasaur", 13, 1, 40, moveMap.get(1), null, Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(9), false));
        cardMap.put(9, new PokemonCard(9, "09", "Ivysaur", 20, 2, 60, moveMap.get(2), moveMap.get(3), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("*"), singletonList(8), Arrays.asList(10, 11), false));
        cardMap.put(10, new PokemonCard(10, "0A", "Venusaur", 64, 3, 100, moveMap.get(4), null, Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("**"), singletonList(9), EMPTY_LIST, false));
        cardMap.put(11, new PokemonCard(11, "OB", "Venusaur", 67, 3, 100, moveMap.get(5), null, Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("**"), singletonList(9), EMPTY_LIST, false));
        cardMap.put(12, new PokemonCard(12, "0C", "Caterpie", 13, 1, 40, moveMap.get(6), null, Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(13), false));
        cardMap.put(13, new PokemonCard(13, "0D", "Metapod", 21, 2, 70, moveMap.get(7), moveMap.get(8), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("**"), singletonList(12), singletonList(14), false));
        cardMap.put(14, new PokemonCard(14, "0E", "Butterfree", 28, 3, 70, moveMap.get(9), moveMap.get(10), Type.GRASS, Type.FIRE, Type.FIGHTING, new MoveCost(), singletonList(13), EMPTY_LIST, false));
        cardMap.put(15, new PokemonCard(15, "OF", "Weedle", 12, 1, 40, moveMap.get(11), null, Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(16), false));
        cardMap.put(16, new PokemonCard(16, "10", "Kakuna", 23, 2, 80, moveMap.get(12), moveMap.get(13), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("**"), singletonList(15), singletonList(17), false));
        cardMap.put(17, new PokemonCard(17, "11", "Beedrill", 32, 3, 80, moveMap.get(14), moveMap.get(15), Type.GRASS, Type.FIRE, Type.FIGHTING, new MoveCost(), singletonList(16), EMPTY_LIST, false));
        cardMap.put(18, new PokemonCard(18, "12", "Ekans", 10, 1, 40, moveMap.get(16), moveMap.get(17), Type.GRASS, Type.PSYCHIC, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(19), false));
        cardMap.put(19, new PokemonCard(19, "13", "Arbok", 27, 2, 60, moveMap.get(18), moveMap.get(19), Type.GRASS, Type.PSYCHIC, Type.NONE, new MoveCost("**"), singletonList(18), EMPTY_LIST, false));
        cardMap.put(20, new PokemonCard(20, "14", "Nidoran♀", 13, 1, 60, moveMap.get(20), moveMap.get(21), Type.GRASS, Type.PSYCHIC, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(21), false));
        cardMap.put(21, new PokemonCard(21, "15", "Nidorina", 24, 2, 70, moveMap.get(22), moveMap.get(23), Type.GRASS, Type.PSYCHIC, Type.NONE, new MoveCost("*"), singletonList(20), singletonList(22), false));
        cardMap.put(22, new PokemonCard(22, "16", "Nidoqueen", 43, 3, 90, moveMap.get(24), moveMap.get(25), Type.GRASS, Type.PSYCHIC, Type.NONE, new MoveCost("***"), singletonList(21), EMPTY_LIST, false));
        cardMap.put(23, new PokemonCard(23, "17", "Nidoran♂", 20, 1, 40, moveMap.get(26), null, Type.GRASS, Type.PSYCHIC, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(24), false));
        cardMap.put(24, new PokemonCard(24, "18", "Nidorino", 25, 2, 60, moveMap.get(27), moveMap.get(28), Type.GRASS, Type.PSYCHIC, Type.NONE, new MoveCost("*"), singletonList(23), singletonList(25), false));
        cardMap.put(25, new PokemonCard(25, "19", "Nidoking", 48, 3, 90, moveMap.get(29), moveMap.get(30), Type.GRASS, Type.PSYCHIC, Type.NONE, new MoveCost("***"), singletonList(24), EMPTY_LIST, false));
        cardMap.put(26, new PokemonCard(26, "1A", "Zubat", 10, 1, 40, moveMap.get(31), moveMap.get(32), Type.GRASS, Type.PSYCHIC, Type.FIGHTING, new MoveCost(), EMPTY_LIST, singletonList(27), false));
        cardMap.put(27, new PokemonCard(27, "1B", "Golbat", 29, 2, 60, moveMap.get(33), moveMap.get(34), Type.GRASS, Type.PSYCHIC, Type.FIGHTING, new MoveCost(), singletonList(26), EMPTY_LIST, false));
        cardMap.put(28, new PokemonCard(28, "1C", "Oddish", 8, 1, 50, moveMap.get(35), moveMap.get(36), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(29), false));
        cardMap.put(29, new PokemonCard(29, "1D", "Gloom", 22, 2, 60, moveMap.get(37), moveMap.get(38), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("*"), singletonList(28), singletonList(30), false));
        cardMap.put(30, new PokemonCard(30, "1E", "Vileplume", 35, 3, 80, moveMap.get(39), null, Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("**"), singletonList(29), EMPTY_LIST, false));
        cardMap.put(31, new PokemonCard(31, "1F", "Paras", 8, 1, 40, moveMap.get(40), moveMap.get(41), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(32), false));
        cardMap.put(32, new PokemonCard(32, "20", "Parasect", 28, 2, 60, moveMap.get(42), moveMap.get(43), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("*"), singletonList(31), EMPTY_LIST, false));
        cardMap.put(33, new PokemonCard(33, "21", "Venonat", 12, 1, 40, moveMap.get(44), moveMap.get(45), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(34), false));
        cardMap.put(34, new PokemonCard(34, "22", "Venomoth", 28, 2, 70, moveMap.get(46), null, Type.GRASS, Type.FIRE, Type.FIGHTING, new MoveCost(), singletonList(33), EMPTY_LIST, false));
        cardMap.put(35, new PokemonCard(35, "23", "Bellsprout", 11, 1, 40, moveMap.get(47), moveMap.get(48), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(36), false));
        cardMap.put(36, new PokemonCard(36, "24", "Weepinbell", 28, 2, 70, moveMap.get(49), moveMap.get(50), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("*"), singletonList(35), singletonList(37), false));
        cardMap.put(37, new PokemonCard(37, "25", "Victreebel", 42, 3, 80, moveMap.get(51), moveMap.get(52), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("**"), singletonList(36), EMPTY_LIST, false));
        cardMap.put(38, new PokemonCard(38, "26", "Grimer", 17, 1, 50, moveMap.get(53), moveMap.get(54), Type.GRASS, Type.PSYCHIC, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(39), false));
        cardMap.put(39, new PokemonCard(39, "27", "Muk", 34, 2, 70, moveMap.get(55), null, Type.GRASS, Type.PSYCHIC, Type.NONE, new MoveCost("**"), singletonList(38), EMPTY_LIST, false));
        cardMap.put(40, new PokemonCard(40, "28", "Exeggcute", 14, 1, 50, moveMap.get(56), moveMap.get(57), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(41), false));
        cardMap.put(41, new PokemonCard(41, "29", "Exeggutor", 35, 2, 80, moveMap.get(58), moveMap.get(59), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("***"), singletonList(40), EMPTY_LIST, false));
        cardMap.put(42, new PokemonCard(42, "2A", "Koffing", 13, 1, 50, moveMap.get(60), null, Type.GRASS, Type.PSYCHIC, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(43), false));
        cardMap.put(43, new PokemonCard(43, "2B", "Weezing", 27, 2, 60, moveMap.get(61), moveMap.get(62), Type.GRASS, Type.PSYCHIC, Type.NONE, new MoveCost("*"), singletonList(42), EMPTY_LIST, false));
        cardMap.put(44, new PokemonCard(44, "2C", "Tangela", 8, 1, 50, moveMap.get(63), moveMap.get(64), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("**"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(45, new PokemonCard(45, "2D", "Tangela", 12, 1, 50, moveMap.get(65), moveMap.get(66), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("**"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(46, new PokemonCard(46, "2E", "Scyther", 25, 1, 70, moveMap.get(67), moveMap.get(68), Type.GRASS, Type.FIRE, Type.FIGHTING, new MoveCost(), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(47, new PokemonCard(47, "2F", "Pinsir", 24, 1, 60, moveMap.get(69), moveMap.get(70), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("*"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(48, new PokemonCard(48, "30", "Charmander", 10, 1, 50, moveMap.get(71), moveMap.get(72), Type.FIRE, Type.WATER, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(49), false));
        cardMap.put(49, new PokemonCard(49, "31", "Charmeleon", 32, 2, 80, moveMap.get(73), moveMap.get(74), Type.FIRE, Type.WATER, Type.NONE, new MoveCost("*"), singletonList(48), singletonList(50), false));
        cardMap.put(50, new PokemonCard(50, "32", "Charizard", 76, 3, 120, moveMap.get(75), null, Type.FIRE, Type.WATER, Type.FIGHTING, new MoveCost("***"), singletonList(49), EMPTY_LIST, false));
        cardMap.put(51, new PokemonCard(51, "33", "Vulpix", 11, 1, 50, moveMap.get(76), null, Type.FIRE, Type.WATER, Type.NONE, new MoveCost("*"), EMPTY_LIST, Arrays.asList(52, 53), false));
        cardMap.put(52, new PokemonCard(52, "34", "Ninetales", 32, 2, 80, moveMap.get(77), moveMap.get(78), Type.FIRE, Type.WATER, Type.NONE, new MoveCost("*"), singletonList(51), EMPTY_LIST, false));
        cardMap.put(53, new PokemonCard(53, "35", "Ninetales", 35, 2, 80, moveMap.get(79), moveMap.get(80), Type.FIRE, Type.WATER, Type.NONE, new MoveCost("*"), singletonList(51), EMPTY_LIST, false));
        cardMap.put(54, new PokemonCard(54, "36", "Growlithe", 18, 1, 60, moveMap.get(81), null, Type.FIRE, Type.WATER, Type.NONE, new MoveCost("*"), EMPTY_LIST, Arrays.asList(55, 56), false));
        cardMap.put(55, new PokemonCard(55, "37", "Arcanine", 34, 2, 70, moveMap.get(82), moveMap.get(83), Type.FIRE, Type.WATER, Type.NONE, new MoveCost("*"), singletonList(54), EMPTY_LIST, false));
        cardMap.put(56, new PokemonCard(56, "38", "Arcanine", 45, 2, 100, moveMap.get(84), moveMap.get(85), Type.FIRE, Type.WATER, Type.NONE, new MoveCost("***"), singletonList(54), EMPTY_LIST, false));
        cardMap.put(57, new PokemonCard(57, "39", "Ponyta", 10, 1, 40, moveMap.get(86), moveMap.get(87), Type.FIRE, Type.WATER, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(58), false));
        cardMap.put(58, new PokemonCard(58, "3A", "Rapidash", 33, 1, 70, moveMap.get(88), moveMap.get(89), Type.FIRE, Type.WATER, Type.NONE, new MoveCost(), singletonList(57), EMPTY_LIST, false));
        cardMap.put(59, new PokemonCard(59, "3B", "Magmar", 24, 1, 50, moveMap.get(90), moveMap.get(91), Type.FIRE, Type.WATER, Type.NONE, new MoveCost("**"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(60, new PokemonCard(60, "3C", "Magmar", 31, 1, 70, moveMap.get(92), moveMap.get(93), Type.FIRE, Type.WATER, Type.NONE, new MoveCost("*"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(61, new PokemonCard(61, "3D", "Flareon", 22, 2, 60, moveMap.get(94), moveMap.get(95), Type.FIRE, Type.WATER, Type.NONE, new MoveCost("*"), EMPTY_LIST, EMPTY_LIST, false)); //TODO add Eevee to list
        cardMap.put(62, new PokemonCard(62, "3E", "Flareon", 28, 2, 70, moveMap.get(96), moveMap.get(97), Type.FIRE, Type.WATER, Type.NONE, new MoveCost("*"), EMPTY_LIST, EMPTY_LIST, false)); //TODO add Eevee to list
        cardMap.put(63, new PokemonCard(63, "3F", "Moltres", 35, 1, 70, moveMap.get(98), moveMap.get(99), Type.FIRE, Type.NONE, Type.FIGHTING, new MoveCost("**"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(64, new PokemonCard(64, "40", "Moltres", 37, 1, 100, moveMap.get(100), null, Type.FIRE, Type.NONE, Type.FIGHTING, new MoveCost("**"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(65, new PokemonCard(65, "41", "Squirtle", 8, 1, 40, moveMap.get(101), moveMap.get(102), Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(66), false));
        cardMap.put(66, new PokemonCard(66, "42", "Wartortle", 22, 2, 70, moveMap.get(103), moveMap.get(104), Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost("*"), singletonList(65), singletonList(67), false));
        cardMap.put(67, new PokemonCard(67, "43", "Blastoise", 52, 3, 100, moveMap.get(105), null, Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost("***"), singletonList(66), EMPTY_LIST, false));
        cardMap.put(68, new PokemonCard(68, "44", "Psyduck", 15, 1, 50, moveMap.get(106), moveMap.get(107), Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(69), false));
        cardMap.put(69, new PokemonCard(69, "45", "Golduck", 27, 2, 70, moveMap.get(108), moveMap.get(109), Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost("*"), singletonList(68), EMPTY_LIST, false));
        cardMap.put(70, new PokemonCard(70, "46", "Poliwag", 13, 1, 40, moveMap.get(110), null, Type.WATER, Type.GRASS, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(71), false));
        cardMap.put(71, new PokemonCard(71, "47", "Poliwhirl", 28, 2, 60, moveMap.get(111), moveMap.get(112), Type.WATER, Type.GRASS, Type.NONE, new MoveCost("*"), singletonList(70), singletonList(72), false));
        cardMap.put(72, new PokemonCard(72, "48", "Poliwrath", 48, 3, 90, moveMap.get(113), moveMap.get(114), Type.WATER, Type.GRASS, Type.NONE, new MoveCost("***"), singletonList(71), EMPTY_LIST, false));
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
