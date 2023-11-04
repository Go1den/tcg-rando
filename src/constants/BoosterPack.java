package constants;

public enum BoosterPack {

    COLOSSEUM(1),
    MYSTERY(2),
    LABORATORY(3),
    EVOLUTION(4);

    private final int packID;

    BoosterPack(int packID) {
        this.packID = packID;
    }

    public int getPackID() {
        return packID;
    }
}
