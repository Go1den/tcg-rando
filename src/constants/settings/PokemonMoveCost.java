package constants.settings;

public enum PokemonMoveCost {

    DO_NOT_CHANGE("Do Not Change"),
    RANDOM_PRESERVE_TOTAL_COST_AND_TYPE("Random, Preserving Total Cost and Mindful of Type"),
    RANDOM_PRESERVE_TOTAL_COST("Random, Preserving Total Cost of Original Move"),
    RANDOM_PRESERVE_MOVE_TYPE("Random, But Mindful of Type"),
    RANDOM("Randomize All");

    private final String text;

    PokemonMoveCost(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
