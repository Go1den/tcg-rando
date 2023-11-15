package game.elements;

import constants.Type;

public class PokemonPower extends Move {

    private Type originalPokemonType;

    public PokemonPower() {
        super();
        originalPokemonType = null;
    }

    public PokemonPower(int moveID, String name, int evolutionStage, int maxEvolutionStage, Type originalPokemonType) {
        super(moveID, name, evolutionStage, maxEvolutionStage);
        this.originalPokemonType = originalPokemonType;
    }

    public Type getOriginalPokemonType() {
        return originalPokemonType;
    }

    public void setOriginalPokemonType(Type originalPokemonType) {
        this.originalPokemonType = originalPokemonType;
    }
}
