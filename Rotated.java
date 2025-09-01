//we have been given a rotated sorted array and we need to find the target element in the array
//we need to return the index of the target element
//if the target element is not found, we need to return -1
//we need to use the binary search algorithm to find the target element
// suppose we have an array arr=[2,4,5,7,8,9,10,12]
//after 1 rotation the array will be arr=[12,2,4,5,7,8,9,10]
//after 2 rotations the array will be arr=[10,12,2,4,5,7,8,9]
//after 3 rotations the array will be arr=[9,10,12,2,4,5,7,8]
//after 4 rotations the array will be arr=[8,9,10,12,2,4,5,7]
//after 5 rotations the array will be arr=[7,8,9,10,12,2,4,5]
//after 6 rotations the array will be arr=[5,7,8,9,10,12,2,4]
//after 7 rotations the array will be arr=[4,5,7,8,9,10,12,2]
//after 8 rotations the array will be arr=[2,4,5,7,8,9,10,12]
//we need to find the target element in the array
//we need to return the index of the target element
// first step we would take is to find the pivot of the array
// pivot is the element in the array which is greater than the next element
// in the array arr=[2,4,5,7,8,9,10,12] the pivot is 12
// in the array arr=[12,2,4,5,7,8,9,10] the pivot is 12
// in the array arr=[10,12,2,4,5,7,8,9] the pivot is 12
// in the array arr=[9,10,12,2,4,5,7,8] the pivot is 12
// in the array arr=[8,9,10,12,2,4,5,7] the pivot is 12
// in the array arr=[7,8,9,10,12,2,4,5] the pivot is 12
// in the array arr=[5,7,8,9,10,12,2,4] the pivot is 12
// in the array arr=[4,5,7,8,9,10,12,2] the pivot is 12
// the elements before and after the pivot are sorted
// so we can use binary search to find the target elements before and after the pivot
// if the target element is greater than the pivot, we can search in the elements after the pivot
// if the target element is less than the pivot, we can search in the elements before the pivot
// we can use binary search to find the target element in the array
// we need to return the index of the target element
// if the target element is not found, we need to return -1
// we need to use the binary search algorithm to find the target element
// we need to return the index of the target element
// if the target element is not found, we need to return -1 
// so how would i find the pivot?
// to find the pivot we can use this condition:
// if arr[mid]> arr[mid+1] then arr[mid] is the pivot
// if arr[mid]< arr[mid-1] then arr[mid-1] is the pivot
// if arr[mid]> arr[start] and arr[mid]< arr[end] then arr[mid] is the pivot
//3. Simple Explanation of Cases ✅
// 🔹 Case 1:
//
// if (arr[mid] > arr[mid+1]) return mid;
// 👉 Pivot is exactly at mid because the next element is smaller.
//
// Example:
// [10, 12, 2, 4]
//
// mid = 1 (12), arr[mid] > arr[mid+1] → pivot = 12.
//
// 🔹 Case 2:
//
// if (arr[mid] < arr[mid-1]) return mid-1;
// 👉 Pivot is just before mid, because mid is smaller than its previous element.
//
// Example:
// [10, 12, 2, 4]
//
// mid = 2 (2), arr[mid] < arr[mid-1] → pivot = 12.
//
// 🔹 Case 3:
//
// if (arr[mid] <= arr[start]) end = mid-1;
// 👉 If mid is smaller than start, it means pivot lies on the left side.
//
// Example:
// [10, 12, 2, 4]
//
// start = 0 (10), mid = 2 (2) → since 2 < 10, pivot must be in left half.
//
// 🔹 Case 4:
//
// else start = mid+1;
// 👉 Otherwise, pivot is on the right side.
//
// Example:
// [4, 5, 7, 8, 9, 10, 12, 2]
//
// mid = 3 (8), since 8 > start (4), pivot is to the right.
//
// 4. Easy Way to Remember 🎯
//
// Think of pivot as “the point where the array breaks its order.”
//
// Look at mid and compare it with neighbors:
//
// If mid > mid+1 → break happens here (pivot = mid).
//
// If mid < mid-1 → break happens before mid (pivot = mid-1).
//
// If no break found yet:
//
// If mid is smaller than start → go left.
//
// Otherwise → go right.
//
// That’s it ✅

import java.util.*;
class Rotated{
    public static void main(String args[])
    {
        int[] arr={2,4,5,7,8,9,10,12};
        int target=8;
        int result = search(arr, target);
        System.out.println("Target " + target + " found at index: " + result);
    }
    static int search(int[] arr,int target)
    {
        int pivot=findPivot(arr);
        if(pivot==-1)
        {
            return binarysearch(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target)
        {
            return pivot;
        }
        if(target>=arr[0])
        {
            return binarysearch(arr,target,0,pivot-1);
        }
        return binarysearch(arr,target,pivot+1,arr.length-1);
    }
    
    static int binarysearch(int[] arr, int target, int start, int end){
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    
    static int findPivot(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            
            //Case 1:mid 
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            //Case 2
            if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            //Case 3
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            //Case 4
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
