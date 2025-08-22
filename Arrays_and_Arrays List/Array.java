import java.util.Scanner;
public class Array {
    //why we need arrays
    //Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
    //Q:store a roll number
    int a=500094143;

   // Q: store a person's name
   String name="Rishabh Sajwan";

   //Q: store  5 roll numbers
   //without arrays you are going to declare 5 variables
   int roll1=500094143;
    int roll2=500094144;
    int roll3=500094145;
    int roll4=500094146;
    int roll5=500094147;
    //what if the user wants to store 100 roll numbers?
    //you will have to declare 100 variables and that takes a lot of time and space
    //so we use arrays to store multiple values in a single variable
    //Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
    //Q: store 5 roll numbers using arrays
    int[] rollNumbers = {500094143, 500094144, 500094145, 500094146, 500094147};
    //syntax
    //datatype[] variablename = new datatype[size];
    // or if you want to initialize the array with values
    //datatype[] variablename = {value1, value2, value3, ...};
    int[] rollnumber= new int[5];
    Scanner sc = new Scanner(System.in);
    public void inputRollNumbers() {
        System.out.println("Enter 5 roll numbers:");
        for (int i = 0; i < rollNumbers.length; i++) {
            rollNumbers[i] = sc.nextInt();
        }
    }

}
int[] rollNumbers // this is the declaration of an array , rollNumberes is being defined in the stack memory
rollNumbers = new int[5]; //intilizaton: here object is being created in the heap memory

//null keyword in java
//why do we need null keyword?
String str=null; 
//this means that str is not pointing to any object in the heap memory
int num=null; //this is not valid because int is a primitive data type and cannot be null
//it is only assigned to primitive data types and not to non-primitive data types
// what is primitive and non-primitive data types?
//Primitive data types are the basic data types in Java, such as int, char, boolean, etc.
//Non-primitive data types are the reference data types in Java, such as String, Arrays, Classes, etc.
//primitve are stored in the stack memory and non-primitive are stored in the heap memory