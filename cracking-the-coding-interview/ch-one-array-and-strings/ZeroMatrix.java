public class ZeroMatrix{
    public void zeroMatrix(int[][] matrix){
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                if(matrix[row][col] == 0){
                    row[row] = true;
                    col[col] = true;
                }
            }
        }

        for(int i = 0; i < row.length; i++){
            if(row[i]){
                for(int j = 0; j < col.length; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int j = 0; j < col.length; j++){
            if(col[j]){
                for(int i = 0; i < row.length; i++){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}