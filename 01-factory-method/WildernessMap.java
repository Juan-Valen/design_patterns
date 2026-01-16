import java.util.Random;

public class WildernessMap extends Map {

    @Override
    public Tile createTile() {
        Random rand = new Random();
        int randNum = rand.nextInt(3) + 1;
        switch (randNum) {
            case 1:
                return new SwampTile();
            case 2:
                return new WaterTile();
            default:
                return new ForestTile();
        }
    }

}
