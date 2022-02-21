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
        int C2 = 1309 % 2;
        int C3 = 1309 % 3;
        int C5 = 1309 % 5;
        int C7 = 1309 % 7;
        int C = C3;

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
        //щоб не допустити ділення на нуль

        float sum = 0;

        for (int i = a; i < n; i++) {
            for (int j = b; j < m; j++) {
                sum += (float)((byte)(i - j)) / ((byte)i - C);
            }
        }
        System.out.printf("Сума: %.3f\n", sum);
    }
}
