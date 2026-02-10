package A04_observable;

import java.util.Random;

public class Main {
    public static void main() {
        WeatherStation station = new WeatherStation();
        station.addObserver(new WeatherObserver("A"));
        station.addObserver(new WeatherObserver("B"));
        station.addObserver(new WeatherObserver("C"));
        station.addObserver(new WeatherObserver("D"));
        station.addObserver(new WeatherObserver("E"));
        station.addObserver(new WeatherObserver("F"));
        station.addObserver(new WeatherObserver("G"));
        station.addObserver(new WeatherObserver("H"));
        station.addObserver(new WeatherObserver("I"));
        station.addObserver(new WeatherObserver("J"));
        Thread stationThread = new Thread(station);
        stationThread.start();

        Random random = new Random();
        try {
            Thread.sleep(20 * 1000);
        } catch (Exception e) {
            System.out.println("Thread was interrupted: " + e.getMessage());
        }
        station.removeObserver(3);
        try {
            int value = random.nextInt(2);
            Thread.sleep(value * 10 * 1000);
        } catch (Exception e) {
            System.out.println("Thread was interrupted: " + e.getMessage());
        }
        stationThread.interrupt();
    }

}
