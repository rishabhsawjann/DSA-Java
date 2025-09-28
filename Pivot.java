class Pivot
{
static int findpivot(int arr[])
{
    int start=0;
    int end=arr.length-1;
    while(start<=end)
    {
        int mid=start+(end-start)/2;
    //Case 1:mid is the pivot
    if(mid<end && arr[mid]>arr[mid+1])
    {
        return mid;
    }
    //Case 2:mid-1 is the pivot
    if(mid>start && arr[mid]<arr[mid-1]){
        return mid-1;
    }
    // Case 3:if left part is sorted then pivot on the right 
    if(arr[start]<=arr[mid]){
        start=mid+1;
    }
    else{
        end=mid-1;
    }
    }
    return -1;
}

public static void main(String args[])
{
    int arr[]={3,4,5,6,7,0,1,2};
    //int arr2[]={6,7,8,9,4,3,2};
    int ans1=findpivot(arr);
    //int ans2=findpivot(arr2);
    System.out.println(ans1);
    //System.out.println(ans2);
}
}
// this is the code for finding the pivot now lets make the code for finding the target element in rotated sorted array
// okay I was thinking what if the arr={9,8,7,6,5,3,2,1}
// this is the descending rotated sorted array
// so we have to reverese the logic for this

