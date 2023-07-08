/*
Задача 2:
Въведете 2 различни целочислени числа от конзолата. Запишете тяхната сума,
разлика, произведение, остатък от деление и целочислено деление в отделни
променливи и разпечатайте тези резултати в конзолата. Опитайте същото с числа
с плаваща запетая.
 */
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter whole number 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter whole number 2: ");
        int num2 = scanner.nextInt();

        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;
        int modulo = num1 % num2;

        System.out.println("Addition = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);
        System.out.println("Modulo = " + modulo);


        System.out.println("Enter decimal number 1: ");
        double num3 = scanner.nextDouble();
        System.out.println("Enter decimal number 2: ");
        double num4 = scanner.nextDouble();


        double additionDouble = num3 + num4;
        double subtractionDouble = num3 - num4;
        double multiplicationDouble = num3 * num4;
        double divisionDouble = num3 / num4;
        double moduloDouble = num3 % num4;

        System.out.println("Addition = " + additionDouble);
        System.out.println("Subtraction = " + subtractionDouble);
        System.out.println("Multiplication = " + multiplicationDouble);
        System.out.println("Division = " + divisionDouble);
        System.out.println("Modulo = " + moduloDouble);



    }
}
