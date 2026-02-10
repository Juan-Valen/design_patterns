package A05_singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.setFileName("new_log.txt");
        logger.writeln("Simulation started");
        logger.writeln("Processing data...");
        logger.writeln("Simulation finished");
        logger.close();
    }
}
