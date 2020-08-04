public class RotateMatrix{
    public void rotateMatrixInPlace(int[][] matrix){
        int n = matrix.length();
        //i = ceil(n/2)
        for(int i = 0; i < n / 2 + n % 2; i++){
            for(int j = 0; j < n / 2; j++){
                int[] temp = new int[4];
                int[] curr = {i, j};
                for(int k = 0; k < 4; k++){
                    temp[k] = matrix[curr[0]][curr[1]];
                    curr = rotater(curr[0], curr[1], n);
                }
                for(int k = 0; k < 4; k++){
                    matrix[curr[0]][curr[1]] = temp[(k + 3) % 4];
                    curr = rotater(curr[0], curr[1], n);
                }
             }
        }
    }
    public int[] rotater(int i, int j, int n){
        return new int[] {j, n - i - 1};
    }

}