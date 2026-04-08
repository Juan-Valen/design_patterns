package A14_builder;

public class ComputerDirector {

    private ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public void constructComputer() {
        builder.buildOS();
        builder.buildRAM();
        builder.buildHardDrive();
        builder.buildProcessor();
        builder.buildGraphicsCard();
    }
}
