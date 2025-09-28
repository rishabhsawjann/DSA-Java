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
/*simple explanation of some thing
Great question 👍 this is where students often get confused.
Let’s carefully see why we do end = mid instead of end = mid - 1 👇

📌 Case: when arr[mid] > arr[mid+1]

This means we are in the decreasing part of the mountain.

Example: arr = [1, 3, 5, 7, 6, 4]
Suppose mid = 3, arr[mid] = 7, arr[mid+1] = 6.

👉 Clearly, 7 might be the peak!
We cannot just throw away index mid, because it could still be the peak.

If we do:
end = mid ✅ → we keep mid inside the search space (safe).

If we do:
end = mid - 1 ❌ → we completely skip mid, and might lose the actual peak.

🔎 Example Walkthrough

arr = [1, 3, 5, 7, 6, 4, 2]
Peak = 7 at index 3

At some step, mid = 3, arr[mid] = 7, arr[mid+1] = 6

If we do end = mid → end = 3. Perfect ✅ we still keep 7 in range.

If we do end = mid - 1 → end = 2. ❌ Oops, we just skipped over 7 and lost the peak.

💡 Rule of Thumb

When condition tells you “mid is still a candidate” → keep it (end = mid).

When condition tells you “mid can’t be the answer” → skip it (start = mid+1).

That’s why:
👉 end = mid (because mid might be the peak).
👉 start = mid + 1 (because mid cannot be the peak if arr[mid] < arr[mid+1])