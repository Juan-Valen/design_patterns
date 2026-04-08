package A14_builder;

public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;

    GamingComputerBuilder() {
        computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor("AMD 5");
    }

    @Override
    public void buildRAM() {
        computer.setRAM(64);

    }

    @Override
    public void buildHardDrive() {
        computer.setHardDrive("HDD - 2 TB");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("Nvidia 3060 TI");
    }

    @Override
    public void buildOS() {
        computer.setOS("Steam OS");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }

}
