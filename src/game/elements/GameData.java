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
        moveMap.put(115, new Move(115, new MoveCost("W"), "Acid", 10, 1, 2, 0));
        moveMap.put(116, new Move(116, new MoveCost("W"), "Supersonic", 0, 2, 2, 0));
        moveMap.put(117, new Move(117, new MoveCost("WW"), "Jellyfish Sting", 10, 2, 2, 0));
        moveMap.put(118, new Move(118, new MoveCost("W"), "Headbutt", 10, 1, 2, 0));
        moveMap.put(119, new Move(119, new MoveCost("WW*"), "Aurora Beam", 50, 2, 2, 0));
        moveMap.put(120, new Move(120, new MoveCost("WW**"), "Ice Beam", 30, 2, 2, 0));
        moveMap.put(121, new Move(121, new MoveCost("W"), "Supersonic", 0, 1, 2, 0));
        moveMap.put(122, new Move(122, new MoveCost("W"), "Hide In Shell", 0, 1, 2, 0)); //maybe rename to Hide?
        moveMap.put(123, new Move(123, new MoveCost("WW"), "Clamp", 30, 2, 2, 0));
        moveMap.put(124, new Move(124, new MoveCost("WW"), "Spike Cannon", 30, 2, 2, 2));
        moveMap.put(125, new Move(125, new MoveCost("W"), "Call For Family", 0, 1, 2, 0));
        moveMap.put(126, new Move(126, new MoveCost("W*"), "Irongrip", 20, 1, 2, 0));
        moveMap.put(127, new Move(127, new MoveCost("W"), "Flail", 10, 2, 2, 0));
        moveMap.put(128, new Move(128, new MoveCost("WW*"), "Crabhammer", 40, 2, 2, 0));
        moveMap.put(129, new Move(129, new MoveCost("W"), "Smokescreen", 10, 1, 2, 0));
        moveMap.put(130, new Move(130, new MoveCost("W*"), "Water Gun", 20, 2, 2, 0));
        moveMap.put(131, new Move(131, new MoveCost("W**"), "Agility", 20, 2, 2, 0));
        moveMap.put(132, new Move(132, new MoveCost("W"), "Horn Attack", 10, 1, 2, 0));
        moveMap.put(133, new Move(133, new MoveCost("W"), "Horn Attack", 10, 2, 2, 0));
        moveMap.put(134, new Move(134, new MoveCost("W*"), "Waterfall", 30, 2, 2, 0));
        moveMap.put(135, new Move(135, new MoveCost("W"), "Slap", 20, 1, 2, 0));
        moveMap.put(136, new Move(136, new MoveCost("WW"), "Recover", 0, 2, 2, 0));
        moveMap.put(137, new Move(137, new MoveCost("W**"), "Star Freeze", 20, 2, 2, 0));
        moveMap.put(138, new Move(138, new MoveCost("*"), "Tackle", 10, 1, 2, 0));
        moveMap.put(139, new Move(139, new MoveCost("W"), "Flail", 10, 1, 2, 0));
        moveMap.put(140, new Move(140, new MoveCost("WWW"), "Dragon Rage", 50, 2, 2, 0));
        moveMap.put(141, new Move(141, new MoveCost("WWWW"), "Bubblebeam", 40, 2, 2, 0));
        moveMap.put(142, new Move(142, new MoveCost("W"), "Water Gun", 10, 1, 1, 0));
        moveMap.put(143, new Move(143, new MoveCost("WW"), "Confuse Ray", 10, 1, 1, 0));
        moveMap.put(144, new Move(144, new MoveCost("*"), "Focus Energy", 0, 2, 2, 0));
        moveMap.put(145, new Move(145, new MoveCost("***"), "Bite", 30, 2, 2, 0));
        moveMap.put(146, new Move(146, new MoveCost("**"), "Quick Attack", 10, 2, 2, 0));
        moveMap.put(147, new Move(147, new MoveCost("WW*"), "Water Gun", 30, 2, 2, 0));
        moveMap.put(148, new Move(148, new MoveCost("W"), "Water Gun", 10, 2, 3, 0));
        moveMap.put(149, new Move(149, new MoveCost("W*"), "Water Gun", 20, 3, 3, 0));
        moveMap.put(150, new Move(150, new MoveCost("WW"), "Spike Cannon", 30, 3, 3, 2));
        moveMap.put(151, new Move(151, new MoveCost("WWW"), "Freeze Dry", 30, 1, 1, 0));
        moveMap.put(152, new Move(152, new MoveCost("WWWW"), "Blizzard", 50, 1, 1, 0));
        moveMap.put(153, new Move(153, new MoveCost("WWW"), "Ice Breath", 40, 1, 1, 0));
        moveMap.put(154, new Move(154, new MoveCost("*"), "Gnaw", 10, 1, 2, 0));
        moveMap.put(155, new Move(155, new MoveCost("E*"), "Thunder Jolt", 30, 1, 2, 0));
        moveMap.put(156, new Move(156, new MoveCost("EE"), "Spark", 20, 1, 2, 0));
        moveMap.put(157, new Move(157, new MoveCost("*"), "Growl", 0, 1, 2, 0));
        moveMap.put(158, new Move(158, new MoveCost("EE"), "Thundershock", 20, 1, 2, 0));
        moveMap.put(159, new Move(159, new MoveCost("*"), "Growl", 0, 1, 2, 0));
        moveMap.put(160, new Move(160, new MoveCost("EE"), "Thundershock", 20, 1, 2, 0));
        moveMap.put(161, new Move(161, new MoveCost("E"), "Thundershock", 10, 1, 2, 0));
        moveMap.put(162, new Move(162, new MoveCost("***"), "Fly", 30, 1, 2, 0));
        moveMap.put(163, new Move(163, new MoveCost("WW"), "Surf", 30, 1, 2, 0));
        moveMap.put(164, new Move(164, new MoveCost("WW"), "Surf", 30, 1, 2, 0));
        moveMap.put(165, new Move(165, new MoveCost("E**"), "Agility", 20, 2, 2, 0));
        moveMap.put(166, new Move(166, new MoveCost("EEE*"), "Thunder", 60, 2, 2, 0));
        moveMap.put(167, new Move(167, new MoveCost("EEEE"), "Gigashock", 30, 2, 2, 0));
        moveMap.put(168, new Move(168, new MoveCost("E"), "Thunder Wave", 10, 1, 2, 0));
        moveMap.put(169, new Move(169, new MoveCost("E*"), "Selfdestruct", 40, 1, 2, 0));
        moveMap.put(170, new Move(170, new MoveCost("*"), "Tackle", 10, 1, 2, 0));
        moveMap.put(171, new Move(171, new MoveCost("E*"), "Magnetic Storm", 0, 1, 2, 0));
        moveMap.put(172, new Move(172, new MoveCost("EE*"), "Thunder Wave", 30, 2, 2, 0));
        moveMap.put(173, new Move(173, new MoveCost("EE**"), "Selfdestruct", 80, 2, 2, 0));
        moveMap.put(174, new Move(174, new MoveCost("E*"), "Sonicboom", 20, 2, 2, 0));
        moveMap.put(175, new Move(175, new MoveCost("EEEE"), "Selfdestruct", 100, 2, 2, 0));
        moveMap.put(176, new Move(176, new MoveCost("*"), "Tackle", 10, 1, 2, 0));
        moveMap.put(177, new Move(177, new MoveCost("EE"), "Sonicboom", 30, 2, 2, 0));
        moveMap.put(178, new Move(178, new MoveCost("EEE"), "Energy Spike", 0, 2, 2, 0));
        moveMap.put(179, new Move(179, new MoveCost("**"), "Tackle", 20, 2, 2, 0));
        moveMap.put(180, new Move(180, new MoveCost("EEE"), "Chain Lightning", 20, 2, 2, 0));
        moveMap.put(181, new Move(181, new MoveCost("E"), "Light Screen", 0, 1, 1, 0));
        moveMap.put(182, new Move(182, new MoveCost("**"), "Quick Attack", 10, 1, 1, 0));
        moveMap.put(183, new Move(183, new MoveCost("E"), "Thundershock", 10, 1, 1, 0));
        moveMap.put(184, new Move(184, new MoveCost("E*"), "Thunderpunch", 30, 1, 1, 0));
        moveMap.put(185, new Move(185, new MoveCost("**"), "Double Kick", 20, 2, 2, 2));
        moveMap.put(186, new Move(186, new MoveCost("****"), "Stun Needle", 30, 2, 2, 0));
        moveMap.put(187, new Move(187, new MoveCost("**"), "Quick Attack", 10, 2, 2, 0));
        moveMap.put(188, new Move(188, new MoveCost("EE*"), "Pin Missile", 20, 2, 2, 4));
        moveMap.put(189, new Move(189, new MoveCost("EEEE"), "Thunderstorm", 40, 1, 1, 0));
        moveMap.put(190, new Move(190, new MoveCost("EEE*"), "Thunder", 60, 1, 1, 0));
        moveMap.put(191, new Move(191, new MoveCost("EEEE"), "Thunderbolt", 100, 1, 1, 0));
        moveMap.put(192, new Move(192, new MoveCost("EEE"), "Big Thunder", 0, 1, 1, 0)); //70 dmg at random
        moveMap.put(193, new Move(193, new MoveCost("D"), "Sand Attack", 10, 1, 2, 0));
        moveMap.put(194, new Move(194, new MoveCost("**"), "Slash", 20, 2, 2, 0));
        moveMap.put(195, new Move(195, new MoveCost("DD"), "Fury Swipes", 20, 2, 2, 3));
        moveMap.put(196, new Move(196, new MoveCost("D"), "Dig", 10, 1, 2, 0));
        moveMap.put(197, new Move(197, new MoveCost("DD"), "Mud Slap", 30, 1, 2, 0));
        moveMap.put(198, new Move(198, new MoveCost("DD*"), "Slash", 40, 2, 2, 0));
        moveMap.put(199, new Move(199, new MoveCost("DDDD"), "Earthquake", 70, 2, 2, 0));
        moveMap.put(200, new Move(200, new MoveCost("*"), "Scratch", 10, 1, 2, 0));
        moveMap.put(201, new Move(201, new MoveCost("DD"), "Fury Swipes", 20, 2, 2, 3));
        moveMap.put(202, new Move(202, new MoveCost("DD*"), "Tantrum", 50, 2, 2, 0));
        moveMap.put(203, new Move(203, new MoveCost("D"), "Low Kick", 20, 1, 3, 0));
        moveMap.put(204, new Move(204, new MoveCost("DD*"), "Karate Chop", 50, 2, 3, 0));
        moveMap.put(205, new Move(205, new MoveCost("DD**"), "Submission", 60, 2, 3, 0));
        moveMap.put(206, new Move(206, new MoveCost("DDD*"), "Seismic Toss", 60, 3, 3, 0));
        moveMap.put(207, new Move(207, new MoveCost("D*"), "Stone Barrage", 10, 1, 3, 0)); //X flips until tails
        moveMap.put(208, new Move(208, new MoveCost("DD"), "Harden", 0, 2, 3, 0));
        moveMap.put(209, new Move(209, new MoveCost("DD*"), "Rock Throw", 40, 2, 3, 0));
        moveMap.put(210, new Move(210, new MoveCost("DDD*"), "Avalanche", 60, 3, 3, 0));
        moveMap.put(211, new Move(211, new MoveCost("DDDD"), "Selfdestruct", 100, 3, 3, 0));
        moveMap.put(212, new Move(212, new MoveCost("D"), "Rock Throw", 10, 1, 1, 0));
        moveMap.put(213, new Move(213, new MoveCost("DD"), "Harden", 0, 1, 1, 0));
        moveMap.put(214, new Move(214, new MoveCost("DD"), "Snivel", 0, 1, 2, 0));
        moveMap.put(215, new Move(215, new MoveCost("DD"), "Rage", 10, 1, 2, 0));
        moveMap.put(216, new Move(216, new MoveCost("DD"), "Boomerang", 30, 2, 2, 2));
        moveMap.put(217, new Move(217, new MoveCost("DD*"), "Call For Friend", 0, 2, 2, 0));
        moveMap.put(218, new Move(218, new MoveCost("D*"), "Bone Attack", 10, 2, 2, 0));
        moveMap.put(219, new Move(219, new MoveCost("DDD"), "Wail", 0, 2, 2, 0));
        moveMap.put(220, new Move(220, new MoveCost("DD"), "Stretch Kick", 0, 1, 1, 0));
        moveMap.put(221, new Move(221, new MoveCost("DDD"), "High Jump Kick", 50, 1, 1, 0));
        moveMap.put(222, new Move(222, new MoveCost("D"), "Jab", 20, 1, 1, 0));
        moveMap.put(223, new Move(223, new MoveCost("DD*"), "Special Punch", 40, 1, 1, 0));
        moveMap.put(224, new Move(224, new MoveCost("*"), "Leer", 0, 1, 2, 0));
        moveMap.put(225, new Move(225, new MoveCost("D**"), "Horn Attack", 30, 1, 2, 0));
        moveMap.put(226, new Move(226, new MoveCost("D**"), "Horn Attack", 30, 2, 2, 0));
        moveMap.put(227, new Move(227, new MoveCost("DDDD"), "Ram", 50, 2, 2, 0));
        moveMap.put(228, new Move(228, new MoveCost("*"), "Scratch", 10, 2, 3, 0));
        moveMap.put(229, new Move(229, new MoveCost("DD"), "Sharp Sickle", 30, 3, 3, 0));
        moveMap.put(230, new Move(230, new MoveCost("DDDD"), "Absorb", 40, 3, 3, 0));
        moveMap.put(231, new Move(231, new MoveCost("***"), "Wing Attack", 30, 2, 2, 0));
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
//        cardMap.put(61, new PokemonCard(61, "3D", "Flareon", 22, 2, 60, moveMap.get(94), moveMap.get(95), Type.FIRE, Type.WATER, Type.NONE, new MoveCost("*"), EMPTY_LIST, EMPTY_LIST, false)); //TODO add Eevee to list
//        cardMap.put(62, new PokemonCard(62, "3E", "Flareon", 28, 2, 70, moveMap.get(96), moveMap.get(97), Type.FIRE, Type.WATER, Type.NONE, new MoveCost("*"), EMPTY_LIST, EMPTY_LIST, false)); //TODO add Eevee to list
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
        cardMap.put(73, new PokemonCard(73, "49", "Tentacool", 10, 1, 30, moveMap.get(115), null, Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost(), EMPTY_LIST, singletonList(74), false));
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
//        cardMap.put(90, new PokemonCard(90, "5A", "Vaporeon", 29, 2, 60, moveMap.get(144), moveMap.get(145), Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost("*"), EMPTY_LIST, EMPTY_LIST, false)); //TODO add Eevee to list
//        cardMap.put(91, new PokemonCard(91, "5B", "Vaporeon", 42, 2, 80, moveMap.get(146), moveMap.get(147), Type.WATER, Type.ELECTRIC, Type.NONE, new MoveCost("*"), EMPTY_LIST, EMPTY_LIST, false)); //TODO add Eevee to list
        cardMap.put(92, new PokemonCard(92, "5C", "Omanyte", 19, 2, 40, moveMap.get(148), null, Type.WATER, Type.GRASS, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(93), true));
        cardMap.put(93, new PokemonCard(93, "5D", "Omastar", 32, 3, 70, moveMap.get(149), moveMap.get(150), Type.WATER, Type.GRASS, Type.NONE, new MoveCost("*"), singletonList(92), EMPTY_LIST, true));
        cardMap.put(94, new PokemonCard(94, "5E", "Articuno", 35, 1, 70, moveMap.get(151), moveMap.get(152), Type.WATER, Type.NONE, Type.FIGHTING, new MoveCost("**"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(95, new PokemonCard(95, "5F", "Articuno", 37, 1, 100, moveMap.get(153), null, Type.WATER, Type.NONE, Type.FIGHTING, new MoveCost("**"), EMPTY_LIST, EMPTY_LIST, false));
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
//        cardMap.put(114, new PokemonCard(114, "72", "Jolteon", 24, 2, 60, moveMap.get(185), moveMap.get(186), Type.ELECTRIC, Type.FIGHTING, Type.NONE, new MoveCost("*"), EMPTY_LIST, EMPTY_LIST, false)); //TODO Eevee
//        cardMap.put(115, new PokemonCard(115, "73", "Jolteon", 29, 2, 70, moveMap.get(187), moveMap.get(188), Type.ELECTRIC, Type.FIGHTING, Type.NONE, new MoveCost("*"), EMPTY_LIST, EMPTY_LIST, false)); //TODO Eevee
        cardMap.put(116, new PokemonCard(116, "74", "Zapdos", 40, 1, 80, moveMap.get(189), null, Type.ELECTRIC, Type.NONE, Type.FIGHTING, new MoveCost("**"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(117, new PokemonCard(117, "75", "Zapdos", 64, 1, 90, moveMap.get(190), moveMap.get(191), Type.ELECTRIC, Type.NONE, Type.FIGHTING, new MoveCost("***"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(118, new PokemonCard(118, "76", "Zapdos", 68, 1, 100, moveMap.get(192), null, Type.ELECTRIC, Type.NONE, Type.FIGHTING, new MoveCost("**"), EMPTY_LIST, EMPTY_LIST, false));
        cardMap.put(119, new PokemonCard(119, "77", "Sandshrew", 12, 1, 40, moveMap.get(193), null, Type.FIGHTING, Type.GRASS, Type.ELECTRIC, new MoveCost("*"), EMPTY_LIST, singletonList(120), false));
        cardMap.put(120, new PokemonCard(120, "78", "Sandslash", 33, 2, 70, moveMap.get(194), moveMap.get(195), Type.FIGHTING, Type.GRASS, Type.ELECTRIC, new MoveCost("*"), singletonList(119), EMPTY_LIST, false));
        cardMap.put(121, new PokemonCard(121, "79", "Diglett", 8, 1, 30, moveMap.get(196), moveMap.get(197), Type.FIGHTING, Type.GRASS, Type.ELECTRIC, new MoveCost(), EMPTY_LIST, singletonList(122), false));
        cardMap.put(122, new PokemonCard(122, "7A", "Dugtrio", 36, 2, 70, moveMap.get(198), moveMap.get(199), Type.FIGHTING, Type.GRASS, Type.ELECTRIC, new MoveCost("**"), singletonList(121), EMPTY_LIST, false));
        cardMap.put(123, new PokemonCard(123, "7B", "Mankey", 7, 1, 30, moveMap.get(200), null, Type.FIGHTING, Type.PSYCHIC, Type.NONE, new MoveCost(), EMPTY_LIST, singletonList(124), false));
        cardMap.put(124, new PokemonCard(124, "7C", "Primeape", 35, 2, 70, moveMap.get(201), moveMap.get(202), Type.FIGHTING, Type.PSYCHIC, Type.NONE, new MoveCost("*"), singletonList(123), EMPTY_LIST, false));
        cardMap.put(125, new PokemonCard(125, "7D", "Machop", 20, 1, 50, moveMap.get(203), null, Type.FIGHTING, Type.PSYCHIC, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(126), false));
        cardMap.put(126, new PokemonCard(126, "7E", "Machoke", 40, 2, 80, moveMap.get(204), moveMap.get(205), Type.FIGHTING, Type.PSYCHIC, Type.NONE, new MoveCost("***"), singletonList(125), singletonList(127), false));
        cardMap.put(127, new PokemonCard(127, "7F", "Machamp", 67, 3, 100, moveMap.get(206), null, Type.FIGHTING, Type.PSYCHIC, Type.NONE, new MoveCost("***"), singletonList(126), EMPTY_LIST, false));
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
        cardMap.put(139, new PokemonCard(139, "8B", "Kabuto", 9, 2, 30, moveMap.get(228), null, Type.FIGHTING, Type.GRASS, Type.NONE, new MoveCost("*"), EMPTY_LIST, singletonList(140), true));
        cardMap.put(140, new PokemonCard(140, "8C", "Kabutops", 30, 3, 60, moveMap.get(229), moveMap.get(230), Type.FIGHTING, Type.GRASS, Type.NONE, new MoveCost("*"), singletonList(139), EMPTY_LIST, true));
        cardMap.put(141, new PokemonCard(141, "8D", "Aerodactyl", 28, 2, 60, moveMap.get(231), null, Type.FIGHTING, Type.GRASS, Type.FIGHTING, new MoveCost("**"), EMPTY_LIST, EMPTY_LIST, true));

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
