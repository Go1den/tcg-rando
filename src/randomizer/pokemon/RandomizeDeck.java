package randomizer.pokemon;

import constants.Type;
import game.elements.Deck;
import game.elements.GameData;
import game.elements.card.Card;
import game.elements.card.TrainerCard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static randomizer.utilites.Utilities.getRandomNonColorlessType;

public class RandomizeDeck {

//    11, 11, 4, 10, 24

    public static Deck getRandomizedStarterDeck(GameData gameData, Random random) {
        List<Integer> cards = new ArrayList<>();

        //Each starter deck will use 2 of the types
        Type type1 = getRandomNonColorlessType(random);
        Type tempType2 = getRandomNonColorlessType(random);
        while (type1.getTypeName().equals(tempType2.getTypeName())) {
            tempType2 = getRandomNonColorlessType(random);
        }
        Type type2 = tempType2;

        //Get 11 Pokemon of each main type by familyID

        //Get 4 colorless Pokemon by familyID

        //Get 7 trainer cards, and duplicate 3 of them to total 10
        List<Integer> trainerIDs = gameData.getAllTrainerCards().stream().map(TrainerCard::getCardID).collect(Collectors.toList());
        Collections.shuffle(trainerIDs, random);
        trainerIDs = trainerIDs.subList(0, 7);
        trainerIDs.add(trainerIDs.get(0));
        trainerIDs.add(trainerIDs.get(1));
        trainerIDs.add(trainerIDs.get(2));
        Collections.sort(trainerIDs);
        System.out.println(trainerIDs);
        cards.addAll(trainerIDs);

        //Get 12 energy cards of each of the two main deck types
        List<Integer> energyCardIDs = gameData.getAllEnergyCards().stream()
                .filter(x -> x.getType().getTypeName().equals(type1.getTypeName())
                || x.getType().getTypeName().equals(type2.getTypeName()))
                .map(Card::getCardID).collect(Collectors.toList());
        energyCardIDs.add(energyCardIDs.get(0));
        energyCardIDs.add(energyCardIDs.get(0));
        energyCardIDs.add(energyCardIDs.get(0));
        energyCardIDs.add(energyCardIDs.get(0));
        energyCardIDs.add(energyCardIDs.get(0));
        energyCardIDs.add(energyCardIDs.get(0));
        energyCardIDs.add(energyCardIDs.get(0));
        energyCardIDs.add(energyCardIDs.get(0));
        energyCardIDs.add(energyCardIDs.get(0));
        energyCardIDs.add(energyCardIDs.get(0));
        energyCardIDs.add(energyCardIDs.get(0));

        energyCardIDs.add(energyCardIDs.get(1));
        energyCardIDs.add(energyCardIDs.get(1));
        energyCardIDs.add(energyCardIDs.get(1));
        energyCardIDs.add(energyCardIDs.get(1));
        energyCardIDs.add(energyCardIDs.get(1));
        energyCardIDs.add(energyCardIDs.get(1));
        energyCardIDs.add(energyCardIDs.get(1));
        energyCardIDs.add(energyCardIDs.get(1));
        energyCardIDs.add(energyCardIDs.get(1));
        energyCardIDs.add(energyCardIDs.get(1));
        energyCardIDs.add(energyCardIDs.get(1));
        cards.addAll(energyCardIDs);
        Collections.sort(cards);
        System.out.println(cards);
        return null;
    }
}
