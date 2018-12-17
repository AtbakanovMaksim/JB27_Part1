package сom.epam.jb27.Maksim_Atbakanau.lesson2;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
//        Вычислить значение выражения по формуле.
        double a;
        double b;
        double c;
        double result;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Введите a!=0: ");
            while (!sc.hasNextDouble()) {
                System.out.print("Не верный формат! Введите число a!=0: ");
                sc.next();
            }
            a = sc.nextDouble();
        } while (a == 0);
        System.out.print("Введите b: ");
        while (!sc.hasNextDouble()) {
            System.out.print("Не верный формат! Введите число b: ");
            sc.next();
        }
        b = sc.nextDouble();
        System.out.print("Введите c: ");
        while (!sc.hasNextDouble()) {
            System.out.print("Не верный формат! Введите число c: ");
            sc.next();
        }
        c = sc.nextDouble();

        result = ((b + Math.sqrt(b * b + 4 * a * c)) / 2 * a) - Math.pow(a, 3) * c + b;
        System.out.println("Результат: " + result);
    }
}
