package A04_observable;

import java.util.ArrayList;
import java.util.Random;

public class WeatherStation implements Runnable {
    private double temperature;
    private int max = 45, min = -40;
    private Random random = new Random();
    private ArrayList<WeatherObserver> observers = new ArrayList<WeatherObserver>();

    public WeatherStation() {
        double value = random.nextDouble() * 85 - 40;
        temperature = value;
    }

    public WeatherStation(double temperature) {
        this.temperature = temperature;
    }

    public void addObserver(WeatherObserver obs) {
        observers.add(obs);
    }

    public void removeObserver(int i) {
        observers.remove(i);
    }

    public void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature);
        }
    }

    public void changeTemperature() {
        double value = random.nextDouble() * 8 - 4;
        if (min <= temperature + value && temperature + value <= max) {
            temperature += value;
            notifyObservers();
        }
    }

    public void run() {
        while (true) {
            changeTemperature();
            try {
                int value = random.nextInt(6) + 6;
                Thread.sleep(value * 1000);
            } catch (Exception e) {
                System.out.println("Thread was interrupted: " + e.getMessage());
            }
        }
    }
}
