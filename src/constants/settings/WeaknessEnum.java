package constants.settings;

public enum WeaknessEnum {

    DO_NOT_CHANGE("Do Not Change"),
    RANDOM_BY_EVOLUTION("Random, But Same For Pokemon in Same Evolution Series"),
    RANDOM("Randomize All");

    private final String text;

    WeaknessEnum(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
