package constants.settings;

public enum PokemonType {

    DO_NOT_CHANGE("Do Not Change"),
    RANDOM_BY_EVOLUTION("Random, But Same For Pokemon in Same Evolution Series"),
    RANDOM("Randomize All");

    private final String text;

    PokemonType(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
