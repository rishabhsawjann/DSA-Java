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
