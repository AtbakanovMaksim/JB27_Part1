package сom.epam.jb27.maksim_atbakanau.lesson3;

import java.util.Scanner;

public class Task02 {
    //    Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат представить в виде таблицы.
    public static void main(String[] args) {
        double a;
        double b;
        double h;

        System.out.print("Введите число a: ");
        a = readConsole();
        System.out.print("Введите число b: ");
        b = readConsole();
        System.out.print("Введите число h: ");
        h = readConsole();

        for (double i = a; i <= b; i = i + h) {
            double y = countFunction(i);
            formattedPrint(i, y);
        }
        System.out.format("+----------------------+----------------------+%n");
    }

    public static double readConsole() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextDouble()) {
            System.out.print("Не верный формат! Введите число: ");
            sc.next();
        }
        return sc.nextDouble();
    }

    public static double countFunction(double x) {
        double result;
        result = 2 * Math.tan(x / 2) + 1;
        return result;
    }

    public static void formattedPrint(double x, double y) {
        System.out.format("+----------------------+----------------------+%n");
        String leftAlignFormat = "| %-20s | %-20s |%n";
        System.out.printf(leftAlignFormat, x, y);
    }
}
