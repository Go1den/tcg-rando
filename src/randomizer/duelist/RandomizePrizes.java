package randomizer.duelist;

import constants.settings.PrizeEnum;
import game.elements.Duelist;
import game.elements.GameData;

import java.util.Random;

public class RandomizePrizes {

    public static void randomizePrizes(GameData gameData, PrizeEnum prizes, Random random, int regularPrizes, int bossPrizes) {
        if (PrizeEnum.RANDOM.equals(prizes)) {
            randomizeAllPrizes(gameData, random);
        } else if (PrizeEnum.SPECIFY.equals(prizes)) {
            setPrizesByBattleType(gameData, regularPrizes, bossPrizes);
        }
    }

    private static void randomizeAllPrizes(GameData gameData, Random random) {
        for (Duelist duelist : gameData.getAllDuelists()) {
            duelist.setPrizes(random.nextInt(6) + 1);
            gameData.getDuelistMap().put(duelist.getDuelistID(), duelist);
        }
    }

    private static void setPrizesByBattleType(GameData gameData, int regularPrizes, int bossPrizes) {
        for (Duelist duelist : gameData.getAllDuelists()) {
            duelist.setPrizes(duelist.isBoss() ? bossPrizes : regularPrizes);
            gameData.getDuelistMap().put(duelist.getDuelistID(), duelist);
        }
    }
}
