![Dynamic memory allocation](image.png)
int[] arr=new int[5] 
int[]-dataypte
arr-reference variable 
int [] arr- this happens at compiler time:, this is the initialization
new int[5]-object is being created in the heap memory-this is is the declaration and this happens at run time

this is called Dynamic Memory allocation-at the run time memory is allocated

array is a continuous memory allocation
it totally depend on the jvm whether it is going to be continuous or not
![alt text](image-1.png)
1.we know  array objects are created in heap
2.heap object are not continous, java says that 
3.Dyanmic memorey allocation
as array is stored in heap memory and array also may not be continuous 
even though the definition say that it  "array is conitnous memory allocation"
new is the keyword that is used to create an object

![array is initally assigned to null](image-2.png)
when we create array of string
String arr[]=new String[5];
this has five values and 
initially arr[0]=null;
it points to null
primtive cannnot be brokend down into futher data types
and non primitive can be brokend down into further data types


you can print the array using this method too
System.out.ptintln(Arrays.toString(arr));

array of objects:
String[] str=new String[4];
for(int i=0;i<)


Arrays.toSting()-this is the best way of printing the arrays, you dont even have to use for loop to print, you can simply use this function

lets take a code example
import.java.util.Arrays;
import java.util.Scanner()
class one
{
    public static void main(string args[])
    { int size;
        int arr[]=new int[size]
        Scanner sc=new Scanner(System.in)
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        for(int i=0;i<=size;i++)
        {
            System.out.println("Enter the elements in the array");
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        
    }
}


Using function to change the values in the array:

![mutability](image-3.png)
Arrays are mutable in java but string are not mutuable in java

import.java.util.arrays;
public class PassinginFuntions{
    public static void main(String args[])
    {
        int[] nums={3,4,5,12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));  
    }
    static void change(int arr[])
    {
        arr[0]=99;
    }
}



Multidimensinonal arrays

rows= left and right
colums= up and down

array is stored in the heap memory as it is non primitive data types

how is mutlidimensiomal  array stored:
![like this ](image-4.png)
each row is stored in a different array
so if there are three rows then three arrays will be stored in the heap memory:
for example we have array like this:
{1,2,30
 4,5,6
 7,8,9}
 so how does 2D array works basicaly
 its array inside an array:
 these will be divided into three arrays
 [1,2,3] [4,5,6] [7,8,9]

 arr[0]- will point to the first [1,2,3]
 arr[1]- will point to the second[4,5,6]
 arr[2]- will point to the third[7,8,9]

 ![example](image-5.png)
 this is how the 2d array would work:
 the 0th index would store the first row 
 the first index would store the second row
 the second index would store the third row

 ![working of two-2d array](image-6.png) 
 this is how the 2D array works
 first we run a simple for loop for to take the input for the rows
 and then we run the column loop till row.length 
  for(row=0;row<=3;row++)
  {
    for(col=0;col<=arr[row].length;col++){
        arr[row][col]=sc.nextInt();
    }
  }

lets take a program example of taking input of 2D array and printing it 
import java.util.Scanner;
Public class 2D
{
    public static void main(String args[])
    {
        int arr[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        //input 
        
        for(int row=;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                System.out.println("Enter the elements in the 2D array");
                arr[row][col]=sc.nextInt();
            }
        }
        System.out.Println(Arrays.deepToString(arr));
    }
}
        
         //if we would not have use Arrays.deepToString(arr)) we would have to write these three
         //lines below a
        /* 
        for(int row=;row<arr;length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                System.out.println(arr[row][col]+""); 
            }
        */

            System.out.println(); this is necessary to print in the form of matrix otherwise it will print the whole array in one line 
    }
}

we can even use the Arrays.toString  to print the elements in 2D array like this 
for(int row=0;row<arr.length;row++)
{
    System.out.println(Arrays.toString(arr[row]));
}

and you can even use enhanced for loop, if you want to make it shorter
for(int[] a:arr)
{
    System.out.println(Arrays.toString(a));
}

arr[row].length-Explanation
class row
{
    public static void main(String args[])
    int arr[][]={
                {1,2,3,4},
                {5,6},
                {7,8,9}};
    }
    for(int row=0;row<arr.length;row++)
    {
        for (int col=0;col<arr[row].length;col++)
        {
            System.out.print(arr[row][col]+" ");
        }
        System.out.println();
    }

}

in this given 2d array the length of the row is changing 
in  the first row the length is 4
and in the second and third is 2 and 3 
so we  have to use arr[row].length

Now lets jump into ArrayList

so why do we need ArrayList in the first place:
so arrays are good but they are of fixed sized we need to define the size at the begining but what if we don't know how much size we would need, arraylist can change its size automatically

What are the main advantage of arraylist and why do we use in in the first place?

Why Do We Use ArrayList? (Advantages)
1. Dynamic Size

Regular array: Fixed size (like a box that can't change)
ArrayList: Can grow or shrink (like a magic box that expands)

2. Easy to Use

You don't need to worry about size
Just keep adding items, it handles the rest

3. Lots of Helpful Methods

add() - put something in
remove() - take something out
get() - look at something
size() - count how many items
contains() - check if something exists

4. No Memory Waste

Only uses as much space as needed
Automatically manages memory for you -> this  is the most important reason why we use arraylist over arrays there is no wasteage of memory 

Let's take an example and do a simple comparison:


array Example

int arr []=new String[3];
{
    for(int i=0i>3;i++)
    {
       System.out.println("Enter three names);
       arr[i]=sc.nextLine();  -> this is how we take input as a String
    }
    
}

Arraylist example

ArrayList<String> Friends= new ArrayList<>();  ->  this can hold as many names as you would like
friends.add("Friend 1")
friends.add("Friend 2")

When to use ArrayList:
Use ArrayList when:

You don't know how many items you'll have
You want to add/remove items frequently
You want easy methods to work with your data
You want the program to handle size automatically

Lets take a simple example of List

import java.util.ArrayList;
public class SimpleList{
    public static void main(String args[])
    {
        ArrayList<Integer> N=new ArrayList<>();

        // now you can add elements to the arraylist N
        N.add(1);
        N.add(2);
        N.add(5);
        
        //Now you can even remove a number using remove function
        N.remove(2); // this will remove element at index number 2 

        System.out.println("ArrayList="+N);
    }
}

Linear Search:
let's take a simple example of linear search:

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

Time complexity of linear search and Time complexity expainnation in General:

time complexity is [](image-9.png)
so basically time complexity means how much time would your program take to run as the size of the elements increase 
for example if the if you are doing  a linear search and the elemnet is present at the beginning , so the time it will to to find this elemnent will be N
it does not matter how big the array it will take constant time - this is the best case scenario, so the time complexity for best case scenario is O(1):



and if we have an searching for an element that is not present in an array the time will inrease as the size of the array increases this is linear time complexity: and for worst case scenario is O(n)

lets write the same code using function:
import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        int num[]={2,4,55,6,19,77,99};
        int target=19;
        int ans=linearSearch(nums,target);
        System.out.println(ans);
    }
    static int linearSearch(int arr[], int target)
    {
        if(arr.length==0)
        return -1;
        for(int index=0;index>arr.length;i++)
        {
           int element=arr[index];
           if(element==target){
            return index;
           }
          return -1;
    }
}

Let's do an example of doing a Linear Search in String:

class LS{
    public static void main(String args[])
    {
        String name="Rishabh";
        char target='i';
        System.out.println(search(name,target)); // here I will call the function that is actually doing the job:
        
        static boolean search(String str,char target)
        {
           // first simple line if string is empty that return false
           if(str.length()==0)
           {
            return false
           }
           //for loop
           for(int i=0;i<str.length();i++>)
           {
            if(target==str.charAt(i))
            {
                return true;
            }
            return fasle;
           }
        }

    }
}

Next thing we can do is search in range:
for the finding the element when a range is given 
There is nothing that you have to do :
you can just declare a start and an end range, that's it 


We are going to take some examples of Linear Search:
Finding minimum number and maximum number:

for the minmum number, just you have to take the the first element as min and then keep comparing and swaping 
and same for the maximum number 

if you try to make the logic , it is pretty simple:

for the minimum number first 
we have elements in {12,34,3,4,56,3}
int min=arr[0]
for(int i=0;i<arr.length;i++){
if(arr[i]<min)     
{
    min=arr[i];
}
}
and you can make the same logic for finding maximum number too:

lets write this code using function of fiding the minimum number
class Findmin

public class FindMin{
    public static void main(String args[])
    {
        int arr[]={18,12,3,4,5,28};
        System.out.println(min(arr));
    }
    static int min(int arr[])
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];    
            }
        }
        return min;  // thus is using function
    }
}

I have to finish linear Search then binary search and then finish sorting:


Let's do searching in two-D array

Lets write the logic first:
//lets just first write how would i find the element in 2D array:
  /* It is simple as we do in 2D array
  for(row=0;row<arr.lenght;row++) here we are iterating through each row 
  {
  for(col=0;col<arr.[row];col++)// col itself is going to be a row, we iteraiting array inside an array, we have already studied this
  {
      if (arr[row][col]==target)
      {
          return 1
      }
      return -1 
  }
      
  } */

  This is the logic its simple we just iterating through each element:
class Main {
    public static void main(String[] args) {
       
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
    }
}
}


        //how would i find that
        // I would need to divide the numbers and see if it has even number of digits:
        /* so what we can do is
        
       if ( arr[i]<10)
       {
           rem=arr[i]/10 100/10
           count++;// we can consider count=0 in the beginning;
       }
        if(count%2==0)
        {
            System.out.println(arr[i]);
        }
        so my logic is first to extract each digit of the number and then use count function to count many digits are there in a number if and then if the count%2==0;, it has even digits and we will print that number:
        okay lets write the logic for this:
    }
    
}*/

I have the written the proram for this  L1.java file




Rotated Array:
we have been given a rotated sorted array and we need to find the target element in the array
//we need to return the index of the target element
//if the target element is not found, we need to return -1
//we need to use the binary search algorithm to find the target element
// suppose we have an array arr=[2,4,5,7,8,9,10,12]
//after 1 rotation the array will be arr=[12,2,4,5,7,8,9,10]
//after 2 rotations the array will be arr=[10,12,2,4,5,7,8,9]
//after 3 rotations the array will be arr=[9,10,12,2,4,5,7,8]
//after 4 rotations the array will be arr=[8,9,10,12,2,4,5,7]
//after 5 rotations the array will be arr=[7,8,9,10,12,2,4,5]
//after 6 rotations the array will be arr=[5,7,8,9,10,12,2,4]
//after 7 rotations the array will be arr=[4,5,7,8,9,10,12,2]
//after 8 rotations the array will be arr=[2,4,5,7,8,9,10,12]
//we need to find the target element in the array
//we need to return the index of the target element
// first step we would take is to find the pivot of the array
// pivot is the element in the array which is greater than the next element
// in the array arr=[2,4,5,7,8,9,10,12] the pivot is 12
// in the array arr=[12,2,4,5,7,8,9,10] the pivot is 12
// in the array arr=[10,12,2,4,5,7,8,9] the pivot is 12
// in the array arr=[9,10,12,2,4,5,7,8] the pivot is 12
// in the array arr=[8,9,10,12,2,4,5,7] the pivot is 12
// in the array arr=[7,8,9,10,12,2,4,5] the pivot is 12
// in the array arr=[5,7,8,9,10,12,2,4] the pivot is 12
// in the array arr=[4,5,7,8,9,10,12,2] the pivot is 12
// the elements before and after the pivot are sorted
// so we can use binary search to find the target elements before and after the pivot
// if the target element is greater than the pivot, we can search in the elements after the pivot
// if the target element is less than the pivot, we can search in the elements before the pivot
//once the pivot is found we can simply use binary search to find the target element in the array
// we need to return the index of the target element
// if the target element is not found, we need to return -1
// so how would i find the pivot?
// how will I know I have found the pivot
// suppose we have an arr[3,4,5,6,7,0,1,2]
// so we can see that the pivot is 7
//  the the number before the pivot are ascending and the number after the pivot are in descending order
// If my mid is greater that mid+1 that means I have found the pivot and my pivot is arr[mid]
// if my mid is smaller than mid-1 that means that I have found the pivot and it is at mid-1
//
// to find the pivot we can use this condition:
// if arr[mid]> arr[mid+1] then arr[mid] is the pivot
// if arr[mid]< arr[mid-1] then arr[mid-1] is the pivot
// if arr[mid]> arr[start] and arr[mid]< arr[end] then arr[mid] is the pivot

we have these three condition to find the pivot element of an array:

🔹 First, what is pivot?

Pivot = the largest element in rotated sorted array (the "turning point").
Example:
[4, 5, 6, 7, 0, 1, 2] → pivot is 7 (right before the drop to 0).

✅ Condition 1:

if arr[mid] > arr[mid+1] → arr[mid] is the pivot

👉 Think: if the middle element is greater than the next one,
that means you just found the point where array drops.
Example:
[4, 5, 6, 7, 0, 1]
mid = 7, next = 0 → 7 > 0 → pivot is 7.

📌 Easy memory trick: big number followed by smaller = turning point.

✅ Condition 2:

if arr[mid] < arr[mid-1] → arr[mid-1] is the pivot

👉 Here, if mid is smaller than its previous element,
that means mid is the drop, so the previous element is the biggest.
Example:
[4, 5, 6, 7, 0, 1]
mid = 0, prev = 7 → 0 < 7 → pivot is 7.

📌 Easy memory trick: small number after big = big one is pivot.

✅ Condition 3:

if arr[mid] >= arr[start] && arr[mid] <= arr[end] → arr[mid] is the pivot

👉 This one is a little tricky.
It means the array is actually not rotated at all (completely sorted).
Example:
[1, 2, 3, 4, 5, 6]
Here, the pivot is the last element (max), so arr[mid] sits properly between start and end.

📌 Easy memory trick: If array looks normal (sorted), the pivot is just the last element.

🎯 How to remember them:

Drop happens between mid and next → mid is pivot

Drop happens between prev and mid → prev is pivot

No drop (fully sorted) → last element is pivot

👉 So basically:

Look next to mid → if drop → mid is pivot.

Look before mid → if drop → prev is pivot.

If no drop anywhere → array not rotated → pivot at end.

let me write the code for finding the pivot:
class pivot
{
int findpivot(int arr[])
{
    int start=0;
    int end=arr.length-1;
    while(start>=end)
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
    if(arr[start])<=arr[mid]){
        mid=start+1;
    }
    else{
        mid=end-1;
    }
}
}
return -1;// not rotated
public static void main(String args[])
{
    int arr1[]={3,4,5,6,7,0,1,2};
    int arr2[]={6,7,8,9,4,3,2};
    int ans1=findpivot(arr1);
    int ans2=findpivot(arr2);
    System.out.println(ans1);
    System.out.println(ans2);
}
}

To find the element in the rotated sorted array, we have three functions
1. one is the findpivot() which we just wrone above:

2. one it the binary search for finding the element

static int binarysearch(int[] arr, int target, int start, int end){
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    //this is the normal binary search as we do

3.int search() function which is actually checking for the element

static int search(int[] arr, int target) {
    int pivot = findPivot(arr);   // Step 1: find where array is rotated

    if (pivot == -1) {  
        // Step 2a: no rotation → array is fully sorted
        return binarysearch(arr, target, 0, arr.length - 1);
    }

    if (arr[pivot] == target) {  
        // Step 2b: if target itself is at pivot
        return pivot;
    }

    if (target >= arr[0]) {  
        // Step 3: if target is in left sorted part
        return binarysearch(arr, target, 0, pivot - 1);
    }

    // Step 4: otherwise target is in right sorted part
    return binarysearch(arr, target, pivot + 1, arr.length - 1);
}


📌 Case 1: if (pivot == -1)

👉 Means array is not rotated, just a normal sorted array.
➡️ So we search the entire array from index 0 to arr.length-1.

Example:
arr = [1,2,3,4,5], target=3

pivot = -1

binary search(0 to 4) → finds 3 ✅

📌 Case 2: if (arr[pivot] == target)

👉 Pivot element itself is the target.
➡️ Just return its index immediately, no need to search further.

Example:
arr = [4,5,6,7,0,1,2], target=7

pivot = 3 (because 7 > 0)

arr[pivot] == target → return 3 ✅

📌 Case 3: if (target >= arr[0])

👉 Target lies in the left sorted part of the array.
➡️ So, search from 0 to pivot-1.

Example:
arr = [4,5,6,7,0,1,2], target=6

pivot = 3 (7 is pivot)

target=6 ≥ arr[0]=4 → lies in left side [4,5,6]

binary search(0 to 2) → finds 6 ✅

📌 Case 4: else → return binarysearch(arr, target, pivot+1, arr.length-1)

👉 If target is not in the left half, then it must be in the right half.
➡️ So, search from pivot+1 to end.

Example:
arr = [4,5,6,7,0,1,2], target=1

pivot = 3 (7)

target=1 < arr[0]=4 → must be in right side [0,1,2]

binary search(4 to 6) → finds 1 ✅

🎯 Easy way to remember:

No rotation → search entire array.

Pivot itself is the answer → return pivot.

Target bigger than first element → search left side.

Else → search right side.

the cases of the intsearch is explained above:


Now lets write the program for duplicate rotated arrray:

for that we have to one more case:

 Normal case (no duplicates)

Pivot is found using these rules:

If arr[mid] > arr[mid+1] → pivot is mid.

If arr[mid] < arr[mid-1] → pivot is mid-1.

Else, check which side is sorted:

If left part (arr[start] → arr[mid]) is sorted, pivot must be on the right → start = mid+1.

Else pivot is on the left → end = mid-1.

This works because no two values are equal, so you always know which half is sorted.

⚠️ What happens with duplicates?

Example:
arr = {2, 9, 9, 9, 10, 2, 2}

Here, if arr[start] == arr[mid] == arr[end] = 9,
you can’t tell if pivot is left or right → both sides look the same.

👉 So, we shrink the search space by ignoring duplicates:

Do start++ and end-- until things become clear.

✅ Steps to Remember

Think of it like a decision tree:

Check if mid is pivot

If arr[mid] > arr[mid+1] → return mid.

If arr[mid] < arr[mid-1] → return mid-1.

If stuck with duplicates

If arr[start] == arr[mid] == arr[end], move both ends:
start++, end--.

Else use normal binary search rules

If left half sorted → go right.

Else → go left.

okay so there would be one more case here that would be added here:

 // Case 3: if arr[start] == arr[mid] == arr[end]
        if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
            // skip duplicates
            if (start < end && arr[start] > arr[start + 1]) {
                return start;
            }
            start++;

            if (end > start && arr[end - 1] > arr[end]) {
                return end - 1;
            }
            end--;

// this is the case for the duplicate values of rotated array 


// Now the next question is how to count the number of rotations:;
what I was thinking is whenever the first element changes that means the rotation happenend
keep the arr[0] as temp and check if it changes 
and then we can do count++, would that work