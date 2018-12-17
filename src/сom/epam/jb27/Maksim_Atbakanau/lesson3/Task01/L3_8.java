package сom.epam.jb27.Maksim_Atbakanau.lesson3.Task01;

import java.util.Scanner;

public class L3_8 {
    //    Составить линейную программу, печатающую значение true, если указанное высказывание
    //    является истинным, и false — в противном случае: в заданном натуральном трехзначном числе N
    //    имеется четная цифра.
    public static void main(String[] args) {
        int number = readConsole();
        hasOddDigit(number);
    }

    public static int readConsole() {
        int number;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Введите трехзначное число: ");
            while (!sc.hasNextInt()) {
                System.out.print("Не верный формат! Введите число: ");
                sc.next();
            }
            number = sc.nextInt();
        } while (String.valueOf(number).length() != 3);
        return number;
    }

    public static void hasOddDigit(int number) {
        int digit;
        while (number != 0) {
            digit = number % 10;
            number = number / 10;
            if (digit % 2 == 0) {
                System.out.println("В числе есть четная цифра.");
                return;
            }
        }
        System.out.println("В числе нет четных цифр.");
    }
}
