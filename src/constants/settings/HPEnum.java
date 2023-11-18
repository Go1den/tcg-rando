package constants.settings;

public enum HPEnum {

    DO_NOT_CHANGE("Do Not Change"),
    RANDOM_BY_STAGE("Random, Proportional to Evolution Stage");

    private final String text;

    HPEnum(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
