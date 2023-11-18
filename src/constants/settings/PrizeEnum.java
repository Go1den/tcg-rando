package constants.settings;

public enum PrizeEnum {

    DO_NOT_CHANGE("Do Not Change"),
    SPECIFY("Specify"),
    RANDOM("Randomize All");

    private final String text;

    PrizeEnum(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
