import java.util.Arrays;

class MatrixMultiplication {
    static int[][] Multi(int matrix1[][], int matrix2[][]) {
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;

        int newmatrix[][] = new int[row1][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    newmatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return newmatrix;
    }

    public static void main(String args[]) {
        int matrix1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int matrix2[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int newmatrix[][] = Multi(matrix1, matrix2);// the array that we storing the new matrix in we 
        // just have to run the loop for that array once and then use Arrays.toString
        for (int i = 0; i < newmatrix.length; i++) {
            System.out.println(Arrays.toString(newmatrix[i]));
        }
    }
}
