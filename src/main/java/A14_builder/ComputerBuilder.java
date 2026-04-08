package A14_builder;

public interface ComputerBuilder {

    void buildProcessor();

    void buildRAM();

    void buildHardDrive();

    void buildGraphicsCard();

    void buildOS();

    Computer getComputer();
}
