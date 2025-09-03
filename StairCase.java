/* this is the program where we are given a 2d matrix array with 
sorted columns and row
for example 
the array is  like this:
[0,0]=10   [0,1]=20   [0,2]=30   [0,3]=40
[1,0]=15   [1,1]=25   [1,2]=35   [1,3]=45
[2,0]=28   [2,1]=29   [2,2]=37   [2,3]=49
[3,0]=33   [3,1]=34   [3,2]=38   [3,3]=50

now we consider the start at(0,0) and end at(0,3)
Step-by-step movement (start top-right):

Start at (0,3) → 40

Compare: 40 < 49 → target is bigger.

So we move down (r=1).

Now at (1,3) → 45

Compare: 45 < 49 → target is bigger.

Move down (r=2).

Now at (2,3) → 49

Compare: 49 == 49 🎯 Target found.

if the target is bigger  we move down we do row++ because bigger elements are down

if the target is smaller we move left we do col-- because smaller elements are on left

so we keep eliminating rows anc col 1 by 1 which does not have the target


Matrix:
[
  [10, 20, 30, 40],
  [15, 25, 35, 45],
  [28, 29, 37, 49],
  [33, 34, 38, 50]
]

Search target = 37

We start from top-right corner (row=0, col=3)

Step 1:
  [10, 20, 30, (40)]
                ^
                upperbound
Compare 40 with 37 → 40 > 37 → move LEFT (col--)

Step 2:
  [10, 20, (30), xx]
             ^
             upperbound
Compare 30 with 37 → 30 < 37 → move DOWN (row++)

Step 3:
  [xx, xx, (35), xx]
             ^
             upperbound
Compare 35 with 37 → 35 < 37 → move DOWN (row++)

Step 4:
  [xx, xx, (37), xx]
             ^
             upperbound
Compare 37 with 37 → 🎯 FOUND!

-----------------------------------------
Easy way to remember:
- If current > target → move LEFT (smaller numbers are left).
- If current < target → move DOWN (bigger numbers are down).
- Condition (r < matrix.length && c >= 0) keeps us INSIDE the matrix.
-----------------------------------------
*/
import java.util.Arrays;
class StairCase
{
    static int[] search(int arr[][],int target)
    {
        int row=0;
        int col=arr[0].length-1;
        while(row<arr.length && col>=0)// this condition keeps us inside the matrix:
        {
            if(arr[row][col]==target)// taget is found
        {
            return new int[]{row,col};
        }
        if(target>arr[row][col])
        {
            row++;
        }
        else
        {
            col--;
        }
    }
    return new int[]{-1,-1};
    }
    public static void main(String args[])
    {
        int arr[][]={{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        int target=37;
        int ans[]=search(arr,target);// calling the search method to search the target in the array
        System.out.println(Arrays.toString(ans));
    }
}