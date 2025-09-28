
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
