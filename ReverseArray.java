public class ReverseArray{
    public static void main(String args[])
    {
        int[] arr={1,2,3,4,5};
        reverse(arr);// calling the reverse function here 
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int arr[])
    {
        int n=arr.length();
        int first=0;
        int last=n-1;
        while(first<last)
        {
            //swap
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
    }
}