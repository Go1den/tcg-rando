package constants.settings;

public enum MoveEnum {

    DO_NOT_CHANGE("Do Not Change"),
    RANDOM_SAME_NUMBER("Random, but Same Number of Moves as Original Card"),
    RANDOM_SAME_TYPE("Random, but Move Type Matches Card"),
    RANDOM("Randomize All");

    private final String text;

    MoveEnum(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
