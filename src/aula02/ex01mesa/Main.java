package aula02.ex01mesa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number to find out if it's a prime number:");
        int number = 0;
        try {
            number = scanner.nextInt();
            if(isPrime(number)) {
                System.out.println(String.format("%s is a prime number!", number));
            } else {
                System.out.println(String.format("%s is not a prime number!", number));
            }
        } catch(Exception exception) {
            System.out.println("Input a number");
        }
    }
    static boolean isPrime(int number) {
        boolean isPrime = false;
        if(number%2 == 0) {


        }
        for(int i = 2; i < number; i++) {
            if(number%i == 0) {
                isPrime = false;
                break;
            } else {
                isPrime = true;
            }
        }
        return isPrime;
    }
    static boolean isDivisible(int number1, int number2) {
        if(number1%number2 == 0) {
            return true;
        } else {
            return false;
        }
    } //this method was only made due to another exercise.
}
