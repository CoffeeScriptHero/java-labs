package labs.Lab1;

import java.util.Scanner;

public class Main {

    public static int acceptNumber(Scanner scanner, String message) {
        String input;
        while (true) {
            System.out.println(message);
            input = scanner.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("Вы ввели не число. Попробуйте еще раз");
            }
        }
    }

    public static void validateLoopData(int x, int y, Scanner scanner) {
        while (!(x < y)) {
            System.out.println("Некорректные значения цикла. Попробуйте еще раз");
            x = acceptNumber(scanner, "Введите первое значение: ");
            y = acceptNumber(scanner, "Введите второе значение (должно быть больше первого): ");
        }
    }

    public static void main(String[] args) {
        int C2 = 1309 % 2;
        int C3 = 1309 % 3;
        int C5 = 1309 % 5;
        int C7 = 1309 % 7;
        int C = C3;

        System.out.printf("C2: %d, знак первой операции : -\n", C2);
        System.out.println("C3: " + C3);
        System.out.printf("C5: %d, знак второй операции : -\n", C5);
        System.out.printf("C7: %d, тип i и j = byte\n", C7);

        Scanner scanner = new Scanner(System.in);
        int a, b, n, m;

        a = acceptNumber(scanner, "Введите a: ");
        n = acceptNumber(scanner, "Введите n (должно быть больше a): ");
        b = acceptNumber(scanner, "Введите b: ");
        m = acceptNumber(scanner, "Введите m (должно быть больше b): ");

        validateLoopData(a, n, scanner);
        validateLoopData(b, m, scanner);

        if (a <= C && n >= C) throw new ArithmeticException("Division by zero");

        float sum = 0;

        for (int i = a; i < n; i++) {
            for (int j = b; j < m; j++) {
                sum += (float)((byte)(i - j)) / ((byte)i - C);
            }
        }
        System.out.printf("Сумма: %.4f\n", sum);
    }
}
