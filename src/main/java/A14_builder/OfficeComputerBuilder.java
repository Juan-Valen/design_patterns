package A14_builder;

public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer;

    OfficeComputerBuilder() {
        computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor("AMD 3");
    }

    @Override
    public void buildRAM() {
        computer.setRAM(16);

    }

    @Override
    public void buildHardDrive() {
        computer.setHardDrive("HDD - 1 TB");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard(" - ");
    }

    @Override
    public void buildOS() {
        computer.setOS("Windows 11");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
