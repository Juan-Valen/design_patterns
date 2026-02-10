package A04_observable;

public class WeatherObserver {
    private String name = "";

    public WeatherObserver(String name) {
        this.name = name;
    }

    public void update(double temperature) {
        System.out.printf("(%s) Temperature update: %.2f C°\n", name, temperature);
    }
}
