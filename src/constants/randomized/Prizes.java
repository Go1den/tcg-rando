package constants.randomized;

public enum Prizes {

    DO_NOT_CHANGE("Do Not Change"),
    SPECIFY("Specify"),
    RANDOM("Randomize All");

    private final String text;

    Prizes(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
