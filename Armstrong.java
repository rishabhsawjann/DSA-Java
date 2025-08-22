import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int num, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check for Armstrong: ");
        num = sc.nextInt();

        int temp = num;
        while (temp != 0) {
            int rem = temp % 10;
            sum += rem * rem * rem;
            temp /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
