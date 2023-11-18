package constants.settings;

public enum MoveEnum {

    DO_NOT_CHANGE("Do Not Change"),
    RANDOM("Randomize All");

    private final String text;

    MoveEnum(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
