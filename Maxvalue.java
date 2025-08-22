public class Maxvalue{
    public static void main(String args[])
    {
        int[] arr={1,2,3,4,5};
        System.out.println(max(arr));
    }
    static int max(int[] arr)
    {
        int maxval=arr[0];// we first initialize the max value with the first element of the array
        for(int i=0;i<arr.length;i++)/
        {
            if(arr[i]>maxval)// then we check if the current element is greater than the max value
            {
                maxval=arr[i];// if it is greater then we update the max value
            }
        }
        return maxval;
    }
}