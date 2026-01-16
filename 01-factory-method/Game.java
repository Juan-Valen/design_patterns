public class Game {

    public static void main(String[] args) {
        Game game = new Game();
        Map map = game.createMap();
        map.display();
    }

    public Map createMap() {
        return new CityMap();
    };
}
