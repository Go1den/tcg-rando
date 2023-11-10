package constants;

public enum Type {

    FIRE("Fire"),
    WATER("Water"),
    ELECTRIC("Electric"),
    GROUND("Ground"),
    PSYCHIC("Psychic"),
    GRASS("Grass"),
    NORMAL("Normal"),
    COLORLESS("Colorless"),
    NONE("None");

    private final String typeName;

    Type(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }
}
