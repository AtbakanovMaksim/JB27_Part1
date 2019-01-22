package сom.epam.jb27.maksim_atbakanau.lesson3.Task01;

import java.util.Scanner;

public class L3_7 {
    //    Составить программу, которая по заданным году и номеру месяца т определяет количество дней в этом месяце.
    public static void main(String[] args) {
        int month;
        do {
            System.out.println("Введите номер месяца");
            month = readConsole();
        } while (month > 12);
        System.out.println("Введите год");
        int year = readConsole();
        int numberOfDays = countDays(month, year);
        formattedPrint(month, year, numberOfDays);

    }

    public static int readConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        while (!sc.hasNextInt()) {
            System.out.print("Не верный формат! Введите число: ");
            sc.next();
        }
        return sc.nextInt();
    }

    public static int countDays(int month, int year) {
        int col_day = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                col_day = 31;
                break;
            case 2:
                if (year % 4 == 0) {
                    col_day = 29;
                } else {
                    col_day = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                col_day = 30;
                break;
        }
        return col_day;
    }

    public static void formattedPrint(int month, int year, int numberOfDays) {
        System.out.println("В " + month + " месяце " + year + " года " + numberOfDays + " дней");
    }
}
