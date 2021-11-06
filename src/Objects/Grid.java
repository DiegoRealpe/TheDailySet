package Objects;

public class Grid {
    private int[][] grid;

    public Grid(int[][] givenGrid) {
        grid = givenGrid;
    }

    public int[][] getGrid() {
        return grid;
    }
    
    public void setGrid(int[][] grid) {
        this.grid = grid;
    }
}
