import java.util.Scanner;
public class TwoDarray
{
    public static void main(String args[])
    {
        int arr[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        //input 
        
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                System.out.println("Enter the elements in the 2D array");
                arr[row][col]=sc.nextInt();
            }
        }
        //output, now lets print this 
         
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                System.out.println(arr[row][col]+""); 
            }
            System.out.println();// this is necessary to print in the form of matrix otherwise it will print the whole array in one line 
    }
}
}