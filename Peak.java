class Peak {
    static int peakindex(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // peak is mid or before
                end = mid;
            } else {
                // peak is after mid
                start = mid + 1;
            }
        }
        return start;  // or end (same here)
    }

    public static void main(String args[]) {
        int arr[] = {1, 3, 5, 7, 6, 4, 2};
        int ans = peakindex(arr);
        System.out.println(ans); // prints 3 (index of peak value 7)
    }
}
