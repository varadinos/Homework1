/*
Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите им така, че
а1 да има стойността на а2, а2 да има стойността на а3, а а3 да има старата
стойност на а1.
 */


import java.sql.SQLOutput;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int a1 = scanner.nextInt();

        System.out.println("Enter number 2: ");
        int a2 = scanner.nextInt();

        System.out.println("Enter number 3: ");
        int a3 = scanner.nextInt();

        int temp = a1;
        a1 = a2;
        a2 = a3;
        a3 = temp;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

    }
}
