public class LS{
    public static void main(String args[])
    {
        int arr[]={18,12,9,14,77,50};
        //find whether 14 exists in array or not.
        int n=14;
        boolean found=false;
        for(int i =0;i<arr.length;i++)
        {
            if (arr[i]==n)
            {
                found=true;
                break;
            }
        }
        if(found)
        {
            System.out.println("the number is present");
        }
        else{
            System.out.println("the number is not present");
        }
    }
}