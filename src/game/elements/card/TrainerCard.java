package game.elements.card;

public class TrainerCard extends Card {

    private boolean isCardDraw;
    private boolean isSabotage;
    private boolean isSearch;
    private boolean isHeal;
    private boolean isEvolutionOnly;

    public TrainerCard() {
        cardID = 0;
        hex = "00";
        name = null;
        isCardDraw = false;
        isSabotage = false;
        isSearch = false;
        isHeal = false;
        isEvolutionOnly = false;
    }

    public TrainerCard(int cardID, String hex, String name, boolean isCardDraw, boolean isSabotage, boolean isSearch,
                       boolean isHeal, boolean isEvolutionOnly) {
        super(cardID, hex, name);
        this.isCardDraw = isCardDraw;
        this.isSabotage = isSabotage;
        this.isSearch = isSearch;
        this.isHeal = isHeal;
        this.isEvolutionOnly = isEvolutionOnly;
    }

    public boolean isCardDraw() {
        return isCardDraw;
    }

    public void setCardDraw(boolean cardDraw) {
        isCardDraw = cardDraw;
    }

    public boolean isSabotage() {
        return isSabotage;
    }

    public void setSabotage(boolean sabotage) {
        isSabotage = sabotage;
    }

    public boolean isSearch() {
        return isSearch;
    }

    public void setSearch(boolean search) {
        isSearch = search;
    }

    public boolean isHeal() {
        return isHeal;
    }

    public void setHeal(boolean heal) {
        isHeal = heal;
    }

    public boolean isEvolutionOnly() {
        return isEvolutionOnly;
    }

    public void setEvolutionOnly(boolean evolutionOnly) {
        isEvolutionOnly = evolutionOnly;
    }
}
