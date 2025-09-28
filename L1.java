import java.util.Arrays;

class L1 {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(arr));  // Expected output: 2
    }

    static int findNumbers(int[] arr) {
        int result = 0; // total count of numbers with even digits

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;  // digit counter for this number

            // count digits
            while (num > 0) {
                num = num / 10;
                count++;
            }

            // check if even
            if (count % 2 == 0) {
                result++;
            }
        }

        return result;
    }
}

/* Now what if we want to print the elments themselves instead of the number of elements
we can just directly return arr[i] right, yea I think we can do that instead of returning result we can just directly return the arr[i] to the findNumber function*/

class Solution {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        findNumbers(arr);  // prints directly
    }

    static void findNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;

            int temp = num;
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }

            if (count % 2 == 0) {
                System.out.println(arr[i]);  // print directly, we can directly print this inside the function 
            }
        }
    }
}
