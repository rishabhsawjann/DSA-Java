import java.util.ArrayList;
import java.util.Scanner;
public class MulitList{// this is the program to print the 2d arraylist
    public static void main(String args[])
    {
    ArrayList<ArrayList<Integer>> list=new ArrayList<>();
    //intialization
    Scanner sc=new Scanner(System.in)
    for(int i=0;i<3;i++)
    {
        list.add(new ArrayList<>());
    }
    //add elements
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            list.get(i).add(sc.nextInt());
        }
        System.out.println(list);
    }
}