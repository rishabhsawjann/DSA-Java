/* 
function overloading simply means having multiple functions with same name
but different number of parameter lists

(different number of arguments or different types of arguments).

The compiler decides which function to run based on the arguments you pass.

Return type does not matter for overloading.
*/

//let's write a simple function overloading program
class FunctionOverloading
{
    static int add(int a, int b)
    {
        int sum=a+b;
        return sum;
    }
    static int add(int a,int b, int c)
    {
        int sum=a+b+c;
        return sum;
    }
    static double add(double a,double b, double c)
    {
        double sum=a+b+c;
        return sum;
    }
    public static void main(String args[])
    {
        int ans=add(1,2);
        int ans2=add(1,2,3);
        double ans3=add(1.1,2.2,3.3);
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
    }
}



