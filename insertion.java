// this is the program for insertion sort:
class insertion
{
    static void insertionsort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
        public static void main(String args[])
        {
            int arr[]={5,4,3,2,1};
            insertionsort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}