public abstract class Map {
    Tile[][] grid = null;

    public void display() {
        if (grid == null) {
            grid = new Tile[4][4];
            for (int r = 0; r < 4; r++) {
                for (int c = 0; c < 4; c++) {
                    grid[r][c] = createTile();
                }
            }
        }
        for (Tile[] row : grid) {
            System.out.printf("[%s] [%s] [%s] [%s]\n", row[0].getCharacter(), row[1].getCharacter(),
                    row[2].getCharacter(),
                    row[3].getCharacter());
        }
    }

    public abstract Tile createTile();
}
