package algorithm.day_7;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        char[][] status = new char[image.length][image[0].length];

        dfs(sr, sc, image, status, newColor);

        return image;
    }

    private void dfs(int sr, int sc, int[][] image, char[][] status, int newColor) {

        image[sr]
    }
}
