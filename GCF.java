import java.util.Scanner;
class GCF
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first nummber:");
         int num1=sc.nextInt();
        System.out.println("Enter the second number:");
        int num2=sc.nextInt();
        System.out.println(" You Entered " +num1+ " and " +num2);
        //Now what was the logic to find the greatest common factor
        //first we initialize the gcf=1;
        int gcf=1;
        //This is because 1 is the smallest factor of any number
        //Then we use a terary operator to check for the smaller number 
        //and we store it in a variable called smaller
        int smaller=(num1<num2)?num1:num2;// you know it will return one value
        //either the num1 will be smaller or num2 smaller
        // and we will store that in variable smaller
        for(int i=1; i<=smaller;i++)
        {
            if(num1%i==0&&num2%i==0)
            {
                gcf=i;
            }
        }
        System.out.println("GCF of " +num1+ " and " +num2+ " is " +gcf);
    }
}