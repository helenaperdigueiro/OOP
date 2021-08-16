package utils;

public class Utils {
    public static boolean isPrime(int number) {
        boolean isPrime = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            } else {
                isPrime = true;
            }
        }
        return isPrime;
    }
}
