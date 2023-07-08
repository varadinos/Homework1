import java.util.Scanner;

/*
Задача 7:
Въведете 3 променливи от клавиатурата – час (целочислен тип), сума пари (число
с плаваща запетая), дали съм здрав – булев тип. Съставете програма, която
взема решения на базата на тези данни по следния начин:
- ако съм болен няма да излизам
- ако имам пари ще си купя лекарства
- ако нямам – ще стоя вкъщи и ще пия чай
- ако съм здрав
- ако имам по-малко от 10 лв ще отида на кафе и т.н
Полученото решение покажете като съобщение в конзолата
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter valid time of the day: ");
        int time = scanner.nextInt();
        System.out.println("How much money you have: ");
        double money = scanner.nextDouble();
        System.out.println("Are you healthy (true/false): ");
        boolean isHealthy = scanner.nextBoolean();

        if (isHealthy == false) {
            System.out.println("I wont go out!");
            if (money > 10) {
                System.out.println("I will buy some pills to get healthy!");
            } else {
                System.out.println("I don't have money. I will stay home and drink hot tea.");
            }
        } else {
            if (money >= 10) {
                System.out.println("I will go to the coffee shop with friends.");
            } else {
                System.out.println("I will go to walk in the park.");
            }
        }
    }
}
