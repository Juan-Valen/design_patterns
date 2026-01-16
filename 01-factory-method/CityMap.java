import java.util.Random;

public class CityMap extends Map {

    @Override
    public Tile createTile() {
        Random rand = new Random();
        int randNum = rand.nextInt(3) + 1;
        switch (randNum) {
            case 1:
                return new RoadTile();
            case 2:
                return new ForestTile();
            default:
                return new BuildingTile();
        }
    }

}
