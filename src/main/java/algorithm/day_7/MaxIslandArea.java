package algorithm.day_7;

public class MaxIslandArea {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 2) continue;
                if (grid[row][col] == 1) max = Math.max(max,dfs(row, col, grid));
            }
        }

        return max;
    }

    private int dfs(int sr, int sc, int[][] image) {
        int area = 1;
        image[sr][sc] = 2;

        if (isValid(sr - 1, sc, image)) area += dfs(sr - 1, sc, image);
        if (isValid(sr, sc + 1, image)) area += dfs(sr, sc + 1, image);
        if (isValid(sr + 1, sc, image)) area += dfs(sr + 1, sc, image);
        if (isValid(sr, sc - 1, image)) area += dfs(sr, sc - 1, image);

        return area;
    }

    private boolean isValid(int row, int col, int[][] image) {
        return (row >= 0 &&
                row < image.length &&
                col >= 0 &&
                col < image[0].length &&
                image[row][col] == 1);
    }
}
