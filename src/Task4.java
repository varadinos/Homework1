/*
Задача 4:
Въведете 2 различни числа от конзолата и ги разпечатайте в нарастващ ред.
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter number 2: ");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println(num2);
            System.out.println(num1);
        } else {
            System.out.println(num1);
            System.out.println(num2);
        }

    }
}
