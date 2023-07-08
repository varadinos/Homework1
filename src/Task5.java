/*
Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ ред.
 */


import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int number3 = scanner.nextInt();

        int[] numbers = {number1, number2, number3};

        Arrays.sort(numbers);
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

    }
}
