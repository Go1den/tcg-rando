package constants.settings;

public enum PokemonTypeEnum {

    DO_NOT_CHANGE("Do Not Change"),
    RANDOM_BY_EVOLUTION("Random, But Same For Pokemon in Same Evolution Series"),
    RANDOM("Randomize All");

    private final String text;

    PokemonTypeEnum(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
