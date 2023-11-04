package constants;

public enum Type {

    FIRE("F"),
    WATER("W"),
    ELECTRIC("E"),
    GROUND("D"),
    PSYCHIC("P"),
    GRASS("G"),
    NORMAL("N"),
    COLORLESS("*");

    private final String typeName;

    Type(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }
}
