/*
Задача 3:
Въведете 2 различни числа от конзолата и разменте стойността им. Разпечатайте
новите стойности
 */
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter number 2: ");
        double num2 = scanner.nextDouble();

        double temp;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Changed num1 = " + num1);
        System.out.println("Changed num2 = " + num2);
    }
}
