//733. Flood Fill
public class FloodFill{
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor){
        if(image[sr][sc] == newColor){
            return image;
        }
        //Calling DFS
        fill(image, sr, sc, image[sr][sc], newColor);
        return image;
    }
    public void fill(int[][] image, int row, int col, int color, int newColor){
        if(row < 0 || row >= image.length || col < 0 || col >= image[0].length || image[row][col] != color){
            return;
        }

        image[row][col] = newColor; // Changing new color as same pixel in first clicked ones
        fill(image, row + 1, col, color, newColor); //UP
        fill(image, row - 1, col, color, newColor); //DOWN
        fill(image, row, col + 1, color, newColor); //RIGHT
        fill(image, row, col - 1, color, newColor); //LEFT
    }
}