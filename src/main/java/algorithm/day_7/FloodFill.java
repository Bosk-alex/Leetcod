package algorithm.day_7;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] != newColor) dfs(sr, sc, image, newColor);

        return image;
    }

    private void dfs(int sr, int sc, int[][] image, int newColor) {
        int oldColor = image[sr][sc];
        image[sr][sc] = newColor;

        if (isValid(sr - 1, sc, image, oldColor)) dfs(sr - 1, sc, image, newColor);
        if (isValid(sr, sc + 1, image, oldColor)) dfs(sr, sc + 1, image, newColor);
        if (isValid(sr + 1, sc, image, oldColor)) dfs(sr + 1, sc, image, newColor);
        if (isValid(sr, sc - 1, image, oldColor)) dfs(sr, sc - 1, image, newColor);
    }

    private boolean isValid(int row, int col, int[][] image, int oldColor) {
        return (row >= 0 && row < image.length && col >= 0 && col < image[0].length && image[row][col] == oldColor);
    }
}