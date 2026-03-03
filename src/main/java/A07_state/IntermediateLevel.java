package A07_state;

public class IntermediateLevel extends Level {

    public IntermediateLevel(Character character) {
        super(character);

    }

    public void train() {
        getCharacter().addExperience(13);
        changeState();
    };

    public void meditate() {
        if (getCharacter().getHealth() < 200) {
            getCharacter().addHealth(5);
        }
    };

    public void fight() {
    };

    private void changeState() {
        if (getCharacter().getExperience() > 200) {
            getCharacter().setLevel(new ExpertLevel(getCharacter()));
        }
    }

    @Override
    public void showAvailableActions() {
        System.out.println("1. Train");
        System.out.println("2. Meditate");
    }
}
