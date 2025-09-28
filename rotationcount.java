// this is going to be the same code as the pivot code in our java we are just going to add
// we know the number of rotation is the smallest number in the rotated array
// the smallest number lies one index ahead of pivot
// so we can return pivot+1 to get the number of rotations
// my vague idea was that whenever the first element changes that means the rotation happenend
// keep the arr[0] as temp and check if it changes 
// and then we can do count++
//but this works if you are physically rotating the array step by step
// but in our case, we are usually given a final rotated array(not the rotation process)
//so we can't track the changes like that



//Correct way to count the rotations are:
//the number of rotations is basically the index of the minimum element in the rotated array.
// why?
//Original[2,4,5,7,8,9,10,12]
//Rotated[7,8,9,10,12,2,4,5]
//smallest element=2
//index of 2 =5
// so the number of rotation=5
// and we know the smallest number is just one index ahead of pivot in rotated array
// so pivot +1 is our answer
// so lets paste the pivot code here:
//we just have to make a function rotationcount 
//and return pivot +1;

class rotationcount
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
static int count(int arr[])
{
    int pivot=findpivot(arr);
    int count=pivot+1;
    return count;
}

public static void main(String args[])
{
    int arr[]={3,4,5,6,7,0,1,2};
    int ans1=findpivot(arr);
    System.out.println("the pivot is at index: "+ans1);
    int roationcount=count(arr);
    System.out.println("the number of rotations are: "+roationcount);
}
}
// this will not work with duplicate values:
