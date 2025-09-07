import java.util.*;

class Matrix {

    // Function to take input in a 2D array
    static void inputMatrix(int[][] arr, Scanner sc) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print("Enter element for [" + row + "][" + col + "]: ");
                arr[row][col] = sc.nextInt();
            }
        }
    }

    // Function to print the matrix
    static void printMatrix(int[][] arr) {
        System.out.println("\nMatrix form:");
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];   // 3x3 matrix

        inputMatrix(arr, sc);   // calling input function
        printMatrix(arr);       // calling print function
    }
}
