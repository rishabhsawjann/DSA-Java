import java.util.*;
class ThreeDarray{
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);

        // input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print("Enter element for [" + row + "][" + col + "]: ");
                arr[row][col] = sc.nextInt();
            }
        }

        // output
        //System.out.println("2D Array: " + Arrays.deepToString(arr));- this will print the array in one line

          System.out.println("\nMatrix form:");
        for (int row = 0; row < arr.length; row++) {// we just have to use the same row loop
        // and use Arrays.toString to print it will print in matrix form
            System.out.println(Arrays.toString(arr[row]));  // prints one row at a time
        }
    }
}
