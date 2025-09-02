// The code to find the pivot in a rotated sorted array with duplicate values
// the code is exactly same we will just add one more case
/* 
if (arr[start] == arr[mid] && arr[mid] == arr[end]) { 
    if (start < end && arr[start] > arr[start + 1]) {
        return start;
    }
    start++;

    if (end > start && arr[end - 1] > arr[end]) {
        return end - 1;
    }
    end--;
}
// the working of the code is explained down below:
first step :if(arr[start] && arr[mid]== arr[end])
this means start,mid and end are all equal.
Example[2,2,2,3,1,2,2]
When this happens,we cannot decide which side is sorted
because both the sides look same
so we try to shrink the search space from both ends:

Second Step:
check the pivot at the left edge
     if (start < end && arr[start] > arr[start + 1]) {
    return start;
}
it is simple if the next element after start is smaller
it means the pivot is right here
Example: [3, 1, 2] → here 3 > 1, 
so pivot is at index 0.

third step:
If not found, just move start forward by 1 
(ignore it, since it's equal to others and not giving info).

This helps skip duplicates.

we just do start++;

fourth step:
     if (end > start && arr[end - 1] > arr[end]) {
    return end - 1;
}
if the previous element is bigger than the end,
then the pivot is right there
xample: [2, 3, 1] → here 3 > 1,
 so pivot is at index 1.

fifth step:;
If still not found, move end backward by 1 
(again skipping duplicates).

we just do end--;

*/
class DuplicateRotatedPivot {
    static int findPivotWithDuplicates(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: mid is the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: mid-1 is the pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            //  Case 3: Handle duplicates
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                // Check if start itself is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // Check if end itself is pivot
                if (end > start && arr[end - 1] > arr[end]) {
                    return end - 1;
                }
                end--;
            }

            // Case 4: If left side is sorted, pivot must be on right
            else if (arr[start] <= arr[mid]) {
                start = mid + 1;
            }
            // Case 5: Otherwise, pivot is on left
            else {
                end = mid - 1;
            }
        }

        return -1; // No pivot found (array not rotated)
    }

    public static void main(String args[]) {
        int arr1[] = {3, 4, 5, 6, 7, 0, 1, 2};      // Normal rotated
        int arr2[] = {2, 2, 2, 3, 4, 2};            // With duplicates
        int arr3[] = {1, 2, 3, 4, 5};               // Not rotated
        int arr4[] = {2, 2, 2, 2, 2};               // All duplicates

        System.out.println("Pivot in arr1: " + findPivotWithDuplicates(arr1)); // 4
        System.out.println("Pivot in arr2: " + findPivotWithDuplicates(arr2)); // 4
        System.out.println("Pivot in arr3: " + findPivotWithDuplicates(arr3)); // -1
        System.out.println("Pivot in arr4: " + findPivotWithDuplicates(arr4)); // -1
    }
}


