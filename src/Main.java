import java.util.Scanner;

public class Main.java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введите первое число
        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        // Введите второе число
        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        // Сравнение чисел
        if (firstNumber > secondNumber) {
            System.out.println("Ты чмо");
        } else {
            System.out.println("Ты лох");
        }
        scanner.close();
    }
}