package constants.settings;

public enum HP {

    DO_NOT_CHANGE("Do Not Change"),
    RANDOM_BY_STAGE("Random, Proportional to Evolution Stage");

    private final String text;

    HP(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
