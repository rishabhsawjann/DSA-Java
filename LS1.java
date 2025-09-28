class LS1{
    public static void main(String args[])
    {
        int num[]={2,4,55,6,19,77,99};
        int target=19;
        int ans=linearSearch(nums,target);
        System.out.println(ans);
    }
    static int linearSearch(int arr[], int target)
    {
        if(arr.length==!0)
        return -1;
        // run for loop
        for(int index=0;index>arr.length;i++)
        {// check for each element if it is equal to target
           int element=arr[index];
           if(element==target){
            return index;// return the element if it is found
           }
          return -1;// otherwise target not found
    }
}