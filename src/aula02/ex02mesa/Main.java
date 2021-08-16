package aula02.ex02mesa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 3 numbers:");
        try {
        String inputNumbers = scanner.nextLine();
        String[] numbers = inputNumbers.split(", ");
        int number1 = Integer.parseInt(numbers[0]);
        int number2 = Integer.parseInt(numbers[1]);
        int number3 = Integer.parseInt(numbers[2]);

        int largestNumber = getLargestNumber(number1, number2, number3);
        System.out.println(String.format("%s is the largest number!", largestNumber));
        } catch(Exception exception) {
            System.out.println("Input 3 numbers such as \'1, 2, 3\'");
        }

    }
    static int getLargestNumber(int number1, int number2, int number3) {
        int largestNumber;
        if(number1 > number2 && number1 > number3) {
            largestNumber = number1;
        } else if(number2 > number1 && number2 > number3) {
            largestNumber = number2;
        } else {
            largestNumber = number3;
        }
        return largestNumber;
    }
}
