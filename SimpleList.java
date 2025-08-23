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