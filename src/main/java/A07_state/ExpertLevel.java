package A07_state;

public class ExpertLevel extends Level {

    public ExpertLevel(Character character) {
        super(character);
    }

    public void train() {
        getCharacter().addExperience(25);
        changeState();
    };

    public void meditate() {
        if (getCharacter().getHealth() < 500) {
            getCharacter().addHealth(5);
        }
    };

    public void fight() {
        if (getCharacter().getHealth() > 0) {
            getCharacter().addHealth(-15);
        }
        getCharacter().addExperience(65);
        changeState();
    };

    private void changeState() {
        if (getCharacter().getExperience() > 1000) {
            getCharacter().setLevel(new MasterLevel(getCharacter()));
        }
    }

    @Override
    public void showAvailableActions() {
        System.out.println("1. Train");
        System.out.println("2. Meditate");
        System.out.println("3. Fight");
    }
}
