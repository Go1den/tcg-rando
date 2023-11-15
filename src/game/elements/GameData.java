package game.elements;

import constants.Gender;
import constants.Type;
import game.elements.card.Card;
import game.elements.card.EnergyCard;
import game.elements.card.PokemonCard;
import game.elements.card.TrainerCard;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.EMPTY_LIST;
import static java.util.Collections.singletonList;

public class GameData {

    private Map<Integer, Move> moveMap = new HashMap<>();
    private Map<Integer, Duelist> duelistMap = new HashMap<>();
    private Map<Integer, Card> cardMap = new HashMap<>();
//    private Deck starterDeck1;
//    private Deck starterDeck2;
//    private Deck starterDeck3;

    public GameData() {
        populateMoveMap();
        populateDuelistMap();
        populateCardMap();
//        starterDeck1 = new Deck(Arrays.asList(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5,
//                48, 48, 49, 50, 54, 54, 56, 57, 57, 59, 96, 96, 103, 105, 105, 107, 117, 121, 121, 122, 125, 126, 167,
//                167, 168, 177, 195, 197, 197, 210, 214, 216, 221, 221, 223, 223), "Charmander & Friends");
//        starterDeck2 = new Deck(Arrays.asList(3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6,
//                65, 65, 66, 67, 75, 75, 76, 83, 84, 85, 86, 89, 125, 126, 128, 128, 136, 142, 142, 143, ))
    }

    private void populateMoveMap() {
        moveMap.put(1, new UsableMove(1, new MoveCost("GG"), "Leech Seed", 20, 1, 3, 0));
        moveMap.put(2, new UsableMove(2, new MoveCost("G**"), "Vine Whip", 30, 2, 3, 0));
        moveMap.put(3, new UsableMove(3, new MoveCost("GGG"), "Poisonpowder", 20, 2, 3, 0));
        moveMap.put(4, new UsableMove(4, new MoveCost("GGGG"), "Mega Drain", 40, 3, 3, 0));
        moveMap.put(5, new UsableMove(5, new MoveCost("GGGG"), "Solarbeam", 60, 3, 3, 0));
        moveMap.put(6, new UsableMove(6, new MoveCost("G"), "String Shot", 10, 1, 3, 0));
        moveMap.put(7, new UsableMove(7, new MoveCost("**"), "Stiffen", 0, 2, 3, 0)); //Metapod
        moveMap.put(8, new UsableMove(8, new MoveCost("GG"), "Stun Spore", 20, 2, 3, 0));
        moveMap.put(9, new UsableMove(9, new MoveCost("**"), "Whirlwind", 20, 3, 3, 0));
        moveMap.put(10, new UsableMove(10, new MoveCost("GGGG"), "Mega Drain", 40, 3, 3, 0));
        moveMap.put(11, new UsableMove(11, new MoveCost("G"), "Poison Sting", 10, 1, 3, 0));
        moveMap.put(12, new UsableMove(12, new MoveCost("**"), "Stiffen", 0, 2, 3, 0)); //Kakuna
        moveMap.put(13, new UsableMove(13, new MoveCost("GG"), "Poisonpowder", 20, 2, 3, 0));
        moveMap.put(14, new UsableMove(14, new MoveCost("***"), "Twineedle", 30, 3, 3, 2));
        moveMap.put(15, new UsableMove(15, new MoveCost("GGG"), "Poison Sting", 40, 3, 3, 0));
        moveMap.put(16, new UsableMove(16, new MoveCost("G"), "Spit Poison", 0, 1, 2, 0));
        moveMap.put(17, new UsableMove(17, new MoveCost("G*"), "Wrap", 20, 1, 2, 0));
        moveMap.put(18, new UsableMove(18, new MoveCost("G"), "Terror Strike", 10, 2, 2, 0));
        moveMap.put(19, new UsableMove(19, new MoveCost("GG*"), "Poison Fang", 20, 2, 2, 0));
        moveMap.put(20, new UsableMove(20, new MoveCost("G"), "Fury Swipes", 10, 1, 3, 3));
        moveMap.put(21, new UsableMove(21, new MoveCost("GG"), "Call For Family", 0, 1, 3, 0));
        moveMap.put(22, new UsableMove(22, new MoveCost("G"), "Supersonic", 0, 2, 3, 0));
        moveMap.put(23, new UsableMove(23, new MoveCost("G**"), "Double Kick", 30, 2, 3, 2));
        moveMap.put(24, new UsableMove(24, new MoveCost("G*"), "Boyfriends", 20, 3, 3, 0));
        moveMap.put(25, new UsableMove(25, new MoveCost("GG**"), "Mega Punch", 50, 3, 3, 0));
        moveMap.put(26, new UsableMove(26, new MoveCost("G"), "Horn Hazard", 30, 1, 3, 0));
        moveMap.put(27, new UsableMove(27, new MoveCost("G**"), "Double Kick", 30, 2, 3, 2));
        moveMap.put(28, new UsableMove(28, new MoveCost("GG**"), "Horn Drill", 50, 2, 3, 0));
        moveMap.put(29, new UsableMove(29, new MoveCost("G**"), "Thrash", 30, 3, 3, 0));
        moveMap.put(30, new UsableMove(30, new MoveCost("GGG"), "Toxic", 20, 3, 3, 0));
        moveMap.put(31, new UsableMove(31, new MoveCost("**"), "Supersonic", 0, 1, 2, 0));
        moveMap.put(32, new UsableMove(32, new MoveCost("G*"), "Leech Life", 10, 1, 2, 0));
        moveMap.put(33, new UsableMove(33, new MoveCost("***"), "Wing Attack", 30, 2, 2, 0));
        moveMap.put(34, new UsableMove(34, new MoveCost("GG*"), "Leech Life", 20, 2, 2, 0));
        moveMap.put(35, new UsableMove(35, new MoveCost("G"), "Stun Spore", 10, 1, 3, 0));
        moveMap.put(36, new UsableMove(36, new MoveCost("GG"), "Sprout", 0, 1, 3, 0)); //might be complicated to shuffle as it searches for pokemon with same name?
        moveMap.put(37, new UsableMove(37, new MoveCost("G"), "Poisonpowder", 0, 2, 3, 0));
        moveMap.put(38, new UsableMove(38, new MoveCost("GG"), "Foul Odor", 20, 2, 3, 0));
        moveMap.put(39, new UsableMove(39, new MoveCost("GGG"), "Petal Dance", 40, 3, 3, 3));
        moveMap.put(40, new UsableMove(40, new MoveCost("**"), "Scratch", 20, 1, 2, 0));
        moveMap.put(41, new UsableMove(41, new MoveCost("GG"), "Spore", 0, 1, 2, 0));
        moveMap.put(42, new UsableMove(42, new MoveCost("GG"), "Spore", 0, 2, 2, 0));
        moveMap.put(43, new UsableMove(43, new MoveCost("***"), "Slash", 30, 2, 2, 0));
        moveMap.put(44, new UsableMove(44, new MoveCost("G"), "Stun Spore", 10, 1, 2, 0));
        moveMap.put(45, new UsableMove(45, new MoveCost("G*"), "Leech Life", 10, 1, 2, 0));
        moveMap.put(46, new UsableMove(46, new MoveCost("GG"), "Venom Powder", 10, 2, 2, 0));
        moveMap.put(47, new UsableMove(47, new MoveCost("G"), "Vine Whip", 10, 1, 3, 0));
        moveMap.put(48, new UsableMove(48, new MoveCost("G"), "Call For Family", 0, 1, 3, 0));
        moveMap.put(49, new UsableMove(49, new MoveCost("G"), "Poisonpowder", 10, 2, 3, 0));
        moveMap.put(50, new UsableMove(50, new MoveCost("GG"), "Razor Leaf", 30, 2, 3, 0));
        moveMap.put(51, new UsableMove(51, new MoveCost("G"), "Lure", 0, 3, 3, 0));
        moveMap.put(52, new UsableMove(52, new MoveCost("GG"), "Acid", 20, 3, 3, 0));
        moveMap.put(53, new UsableMove(53, new MoveCost("*"), "Nasty Goo", 10, 1, 2, 0));
        moveMap.put(54, new UsableMove(54, new MoveCost("G"), "Minimize", 0, 1, 2, 0));
        moveMap.put(55, new UsableMove(55, new MoveCost("GGG"), "Sludge", 30, 2, 2, 0));
        moveMap.put(56, new UsableMove(56, new MoveCost("P"), "Hypnosis", 0, 1, 2, 0));
        moveMap.put(57, new UsableMove(57, new MoveCost("GG"), "Leech Seed", 20, 1, 2, 0));
        moveMap.put(58, new UsableMove(58, new MoveCost("P"), "Teleport", 0, 2, 2, 0));
        moveMap.put(59, new UsableMove(59, new MoveCost("*"), "Big Eggsplosion", 20, 2, 2, 0)); //coinFlips is X = energy on Exeggutor
        moveMap.put(60, new UsableMove(60, new MoveCost("GG"), "Foul Gas", 10, 1, 2, 0));
        moveMap.put(61, new UsableMove(61, new MoveCost("GG"), "Smog", 20, 2, 2, 0));
        moveMap.put(62, new UsableMove(62, new MoveCost("GG*"), "Selfdestruct", 60, 2, 2, 0));
        moveMap.put(63, new UsableMove(63, new MoveCost("G*"), "Bind", 20, 1, 1, 0));
        moveMap.put(64, new UsableMove(64, new MoveCost("GGG"), "Poisonpowder", 20, 1, 1, 0));
        moveMap.put(65, new UsableMove(65, new MoveCost("G"), "Stun Spore", 10, 1, 1, 0));
        moveMap.put(66, new UsableMove(66, new MoveCost("GG*"), "Poison Whip", 10, 1, 1, 0));
        moveMap.put(67, new UsableMove(67, new MoveCost("G"), "Swords Dance", 0, 1, 1, 0));
        moveMap.put(68, new UsableMove(68, new MoveCost("***"), "Slash", 30, 1, 1, 0));
        moveMap.put(69, new UsableMove(69, new MoveCost("GG"), "Irongrip", 20, 1, 1, 0));
        moveMap.put(70, new UsableMove(70, new MoveCost("GG**"), "Guillotine", 50, 1, 1, 0));
        moveMap.put(71, new UsableMove(71, new MoveCost("*"), "Scratch", 10, 1, 3, 0));
        moveMap.put(72, new UsableMove(72, new MoveCost("F*"), "Ember", 30, 1, 3, 0));
        moveMap.put(73, new UsableMove(73, new MoveCost("***"), "Slash", 30, 2, 3, 0));
        moveMap.put(74, new UsableMove(74, new MoveCost("FF*"), "Flamethrower", 50, 2, 3, 0));
        moveMap.put(75, new UsableMove(75, new MoveCost("FFFF"), "Fire Spin", 100, 3, 3, 0));
        moveMap.put(76, new UsableMove(76, new MoveCost("FF"), "Confuse Ray", 10, 1, 2, 0));
        moveMap.put(77, new UsableMove(77, new MoveCost("**"), "Lure", 0, 2, 2, 0));
        moveMap.put(78, new UsableMove(78, new MoveCost("FFFF"), "Fire Blast", 80, 2, 2, 0));
        moveMap.put(79, new UsableMove(79, new MoveCost("FF"), "Mix-Up", 0, 2, 2, 0));
        moveMap.put(80, new UsableMove(80, new MoveCost("FFF"), "Dancing Embers", 10, 2, 2, 8));
        moveMap.put(81, new UsableMove(81, new MoveCost("F*"), "Flare", 20, 1, 2, 0));
        moveMap.put(82, new UsableMove(82, new MoveCost("**"), "Quick Attack", 10, 2, 2, 0));
        moveMap.put(83, new UsableMove(83, new MoveCost("FF"), "Flames of Rage", 40, 2, 2, 0));
        moveMap.put(84, new UsableMove(84, new MoveCost("FF*"), "Flamethrower", 50, 2, 2, 0));
        moveMap.put(85, new UsableMove(85, new MoveCost("FF**"), "Take Down", 80, 2, 2, 0));
        moveMap.put(86, new UsableMove(86, new MoveCost("**"), "Smash Kick", 20, 1, 2, 0));
        moveMap.put(87, new UsableMove(87, new MoveCost("FF"), "Flame Tail", 30, 1, 2, 0));
        moveMap.put(88, new UsableMove(88, new MoveCost("**"), "Stomp", 20, 1, 2, 0));
        moveMap.put(89, new UsableMove(89, new MoveCost("FF*"), "Agility", 30, 1, 2, 0));
        moveMap.put(90, new UsableMove(90, new MoveCost("FF"), "Fire Punch", 30, 1, 1, 0));
        moveMap.put(91, new UsableMove(91, new MoveCost("FF*"), "Flamethrower", 50, 1, 1, 0));
        moveMap.put(92, new UsableMove(92, new MoveCost("F"), "Smokescreen", 10, 1, 1, 0));
        moveMap.put(93, new UsableMove(93, new MoveCost("FF"), "Smog", 20, 1, 1, 0));
        moveMap.put(94, new UsableMove(94, new MoveCost("***"), "Bite", 30, 2, 2, 0));
        moveMap.put(95, new UsableMove(95, new MoveCost("***"), "Rage", 10, 2, 2, 0));
        moveMap.put(96, new UsableMove(96, new MoveCost("**"), "Quick Attack", 10, 2, 2, 0));
        moveMap.put(97, new UsableMove(97, new MoveCost("FF**"), "Flamethrower", 60, 2, 2, 0));
        moveMap.put(98, new UsableMove(98, new MoveCost("F"), "Wildfire", 0, 1, 1, 0));
        moveMap.put(99, new UsableMove(99, new MoveCost("FFFF"), "Dive Bomb", 80, 1, 1, 0));
        moveMap.put(100, new UsableMove(100, new MoveCost("FFF"), "Dive Bomb", 70, 1, 1, 0));
        moveMap.put(101, new UsableMove(101, new MoveCost("W"), "Bubble", 10, 1, 3, 0));
        moveMap.put(102, new UsableMove(102, new MoveCost("W*"), "Withdraw", 0, 1, 3, 0));
        moveMap.put(103, new UsableMove(103, new MoveCost("W*"), "Withdraw", 0, 2, 3, 0));
        moveMap.put(104, new UsableMove(104, new MoveCost("W**"), "Bite", 40, 2, 3, 0));
        moveMap.put(105, new UsableMove(105, new MoveCost("WWW"), "Hydro Pump", 40, 3, 3, 0));
        moveMap.put(106, new UsableMove(106, new MoveCost("P"), "Headache", 0, 1, 2, 0));
        moveMap.put(107, new UsableMove(107, new MoveCost("W"), "Fury Swipes", 10, 1, 2, 3));
        moveMap.put(108, new UsableMove(108, new MoveCost("P"), "Psyshock", 10, 2, 2, 0));
        moveMap.put(109, new UsableMove(109, new MoveCost("WW*"), "Hyper Beam", 20, 2, 2, 0));
        moveMap.put(110, new UsableMove(110, new MoveCost("W"), "Water Gun", 10, 1, 3, 0));
        moveMap.put(111, new UsableMove(111, new MoveCost("WW"), "Amnesia", 0, 2, 3, 0));
        moveMap.put(112, new UsableMove(112, new MoveCost("WW*"), "Doubleslap", 30, 2, 3, 2));
        moveMap.put(113, new UsableMove(113, new MoveCost("WW*"), "Water Gun", 30, 3, 3, 0));
        moveMap.put(114, new UsableMove(114, new MoveCost("WW**"), "Whirlpool", 40, 3, 3, 0));
        moveMap.put(115, new UsableMove(115, new MoveCost("W"), "Acid", 10, 1, 2, 0));
        moveMap.put(116, new UsableMove(116, new MoveCost("W"), "Supersonic", 0, 2, 2, 0));
        moveMap.put(117, new UsableMove(117, new MoveCost("WW"), "Jellyfish Sting", 10, 2, 2, 0));
        moveMap.put(118, new UsableMove(118, new MoveCost("W"), "Headbutt", 10, 1, 2, 0));
        moveMap.put(119, new UsableMove(119, new MoveCost("WW*"), "Aurora Beam", 50, 2, 2, 0));
        moveMap.put(120, new UsableMove(120, new MoveCost("WW**"), "Ice Beam", 30, 2, 2, 0));
        moveMap.put(121, new UsableMove(121, new MoveCost("W"), "Supersonic", 0, 1, 2, 0));
        moveMap.put(122, new UsableMove(122, new MoveCost("W"), "Hide In Shell", 0, 1, 2, 0)); //maybe rename to Hide?
        moveMap.put(123, new UsableMove(123, new MoveCost("WW"), "Clamp", 30, 2, 2, 0));
        moveMap.put(124, new UsableMove(124, new MoveCost("WW"), "Spike Cannon", 30, 2, 2, 2));
        moveMap.put(125, new UsableMove(125, new MoveCost("W"), "Call For Family", 0, 1, 2, 0));
        moveMap.put(126, new UsableMove(126, new MoveCost("W*"), "Irongrip", 20, 1, 2, 0));
        moveMap.put(127, new UsableMove(127, new MoveCost("W"), "Flail", 10, 2, 2, 0));
        moveMap.put(128, new UsableMove(128, new MoveCost("WW*"), "Crabhammer", 40, 2, 2, 0));
        moveMap.put(129, new UsableMove(129, new MoveCost("W"), "Smokescreen", 10, 1, 2, 0));
        moveMap.put(130, new UsableMove(130, new MoveCost("W*"), "Water Gun", 20, 2, 2, 0));
        moveMap.put(131, new UsableMove(131, new MoveCost("W**"), "Agility", 20, 2, 2, 0));
        moveMap.put(132, new UsableMove(132, new MoveCost("W"), "Horn Attack", 10, 1, 2, 0));
        moveMap.put(133, new UsableMove(133, new MoveCost("W"), "Horn Attack", 10, 2, 2, 0));
        moveMap.put(134, new UsableMove(134, new MoveCost("W*"), "Waterfall", 30, 2, 2, 0));
        moveMap.put(135, new UsableMove(135, new MoveCost("W"), "Slap", 20, 1, 2, 0));
        moveMap.put(136, new UsableMove(136, new MoveCost("WW"), "Recover", 0, 2, 2, 0));
        moveMap.put(137, new UsableMove(137, new MoveCost("W**"), "Star Freeze", 20, 2, 2, 0));
        moveMap.put(138, new UsableMove(138, new MoveCost("*"), "Tackle", 10, 1, 2, 0));
        moveMap.put(139, new UsableMove(139, new MoveCost("W"), "Flail", 10, 1, 2, 0));
        moveMap.put(140, new UsableMove(140, new MoveCost("WWW"), "Dragon Rage", 50, 2, 2, 0));
        moveMap.put(141, new UsableMove(141, new MoveCost("WWWW"), "Bubblebeam", 40, 2, 2, 0));
        moveMap.put(142, new UsableMove(142, new MoveCost("W"), "Water Gun", 10, 1, 1, 0));
        moveMap.put(143, new UsableMove(143, new MoveCost("WW"), "Confuse Ray", 10, 1, 1, 0));
        moveMap.put(144, new UsableMove(144, new MoveCost("*"), "Focus Energy", 0, 2, 2, 0));
        moveMap.put(145, new UsableMove(145, new MoveCost("***"), "Bite", 30, 2, 2, 0));
        moveMap.put(146, new UsableMove(146, new MoveCost("**"), "Quick Attack", 10, 2, 2, 0));
        moveMap.put(147, new UsableMove(147, new MoveCost("WW*"), "Water Gun", 30, 2, 2, 0));
        moveMap.put(148, new UsableMove(148, new MoveCost("W"), "Water Gun", 10, 2, 3, 0));
        moveMap.put(149, new UsableMove(149, new MoveCost("W*"), "Water Gun", 20, 3, 3, 0));
        moveMap.put(150, new UsableMove(150, new MoveCost("WW"), "Spike Cannon", 30, 3, 3, 2));
        moveMap.put(151, new UsableMove(151, new MoveCost("WWW"), "Freeze Dry", 30, 1, 1, 0));
        moveMap.put(152, new UsableMove(152, new MoveCost("WWWW"), "Blizzard", 50, 1, 1, 0));
        moveMap.put(153, new UsableMove(153, new MoveCost("WWW"), "Ice Breath", 40, 1, 1, 0));
        moveMap.put(154, new UsableMove(154, new MoveCost("*"), "Gnaw", 10, 1, 2, 0));
        moveMap.put(155, new UsableMove(155, new MoveCost("E*"), "Thunder Jolt", 30, 1, 2, 0));
        moveMap.put(156, new UsableMove(156, new MoveCost("EE"), "Spark", 20, 1, 2, 0));
        moveMap.put(157, new UsableMove(157, new MoveCost("*"), "Growl", 0, 1, 2, 0));
        moveMap.put(158, new UsableMove(158, new MoveCost("EE"), "Thundershock", 20, 1, 2, 0));
        moveMap.put(159, new UsableMove(159, new MoveCost("*"), "Growl", 0, 1, 2, 0));
        moveMap.put(160, new UsableMove(160, new MoveCost("EE"), "Thundershock", 20, 1, 2, 0));
        moveMap.put(161, new UsableMove(161, new MoveCost("E"), "Thundershock", 10, 1, 2, 0));
        moveMap.put(162, new UsableMove(162, new MoveCost("***"), "Fly", 30, 1, 2, 0));
        moveMap.put(163, new UsableMove(163, new MoveCost("WW"), "Surf", 30, 1, 2, 0));
        moveMap.put(164, new UsableMove(164, new MoveCost("WW"), "Surf", 30, 1, 2, 0));
        moveMap.put(165, new UsableMove(165, new MoveCost("E**"), "Agility", 20, 2, 2, 0));
        moveMap.put(166, new UsableMove(166, new MoveCost("EEE*"), "Thunder", 60, 2, 2, 0));
        moveMap.put(167, new UsableMove(167, new MoveCost("EEEE"), "Gigashock", 30, 2, 2, 0));
        moveMap.put(168, new UsableMove(168, new MoveCost("E"), "Thunder Wave", 10, 1, 2, 0));
        moveMap.put(169, new UsableMove(169, new MoveCost("E*"), "Selfdestruct", 40, 1, 2, 0));
        moveMap.put(170, new UsableMove(170, new MoveCost("*"), "Tackle", 10, 1, 2, 0));
        moveMap.put(171, new UsableMove(171, new MoveCost("E*"), "Magnetic Storm", 0, 1, 2, 0));
        moveMap.put(172, new UsableMove(172, new MoveCost("EE*"), "Thunder Wave", 30, 2, 2, 0));
        moveMap.put(173, new UsableMove(173, new MoveCost("EE**"), "Selfdestruct", 80, 2, 2, 0));
        moveMap.put(174, new UsableMove(174, new MoveCost("E*"), "Sonicboom", 20, 2, 2, 0));
        moveMap.put(175, new UsableMove(175, new MoveCost("EEEE"), "Selfdestruct", 100, 2, 2, 0));
        moveMap.put(176, new UsableMove(176, new MoveCost("*"), "Tackle", 10, 1, 2, 0));
        moveMap.put(177, new UsableMove(177, new MoveCost("EE"), "Sonicboom", 30, 2, 2, 0));
        moveMap.put(178, new UsableMove(178, new MoveCost("EEE"), "Energy Spike", 0, 2, 2, 0));
        moveMap.put(179, new UsableMove(179, new MoveCost("**"), "Tackle", 20, 2, 2, 0));
        moveMap.put(180, new UsableMove(180, new MoveCost("EEE"), "Chain Lightning", 20, 2, 2, 0));
        moveMap.put(181, new UsableMove(181, new MoveCost("E"), "Light Screen", 0, 1, 1, 0));
        moveMap.put(182, new UsableMove(182, new MoveCost("**"), "Quick Attack", 10, 1, 1, 0));
        moveMap.put(183, new UsableMove(183, new MoveCost("E"), "Thundershock", 10, 1, 1, 0));
        moveMap.put(184, new UsableMove(184, new MoveCost("E*"), "Thunderpunch", 30, 1, 1, 0));
        moveMap.put(185, new UsableMove(185, new MoveCost("**"), "Double Kick", 20, 2, 2, 2));
        moveMap.put(186, new UsableMove(186, new MoveCost("****"), "Stun Needle", 30, 2, 2, 0));
        moveMap.put(187, new UsableMove(187, new MoveCost("**"), "Quick Attack", 10, 2, 2, 0));
        moveMap.put(188, new UsableMove(188, new MoveCost("EE*"), "Pin Missile", 20, 2, 2, 4));
        moveMap.put(189, new UsableMove(189, new MoveCost("EEEE"), "Thunderstorm", 40, 1, 1, 0));
        moveMap.put(190, new UsableMove(190, new MoveCost("EEE*"), "Thunder", 60, 1, 1, 0));
        moveMap.put(191, new UsableMove(191, new MoveCost("EEEE"), "Thunderbolt", 100, 1, 1, 0));
        moveMap.put(192, new UsableMove(192, new MoveCost("EEE"), "Big Thunder", 0, 1, 1, 0)); //70 dmg at random
        moveMap.put(193, new UsableMove(193, new MoveCost("D"), "Sand Attack", 10, 1, 2, 0));
        moveMap.put(194, new UsableMove(194, new MoveCost("**"), "Slash", 20, 2, 2, 0));
        moveMap.put(195, new UsableMove(195, new MoveCost("DD"), "Fury Swipes", 20, 2, 2, 3));
        moveMap.put(196, new UsableMove(196, new MoveCost("D"), "Dig", 10, 1, 2, 0));
        moveMap.put(197, new UsableMove(197, new MoveCost("DD"), "Mud Slap", 30, 1, 2, 0));
        moveMap.put(198, new UsableMove(198, new MoveCost("DD*"), "Slash", 40, 2, 2, 0));
        moveMap.put(199, new UsableMove(199, new MoveCost("DDDD"), "Earthquake", 70, 2, 2, 0));
        moveMap.put(200, new UsableMove(200, new MoveCost("*"), "Scratch", 10, 1, 2, 0));
        moveMap.put(201, new UsableMove(201, new MoveCost("DD"), "Fury Swipes", 20, 2, 2, 3));
        moveMap.put(202, new UsableMove(202, new MoveCost("DD*"), "Tantrum", 50, 2, 2, 0));
        moveMap.put(203, new UsableMove(203, new MoveCost("D"), "Low Kick", 20, 1, 3, 0));
        moveMap.put(204, new UsableMove(204, new MoveCost("DD*"), "Karate Chop", 50, 2, 3, 0));
        moveMap.put(205, new UsableMove(205, new MoveCost("DD**"), "Submission", 60, 2, 3, 0));
        moveMap.put(206, new UsableMove(206, new MoveCost("DDD*"), "Seismic Toss", 60, 3, 3, 0));
        moveMap.put(207, new UsableMove(207, new MoveCost("D*"), "Stone Barrage", 10, 1, 3, 0)); //X flips until tails
        moveMap.put(208, new UsableMove(208, new MoveCost("DD"), "Harden", 0, 2, 3, 0));
        moveMap.put(209, new UsableMove(209, new MoveCost("DD*"), "Rock Throw", 40, 2, 3, 0));
        moveMap.put(210, new UsableMove(210, new MoveCost("DDD*"), "Avalanche", 60, 3, 3, 0));
        moveMap.put(211, new UsableMove(211, new MoveCost("DDDD"), "Selfdestruct", 100, 3, 3, 0));
        moveMap.put(212, new UsableMove(212, new MoveCost("D"), "Rock Throw", 10, 1, 1, 0));
        moveMap.put(213, new UsableMove(213, new MoveCost("DD"), "Harden", 0, 1, 1, 0));
        moveMap.put(214, new UsableMove(214, new MoveCost("DD"), "Snivel", 0, 1, 2, 0));
        moveMap.put(215, new UsableMove(215, new MoveCost("DD"), "Rage", 10, 1, 2, 0));
        moveMap.put(216, new UsableMove(216, new MoveCost("DD"), "Boomerang", 30, 2, 2, 2));
        moveMap.put(217, new UsableMove(217, new MoveCost("DD*"), "Call For Friend", 0, 2, 2, 0));
        moveMap.put(218, new UsableMove(218, new MoveCost("D*"), "Bone Attack", 10, 2, 2, 0));
        moveMap.put(219, new UsableMove(219, new MoveCost("DDD"), "Wail", 0, 2, 2, 0));
        moveMap.put(220, new UsableMove(220, new MoveCost("DD"), "Stretch Kick", 0, 1, 1, 0));
        moveMap.put(221, new UsableMove(221, new MoveCost("DDD"), "High Jump Kick", 50, 1, 1, 0));
        moveMap.put(222, new UsableMove(222, new MoveCost("D"), "Jab", 20, 1, 1, 0));
        moveMap.put(223, new UsableMove(223, new MoveCost("DD*"), "Special Punch", 40, 1, 1, 0));
        moveMap.put(224, new UsableMove(224, new MoveCost("*"), "Leer", 0, 1, 2, 0));
        moveMap.put(225, new UsableMove(225, new MoveCost("D**"), "Horn Attack", 30, 1, 2, 0));
        moveMap.put(226, new UsableMove(226, new MoveCost("D**"), "Horn Attack", 30, 2, 2, 0));
        moveMap.put(227, new UsableMove(227, new MoveCost("DDDD"), "Ram", 50, 2, 2, 0));
        moveMap.put(228, new UsableMove(228, new MoveCost("*"), "Scratch", 10, 2, 3, 0));
        moveMap.put(229, new UsableMove(229, new MoveCost("DD"), "Sharp Sickle", 30, 3, 3, 0));
        moveMap.put(230, new UsableMove(230, new MoveCost("DDDD"), "Absorb", 40, 3, 3, 0));
        moveMap.put(231, new UsableMove(231, new MoveCost("***"), "Wing Attack", 30, 2, 2, 0));
        moveMap.put(232, new UsableMove(232, new MoveCost("P"), "Psyshock", 10, 1, 3, 0));
        moveMap.put(233, new UsableMove(233, new MoveCost("PP"), "Recover", 0, 2, 3, 0));
        moveMap.put(234, new UsableMove(234, new MoveCost("PP*"), "Super Psy", 50, 2, 3, 0));
        moveMap.put(235, new UsableMove(235, new MoveCost("PPP"), "Confuse Ray", 30, 3, 3, 0));
        moveMap.put(236, new UsableMove(236, new MoveCost("*"), "Headbutt", 10, 1, 2, 0));
        moveMap.put(237, new UsableMove(237, new MoveCost("PP"), "Amnesia", 0, 1, 2, 0));
        moveMap.put(238, new UsableMove(238, new MoveCost("*"), "Spacing Out", 0, 1, 2, 0));
        moveMap.put(239, new UsableMove(239, new MoveCost("PP"), "Scavenge", 0, 1, 2, 0));
        moveMap.put(240, new UsableMove(240, new MoveCost("PP"), "Psyshock", 20, 2, 2, 0));
        moveMap.put(241, new UsableMove(241, new MoveCost("P"), "Sleeping Gas", 0, 1, 3, 0));
        moveMap.put(242, new UsableMove(242, new MoveCost("P*"), "Destiny Bond", 0, 1, 3, 0));
        moveMap.put(243, new UsableMove(243, new MoveCost("P"), "Lick", 10, 1, 3, 0));
        moveMap.put(244, new UsableMove(244, new MoveCost("PP"), "Energy Conversion", 0, 1, 3, 0));
        moveMap.put(245, new UsableMove(245, new MoveCost("P*"), "Nightmare", 10, 2, 3, 0));
        moveMap.put(246, new UsableMove(246, new MoveCost("P"), "Hypnosis", 0, 2, 3, 0));
        moveMap.put(247, new UsableMove(247, new MoveCost("PP"), "Dream Eater", 50, 2, 3, 0));
        moveMap.put(248, new UsableMove(248, new MoveCost("PPP"), "Dark Mind", 30, 3, 3, 0));
        moveMap.put(249, new UsableMove(249, new MoveCost("*"), "Pound", 10, 1, 2, 0));
        moveMap.put(250, new UsableMove(250, new MoveCost("PP"), "Confuse Ray", 10, 1, 2, 0));
        moveMap.put(251, new UsableMove(251, new MoveCost("P"), "Prophecy", 0, 2, 2, 0));
        moveMap.put(252, new UsableMove(252, new MoveCost("PPP"), "Dark Mind", 30, 2, 2, 0));
        moveMap.put(253, new UsableMove(253, new MoveCost("P*"), "Meditate", 10, 1, 1, 0));
        moveMap.put(254, new UsableMove(254, new MoveCost("P"), "Doubleslap", 10, 1, 1, 2));
        moveMap.put(255, new UsableMove(255, new MoveCost("PP*"), "Meditate", 20, 1, 1, 0));
        moveMap.put(256, new UsableMove(256, new MoveCost("P*"), "Psychic", 10, 1, 1, 0));
        moveMap.put(257, new UsableMove(257, new MoveCost("PP"), "Barrier", 0, 1, 1, 0));
        moveMap.put(258, new UsableMove(258, new MoveCost("P"), "Energy Absorption", 0, 1, 1, 0));
        moveMap.put(259, new UsableMove(259, new MoveCost("PP*"), "Psyburn", 40, 1, 1, 0));
        moveMap.put(260, new UsableMove(260, new MoveCost("P"), "Energy Absorption", 0, 1, 1, 0));
        moveMap.put(261, new UsableMove(261, new MoveCost("PP*"), "Psyburn", 40, 1, 1, 0));
        moveMap.put(262, new UsableMove(262, new MoveCost("P"), "Psyshock", 10, 1, 1, 0));
        moveMap.put(263, new UsableMove(263, new MoveCost("P*"), "Mystery Attack", 0, 1, 1, 0)); //random damage with random effects lol
        moveMap.put(264, new UsableMove(264, new MoveCost("P"), "Psywave", 10, 1, 1, 0)); //10x energy cards on opponent
        moveMap.put(265, new UsableMove(265, new MoveCost("PP"), "Devolution Beam", 0, 1, 1, 0));
        moveMap.put(266, new UsableMove(266, new MoveCost("**"), "Whirlwind", 10, 1, 3, 0));
        moveMap.put(267, new UsableMove(267, new MoveCost("**"), "Whirlwind", 20, 2, 3, 0));
        moveMap.put(268, new UsableMove(268, new MoveCost("***"), "Mirror Move", 0, 2, 3, 0)); //return damage
        moveMap.put(269, new UsableMove(269, new MoveCost("***"), "Slicing Wind", 0, 3, 3, 0)); //30 damage to random opp pokemon
        moveMap.put(270, new UsableMove(270, new MoveCost("****"), "Gale", 20, 3, 3, 0));
        moveMap.put(271, new UsableMove(271, new MoveCost("**"), "Wing Attack", 20, 3, 3, 0));
        moveMap.put(272, new UsableMove(272, new MoveCost("***"), "Hurricane", 30, 3, 3, 0));
        moveMap.put(273, new UsableMove(273, new MoveCost("*"), "Bite", 20, 1, 2, 0));
        moveMap.put(274, new UsableMove(274, new MoveCost("*"), "Bite", 20, 2, 2, 0));
        moveMap.put(275, new UsableMove(275, new MoveCost("***"), "Super Fang", 20, 2, 2, 0)); //1/2 remaining hp rounded up
        moveMap.put(276, new UsableMove(276, new MoveCost("*"), "Peck", 10, 1, 2, 0));
        moveMap.put(277, new UsableMove(277, new MoveCost("***"), "Mirror Move", 0, 1, 2, 0)); //return damage
        moveMap.put(278, new UsableMove(278, new MoveCost("***"), "Agility", 20, 2, 2, 0));
        moveMap.put(279, new UsableMove(279, new MoveCost("****"), "Drill Peck", 40, 2, 2, 0));
        moveMap.put(280, new UsableMove(280, new MoveCost("*"), "Sing", 0, 1, 2, 0));
        moveMap.put(281, new UsableMove(281, new MoveCost("***"), "Metronome", 0, 1, 2, 0));
        moveMap.put(282, new UsableMove(282, new MoveCost("*"), "Metronome", 0, 2, 2, 0));
        moveMap.put(283, new UsableMove(283, new MoveCost("**"), "Minimize", 0, 2, 2, 0));
        moveMap.put(284, new UsableMove(284, new MoveCost("*"), "First Aid", 0, 1, 2, 0));
        moveMap.put(285, new UsableMove(285, new MoveCost("***"), "Double-Edge", 40, 1, 2, 0));
        moveMap.put(286, new UsableMove(286, new MoveCost("*"), "Friendship Song", 0, 1, 2, 0));
        moveMap.put(287, new UsableMove(287, new MoveCost("**"), "Expand", 10, 1, 2, 0));
        moveMap.put(288, new UsableMove(288, new MoveCost("*"), "Lullaby", 0, 1, 2, 0));
        moveMap.put(289, new UsableMove(289, new MoveCost("**"), "Pound", 20, 1, 2, 0));
        moveMap.put(290, new UsableMove(290, new MoveCost("*"), "Lullaby", 0, 2, 2, 0));
        moveMap.put(291, new UsableMove(291, new MoveCost("***"), "Do The Wave", 10, 2, 2, 0));
        moveMap.put(292, new UsableMove(292, new MoveCost("**"), "Cat Punch", 0, 1, 2, 0)); //20 damage to random opp pokemon
        moveMap.put(293, new UsableMove(293, new MoveCost("**"), "Pay Day", 10, 1, 2, 0));
        moveMap.put(294, new UsableMove(294, new MoveCost("**"), "Scratch", 20, 2, 2, 0));
        moveMap.put(295, new UsableMove(295, new MoveCost("***"), "Pounce", 30, 2, 2, 0));
        moveMap.put(296, new UsableMove(296, new MoveCost("*"), "Leek Slap", 30, 1, 1, 0));
        moveMap.put(297, new UsableMove(297, new MoveCost("***"), "Pot Smash", 30, 1, 1, 0));
        moveMap.put(298, new UsableMove(298, new MoveCost("*"), "Fury Attack", 10, 1, 2, 2));
        moveMap.put(299, new UsableMove(299, new MoveCost("***"), "Rage", 10, 2, 2, 0));
        moveMap.put(300, new UsableMove(300, new MoveCost("*"), "Tongue Wrap", 10, 1, 1, 0));
        moveMap.put(301, new UsableMove(301, new MoveCost("**"), "Supersonic", 0, 1, 1, 0));
        moveMap.put(302, new UsableMove(302, new MoveCost("**"), "Scrunch", 0, 1, 1, 0));
        moveMap.put(303, new UsableMove(303, new MoveCost("****"), "Double-Edge", 80, 1, 1, 0));
        moveMap.put(304, new UsableMove(304, new MoveCost("*"), "Fetch", 0, 1, 1, 0));
        moveMap.put(305, new UsableMove(305, new MoveCost("****"), "Comet Punch", 20, 1, 1, 4));
        moveMap.put(306, new UsableMove(306, new MoveCost("**"), "Stomp", 20, 1, 1, 0));
        moveMap.put(307, new UsableMove(307, new MoveCost("***"), "Rampage", 20, 1, 1, 0));
        moveMap.put(308, new UsableMove(308, new MoveCost("*"), "Pound", 10, 1, 1, 0));
        moveMap.put(309, new UsableMove(309, new MoveCost("***"), "Morph", 0, 1, 1, 0));
        moveMap.put(310, new UsableMove(310, new MoveCost("*"), "Tail Wag", 0, 1, 2, 0));
        moveMap.put(311, new UsableMove(311, new MoveCost("**"), "Quick Attack", 10, 1, 2, 0));
        moveMap.put(312, new UsableMove(312, new MoveCost("*"), "Conversion 1", 0, 1, 1, 0));
        moveMap.put(313, new UsableMove(313, new MoveCost("**"), "Conversion 2", 0, 1, 1, 0));
        moveMap.put(314, new UsableMove(314, new MoveCost("****"), "Body Slam", 30, 1, 1, 0));
        moveMap.put(315, new UsableMove(315, new MoveCost("*"), "Pound", 10, 1, 3, 0));
        moveMap.put(316, new UsableMove(316, new MoveCost("***"), "Slam", 30, 2, 3, 2));
        moveMap.put(317, new UsableMove(317, new MoveCost("****"), "Hyper Beam", 20, 2, 3, 0));
        moveMap.put(318, new UsableMove(318, new MoveCost("***"), "Slam", 30, 3, 3, 2));
        moveMap.put(319, new UsableMove(319, new MoveCost("****"), "Slam", 40, 3, 3, 2));
        moveMap.put(320, new PokemonPower(320, "Solar Power", 3, 3, Type.GRASS));
        moveMap.put(321, new PokemonPower(321, "Energy Trans", 3, 3, Type.GRASS));
        moveMap.put(322, new PokemonPower(322, "Heal", 3, 3, Type.GRASS));
        moveMap.put(323, new PokemonPower(323, "Shift", 2, 2, Type.GRASS));
        moveMap.put(324, new PokemonPower(324, "Toxic Gas", 2, 2, Type.GRASS));
        moveMap.put(325, new PokemonPower(325, "Energy Burn", 3, 3, Type.FIRE));
        moveMap.put(326, new PokemonPower(326, "Firegiver", 1, 1, Type.FIRE)); //could make grass, water, elec, psychic, fighting versions of this as well?
        moveMap.put(327, new PokemonPower(327, "Rain Dance", 3, 3, Type.WATER)); //could make grass, water, elec, psychic, fighting versions of this as well?
        moveMap.put(328, new PokemonPower(328, "Cowardice", 1, 2, Type.WATER));
        moveMap.put(329, new PokemonPower(329, "Clairvoyance", 2, 3, Type.WATER));
        moveMap.put(330, new PokemonPower(330, "Quickfreeze", 1, 1, Type.WATER));
        moveMap.put(331, new PokemonPower(331, "Peal Of Thunder", 1, 1, Type.ELECTRIC));
        moveMap.put(332, new PokemonPower(332, "Peek", 1, 2, Type.FIGHTING));
        moveMap.put(333, new PokemonPower(333, "Strikes Back", 3, 3, Type.FIGHTING));
        moveMap.put(334, new PokemonPower(334, "Kabuto Armor", 2, 3, Type.FIGHTING));
        moveMap.put(335, new PokemonPower(335, "Prehistoric Power", 2, 2, Type.FIGHTING));
        moveMap.put(336, new PokemonPower(336, "Damage Swap", 3, 3, Type.PSYCHIC));
        moveMap.put(337, new PokemonPower(337, "Strange Behavior", 2, 2, Type.PSYCHIC));
        moveMap.put(338, new PokemonPower(338, "Transparency", 2, 3, Type.PSYCHIC));
        moveMap.put(339, new PokemonPower(339, "Curse", 3, 3, Type.PSYCHIC));
        moveMap.put(340, new PokemonPower(340, "Invisible Wall", 1, 1, Type.PSYCHIC));
        moveMap.put(341, new PokemonPower(341, "Neutralizing Shield", 1, 1, Type.PSYCHIC));
        moveMap.put(342, new PokemonPower(342, "Retreat Aid", 2, 2, Type.COLORLESS));
        moveMap.put(343, new PokemonPower(343, "Thick Skinned", 1, 1, Type.COLORLESS));
        moveMap.put(344, new PokemonPower(344, "Healing Wind", 3, 3, Type.COLORLESS));
        moveMap.put(345, new PokemonPower(345, "Step In", 3, 3, Type.COLORLESS));
    }

    private void populateDuelistMap() {
        duelistMap.put(1, new Duelist(1, "Ronald", new Deck(EMPTY_LIST, "Legendary"), null, Gender.MALE, 6, true));
        duelistMap.put(2, new Duelist(2, "Ronald", new Deck(EMPTY_LIST, "Legendary"), null, Gender.MALE, 6, true));
        duelistMap.put(3, new Duelist(3, "Ronald", new Deck(EMPTY_LIST, "Legendary"), null, Gender.MALE, 6, true));
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
        cardMap.put(10, new PokemonCard(10, "0A", "Venusaur", 64, 3, 100, moveMap.get(320), moveMap.get(4), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("**"), singletonList(9), EMPTY_LIST, false));
        cardMap.put(11, new PokemonCard(11, "OB", "Venusaur", 67, 3, 100, moveMap.get(321), moveMap.get(5), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("**"), singletonList(9), EMPTY_LIST, false));
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
        cardMap.put(30, new PokemonCard(30, "1E", "Vileplume", 35, 3, 80, moveMap.get(322), moveMap.get(39), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("**"), singletonList(29), EMPTY_LIST, false));
        cardMap.put(31, new PokemonCard(31, "1F", "Paras", 8, 1, 40, moveMap.get(40), moveMap.get(41), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(32), false));
        cardMap.put(32, new PokemonCard(32, "20", "Parasect", 28, 2, 60, moveMap.get(42), moveMap.get(43), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("*"), singletonList(31), EMPTY_LIST, false));
        cardMap.put(33, new PokemonCard(33, "21", "Venonat", 12, 1, 40, moveMap.get(44), moveMap.get(45), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(34), false));
        cardMap.put(34, new PokemonCard(34, "22", "Venomoth", 28, 2, 70, moveMap.get(323), moveMap.get(46), Type.GRASS, Type.FIRE, Type.FIGHTING, new MoveCost(), singletonList(33), EMPTY_LIST, false));
        cardMap.put(35, new PokemonCard(35, "23", "Bellsprout", 11, 1, 40, moveMap.get(47), moveMap.get(48), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(36), false));
        cardMap.put(36, new PokemonCard(36, "24", "Weepinbell", 28, 2, 70, moveMap.get(49), moveMap.get(50), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("*"), singletonList(35), singletonList(37), false));
        cardMap.put(37, new PokemonCard(37, "25", "Victreebel", 42, 3, 80, moveMap.get(51), moveMap.get(52), Type.GRASS, Type.FIRE, Type.NONE, new MoveCost("**"), singletonList(36), EMPTY_LIST, false));
        cardMap.put(38, new PokemonCard(38, "26", "Grimer", 17, 1, 50, moveMap.get(53), moveMap.get(54), Type.GRASS, Type.PSYCHIC, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(39), false));
        cardMap.put(39, new PokemonCard(39, "27", "Muk", 34, 2, 70, moveMap.get(324), moveMap.get(55), Type.GRASS, Type.PSYCHIC, Type.NONE, new MoveCost("**"), singletonList(38), EMPTY_LIST, false));
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
        cardMap.put(50, new PokemonCard(50, "32", "Charizard", 76, 3, 120, moveMap.get(325), moveMap.get(75), Type.FIRE, Type.WATER, Type.FIGHTING, new MoveCost("***"), singletonList(49), EMPTY_LIST, false));
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
        cardMap.put(61, new PokemonCard(61, "3D", "Flareon", 22, 2, 60, moveMap.get(94), moveMap.get(95), Type.FIRE, Type.WATER, Type.NONE, new MoveCost("*"), singletonList(188), EMPTY_LIST, false));
        cardMap.put(62, new PokemonCard(62, "3E", "Flareon", 28, 2, 70, moveMap.get(96), moveMap.get(97), Type.FIRE, Type.WATER, Type.NONE, new MoveCost("*"), singletonList(188), EMPTY_LIST, false));
        cardMap.put(63, new PokemonCard(63, "3F", "Moltres", 35, 1, 70, moveMap.get(98), moveMap.get(99), Type.FIRE, Type.NONE, Type.FIGHTING, new MoveCost("**"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(64, new PokemonCard(64, "40", "Moltres", 37, 1, 100, moveMap.get(326), moveMap.get(100), Type.FIRE, Type.NONE, Type.FIGHTING, new MoveCost("**"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(65, new PokemonCard(65, "41", "Squirtle", 8, 1, 40, moveMap.get(101), moveMap.get(102), Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(66), false));
        cardMap.put(66, new PokemonCard(66, "42", "Wartortle", 22, 2, 70, moveMap.get(103), moveMap.get(104), Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost("*"), singletonList(65), singletonList(67), false));
        cardMap.put(67, new PokemonCard(67, "43", "Blastoise", 52, 3, 100, moveMap.get(327), moveMap.get(105), Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost("***"), singletonList(66), EMPTY_LIST, false));
        cardMap.put(68, new PokemonCard(68, "44", "Psyduck", 15, 1, 50, moveMap.get(106), moveMap.get(107), Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(69), false));
        cardMap.put(69, new PokemonCard(69, "45", "Golduck", 27, 2, 70, moveMap.get(108), moveMap.get(109), Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost("*"), singletonList(68), EMPTY_LIST, false));
        cardMap.put(70, new PokemonCard(70, "46", "Poliwag", 13, 1, 40, moveMap.get(110), null, Type.WATER, Type.GRASS, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(71), false));
        cardMap.put(71, new PokemonCard(71, "47", "Poliwhirl", 28, 2, 60, moveMap.get(111), moveMap.get(112), Type.WATER, Type.GRASS, Type.NONE, new MoveCost("*"), singletonList(70), singletonList(72), false));
        cardMap.put(72, new PokemonCard(72, "48", "Poliwrath", 48, 3, 90, moveMap.get(113), moveMap.get(114), Type.WATER, Type.GRASS, Type.NONE, new MoveCost("***"), singletonList(71), EMPTY_LIST, false));
        cardMap.put(73, new PokemonCard(73, "49", "Tentacool", 10, 1, 30, moveMap.get(328), moveMap.get(115), Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost(), EMPTY_LIST, singletonList(74), false));
        cardMap.put(74, new PokemonCard(74, "4A", "Tentacruel", 21, 2, 60, moveMap.get(116), moveMap.get(117), Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost(), singletonList(73), EMPTY_LIST, false));
        cardMap.put(75, new PokemonCard(75, "4B", "Seel", 12, 1, 60, moveMap.get(118), null, Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(76), false));
        cardMap.put(76, new PokemonCard(76, "4C", "Dewgong", 42, 2, 80, moveMap.get(119), moveMap.get(120), Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost("***"), singletonList(75), EMPTY_LIST, false));
        cardMap.put(77, new PokemonCard(77, "4D", "Shellder", 8, 1, 30, moveMap.get(121), moveMap.get(122), Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(78), false));
        cardMap.put(78, new PokemonCard(78, "4E", "Cloyster", 25, 2, 50, moveMap.get(123), moveMap.get(124), Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost("**"), singletonList(77), EMPTY_LIST, false));
        cardMap.put(79, new PokemonCard(79, "4F", "Krabby", 20, 1, 50, moveMap.get(125), moveMap.get(126), Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost("**"), EMPTY_LIST, singletonList(80), false));
        cardMap.put(80, new PokemonCard(80, "50", "Kingler", 27, 2, 60, moveMap.get(127), moveMap.get(128), Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost("***"), singletonList(79), EMPTY_LIST, false));
        cardMap.put(81, new PokemonCard(81, "51", "Horsea", 19, 1, 40, moveMap.get(129), null, Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost(), EMPTY_LIST, singletonList(82), false));
        cardMap.put(82, new PokemonCard(82, "52", "Seadra", 23, 2, 60, moveMap.get(130), moveMap.get(131), Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost("*"), singletonList(81), EMPTY_LIST, false));
        cardMap.put(83, new PokemonCard(83, "53", "Goldeen", 12, 1, 40, moveMap.get(132), null, Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost(), EMPTY_LIST, singletonList(84), false));
        cardMap.put(84, new PokemonCard(84, "54", "Seaking", 28, 2, 70, moveMap.get(133), moveMap.get(134), Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost("*"), singletonList(83), EMPTY_LIST, false));
        cardMap.put(85, new PokemonCard(85, "55", "Staryu", 15, 1, 40, moveMap.get(135), null, Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(86), false));
        cardMap.put(86, new PokemonCard(86, "56", "Starmie", 28, 2, 60, moveMap.get(136), moveMap.get(137), Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost("*"), singletonList(85), EMPTY_LIST, false));
        cardMap.put(87, new PokemonCard(87, "57", "Magikarp", 8, 1, 30, moveMap.get(138), moveMap.get(139), Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(88), false));
        cardMap.put(88, new PokemonCard(88, "58", "Gyarados", 41, 2, 100, moveMap.get(140), moveMap.get(141), Type.WATER, Type.GRASS, Type.FIGHTING, new MoveCost("***"), singletonList(87), EMPTY_LIST, false));
        cardMap.put(89, new PokemonCard(89, "59", "Lapras", 31, 1, 80, moveMap.get(142), moveMap.get(143), Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost("**"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(90, new PokemonCard(90, "5A", "Vaporeon", 29, 2, 60, moveMap.get(144), moveMap.get(145), Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost("*"), singletonList(188), EMPTY_LIST, false));
        cardMap.put(91, new PokemonCard(91, "5B", "Vaporeon", 42, 2, 80, moveMap.get(146), moveMap.get(147), Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost("*"), singletonList(188), EMPTY_LIST, false));
        cardMap.put(92, new PokemonCard(92, "5C", "Omanyte", 19, 2, 40, moveMap.get(329), moveMap.get(148), Type.WATER, Type.GRASS, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(93), true));
        cardMap.put(93, new PokemonCard(93, "5D", "Omastar", 32, 3, 70, moveMap.get(149), moveMap.get(150), Type.WATER, Type.GRASS, Type.NONE, new MoveCost("*"), singletonList(92), EMPTY_LIST, true));
        cardMap.put(94, new PokemonCard(94, "5E", "Articuno", 35, 1, 70, moveMap.get(151), moveMap.get(152), Type.WATER, Type.NONE, Type.FIGHTING, new MoveCost("**"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(95, new PokemonCard(95, "5F", "Articuno", 37, 1, 100, moveMap.get(330), moveMap.get(153), Type.WATER, Type.NONE, Type.FIGHTING, new MoveCost("**"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(96, new PokemonCard(96, "60", "Pikachu", 12, 1, 40, moveMap.get(154), moveMap.get(155), Type.ELECTRIC, Type.FIGHTING, Type.NONE, new MoveCost("*"), EMPTY_LIST, Arrays.asList(103, 104), false));
        cardMap.put(97, new PokemonCard(97, "61", "Pikachu", 14, 1, 50, moveMap.get(156), null, Type.ELECTRIC, Type.FIGHTING, Type.NONE, new MoveCost("*"), EMPTY_LIST, Arrays.asList(103, 104), false));
        cardMap.put(98, new PokemonCard(98, "62", "Pikachu", 16, 1, 60, moveMap.get(157), moveMap.get(158), Type.ELECTRIC, Type.FIGHTING, Type.NONE, new MoveCost("*"), EMPTY_LIST, Arrays.asList(103, 104), false));
        cardMap.put(99, new PokemonCard(99, "63", "Pikachu", 16, 1, 60, moveMap.get(159), moveMap.get(160), Type.ELECTRIC, Type.FIGHTING, Type.NONE, new MoveCost("*"), EMPTY_LIST, Arrays.asList(103, 104), false));
        cardMap.put(100, new PokemonCard(100, "64", "Flying Pikachu", 12, 1, 40, moveMap.get(161), moveMap.get(162), Type.ELECTRIC, Type.NONE, Type.FIGHTING, new MoveCost("*"), EMPTY_LIST, Arrays.asList(103, 104), false));
        cardMap.put(101, new PokemonCard(101, "65", "Surfing Pikachu", 13, 1, 50, moveMap.get(163), null, Type.ELECTRIC, Type.FIGHTING, Type.NONE, new MoveCost("*"), EMPTY_LIST, Arrays.asList(103, 104), false));
        cardMap.put(102, new PokemonCard(102, "66", "Surfing Pikachu", 13, 1, 50, moveMap.get(164), null, Type.ELECTRIC, Type.FIGHTING, Type.NONE, new MoveCost("*"), EMPTY_LIST, Arrays.asList(103, 104), false));
        cardMap.put(103, new PokemonCard(103, "67", "Raichu", 40, 2, 80, moveMap.get(165), moveMap.get(166), Type.ELECTRIC, Type.FIGHTING, Type.NONE, new MoveCost("*"), Arrays.asList(96, 97, 98, 99, 100, 101, 102), EMPTY_LIST, false));
        cardMap.put(104, new PokemonCard(104, "68", "Raichu", 45, 2, 90, moveMap.get(167), null, Type.ELECTRIC, Type.FIGHTING, Type.NONE, new MoveCost("*"), Arrays.asList(96, 97, 98, 99, 100, 101, 102), EMPTY_LIST, false));
        cardMap.put(105, new PokemonCard(105, "69", "Magnemite", 13, 1, 40, moveMap.get(168), moveMap.get(169), Type.ELECTRIC, Type.FIGHTING, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(107), false));
        cardMap.put(106, new PokemonCard(106, "6A", "Magnemite", 15, 1, 40, moveMap.get(170), moveMap.get(171), Type.ELECTRIC, Type.FIGHTING, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(107), false));
        cardMap.put(107, new PokemonCard(107, "6B", "Magneton", 28, 2, 60, moveMap.get(172), moveMap.get(173), Type.ELECTRIC, Type.FIGHTING, Type.NONE, new MoveCost("*"), Arrays.asList(105, 106), EMPTY_LIST, false));
        cardMap.put(108, new PokemonCard(108, "6C", "Magneton", 35, 2, 80, moveMap.get(174), moveMap.get(175), Type.ELECTRIC, Type.FIGHTING, Type.NONE, new MoveCost("**"), Arrays.asList(105, 106), EMPTY_LIST, false));
        cardMap.put(109, new PokemonCard(109, "6D", "Voltorb", 10, 1, 40, moveMap.get(176), null, Type.ELECTRIC, Type.FIGHTING, Type.NONE, new MoveCost("*"), EMPTY_LIST, Arrays.asList(110, 111), false));
        cardMap.put(110, new PokemonCard(110, "6E", "Electrode", 35, 2, 70, moveMap.get(177), moveMap.get(178), Type.ELECTRIC, Type.FIGHTING, Type.NONE, new MoveCost("*"), singletonList(109), EMPTY_LIST, false));
        cardMap.put(111, new PokemonCard(111, "6F", "Electrode", 42, 2, 90, moveMap.get(179), moveMap.get(180), Type.ELECTRIC, Type.FIGHTING, Type.NONE, new MoveCost("*"), singletonList(109), EMPTY_LIST, false));
        cardMap.put(112, new PokemonCard(112, "70", "Electabuzz", 20, 1, 60, moveMap.get(181), moveMap.get(182), Type.ELECTRIC, Type.FIGHTING, Type.NONE, new MoveCost("**"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(113, new PokemonCard(113, "71", "Electabuzz", 35, 1, 70, moveMap.get(183), moveMap.get(184), Type.ELECTRIC, Type.FIGHTING, Type.NONE, new MoveCost("**"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(114, new PokemonCard(114, "72", "Jolteon", 24, 2, 60, moveMap.get(185), moveMap.get(186), Type.ELECTRIC, Type.FIGHTING, Type.NONE, new MoveCost("*"), singletonList(188), EMPTY_LIST, false));
        cardMap.put(115, new PokemonCard(115, "73", "Jolteon", 29, 2, 70, moveMap.get(187), moveMap.get(188), Type.ELECTRIC, Type.FIGHTING, Type.NONE, new MoveCost("*"), singletonList(188), EMPTY_LIST, false));
        cardMap.put(116, new PokemonCard(116, "74", "Zapdos", 40, 1, 80, moveMap.get(189), null, Type.ELECTRIC, Type.NONE, Type.FIGHTING, new MoveCost("**"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(117, new PokemonCard(117, "75", "Zapdos", 64, 1, 90, moveMap.get(190), moveMap.get(191), Type.ELECTRIC, Type.NONE, Type.FIGHTING, new MoveCost("***"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(118, new PokemonCard(118, "76", "Zapdos", 68, 1, 100, moveMap.get(331), moveMap.get(192), Type.ELECTRIC, Type.NONE, Type.FIGHTING, new MoveCost("**"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(119, new PokemonCard(119, "77", "Sandshrew", 12, 1, 40, moveMap.get(193), null, Type.FIGHTING, Type.GRASS, Type.ELECTRIC, new MoveCost("*"), EMPTY_LIST, singletonList(120), false));
        cardMap.put(120, new PokemonCard(120, "78", "Sandslash", 33, 2, 70, moveMap.get(194), moveMap.get(195), Type.FIGHTING, Type.GRASS, Type.ELECTRIC, new MoveCost("*"), singletonList(119), EMPTY_LIST, false));
        cardMap.put(121, new PokemonCard(121, "79", "Diglett", 8, 1, 30, moveMap.get(196), moveMap.get(197), Type.FIGHTING, Type.GRASS, Type.ELECTRIC, new MoveCost(), EMPTY_LIST, singletonList(122), false));
        cardMap.put(122, new PokemonCard(122, "7A", "Dugtrio", 36, 2, 70, moveMap.get(198), moveMap.get(199), Type.FIGHTING, Type.GRASS, Type.ELECTRIC, new MoveCost("**"), singletonList(121), EMPTY_LIST, false));
        cardMap.put(123, new PokemonCard(123, "7B", "Mankey", 7, 1, 30, moveMap.get(332), moveMap.get(200), Type.FIGHTING, Type.PSYCHIC, Type.NONE, new MoveCost(), EMPTY_LIST, singletonList(124), false));
        cardMap.put(124, new PokemonCard(124, "7C", "Primeape", 35, 2, 70, moveMap.get(201), moveMap.get(202), Type.FIGHTING, Type.PSYCHIC, Type.NONE, new MoveCost("*"), singletonList(123), EMPTY_LIST, false));
        cardMap.put(125, new PokemonCard(125, "7D", "Machop", 20, 1, 50, moveMap.get(203), null, Type.FIGHTING, Type.PSYCHIC, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(126), false));
        cardMap.put(126, new PokemonCard(126, "7E", "Machoke", 40, 2, 80, moveMap.get(204), moveMap.get(205), Type.FIGHTING, Type.PSYCHIC, Type.NONE, new MoveCost("***"), singletonList(125), singletonList(127), false));
        cardMap.put(127, new PokemonCard(127, "7F", "Machamp", 67, 3, 100, moveMap.get(333), moveMap.get(206), Type.FIGHTING, Type.PSYCHIC, Type.NONE, new MoveCost("***"), singletonList(126), EMPTY_LIST, false));
        cardMap.put(128, new PokemonCard(128, "80", "Geodude", 16, 1, 50, moveMap.get(207), null, Type.FIGHTING, Type.GRASS, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(129), false));
        cardMap.put(129, new PokemonCard(129, "81", "Graveler", 29, 2, 60, moveMap.get(208), moveMap.get(209), Type.FIGHTING, Type.GRASS, Type.NONE, new MoveCost("**"), singletonList(128), singletonList(130), false));
        cardMap.put(130, new PokemonCard(130, "82", "Golem", 36, 3, 80, moveMap.get(210), moveMap.get(211), Type.FIGHTING, Type.GRASS, Type.NONE, new MoveCost("****"), singletonList(129), EMPTY_LIST, false));
        cardMap.put(131, new PokemonCard(131, "83", "Onix", 12, 1, 90, moveMap.get(212), moveMap.get(213), Type.FIGHTING, Type.GRASS, Type.NONE, new MoveCost("***"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(132, new PokemonCard(132, "84", "Cubone", 13, 1, 40, moveMap.get(214), moveMap.get(215), Type.FIGHTING, Type.GRASS, Type.ELECTRIC, new MoveCost("*"), EMPTY_LIST, Arrays.asList(133, 134), false));
        cardMap.put(133, new PokemonCard(133, "85", "Marowak", 26, 2, 60, moveMap.get(216), moveMap.get(217), Type.FIGHTING, Type.GRASS, Type.ELECTRIC, new MoveCost("*"), singletonList(132), EMPTY_LIST, false));
        cardMap.put(134, new PokemonCard(134, "86", "Marowak", 32, 2, 70, moveMap.get(218), moveMap.get(219), Type.FIGHTING, Type.GRASS, Type.ELECTRIC, new MoveCost("**"), singletonList(132), EMPTY_LIST, false));
        cardMap.put(135, new PokemonCard(135, "87", "Hitmonlee", 30, 1, 60, moveMap.get(220), moveMap.get(221), Type.FIGHTING, Type.PSYCHIC, Type.NONE, new MoveCost("*"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(136, new PokemonCard(136, "88", "Hitmonchan", 33, 1, 70, moveMap.get(222), moveMap.get(223), Type.FIGHTING, Type.PSYCHIC, Type.NONE, new MoveCost("**"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(137, new PokemonCard(137, "89", "Rhyhorn", 18, 1, 70, moveMap.get(224), moveMap.get(225), Type.FIGHTING, Type.GRASS, Type.ELECTRIC, new MoveCost("***"), EMPTY_LIST, singletonList(138), false));
        cardMap.put(138, new PokemonCard(138, "8A", "Rhydon", 48, 1, 100, moveMap.get(226), moveMap.get(227), Type.FIGHTING, Type.GRASS, Type.ELECTRIC, new MoveCost("***"), singletonList(137), EMPTY_LIST, false));
        cardMap.put(139, new PokemonCard(139, "8B", "Kabuto", 9, 2, 30, moveMap.get(334), moveMap.get(228), Type.FIGHTING, Type.GRASS, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(140), true));
        cardMap.put(140, new PokemonCard(140, "8C", "Kabutops", 30, 3, 60, moveMap.get(229), moveMap.get(230), Type.FIGHTING, Type.GRASS, Type.NONE, new MoveCost("*"), singletonList(139), EMPTY_LIST, true));
        cardMap.put(141, new PokemonCard(141, "8D", "Aerodactyl", 28, 2, 60, moveMap.get(335), moveMap.get(231), Type.FIGHTING, Type.GRASS, Type.FIGHTING, new MoveCost("**"), EMPTY_LIST, EMPTY_LIST, true));
        cardMap.put(142, new PokemonCard(142, "8E", "Abra", 10, 1, 30, moveMap.get(232), null, Type.PSYCHIC, Type.PSYCHIC, Type.NONE, new MoveCost(), EMPTY_LIST, singletonList(143), false));
        cardMap.put(143, new PokemonCard(143, "8F", "Kadabra", 38, 2, 60, moveMap.get(233), moveMap.get(234), Type.PSYCHIC, Type.PSYCHIC, Type.NONE, new MoveCost("***"), singletonList(142), singletonList(144), false));
        cardMap.put(144, new PokemonCard(144, "90", "Alakazam", 42, 2, 80, moveMap.get(336), moveMap.get(235), Type.PSYCHIC, Type.PSYCHIC, Type.NONE, new MoveCost("***"), singletonList(143), EMPTY_LIST, false));
        cardMap.put(145, new PokemonCard(145, "91", "Slowpoke", 9, 1, 40, moveMap.get(236), moveMap.get(237), Type.PSYCHIC, Type.PSYCHIC, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(147), false));
        cardMap.put(146, new PokemonCard(146, "92", "Slowpoke", 18, 1, 50, moveMap.get(238), moveMap.get(239), Type.PSYCHIC, Type.PSYCHIC, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(147), false));
        cardMap.put(147, new PokemonCard(147, "93", "Slowbro", 26, 2, 60, moveMap.get(337), moveMap.get(240), Type.PSYCHIC, Type.PSYCHIC, Type.NONE, new MoveCost("*"), Arrays.asList(145, 146), EMPTY_LIST, false));
        cardMap.put(148, new PokemonCard(148, "94", "Gastly", 8, 1, 30, moveMap.get(241), moveMap.get(242), Type.PSYCHIC, Type.NONE, Type.FIGHTING, new MoveCost(), EMPTY_LIST, Arrays.asList(150, 151), false));
        cardMap.put(149, new PokemonCard(149, "95", "Gastly", 17, 1, 50, moveMap.get(243), moveMap.get(244), Type.PSYCHIC, Type.NONE, Type.FIGHTING, new MoveCost(), EMPTY_LIST, Arrays.asList(150, 151), false));
        cardMap.put(150, new PokemonCard(150, "96", "Haunter", 17, 2, 50, moveMap.get(338), moveMap.get(245), Type.PSYCHIC, Type.NONE, Type.FIGHTING, new MoveCost(), Arrays.asList(148, 149), singletonList(152), false));
        cardMap.put(151, new PokemonCard(151, "97", "Haunter", 22, 2, 60, moveMap.get(246), moveMap.get(247), Type.PSYCHIC, Type.NONE, Type.FIGHTING, new MoveCost("*"), Arrays.asList(148, 149), singletonList(152), false));
        cardMap.put(152, new PokemonCard(152, "98", "Gengar", 38, 3, 80, moveMap.get(339), moveMap.get(248), Type.PSYCHIC, Type.NONE, Type.FIGHTING, new MoveCost("*"), Arrays.asList(150, 151), EMPTY_LIST, false));
        cardMap.put(153, new PokemonCard(153, "99", "Drowzee", 12, 1, 50, moveMap.get(249), moveMap.get(250), Type.PSYCHIC, Type.PSYCHIC, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(154), false));
        cardMap.put(154, new PokemonCard(154, "9A", "Hypno", 36, 2, 90, moveMap.get(251), moveMap.get(252), Type.PSYCHIC, Type.PSYCHIC, Type.NONE, new MoveCost("**"), singletonList(153), EMPTY_LIST, false));
        cardMap.put(155, new PokemonCard(155, "9B", "Mr. Mime", 28, 1, 40, moveMap.get(340), moveMap.get(253), Type.PSYCHIC, Type.PSYCHIC, Type.NONE, new MoveCost("*"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(156, new PokemonCard(156, "9C", "Jynx", 23, 1, 70, moveMap.get(254), moveMap.get(255), Type.PSYCHIC, Type.PSYCHIC, Type.NONE, new MoveCost("**"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(157, new PokemonCard(157, "9D", "Mewtwo", 53, 1, 60, moveMap.get(256), moveMap.get(257), Type.PSYCHIC, Type.PSYCHIC, Type.NONE, new MoveCost("***"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(158, new PokemonCard(158, "9E", "Mewtwo", 60, 1, 70, moveMap.get(258), moveMap.get(259), Type.PSYCHIC, Type.PSYCHIC, Type.NONE, new MoveCost("**"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(159, new PokemonCard(159, "9F", "Mewtwo", 60, 1, 70, moveMap.get(260), moveMap.get(261), Type.PSYCHIC, Type.PSYCHIC, Type.NONE, new MoveCost("**"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(160, new PokemonCard(160, "A0", "Mew", 8, 1, 40, moveMap.get(341), moveMap.get(262), Type.PSYCHIC, Type.PSYCHIC, Type.NONE, new MoveCost("*"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(161, new PokemonCard(161, "A1", "Mew", 15, 1, 50, moveMap.get(263), null, Type.PSYCHIC, Type.PSYCHIC, Type.NONE, new MoveCost(), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(162, new PokemonCard(162, "A2", "Mew", 23, 1, 50, moveMap.get(264), moveMap.get(265), Type.PSYCHIC, Type.PSYCHIC, Type.NONE, new MoveCost("*"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(163, new PokemonCard(163, "A3", "Pidgey", 8, 1, 40, moveMap.get(266), null, Type.COLORLESS, Type.ELECTRIC, Type.FIGHTING, new MoveCost("*"), EMPTY_LIST, singletonList(164), false));
        cardMap.put(164, new PokemonCard(164, "A4", "Pidgeotto", 36, 2, 60, moveMap.get(267), moveMap.get(268), Type.COLORLESS, Type.ELECTRIC, Type.FIGHTING, new MoveCost("*"), singletonList(163), Arrays.asList(165, 166), false));
        cardMap.put(165, new PokemonCard(165, "A5", "Pidgeot", 38, 3, 80, moveMap.get(269), moveMap.get(270), Type.COLORLESS, Type.ELECTRIC, Type.FIGHTING, new MoveCost("*"), singletonList(164), EMPTY_LIST, false));
        cardMap.put(166, new PokemonCard(166, "A6", "Pidgeot", 40, 3, 80, moveMap.get(271), moveMap.get(272), Type.COLORLESS, Type.ELECTRIC, Type.FIGHTING, new MoveCost(), singletonList(164), EMPTY_LIST, false));
        cardMap.put(167, new PokemonCard(167, "A7", "Rattata", 9, 1, 30, moveMap.get(273), null, Type.COLORLESS, Type.FIGHTING, Type.PSYCHIC, new MoveCost(), EMPTY_LIST, singletonList(168), false));
        cardMap.put(168, new PokemonCard(168, "A8", "Raticate", 41, 2, 60, moveMap.get(274), moveMap.get(275), Type.COLORLESS, Type.FIGHTING, Type.PSYCHIC, new MoveCost("*"), singletonList(167), EMPTY_LIST, false));
        cardMap.put(169, new PokemonCard(169, "A9", "Spearow", 13, 1, 50, moveMap.get(276), moveMap.get(277), Type.COLORLESS, Type.ELECTRIC, Type.FIGHTING, new MoveCost(), EMPTY_LIST, singletonList(170), false));
        cardMap.put(170, new PokemonCard(170, "AA", "Fearow", 27, 2, 70, moveMap.get(278), moveMap.get(279), Type.COLORLESS, Type.ELECTRIC, Type.FIGHTING, new MoveCost(), singletonList(169), EMPTY_LIST, false));
        cardMap.put(171, new PokemonCard(171, "AB", "Clefairy", 14, 1, 40, moveMap.get(280), moveMap.get(281), Type.COLORLESS, Type.FIGHTING, Type.PSYCHIC, new MoveCost("*"), EMPTY_LIST, singletonList(172), false));
        cardMap.put(172, new PokemonCard(172, "AC", "Clefable", 34, 2, 70, moveMap.get(282), moveMap.get(283), Type.COLORLESS, Type.FIGHTING, Type.PSYCHIC, new MoveCost("**"), singletonList(171), EMPTY_LIST, false));
        cardMap.put(173, new PokemonCard(173, "AD", "Jigglypuff", 12, 1, 50, moveMap.get(284), moveMap.get(285), Type.COLORLESS, Type.FIGHTING, Type.PSYCHIC, new MoveCost("*"), EMPTY_LIST, singletonList(176), false));
        cardMap.put(174, new PokemonCard(174, "AE", "Jigglypuff", 13, 1, 50, moveMap.get(286), moveMap.get(287), Type.COLORLESS, Type.FIGHTING, Type.PSYCHIC, new MoveCost("*"), EMPTY_LIST, singletonList(176), false));
        cardMap.put(175, new PokemonCard(175, "AF", "Jigglypuff", 14, 1, 60, moveMap.get(288), moveMap.get(289), Type.COLORLESS, Type.FIGHTING, Type.PSYCHIC, new MoveCost("*"), EMPTY_LIST, singletonList(176), false));
        cardMap.put(176, new PokemonCard(176, "B0", "Wigglytuff", 36, 2, 80, moveMap.get(290), moveMap.get(291), Type.COLORLESS, Type.FIGHTING, Type.PSYCHIC, new MoveCost("**"), Arrays.asList(173, 174, 175), EMPTY_LIST, false));
        cardMap.put(177, new PokemonCard(177, "B1", "Meowth", 14, 1, 50, moveMap.get(292), null, Type.COLORLESS, Type.FIGHTING, Type.PSYCHIC, new MoveCost("*"), EMPTY_LIST, singletonList(179), false));
        cardMap.put(178, new PokemonCard(178, "B2", "Meowth", 15, 1, 50, moveMap.get(293), null, Type.COLORLESS, Type.FIGHTING, Type.PSYCHIC, new MoveCost("*"), EMPTY_LIST, singletonList(179), false));
        cardMap.put(179, new PokemonCard(179, "B3", "Persian", 25, 2, 70, moveMap.get(294), moveMap.get(295), Type.COLORLESS, Type.FIGHTING, Type.PSYCHIC, new MoveCost(), Arrays.asList(177, 178), EMPTY_LIST, false));
        cardMap.put(180, new PokemonCard(180, "B4", "Farfetch'd", 20, 1, 50, moveMap.get(296), moveMap.get(297), Type.COLORLESS, Type.ELECTRIC, Type.FIGHTING, new MoveCost("*"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(181, new PokemonCard(181, "B5", "Doduo", 10, 1, 50, moveMap.get(298), null, Type.COLORLESS, Type.ELECTRIC, Type.FIGHTING, new MoveCost(), EMPTY_LIST, singletonList(182), false));
        cardMap.put(182, new PokemonCard(182, "B6", "Dodrio", 28, 2, 70, moveMap.get(342), moveMap.get(299), Type.COLORLESS, Type.ELECTRIC, Type.FIGHTING, new MoveCost(), singletonList(181), EMPTY_LIST, false));
        cardMap.put(183, new PokemonCard(183, "B7", "Lickitung", 26, 1, 90, moveMap.get(300), moveMap.get(301), Type.COLORLESS, Type.FIGHTING, Type.PSYCHIC, new MoveCost("***"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(184, new PokemonCard(184, "B8", "Chansey", 55, 1, 120, moveMap.get(302), moveMap.get(303), Type.COLORLESS, Type.FIGHTING, Type.PSYCHIC, new MoveCost("*"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(185, new PokemonCard(185, "B9", "Kangashkan", 40, 1, 90, moveMap.get(304), moveMap.get(305), Type.COLORLESS, Type.FIGHTING, Type.PSYCHIC, new MoveCost("***"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(186, new PokemonCard(186, "BA", "Tauros", 32, 1, 60, moveMap.get(306), moveMap.get(307), Type.COLORLESS, Type.FIGHTING, Type.PSYCHIC, new MoveCost("**"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(187, new PokemonCard(187, "BB", "Ditto", 19, 1, 50, moveMap.get(308), moveMap.get(309), Type.COLORLESS, Type.FIGHTING, Type.PSYCHIC, new MoveCost("*"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(188, new PokemonCard(188, "BC", "Eevee", 12, 1, 50, moveMap.get(310), moveMap.get(311), Type.COLORLESS, Type.FIGHTING, Type.PSYCHIC, new MoveCost("*"), EMPTY_LIST, Arrays.asList(61, 62, 90, 91, 114, 115), false));
        cardMap.put(189, new PokemonCard(189, "BD", "Porygon", 12, 1, 30, moveMap.get(312), moveMap.get(313), Type.COLORLESS, Type.FIGHTING, Type.PSYCHIC, new MoveCost("*"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(190, new PokemonCard(190, "BE", "Snorlax", 20, 1, 90, moveMap.get(343), moveMap.get(314), Type.COLORLESS, Type.FIGHTING, Type.PSYCHIC, new MoveCost("****"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(191, new PokemonCard(191, "BF", "Dratini", 10, 1, 40, moveMap.get(315), null, Type.COLORLESS, Type.NONE, Type.PSYCHIC, new MoveCost("*"), EMPTY_LIST, singletonList(192), false));
        cardMap.put(192, new PokemonCard(192, "C0", "Dragonair", 33, 2, 80, moveMap.get(316), moveMap.get(317), Type.COLORLESS, Type.NONE, Type.PSYCHIC, new MoveCost("**"), singletonList(191), Arrays.asList(193, 194), false));
        cardMap.put(193, new PokemonCard(193, "C1", "Dragonite", 41, 3, 100, moveMap.get(344), moveMap.get(318), Type.COLORLESS, Type.NONE, Type.FIGHTING, new MoveCost("**"), singletonList(192), EMPTY_LIST, false));
        cardMap.put(194, new PokemonCard(194, "C2", "Dragonite", 45, 3, 100, moveMap.get(345), moveMap.get(319), Type.COLORLESS, Type.NONE, Type.FIGHTING, new MoveCost("*"), singletonList(192), EMPTY_LIST, false));
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

    public List<UsableMove> getAllUsableMoves() {
        return moveMap.values().stream().filter(x -> x instanceof UsableMove).map(x -> (UsableMove) x).collect(Collectors.toList());
    }

    public List<PokemonPower> getAllPokemonPowers() {
        return moveMap.values().stream().filter(x -> x instanceof PokemonPower).map(x -> (PokemonPower) x).collect(Collectors.toList());
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
