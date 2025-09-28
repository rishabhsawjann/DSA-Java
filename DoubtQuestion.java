import java.util.Scanner;
class sum
{
    static void sum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        System.out.println("Enter the third number");
        int num3=sc.nextInt();
        int sum=num1+num2+num3;
        System.out.println("The sum of the three numbers is "+sum);
    }
    public static void main(String args[])
    {
        int ans =sum();
        System.out.println(ans);
    }
}
/*
No, you cannot do this ⛔ because your sum() method is declared as void.

👉 void means the method does not return anything.
So when you write:

int ans = sum();  // ❌ Error


Java complains because sum() doesn’t produce any value to store in ans.

Rule of Thumb:

If you just want to print inside the method, keep void.

If you want to use the result later, return a value instead.