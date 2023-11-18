package constants.settings;

public enum RetreatCostEnum {

    DO_NOT_CHANGE("Do Not Change"),
    RANDOM_PRESERVE_TYPE("Random, But Mindful of Type"),
    RANDOM("Randomize All");

    private final String text;

    RetreatCostEnum(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
