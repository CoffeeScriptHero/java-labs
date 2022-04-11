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
                System.out.println("Ви ввели не число. Спробуйте ще раз");
            }
        }
    }

    public static void main(String[] args) {
        final int C2 = 1309 % 2;
        final int C3 = 1309 % 3;
        final int C5 = 1309 % 5;
        final int C7 = 1309 % 7;
        final int C = C3;

        System.out.printf("C2: %d, знак першої операції: -\n", C2);
        System.out.println("C3: " + C3);
        System.out.printf("C5: %d, знак другої операції: -\n", C5);
        System.out.printf("C7: %d, тип i та j = byte\n\n", C7);

        Scanner scanner = new Scanner(System.in);
        int a, b, n, m;

        a = acceptNumber(scanner, "Введіть a: ");
        n = acceptNumber(scanner, "Введіть n: ");
        b = acceptNumber(scanner, "Введіть b: ");
        m = acceptNumber(scanner, "Введіть m: ");

        if (a > n || b > m) throw new ArithmeticException("Incorrect loop boundaries");

        if (a <= C && n >= C) throw new ArithmeticException("Division by zero");

        float sum = 0;

        for (byte i = (byte) a; i <= n; i++) {
            for (byte j = (byte) b; j <= m; j++) {
                sum += (float)(i - j) / (i - C);
            }
        }
        System.out.printf("Сума: %.3f\n", sum);
    }
}
