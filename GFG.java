// this is the program for finding the greatest common factor between two numbers
/*
Highest Common Factor) of two numbers is the biggest number
that divides both numbers completely (without leaving a remainder).
👉 Example:

Numbers: 12 and 18

Factors of 12 = {1, 2, 3, 4, 6, 12}

Factors of 18 = {1, 2, 3, 6, 9, 18}

Common factors = {1, 2, 3, 6}

Greatest common factor = 6 ✅

*/
class GFG{
    public static void main(String args[])
    {
        int a=12;
        int b=18;
        int gcd=findGCD(a,b);
        System.out.println(gcd);
    }
    static int findGCD(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}