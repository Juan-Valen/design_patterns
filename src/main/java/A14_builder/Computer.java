package A14_builder;

public class Computer {

    private String processor;
    private int RAM;
    private String hardDrive;
    private String graphicsCard;
    private String OS;

    public void setOS(String oS) {
        OS = oS;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    @Override
    public String toString() {
        return String.format("OS: %s, Graphics Card: %s, Hard Drive: %s, Processor: %s, RAM: %d", OS, graphicsCard,
                hardDrive, processor, RAM);
    }

}
