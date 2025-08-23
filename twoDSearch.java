import java.util.Arrays;
class twoDSearch{
    public static void main(String args[]) {
       
        //lets  make an array first
        int arr[][]={
            {1,2,3},
            {4,5,6,7},
            {11,12,23},
        };
           int target=11;
           int ans[]=search(arr,target);
           System.out.println(Arrays.toString(ans));
        }

    //lets make a function
    static int[] search(int arr [][],int target)
    {
        for(int row=0;row<arr.length;row++)  
        {
            for(int col=0;col<arr[row].length;col++)
            {
                if(arr[row][col]==target)
                {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
