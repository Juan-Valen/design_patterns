package A07_state;

public class NoviceLevel extends Level {

    public NoviceLevel(Character character) {
        super(character);

    }

    public void train() {
        getCharacter().addExperience(2);
        changeState();
    };

    public void meditate() {
    };

    public void fight() {
    };

    private void changeState() {
        if (getCharacter().getExperience() > 50) {
            getCharacter().setLevel(new IntermediateLevel(getCharacter()));
        }
    }

    @Override
    public void showAvailableActions() {
        System.out.println("1. Train");
    }
}
