package A07_state;

public class MasterLevel extends Level {
    private Character character;

    public MasterLevel(Character character) {
        super(character);

    }

    public Character getCharacter() {
        return character;
    }

    public void train() {
    };

    public void meditate() {
    };

    public void fight() {
    };

    @Override
    public void showAvailableActions() {
    }
}
