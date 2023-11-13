package constants;

public enum Type {

    FIRE("Fire", "F"),
    WATER("Water", "W"),
    ELECTRIC("Electric", "E"),
    FIGHTING("Fighting", "D"),
    PSYCHIC("Psychic", "P"),
    GRASS("Grass", "G"),
    NORMAL("Normal", "N"),
    COLORLESS("Colorless", "*"),
    NONE("None", "N/A");

    private final String typeName;

    private final String typeLetter;

    Type(String typeName, String typeLetter) {
        this.typeName = typeName;
        this.typeLetter = typeLetter;
    }

    public String getTypeName() {
        return typeName;
    }

    public String getTypeLetter() {
        return typeLetter;
    }
}
