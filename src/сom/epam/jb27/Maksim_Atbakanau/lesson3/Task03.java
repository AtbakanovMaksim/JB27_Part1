package сom.epam.jb27.maksim_atbakanau.lesson3;

import java.util.Scanner;

import static java.lang.Double.NaN;

public class Task03 {
    //    Вычислить значение функции
    public static void main(String[] args) {
        double x = readConsole();
        double y = countFunction(x);
        formattedPrint(x, y);

    }

    public static double readConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        while (!sc.hasNextDouble()) {
            System.out.print("Не верный формат! Введите число: ");
            sc.next();
        }
        return sc.nextDouble();
    }

    public static double countFunction(double x) {
        double result = 0;
        if (x <= -3) {
            result = 9;
        } else if (x > 3) {
            result = 1 / (Math.pow(x, 2) + 1);
        } else {
            result = NaN;
        }
        return result;
    }

    public static void formattedPrint(double x, double y) {
        System.out.format("+----------------------+----------------------+%n");
        String leftAlignFormat = "| %-20s | %-20s |%n";
        System.out.printf(leftAlignFormat, x, y);
        System.out.format("+----------------------+----------------------+%n");
    }
}
