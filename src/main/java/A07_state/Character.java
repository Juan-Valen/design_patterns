package A07_state;

class Character {
    private String name;
    private Level level;
    private int experience;
    private int health;

    public Character(String name) {
        this.name = name;
        experience = 0;
        health = 100;
        level = new NoviceLevel(this);
    }

    public void displayStatus() {
        System.out.println("===== CHARACTER STATUS =====");
        System.out.println("Name: " + name);
        System.out.println("Level: " + getLevel());
        System.out.println("Experience: " + experience);
        System.out.println("Health: " + health);
        System.out.println();
        System.out.println("Available actions:");
        level.showAvailableActions();
        System.out.println("0 - Exit");
        System.out.println("============================");
    }

    public void train() {
        level.train();
    }

    public void meditate() {
        level.meditate();
    }

    public void fight() {
        level.fight();
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getHealth() {
        return health;
    }

    public int getExperience() {
        return experience;
    }

    public String getName() {
        return name;
    }

    public String getLevel() {
        if (level instanceof NoviceLevel) {
            return "novice level";
        } else if (level instanceof IntermediateLevel) {
            return "intermidiate level";
        } else if (level instanceof ExpertLevel) {
            return "expert level";
        } else if (level instanceof MasterLevel) {
            return "master level";
        }

        return "";
    }

    public void addExperience(int value) {
        experience += value;
    }

    public void addHealth(int value) {
        health += value;
    }
}
