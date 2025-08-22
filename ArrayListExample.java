import java.util.Scanner;
import java.util.ArrayList;
class ArrayListExample{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        list.add(67);
        list.add(344);
        list.add(342);
        list.add(67);
        list.add(344);
        list.add(342);
       // System.out.println(list);

        for(int i=0; i<5;i++)
        {
            list.add(sc.nextInt());
        }

        // get item at any index
        for(int i=0;i<5;i++)
        {
            System.out.println(list.get(i)); // pass the indec here
        }
        System.out.println(list);
    }
}