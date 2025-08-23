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
