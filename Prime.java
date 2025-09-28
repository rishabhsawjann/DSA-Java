/*
A prime number is a natural number greater than 1 that has only two factors:

👉 1 and itself

That means it cannot be divided evenly (without remainder) by any other number.

✅ Examples of prime numbers:

2 → factors = (1, 2) ✔ prime

3 → factors = (1, 3) ✔ prime

5 → factors = (1, 5) ✔ prime

7 → factors = (1, 7) ✔ prime

⚡ Special note:

1 is NOT prime (because it has only one factor, itself).

2 is the only even prime (all other even numbers are divisible by 2).

*/

public class Prime {
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <n; i++) {
            if (n % i == 0) {
                return false; // n is divisible by i, hence not prime
            }
        }
        return true; // n is prime
    }

    public static void main(String[] args) {
        int number = 29; // Example number to check
        if (isPrime(number)==true) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
