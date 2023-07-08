/*
Задача 1:
Да се изведат съобщения към потребителя и да се прочетат 2 числа от
клавиатурата A и B (може да са с плаваща запетая – double). После да се прочете
3-то число C и да се провери дали то е м/у A и B. Да се изведе подходящо
съобщение за това дали C е между A и B.
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter number A: ");
//        int a = scanner.nextInt();
//        System.out.println("Enter number B: ");
//        int b = scanner.nextInt();
//        System.out.println("Enter number C: ");
//        int c = scanner.nextInt();
//
//        if (c > a && c < b) {
//            System.out.println("Number C is between number A and number B!");
//        } else {
//            System.out.println("Number C isn't between number A and number B.");
//        }

        System.out.println("Enter number A: ");
        double a = scanner.nextDouble();
        System.out.println("Enter number B: ");
        double b = scanner.nextDouble();
        System.out.println("Enter number C: ");
        double c = scanner.nextDouble();

        if (c > a && c < b) {
            System.out.println("Number C is between number A and number B!");
        } else {
            System.out.println("Number C isn't between number A and number B.");
        }

    }
}
