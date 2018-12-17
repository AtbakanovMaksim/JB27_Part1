package сom.epam.jb27.Maksim_Atbakanau.lesson3.Task01;

import java.util.Scanner;

public class L3_6 {
    //Написать программу, позволяющую по последней цифре числа определить последнюю цифру его квадрата.
    public static void main(String[] args) {
        int number = readConsole();
        int result = findLastDigitOfSquare(number);
        formattedPrint(number, result);
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

    public static int findLastDigitOfSquare(int number) {
        int poslZifra = number % 10;
        int poslZifraKv = 0;
        switch (poslZifra) {
            case 0:
                poslZifraKv = 0;
                break;
            case 1:
                poslZifraKv = 1;
                break;
            case 2:
                poslZifraKv = 4;
                break;
            case 3:
                poslZifraKv = 9;
                break;
            case 4:
                poslZifraKv = 6;
                break;
            case 5:
                poslZifraKv = 5;
                break;
            case 6:
                poslZifraKv = 6;
                break;
            case 7:
                poslZifraKv = 9;
                break;
            case 8:
                poslZifraKv = 4;
                break;
            case 9:
                poslZifraKv = 1;
                break;
            default:
                System.out.println("Что-то не то с программой.");
        }
        return poslZifraKv;
    }

    public static void formattedPrint(int number, int result) {
        System.out.println("Последняя цифра квадрата числа " + number + " равняется " + result);
    }
}
