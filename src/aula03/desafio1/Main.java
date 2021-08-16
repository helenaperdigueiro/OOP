package aula03.desafio1;

import utils.Utils;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of first prime numbers you would like to see:");
        int numberOfPrimes = scanner.nextInt();
        System.out.println(getNumberOfPrimeNumbers(numberOfPrimes));

    }

    static String getNumberOfPrimeNumbers(int number) {
        int[] firstPrimeNumbers = new int[number];
        int numberOfPrimes = 0;
        int index = 0;
        int numberToBeTested = 0;
        while (numberOfPrimes < number) {
            if (Utils.isPrime(numberToBeTested)) {
                firstPrimeNumbers[index] = numberToBeTested;
                numberOfPrimes++;
                index++;
            }
            numberToBeTested++;


        }
        return Arrays.toString(firstPrimeNumbers);
        //System.out.println();
    }
}
