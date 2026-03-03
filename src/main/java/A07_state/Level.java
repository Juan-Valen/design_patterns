package A07_state;

public abstract class Level {
    private Character character;

    public Level(Character character) {
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }

    abstract void train();

    abstract void meditate();

    abstract void fight();

    public abstract void showAvailableActions();
}
